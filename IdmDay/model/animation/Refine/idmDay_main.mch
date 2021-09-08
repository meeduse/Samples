MACHINE
	idmDay_main
INCLUDES
	idmDayRef
INVARIANT
    position : Train >-> Section
OPERATIONS
    move(tt,ss) =
    PRE
        tt:Train
        & ss:Section
        & position(tt) /= ss
        & ss /: ran(position)
        & next(position(tt)) = ss
    THEN
        Train_SetPosition(tt,ss) 
    END
    
    
END