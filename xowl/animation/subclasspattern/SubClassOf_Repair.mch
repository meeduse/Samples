MACHINE
	SubClassOf_Repair
INCLUDES
	xOwl
DEFINITIONS
	SET_PREF_DEFAULT_SETSIZE == 25 ;
	SET_PREF_MAX_OPERATIONS == 20 ;
	SET_PREF_SHOW_EVENTB_ANY_VALUES == FALSE ;
	
	inheritence == ((subClassExp ; classOfClassExp)~ ; (superClassExp ; classOfClassExp)) ;
	disjunctionExp == classOfClassExp >< disjointClassExp ;
	disjunction == (ran(disjunctionExp) ; ran(disjunctionExp)~) - id(Class) ;
	super(cls) ==  closure(inheritence)[cls] ;
	super1(cls) ==  closure1(inheritence)[cls] ;
	
	inconsistentClasses == {cl | cl : Class & disjunction[super({cl})] /\ super({cl}) /= {} }
	
INVARIANT
    inconsistentClasses = {}
	
OPERATIONS
repairSubClassAxiom(iri1, iri2, iri3) = 
	PRE iri1 : STRING & iri2 : STRING & iri3 : STRING THEN
		ANY 
			cl1, cl2, cl3, axiom
		WHERE 
			cl1 : Class & cl2 : Class & cl3 : Class & axiom : SubClassOf 
			& Entity_name(cl1) = iri1 & Entity_name(cl2) = iri2 & Entity_name(cl3) = iri3 
			& cl1 : inconsistentClasses
			& {cl2, cl3} <: super({cl1}) 
			& {cl2, cl3} /\ (super1(disjunction[super({cl1})]) - dom(disjunction)) = {}
			& {cl2} = (subClassExp ; classOfClassExp)[{axiom}]
			& {cl3} = (superClassExp ; classOfClassExp)[{axiom}]
		THEN
			SubClassOf_Free(axiom)
		END
	END
END