/* 
 * Author: Akram Idani
 * Creation date: 09/09/2021
 */

MACHINE gpuScheduler_main

INCLUDES
	gpuScheduler
DEFINITIONS
    SET_PREF_SHOW_EVENTB_ANY_VALUES == TRUE ;
    SET_PREF_MAX_OPERATIONS == 40 ;
    SET_PREF_MAXINT == 100 ;
VARIABLES
    Ready
INVARIANT
    Ready <: Process &
    dom(running) /\ Ready  = {} &
    (# gpu . (gpu : Gpu & Gpu_size(gpu) > 0) => Ready = {})
INITIALISATION
    Ready := {}
OPERATIONS
purge = 
    ANY pp WHERE
        pp : Process - (dom(running) \/ Ready)
    THEN
        Process_Free(pp)
    END ;
enqueue = 
    ANY pp,ss WHERE
        pp : (PROCESS - Process) & ss : Server  
    THEN
        Process_NEW(pp) ;
        Server_AddPocesses(ss,pp)
    END ;
ready = 
    ANY pp WHERE
        pp : Process - (dom(running) \/ Ready)
    THEN
        IF # gpu . (gpu : Gpu & Gpu_size(gpu) > 0) THEN
            ANY gg WHERE gg : Gpu & Gpu_size(gg) > 0 THEN
                Process_SetGpu(pp,gg) ;
                Gpu_SetSize(gg, Gpu_size(gg) - 1)
            END
        ELSE
            Ready := Ready \/ {pp}
        END        
    END ;
    
swap = 
    ANY pp, gp WHERE
        pp : dom(running) & gp : Gpu & gp = running(pp)
        & Gpu_size(gp) < MAXINT
    THEN
        Process_UnsetGpu(pp) ;
        IF Ready /= {} THEN
            ANY gg WHERE
                gg : Ready
            THEN
                Ready := Ready - {gg} ||
                Process_SetGpu(gg,gp) 
            END
         ELSE
             Gpu_SetSize(gp, Gpu_size(gp) + 1)
         END
    END
END