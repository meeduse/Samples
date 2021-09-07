MACHINE linkage
INCLUDES bnet.bnet, pnml.ptnet
DEFINITIONS
    P_PNML == pnml.Place ; P_BNET == bnet.Place ;
    T_PNML == pnml.pnmlcoremodel_Transition ; T_BNET == bnet.Transition ;
    Ac_PNML == (P_PNML <| pnml.pnmlcoremodel_source~ ; pnml.pnmlcoremodel_target |> pnml.pnmlcoremodel_Transition) ; 
    Ac_BNET == (bnet.grds |> bnet.Consumption ; bnet.pGrd)~ ;
    Ap_PNML == (P_PNML <| pnml.pnmlcoremodel_target~ ; pnml.pnmlcoremodel_source |> pnml.pnmlcoremodel_Transition)~ ;
    Ap_BNET == (bnet.grds |> bnet.Production ; bnet.pGrd)
    
    ; v_BNET == (bnet.initP~; bnet.InitialMarking_token)
    ; v_PNML == pnml.Place_marking
    
    ; u_BNET == ((bnet.pGrd >< bnet.grds~)~ ; bnet.Guard_token)
    ; u_PNML == pnml.Arc_value
    
    ; mapPlace == (bnet.Place_name ; pnml.pnmlcoremodel_Node_etiq~)
    ; mapTrans == (bnet.Transition_name ; pnml.pnmlcoremodel_Node_etiq~)
    ; mapConsArc(pp,tt) == (pnml.pnmlcoremodel_source >< pnml.pnmlcoremodel_target)~(mapPlace(pp)|->mapTrans(tt))
    ; mapProdArc(tt,pp) == (pnml.pnmlcoremodel_source >< pnml.pnmlcoremodel_target)~(mapTrans(tt)|->mapPlace(pp))
    /*(grds |> Consumption ; pGrd)~ /= {} &
	(grds |> Production ; pGrd) /= {} &
	(initP~;InitialMarking_token) /= {}&
	((pGrd >< grds~)~ ; Guard_token) /= {} */
INITIALISATION
pnml.initialize
INVARIANT
    pnml.pnmlcoremodel_Node_etiq[P_PNML] = bnet.Place_name[P_BNET] &
    pnml.pnmlcoremodel_Node_etiq[T_PNML] = bnet.Transition_name[T_BNET] &
    Ac_BNET = {pp,tt| pp : P_BNET & tt : T_BNET & (mapPlace(pp)|->mapTrans(tt)) : Ac_PNML} &
    Ap_BNET = {tt,pp| tt : T_BNET & pp : P_BNET & (mapTrans(tt)|->mapPlace(pp)) : Ap_PNML} &
    v_BNET = {pp,vv| pp: P_BNET & vv : NATURAL & (mapPlace(pp)|->vv) : v_PNML} &
    u_BNET = {pp, tt, vv | pp : P_BNET & tt : T_BNET & vv : NAT1 
                                        & (((pp|->tt) : Ac_BNET & (mapConsArc(pp,tt),vv) : u_PNML)
                                        or ((tt|->pp) : Ap_BNET & (mapProdArc(tt,pp),vv) : u_PNML))} 
    
END
