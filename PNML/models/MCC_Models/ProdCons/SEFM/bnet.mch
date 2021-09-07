MACHINE bnet
DEFINITIONS
   pending_start == pending >= 1;
   a1 == pending := pending - 1;
   consume_ready == ready + 1 <= MAXINT;
   a10 == ready := ready + 1;
   bound_produce == bound >= 1;
   a11 == bound := bound - 1;
   consume_bound == bound + 5 <= MAXINT;
   a12 == bound := bound + 5;
   start_progress == progress + 1 <= MAXINT;
   a2 == progress := progress + 1;
   progress_produce == progress >= 1;
   a3 == progress := progress - 1;
   produce_pending == pending + 1 <= MAXINT;
   a4 == pending := pending + 1;
   produce_buffer == buffer + 1 <= MAXINT;
   a5 == buffer := buffer + 1;
   buffer_request == buffer >= 5;
   a6 == buffer := buffer - 5;
   ready_request == ready >= 1;
   a7 == ready := ready - 1;
   request_accept == accept + 1 <= MAXINT;
   a8 == accept := accept + 1;
   accept_consume == accept >= 1;
   a9 == accept := accept - 1;
ABSTRACT_VARIABLES
   pending,
   progress,
   buffer,
   ready,
   accept,
   bound
INVARIANT
   pending : NAT &
   progress : NAT &
   buffer : NAT &
   ready : NAT &
   accept : NAT &
   bound : NAT 
INITIALISATION
   pending := 1 ;
   progress := 0 ;
   buffer := 0 ;
   ready := 1 ;
   accept := 0 ;
   bound := 10 
OPERATIONS
consume =
   SELECT
      consume_ready &
      consume_bound &
      accept_consume 
   THEN
      a10;
      a12;
      a9
   END;
start =
   SELECT
      pending_start &
      start_progress 
   THEN
      a1;
      a2
   END;
produce =
   SELECT
      bound_produce &
      progress_produce &
      produce_pending &
      produce_buffer 
   THEN
      a11;
      a3;
      a4;
      a5
   END;
request =
   SELECT
      buffer_request &
      ready_request &
      request_accept 
   THEN
      a6;
      a7;
      a8
   END
END