/* 
 * Author: A. Idani (Meeduse)
 * Creation date: 10/05/2021
 * Remove the comments to avoid train collision
 */
MACHINE
    idmDay_main
INCLUDES
    idmDay
/* INVARIANT
    position : Train >-> Section */
OPERATIONS
move(tt,ss)=
    PRE
        tt:Train
        & ss:Section
        & ss = next(position(tt))
        & ss /= position(tt)
        /* & ss /: ran(position) */
    THEN
        Train_SetSection(tt,ss)
    END
    
    
END
