
MACHINE
    M0_Existing
    
SETS 
    StateTTD =  {freeT,occupiedT};
    TRAINS  ;
    TrainKind = {TimErtms, Ertms, NoErtms}

CONSTANTS 
          Ttds,
          minTTD, 
          maxTTD, // TTD is an interval of naturals
          trainKind, // TTD is an interval of naturals
          Trains, // TTD is an interval of naturals
          Cars // TTD is an interval of naturals
PROPERTIES
  Trains : FIN(TRAINS)
  & Cars : FIN(TRAINS)
  & minTTD : NAT1
  & maxTTD : NAT1
  & minTTD <= maxTTD
  & Ttds = minTTD..maxTTD
  & trainKind : Trains --> TrainKind

//& card(TRAINS) = 3 // Added later by us
//& {TimErtms, Ertms, NoErtms} <: ran(trainKind) // Added later by us

//& minTTD = 1 // Added later by us
//& maxTTD = 3 // Added later by us

VARIABLES 
          
    stateTTD,
    trainOccupationTTDFront,
    trainOccupationTTDRear,
    isConnected,
    supervisor 
INVARIANT
    stateTTD : Ttds --> StateTTD
    & trainOccupationTTDFront : TRAINS +-> Ttds
    & trainOccupationTTDRear : dom(trainOccupationTTDFront) --> Ttds
    & !tr . (tr: dom(trainOccupationTTDFront) => trainOccupationTTDRear(tr) <= trainOccupationTTDFront(tr))
    & isConnected : trainKind~[{Ertms,TimErtms}] --> BOOL
    & supervisor : BOOL

INITIALISATION
    
	
stateTTD := Ttds * {occupiedT} ||
    trainOccupationTTDRear := {} ||
    trainOccupationTTDFront := {} ||
    isConnected := trainKind~[{Ertms, TimErtms}] * {FALSE} ||
    supervisor := TRUE



OPERATIONS
trainSupervisor =
    ANY 
        ttds, active 
    WHERE
        ttds=(UNION tr.(tr: dom(trainOccupationTTDFront) | trainOccupationTTDRear(tr)..trainOccupationTTDFront(tr)))
        & supervisor = TRUE
        & active: BOOL
    THEN
        stateTTD := (ttds * {occupiedT}) \/ ((Ttds - ttds)*{freeT}) ||
        supervisor := active
  END ;


trainEntring =
    ANY tr 
    WHERE
      tr: TRAINS - dom(trainOccupationTTDFront) 
      & supervisor = FALSE
      & tr : Trains
    THEN
      trainOccupationTTDFront(tr) := minTTD ||
      trainOccupationTTDRear(tr) := minTTD ||
      supervisor := TRUE
  END;
trainMovingInSameTTD = 
    ANY tr 
    WHERE
      tr: dom(trainOccupationTTDFront) 
      & supervisor = FALSE 
      & tr : Trains
    THEN
      supervisor := TRUE
  END;
trainMovingFrontNextTTD =
    ANY tr, newFront 
    WHERE
      tr : dom(trainOccupationTTDFront)
      & trainOccupationTTDFront(tr) < maxTTD
      & supervisor = FALSE
      & newFront = trainOccupationTTDFront(tr) + 1
      & tr : Trains
    THEN
      trainOccupationTTDFront(tr) := newFront ||
      supervisor := TRUE
    END;
trainMovingRearNextTTD =
    ANY tr, newRear 
    WHERE
      tr : dom(trainOccupationTTDFront)
      & trainOccupationTTDRear(tr) < trainOccupationTTDFront(tr)
      & supervisor = FALSE
      & newRear = trainOccupationTTDRear(tr) + 1
      & tr : Trains
    THEN
      trainOccupationTTDRear(tr) := newRear ||
      supervisor := TRUE
  END;
  
trainExiting = 
    ANY tr 
    WHERE
      tr : dom(trainOccupationTTDFront)
      & trainOccupationTTDRear(tr) = maxTTD
      & supervisor = FALSE
    THEN
      trainOccupationTTDFront := {tr} <<| trainOccupationTTDFront ||
      trainOccupationTTDRear := {tr} <<| trainOccupationTTDRear ||
      supervisor := TRUE
  END;
  
trainConnect = 
    ANY tr 
    WHERE
      tr : Trains
      & trainKind(tr) : {Ertms,TimErtms}
      & isConnected(tr) = FALSE
      & supervisor = FALSE
    THEN
      isConnected(tr) := TRUE ||
      supervisor := TRUE
  END;
  
trainDisconnect = 
    ANY tr 
    WHERE
      tr : dom(isConnected) & isConnected(tr)=TRUE
      & supervisor = FALSE
    THEN
      isConnected(tr) := FALSE ||
      supervisor := TRUE
  END;
  
 trainSplit = 
    ANY tr, car, td 
    WHERE
      tr : Trains & tr : dom(trainOccupationTTDFront)
      & car : Cars -  dom(trainOccupationTTDFront)
      & td : Ttds & td : trainOccupationTTDRear(tr)..trainOccupationTTDFront(tr)
      & supervisor = TRUE
      & FALSE = TRUE
    THEN
      trainOccupationTTDRear := ({tr}<<|trainOccupationTTDRear) \/ {tr|->td, car|->trainOccupationTTDRear(tr)} ||
      trainOccupationTTDFront(car) := td ||
      supervisor := FALSE
  END; 
TimerExipation =
    SELECT
        supervisor = FALSE
    THEN
        supervisor := TRUE

    END;
    
muteTimerExpire = 
BEGIN
    skip
END;

disconectTimerExpire = 
BEGIN
    skip
END;
ghostTimerExpire = 
BEGIN
    skip
END;

assignMANoErtmsTrain =
BEGIN
    skip
END;
               
assignMAErtmsTrain = 
BEGIN
    skip
END
    

END