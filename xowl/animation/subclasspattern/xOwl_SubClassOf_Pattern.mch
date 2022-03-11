MACHINE
	xOwl_SubClassOf_Pattern
INCLUDES
	xOwl
/*PROMOTES
	SubClassOf_Free*/
DEFINITIONS
	SET_PREF_DEFAULT_SETSIZE == 25 ;
	SET_PREF_MAX_OPERATIONS == 20 ;
	SET_PREF_SHOW_EVENTB_ANY_VALUES == FALSE ;
	
	subClassGoal(iri1,iri2) == (name~(iri1),name~(iri2)) : inheritence & Axiom = dom(axioms) ;
	
	inheritence == ((subClassExp ; classOfClassExp)~ ; (superClassExp ; classOfClassExp)) ;
	disjunctionExp == classOfClassExp >< disjointClassExp ;
	disjunction == (ran(disjunctionExp) ; ran(disjunctionExp)~) - id(Class) ;
	super(cls) ==  closure1(inheritence)[cls] 
	
VARIABLES
	subClass, superClass
INVARIANT
	subClass <: Class & superClass <: Class
	& subClass /\ superClass = {}
	& closure1(inheritence) /\ id(Class) = {} // invariant: no cycles
	& ! cl . (cl : Class => disjunction[super({cl})] /\ super({cl}) = {})
	
INITIALISATION
	subClass, superClass := {}, {}
OPERATIONS
repairSubClassAxiom(iri1, iri2, iri3) = 
	PRE iri1 : STRING & iri2 : STRING & iri3 : STRING THEN
		ANY 
			cl1, cl2, cl3, axiom
		WHERE 
			cl1 : Class & name(cl1) = iri1 
			& cl2 : Class & name(cl2) = iri2 
			& cl3 : Class & name(cl3) = iri3 
			& disjunction[super({cl1})] /\ super({cl1}) /= {}
			& {cl2, cl3} <: super({cl1}) \/ {cl1}
			& {cl2, cl3} /\ super(disjunction[super({cl1})]) = {}
			& cl3 : inheritence[{cl2}]
			
			
			& axiom : Axiom 
			& cl2 : (subClassExp ; classOfClassExp)[{axiom}]
			& cl3 : (superClassExp ; classOfClassExp)[{axiom}]
		THEN
			SubClassOf_Free(axiom)
		END
	END
END