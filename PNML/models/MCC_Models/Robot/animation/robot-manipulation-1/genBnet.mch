MACHINE
	genBnet
INCLUDES
	ptnet
SETS
	Step = {s1,s2,s3,s4,s5,s6}
DEFINITIONS
	ArcTarget(aa) == pnmlcoremodel_Node_etiq(pnmlcoremodel_target(aa)) ;
	ArcSource(aa) == pnmlcoremodel_Node_etiq(pnmlcoremodel_source(aa)) ;
	Arc_val(aa) == ((inscription ; PTArcAnnotation_text) \/ (Arc - dom(inscription))*{1})(aa);
	Place_mark(pp) == ((initialMarking ; PTMarking_text) \/ (Place - dom(initialMarking))*{0})(pp) ;
	SET_PREF_MAX_OPERATIONS == 1 ;
	SET_PREF_MAX_INITIALISATIONS == 1 ;
	"LibraryIO.def"
VARIABLES
	tr, tt, step
INVARIANT
	tr <: pnmlcoremodel_Transition
	& step : Step
	& tt : pnmlcoremodel_Transition
INITIALISATION
step := s1 ;
tt :: pnmlcoremodel_Transition ;
tr := pnmlcoremodel_Transition ;
VAR gen0, gen1, gen2 IN
	gen0 := bool(printf("~w~n",["MACHINE prod_cons"]) & printf("~w~n",["DEFINITIONS"])) ;
	gen1 := { aa | aa : Arc 
		&		
		(aa : dom(pnmlcoremodel_target |> pnmlcoremodel_Transition) 
			=> 
			(printf("   ~w_~w == ~w >= ",[ArcSource(aa),ArcTarget(aa),ArcSource(aa)])
			& printf("~w;~n",[Arc_val(aa)])
			& printf("   ~w == ~w := ~w - ",[pnmlcoremodel_Arc_etiq(aa),ArcSource(aa),ArcSource(aa)])
			& printf("~w;~n",[Arc_val(aa)])))
		&
		(aa : dom(pnmlcoremodel_source |> pnmlcoremodel_Transition) 
			=>
			(printf("   ~w_~w == ~w + ",[ArcSource(aa),ArcTarget(aa),ArcTarget(aa)])
			& printf("~w",[Arc_val(aa)])
			& printf(" <= ~w;~n",["MAXINT"])
			& printf("   ~w == ~w := ~w + ",[pnmlcoremodel_Arc_etiq(aa),ArcTarget(aa),ArcTarget(aa)])
			& printf("~w;~n",[Arc_val(aa)])))
	} ;
	gen0 := bool(printf("~w~n",["CONCRETE_VARIABLES"])) ;
	gen2 := {pp | pp : Place &
			printf("   ~w,~n",[pnmlcoremodel_Node_etiq(pp)])
	} ;
	gen0 := bool(printf("   ~w~n",["kill"]));
	gen0 := bool(printf("~w~n",["INVARIANT"])) ;
	gen2 := {pp | pp : Place &
			printf("   ~w : NAT &~n",[pnmlcoremodel_Node_etiq(pp)])
	} ;
	gen0 := bool(printf("   ~w~n",["kill : NAT"]) & printf("~w~n",["INITIALISATION"])) ;

	gen2 := {pp | pp : Place &
			printf("   ~w := ",[pnmlcoremodel_Node_etiq(pp)])
			& printf("~w ;~n",[Place_mark(pp)])
	};
	gen0 := bool(printf("   ~w~n",["kill := 0"]) & printf("~w~n",["OPERATIONS"]))
END /*;
	
VAR tr IN
tr := pnmlcoremodel_Transition ;
WHILE card(tr) > 0 DO
	ANY tt WHERE 
		tt : tr 
		& printf("~w =~n   SELECT~n",[pnmlcoremodel_Node_etiq(tt)])
	THEN
		tr := tr - {tt}
	END
INVARIANT
	card(tr) >= 0
VARIANT
	card(tr)
END
END*/
OPERATIONS
genTr1 = 
	SELECT 
		step = s1 & tr /= {}
		& printf("~w =~n   SELECT~n",[pnmlcoremodel_Node_etiq(tt)])
	THEN
		tr := tr - {tt} ;
		step := s2 
	END ;
genTr2 =
	SELECT
		step = s2
	THEN
		VAR genA IN
			genA := {aa| aa : pnmlcoremodel_source~[{tt}] \/  pnmlcoremodel_target~[{tt}]
			=> printf("      ~w_~w &~n",[ArcSource(aa),ArcTarget(aa)])}
		END ;
		step := s3
	END;
genTr3 =
	SELECT
		step = s3 & printf("      kill = 0~n   ~w~n",["THEN"])
	THEN
		step := s4
	END ;
genTr4 =
	SELECT
		step = s4 
	THEN
		VAR genC IN
			genC := {aa| aa : pnmlcoremodel_source~[{tt}] \/  pnmlcoremodel_target~[{tt}]
			=> printf("      ~w;~n",[pnmlcoremodel_Arc_etiq(aa)])}
		END ;
		step := s5
	END ;
genTr5 =
	SELECT
		step = s5 & printf("      kill := 0~n   ~w~n",["END;"])
	THEN
		IF tr = {} THEN
			step := s6
		ELSE
			step := s1 ;
			tt :: tr
		END
		
		
	END ;
		
genTr6 = SELECT step=s6 & printf("stop = BEGIN kill := 1 END~n~w~n",["END"]) THEN skip END

/*;
genLast = PRE tr = {} & printf("stop = BEGIN kill := 1 END~n~w~n",["END"]) THEN skip END*/
	/*tr := { tt |
		tt : pnmlcoremodel_Transition & printf("~w =~n   SELECT~n",[pnmlcoremodel_Node_etiq(tt)]) 
	}*/
/* 
	!tt.(tt : pnmlcoremodel_Transition 
	=> (printf("~w =~n   SELECT~n",[pnmlcoremodel_Node_etiq(tt)])
		& !aa.(aa : pnmlcoremodel_source~[{tt}] \/  pnmlcoremodel_target~[{tt}]
			=> printf("      ~w_~w &~n",[ArcSource(aa),ArcTarget(aa)]))
		& printf("      kill = 0~n   ~w~n",["THEN"])
		& !aa.(aa : pnmlcoremodel_source~[{tt}] \/  pnmlcoremodel_target~[{tt}]
			=> printf("      ~w;~n",[pnmlcoremodel_Arc_etiq(aa)]))
			& printf("      kill := 0~n   ~w~n",["END;"])
			)
		)
*/

END