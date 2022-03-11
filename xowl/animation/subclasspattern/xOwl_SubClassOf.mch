MACHINE
	xOwl_SubClassOf
INCLUDES
	xOwl
SETS
	state = {safe, not_safe}
DEFINITIONS
	SET_PREF_DEFAULT_SETSIZE == 25 ;
	SET_PREF_MAX_OPERATIONS == 20 ;
	SET_PREF_SHOW_EVENTB_ANY_VALUES == FALSE ;
	
	subClassGoal(iri1,iri2) == (name~(iri1),name~(iri2)) : inheritence & Axiom = dom(axioms) ;
	
	inheritence == ((subClassExp ; classOfClassExp)~ ; (superClassExp ; classOfClassExp)) ;
	disjunctionExp == classOfClassExp >< disjointClassExp ;
	disjunction == (ran(disjunctionExp) ; ran(disjunctionExp)~) ;
	super(cl) ==  closure(inheritence)[{cl}] 

VARIABLES
	subClass, superClass, check
INVARIANT
	subClass <: Class & superClass <: Class
	& subClass /\ superClass = {}
	& check : (Class * Class) +-> state
	& closure1(inheritence) /\ id(Class) = {}
INITIALISATION
	subClass, superClass, check := {}, {}, {}
OPERATIONS
ss <-- selectClasses(iri1, iri2) = 
	PRE iri1 : STRING & iri2 : STRING THEN
		ANY 
			cl1, cl2
		WHERE 
			cl1 : Class & name(cl1) = iri1 & cl1 /: (subClass \/ superClass)
			& cl2 : Class & name(cl2) = iri2 & cl2 /: (subClass \/ superClass)
			& cl2 /: super(cl1)
			& (closure1(inheritence \/ {(cl1|->cl2)}) /\ id(Class) = {})
		THEN
			subClass := subClass \/ {cl1} ||
			superClass := superClass \/ {cl2} ||
			IF super(cl1) * super(cl2) /\ disjunction = {} THEN
				ss := safe 
			ELSE
				ss := not_safe 
			END ;
			check(cl1|->cl2) := ss
		END
	END ;
createSubClassOf(cl1,cl2) =
	PRE cl1 : subClass & cl2 : superClass THEN
		ANY axiom, exp1, exp2 WHERE
			axiom : AXIOM - Axiom
			& {exp1, exp2} <: CLASSEXPRESSION - ClassExpression
		THEN
			ClassExpression_NEW(exp1);
			ClassExpression_NEW(exp2);
			SubClassOf_NEW(axiom, exp1, exp2);
			ClassExpression_SetClass(exp1,cl1) ;
			ClassExpression_SetClass(exp2,cl2) ;
			IF check(cl1|->cl2) = not_safe  THEN
				ANY annotation WHERE
					annotation : ANNOTATION - Annotation
				THEN
					Annotation_NEW(annotation) ;
					AddAxiomAnnotations(axiom, annotation) ;
					SetAnnotationValue(annotation, "inconsistent")
				END
			END ;
			BEGIN
				subClass := subClass - {cl1} ||
				superClass := superClass - {cl2} 
			END
		END 
	END ;
addSubClassOfAxiom =
	ANY 
		onto, axiom
	WHERE
		onto : XOwl & axiom : Axiom - dom(axioms)
	THEN
		AddAxioms(onto,axiom)
	END
END