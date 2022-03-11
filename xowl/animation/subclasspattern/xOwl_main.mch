MACHINE
	xOwl_main
INCLUDES
	xOwl_SubClassOf
PROMOTES
	selectSubClass, selectSuperClass
/*OPERATIONS
declareClass =
	ANY
		onto, class, decl
	WHERE
		onto : XOwl
		& class : ENTITY & class /: Entity
		& decl : AXIOM & decl /: Axiom
	THEN
		BEGIN
			Class_NEW(class) || Declaration_NEW(decl) 
		END ;
		BEGIN
			Declaration_SetEntity(decl,class) ||
			xOwl_AddAxioms(onto,decl) /* ||
			Entity_SetName(class, "default_name") */
		END
	END*/
END