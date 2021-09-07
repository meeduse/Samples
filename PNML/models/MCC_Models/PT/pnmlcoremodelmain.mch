MACHINE
    pnmlcoremodelmain
INCLUDES
    pnmlcoremodel

DEFINITIONS

    SET_PREF_SHOW_EVENTB_ANY_VALUES == TRUE ;
    SET_PREF_MAX_OPERATIONS == 40 ;
    SET_PREF_MAXINT == 100 ;
	
    inputs(tt) ==   {pp, aa | pp : Place & aa : Arc 
                                & source(aa) = pp & target(aa) = tt
                                & Arc_value(aa) <= Place_marking(pp)
                            } ;
    outputs(tt) ==   {pp, aa | pp : Place & aa : Arc 
                                & target(aa) = pp & source(aa) = tt
                            } ;
    consume(tt) == {pp, nn | pp : dom(inputs(tt)) & nn = Place_marking(pp) - Arc_value(inputs(tt)(pp))} ;
    produce(tt) == {pp, nn | pp : dom(outputs(tt)) & nn = Place_marking(pp) + Arc_value(outputs(tt)(pp))}

INITIALISATION
    initialize

OPERATIONS
fire= 
    ANY tt WHERE
        tt : Transition &
        card(inputs(tt)) = card(target~[{tt}])
    THEN
		updateMarking(consume(tt)) ;
		updateMarking(produce(tt))
    END
END
