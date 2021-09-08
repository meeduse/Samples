/* idmDay_main
 * Author: 
 * Creation date: 10/05/2021
 */
MACHINE
    idmDay_main
INCLUDES
    idmDay

OPERATIONS
    move(tt,ss)=
    PRE
        tt:Train
        & ss:Section
        & ss = next(position(tt))
        & ss /= position(tt)
    THEN
        Train_SetSection(tt,ss)
    END
    
    
END
