Install the Eclipse Modelling Tools. Any recent distribution should work (The work is built on ECLISPE Version: 2021-03 (4.19.0)). Link: https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-modeling-tools

Launch your eclipse and install Linkage Generator Tool from the following update site:

- Link: http://vasco.imag.fr/tools/meeduse/LinkageGeneratorTool

1. Create a Modeling Project

- Click on File -> Other -> Sirius -> Modeling Project -> Next, then give a project name TestLift

2. Create the Pattern-Definition File

- Click on TestLift Folder -> New -> File then give the name lift.lnk , here Eclispe asks you to convert TestLift to an Xtext project, click Yes.

- Now you can define patterns in the file. Ctrl+space will guides you to fill syntex. Since we are working on lift example, copy and paste the following into lift.lnk and save.

template MyTemplate 

pattern EclassToMachine(anEClass)
alias anEClass : anEClass
alias varName : "linked_"anEClass

{	
	VARIABLES : varName 
	INVARIANT : varName ":" anEClass
	INITIALISATION : varName "::" anEClass  
	
}

pattern EClassToBSet(anEClass aBSet userDefined)
alias anEClass : anEClass
alias abset : aBSet
alias userDefined : userDefined 
alias varName : "linked_"anEClass
alias relation : anEClass ">->>" aBSet
{
	VARIABLES : anEClass
	INVARIANT : varName ":" relation
	INITIALISATION:
	"ANY mapping WHERE 
		mapping :" relation "
	&
	" 
		userDefined 
	"THEN
	" 
	 	varName ":= mapping
	END"
}

pattern SingleValuedERefToSetElement
(EReferenceExp aSetElement)
alias EReferenceExp : EReferenceExp
alias aSetElement : aSetElement
{
	INVARIANT : EReferenceExp "=" aSetElement
}

pattern MultileValuedERefToSet
(EReferenceExp aSet)
alias EReferenceExp : EReferenceExp
alias aSet : aSet
{
	INVARIANT : EReferenceExp "=" aSet
}

pattern EnumTypeToBoolean(attributeExp bExp aVal1 aVal2)
alias attributeExp : attributeExp
alias bExp : bExp
alias aVal1 : aVal1
alias aVal2 : aVal2
{
	INVARIANT : 
		"(" attributeExp "=" aVal1 "<=>" bExp "=" "FALSE" ")"
		"&" "(" attributeExp "=" aVal2 "<=>" bExp "=" "TRUE" ")"
}

3. Create the Pattern Application File

- We defined the patterns in previous file, here we create a pattern application file, for this, click again on the TestLift folder -> New -> File then give the name lift.apn , copy and paste the following which define the structure of linkage machine and apply the patterns defined previously and then Ctrl+S.

technique RefinementInclusion
header {
	REFINEMENT linkage_lift
	B{
	REFINES existing_lift
	INCLUDES liftM
}B
}


applyPattern MyTemplate.EclassToMachine(Lift)

applyPattern MyTemplate.EnumTypeToBoolean(
	B{Door(linked_lift)}B  door_open Closed Open
)

applyPattern MyTemplate.EnumTypeToBoolean(
	B{Direction(linked_lift)}B direction_up Down Up
)
applyPattern MyTemplate.EClassToBSet(
	Floor 
	B{groundf..topf}B 
	B{!(f1,f2).(f1 : Floor & f2 : Floor & (f1|->f2) : up_down => mapping(f2) = mapping(f1) + 1)}B
)
applyPattern MyTemplate.SingleValuedERefToSetElement(
	B{linked floors(liftPosition(linked_lift))}B 
	cur_floor
)

applyPattern MyTemplate.MultileValuedERefToSet(
	B{Linked_floors[selectedFloors[{linked_lift}]]}B call_buttons

)





BClause INITIALISATION
B{   cur_floor := (groundf) ;
	door_open := FALSE ;
	call_buttons := ({}) ;
	direction_up := TRUE;
    SetDirection(linked_lift ,Up);
	SetDoor(linked_lift,Closed);
	UnsetSelectedFloors(linked_lift)
}B

BClause OPERATIONS
B{ 
 move_up = 
 SELECT 
     door_open = FALSE 
     & cur_floor < topf 
     & direction_up = TRUE 
     & # cc.((cc : INTEGER) & ((cc : INTEGER) & (cc > cur_floor) & (cc : call_buttons))) &
            (cur_floor /: call_buttons)
THEN
    cur_floor := ((cur_floor)+(1));
    SetLiftPosition(linked_lift ,linked_floors~(cur_floor)) 
 END ;
 
 move_down = SELECT door_open = FALSE & cur_floor > groundf & (direction_up = FALSE) &
       # cu.((cu : INTEGER) & ((cu : INTEGER) & (cu < cur_floor) & (cu : call_buttons))) &
      (cur_floor /: call_buttons) THEN
   cur_floor := ((cur_floor)-(1));  
	SetLiftPosition(linked_lift ,linked_floors~(cur_floor)) 
 END ;
 reverse_lift_up = SELECT direction_up = FALSE & door_open = FALSE &
   # cc.((cc : INTEGER) & ((cc : INTEGER) & (cc > cur_floor) & (cc : call_buttons))) & 
   ! ll.((ll : INTEGER) => (((ll : INTEGER) & (ll <= cur_floor) & (ll >= groundf)) => (ll /: call_buttons))) THEN
   direction_up := TRUE;
    SetDirection(linked_lift ,Up)
 END ;
 reverse_lift_down = SELECT direction_up = TRUE & door_open = FALSE & 
  # cd.(cd : INTEGER & ((cd : INTEGER) & (cd < cur_floor) & (cd : call_buttons))) & 
  ! uu.(uu : INTEGER => (((uu : INTEGER) & (uu >= cur_floor) & (uu <= topf)) => (uu /: call_buttons))) THEN
  direction_up := FALSE;
    SetDirection(linked_lift, Down)
 END ;
 open_door = SELECT door_open = FALSE & (cur_floor : call_buttons) THEN
    door_open := TRUE;
    SetDoor(linked_lift, Open)
 END ;
 close_door = SELECT door_open = TRUE THEN
    door_open := FALSE || call_buttons := ((call_buttons)-({cur_floor}));
    SetDoor(linked_lift,Closed) ;
    RemoveSelectedFloors(linked_lift, linked_floors~(cur_floor))
 END ;
 push_call_button(fl) = PRE (fl : (groundf .. topf)) & (fl /: call_buttons) THEN 
     call_buttons := ((call_buttons)\/({fl}));
    AddSelectedFloors(linked_lift, linked_floors~(fl))
 END
 
 }B

4. Now your both files are ready, now its time to generate the linkage B specification. But due to some technical reasons in Eclispe, at this moment, we have to close and reopen the project. 

- Click TestLift -> click clsoe proejct and again click TestLift folder and -> click open project. Now lift.lnk and lift.apn are converted to modeling files. 

- To generate the linkage B specification, -> left click on lift.apn, the model will show the "Application RefinementInclusion", -> right click on it and click Generate. It will generate linkage_lift.ref in TestLift Folder.