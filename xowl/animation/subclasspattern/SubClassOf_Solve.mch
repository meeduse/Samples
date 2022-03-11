MACHINE
	SubClassOf_Solve
INCLUDES
	xOwl,LibraryStrings
DEFINITIONS
	"LibraryStrings.def" ;
	SET_PREF_DEFAULT_SETSIZE == 25 ;
	SET_PREF_MAX_OPERATIONS == 20 ;
	SET_PREF_SHOW_EVENTB_ANY_VALUES == TRUE ;
	
	subClassGoal(iri1,iri2) == (name~(iri1),name~(iri2)) : inheritence & Axiom = dom(axioms) ;
	
	inheritence == ((subClassExp ; classOfClassExp)~ ; (superClassExp ; classOfClassExp)) ;
	
	disjunctionExp == classOfClassExp >< disjointClassExp ;
	
	disjunction == (ran(disjunctionExp) ; ran(disjunctionExp)~) - id(Class) ;
	
	super(cls) ==  closure(inheritence)[cls] ;
	
	inconsistentClasses == {cl | cl : Class & disjunction[super({cl})] /\ super({cl}) /= {} }
	
VARIABLES
	newClass, newDecl, newSubClass,
	exp1, exp2, ontology
INVARIANT
	newClass : ENTITY & newDecl : AXIOM & newSubClass : AXIOM 
	& exp1 : CLASSEXPRESSION & exp2 : CLASSEXPRESSION
	& ontology : XOwl
	
	& closure1(inheritence) /\ id(Class) = {} // pas de cycle
	& inconsistentClasses = {} // pas d'inconsistance
	
INITIALISATION

	newClass :: (ENTITY - Entity)||
	ANY a1, a2, e1, e2 WHERE
		a1 : AXIOM - Axiom
		& a2 : AXIOM - Axiom
		& e1 : CLASSEXPRESSION - ClassExpression
		& e2 : CLASSEXPRESSION - ClassExpression
		& a1 /= a2
		& e1 /= e2
	THEN
		newDecl := a1 ||
		newSubClass := a2 ||
		exp1 := e1 ||
		exp2 := e2
	END || 
	ontology :: XOwl
	
OPERATIONS
alternative <-- applySubClassOf(iri1, iri2) = 
	PRE iri1 : STRING & iri2 : STRING THEN
		ANY 
			cl1, cl2
		WHERE 
			cl1 : Class & cl2 : Class
			& Entity_name(cl1) = iri1 & Entity_name(cl2) = iri2			  
			& cl2 /: super({cl1})
			& (closure1(inheritence \/ {(cl1|->cl2)}) /\ id(Class) = {})
			& disjunction[super({cl1,cl2})] /\ super({cl1,cl2}) /= {}
		THEN
			Class_NEW(newClass) ;
			Declaration_NEW(newDecl) ;
			Declaration_SetEntity(newDecl, newClass) ;
			
			ClassExpression_NEW(exp1);
			ClassExpression_NEW(exp2);
			
			ClassExpression_SetClass(exp1, newClass) ;
			ClassExpression_SetClass(exp2, cl1) ;
			VAR
				name1, name2
			IN
				name1 := STRING_CONC([iri1,"_",iri2]) ;
				name2 := STRING_CONC([TO_STRING(Entity_name[inheritence[{cl1}]]),"_",iri2]) ;
				CHOICE
					SubClassOf_NEW(newSubClass, exp1, exp2);
					Entity_SetName(newClass, name1) ;
					alternative := "SubClassing"
				OR
					SubClassOf_NEW(newSubClass, exp2, exp1);
					Entity_SetName(newClass, name2) ;
					alternative := "SuperClassing"
				END 
			END ;
			xOwl_AddAxioms(ontology, newDecl) ;
			xOwl_AddAxioms(ontology, newSubClass) 
		END
	END 	

END