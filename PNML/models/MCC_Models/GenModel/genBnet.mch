MACHINE
	genBnet
INCLUDES
	ptnet2
DEFINITIONS
	ArcTarget(aa) == pnmlcoremodel_Node_etiq(pnmlcoremodel_target(aa)) ;
	ArcSource(aa) == pnmlcoremodel_Node_etiq(pnmlcoremodel_source(aa)) ;
	Arc_val(aa) == ((inscription ; PTArcAnnotation_text) \/ (Arc - dom(inscription))*{1})(aa);
	Place_mark(pp) == ((initialMarking ; PTMarking_text) \/ (Place - dom(initialMarking))*{0})(pp) ;
	"LibraryIO.def"
VARIABLES
	gen
INVARIANT
	gen : BOOL
INITIALISATION

gen := bool(

printf("~w~n",["MACHINE prod_cons"]) &

printf("~w~n",["DEFINITIONS"]) &

!aa.(aa : Arc => 
	(aa : dom(pnmlcoremodel_target |> pnmlcoremodel_Transition) 
		& printf("   ~w_~w == ~w >= ",[ArcSource(aa),ArcTarget(aa),ArcSource(aa)])
		& printf("~w;~n",[Arc_val(aa)])
		& printf("   ~w == ~w := ~w - ",[pnmlcoremodel_Arc_etiq(aa),ArcSource(aa),ArcSource(aa)])
		& printf("~w;~n",[Arc_val(aa)])
		)
	or
	(aa : dom(pnmlcoremodel_source |> pnmlcoremodel_Transition) 
		& printf("   ~w_~w == ~w + ",[ArcSource(aa),ArcTarget(aa),ArcTarget(aa)])
		& printf("~w",[Arc_val(aa)])
		& printf(" <= ~w;~n",["MAXINT"])
		& printf("   ~w == ~w := ~w + ",[pnmlcoremodel_Arc_etiq(aa),ArcTarget(aa),ArcTarget(aa)])
		& printf("~w;~n",[Arc_val(aa)])
		)
) &

printf("~w~n",["CONCRETE_VARIABLES"]) &

!pp.(pp : Place => printf("   ~w,~n",[pnmlcoremodel_Node_etiq(pp)]))
& printf("   ~w~n",["kill"]) &

printf("~w~n",["INVARIANT"]) &

!pp.(pp : Place => printf("   ~w : NAT &~n",[pnmlcoremodel_Node_etiq(pp)])) & 
printf("   ~w~n",["kill : NAT"]) &

printf("~w~n",["INITIALISATION"]) &

!pp.(pp : Place 
				=> printf("   ~w := ",[pnmlcoremodel_Node_etiq(pp)])
				& printf("~w ;~n",[Place_mark(pp)])
			) & 
printf("   ~w~n",["kill := 0"]) &

printf("~w~n",["OPERATIONS"]) &

!tt.(tt : pnmlcoremodel_Transition 
	=> (printf("~w =~n   SELECT~n",[pnmlcoremodel_Node_etiq(tt)])
		& !aa.(aa : pnmlcoremodel_source~[{tt}] \/  pnmlcoremodel_target~[{tt}]
			=> printf("      ~w_~w &~n",[ArcSource(aa),ArcTarget(aa)]))
		& printf("      kill = 0~n   ~w~n",["THEN"])
		& !aa.(aa : pnmlcoremodel_source~[{tt}] \/  pnmlcoremodel_target~[{tt}]
			=> printf("      ~w;~n",[pnmlcoremodel_Arc_etiq(aa)]))
			& printf("      kill := 0~n   ~w~n",["END;"])
			)
		) &

printf("stop = BEGIN kill := 1 END~n~w~n",["END"])
)

END