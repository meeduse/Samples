MACHINE
    Lift_Existing
CONCRETE_CONSTANTS 
    groundf, topf 
PROPERTIES 
    topf : INTEGER 
    & groundf : INTEGER 
    & (groundf < topf)
CONCRETE_VARIABLES 
    call_buttons, cur_floor, direction_up, door_open
INVARIANT
    cur_floor : (groundf .. topf) 
    & door_open : BOOL 
    & call_buttons : POW(groundf .. topf) 
    & direction_up : BOOL 
    & (door_open = TRUE => cur_floor : call_buttons)
INITIALISATION 
    cur_floor := (groundf) 
    || door_open := FALSE 
    || call_buttons := ({}) 
    || direction_up := TRUE
OPERATIONS
    move_up = 
    SELECT 
        door_open = FALSE 
        & cur_floor < topf 
        & direction_up = TRUE 
        & # cc.((cc : INTEGER) & ((cc : INTEGER) & (cc > cur_floor) & (cc : call_buttons))) 
        & (cur_floor /: call_buttons) 
    THEN
        cur_floor := ((cur_floor)+(1))
    END ;
    move_down = 
    SELECT 
        door_open = FALSE 
        & cur_floor > groundf 
        & (direction_up = FALSE) 
        & # cu.((cu : INTEGER) & ((cu : INTEGER) & (cu < cur_floor) & (cu : call_buttons))) 
        & (cur_floor /: call_buttons) 
    THEN
        cur_floor := ((cur_floor)-(1))
    END ;
    reverse_lift_up = 
    SELECT 
        direction_up = FALSE 
        & door_open = FALSE 
        & # cc.((cc : INTEGER) & ((cc : INTEGER) & (cc > cur_floor) & (cc : call_buttons))) 
        & ! ll.((ll : INTEGER) => (((ll : INTEGER) & (ll <= cur_floor) & (ll >= groundf)) => (ll /: call_buttons))) 
    THEN
        direction_up := TRUE
    END ;
    reverse_lift_down = 
    SELECT 
        direction_up = TRUE 
        & door_open = FALSE 
        & # cd.(cd : INTEGER & ((cd : INTEGER) & (cd < cur_floor) & (cd : call_buttons))) 
        & ! uu.(uu : INTEGER => (((uu : INTEGER) & (uu >= cur_floor) & (uu <= topf)) => (uu /: call_buttons))) 
    THEN
        direction_up := FALSE
    END ;
    open_door = 
    SELECT 
        door_open = FALSE 
        & (cur_floor : call_buttons) 
    THEN
        door_open := TRUE
    END ;
    close_door = 
    SELECT 
        door_open = TRUE 
    THEN
        door_open := FALSE 
        || call_buttons := ((call_buttons)-({cur_floor}))
    END ;
    push_call_button(fl) = 
    PRE 
        (fl : (groundf .. topf)) 
        & (fl /: call_buttons) 
    THEN 
        call_buttons := ((call_buttons)\/({fl}))
    END ;
    
    setValues(call_buttons_, cur_floor_,direction_up_,door_open_) =
    PRE
        cur_floor_ : (groundf .. topf) 
        & door_open_ : BOOL 
        & call_buttons_ : POW(groundf .. topf) 
        & direction_up_ : BOOL 
        & (door_open_ = TRUE => cur_floor_ : call_buttons_)
    THEN
        cur_floor := cur_floor_
        || door_open := door_open_
        || call_buttons := call_buttons_
        || direction_up := direction_up_
    END  
END
