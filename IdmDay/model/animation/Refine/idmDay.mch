
/*
 * This file was generated by Meeduse animator on Wednesday, May 5, 2021 at 10:58:10 AM CEST
 */


MACHINE 
	
	idmDay

DEFINITIONS
	


	END_OF_GENERATED_DEFINITIONS_FOR == idmDay;
	

SETS
	
	SECTION;
	TRAIN


CONCRETE_VARIABLES
	
	Section,
	Train,
	next,
	position

INVARIANT
	
	Section : FIN(SECTION) &
	Train : FIN(TRAIN) &
	next : Section >->> Section &
	position : Train --> Section

INITIALISATION
	
	Train := {} ||
	Section := {} ||
	next := {} ||
	position := {}

OPERATIONS
	Train_SetPosition(aTrain,aPosition) = 
	PRE	aTrain : Train &
		aPosition : Section &
		{(aTrain |-> aPosition)} /<: position
		
	THEN 
		position := ({aTrain} <<| position) \/ {(aTrain |-> aPosition)}
	END;

	Section_NEW(aSection,aNext,aDefault) = 
	PRE	aSection : SECTION &
		aNext : Section &
		aDefault : Section &
		aSection /: Section &
		next~[{aNext}] = {} &
		next[{aDefault}] = {}
		
	THEN 
		Section := Section \/ {aSection} ||
		next := (next \/ {(aDefault |-> aSection)}) \/ {(aSection |-> aNext)}
	END;

	Train_NEW(aTrain,aPosition) = 
	PRE	aTrain : TRAIN &
		aPosition : Section &
		aTrain /: Train
		
	THEN 
		Train := Train \/ {aTrain} ||
		position := position \/ {(aTrain |-> aPosition)}
	END;

	Section_Free(aSection) = 
	PRE	aSection : Section &
		next[{aSection}] = {} &
		position~[{aSection}] = {} &
		next~[{aSection}] = {}
		
	THEN 
		Section := Section - {aSection} ||
		next := {aSection} <<| (next |>> {aSection}) ||
		position := position |>> {aSection}
	END;

	Train_Free(aTrain) = 
	PRE	aTrain : Train
		
	THEN 
		Train := Train - {aTrain} ||
		position := {aTrain} <<| position
	END;

	result <-- Section_GetNext(aSection) = 
	PRE	aSection : Section &
		aSection : dom(next)
		
	THEN 
		result := next(aSection)
	END;

	result <-- Section_GetPosition(aSection) = 
	PRE	aSection : Section &
		aSection : ran(position)
		
	THEN 
		result := position~[{aSection}]
	END;

	Section_SetNext(aSection,aNext) = 
	PRE	aSection : Section &
		aNext : Section &
		{(aSection |-> aNext)} /<: next &
		next[{aSection}] = {} &
		next~[{aNext}] = {}
		
	THEN 
		next := ({aSection} <<| next) \/ {(aSection |-> aNext)}
	END;

	Section_SetPosition(aSection,thePosition) = 
	PRE	aSection : Section &
		thePosition : FIN(Train) &
		(thePosition * {aSection}) /<: position &
		position~[{aSection}] = {} &
		!added.( added : thePosition => position[{added}] = {})
		
	THEN 
		position := (position |>> {aSection}) \/ (thePosition * {aSection})
	END;

	Section_UnsetPosition(aSection) = 
	PRE	aSection : Section &
		position~[{aSection}] = {}
		
	THEN 
		position := position |>> {aSection}
	END;

	Section_AddPosition(aSection,aPosition) = 
	PRE	aSection : Section &
		aPosition : Train &
		(aPosition |-> aSection) /: position &
		position[{aPosition}] = {}
		
	THEN 
		position := position \/ {(aPosition |-> aSection)}
	END;

	Section_RemovePosition(aSection,aPosition) = 
	PRE	aSection : Section &
		aPosition : Train &
		(aPosition |-> aSection) : position &
		card(position[{aPosition}]) >= 2
		
	THEN 
		position := position - {(aPosition |-> aSection)}
	END


END