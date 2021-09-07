MACHINE

    pnmlcoremodel


SETS

    ID_AS={aNewID_AS, e31, e30, e33, e32, e35, e34, e37, e36, e39, e38, p10, p12, p11, e40, e42, e41, e44, e43, e46, page_1, e45, e48, e47, e49, t0, t1, t2, t3, p0, t4, e51, p1, t5, e50, p2, t6, e53, p3, t7, e52, p4, t8, e55, p5, t9, e54, p6, e57, p7, e56, p8, e59, p9, e58, SatelliteMemory_PT, e60, e62, e61, e64, e63, e26, e25, e28, e27, e29} ;
    LABEL={aNewLABEL, at_12, at_9, at_8, at_11, pt_1, pt_2, at_5, at_4, at_7, at_10, at_6, aLabelId, pt_7, at_1, pt_8, at_3, at_2, pt_3, pt_4, pt_5, pt_6}
    
ABSTRACT_VARIABLES

    ID, Label, Object, PTMarking, PTArcAnnotation, Node, Arc, PlaceNode, TransitionNode, Place, Transition, source, target, initialMarking, inscription, Place_marking, PTMarking_text, Arc_value, PTArcAnnotation_text

INVARIANT

    ID : FIN(ID_AS) & 
    Label : FIN(LABEL) & 
    Object <: ID & 
    PTMarking <: Label & 
    PTArcAnnotation <: Label & 
    Node <: Object & 
    Arc <: Object & 
    PlaceNode <: Node & 
    TransitionNode <: Node & 
    Place <: PlaceNode & 
    Transition <: TransitionNode & 
    source : Arc --> Node & 
    target : Arc --> Node & 
    initialMarking : Place >+> PTMarking & 
    inscription : Arc >+> PTArcAnnotation & 
    Place_marking : Place --> INTEGER & 
    PTMarking_text : PTMarking --> NATURAL & 
    Arc_value : Arc --> INTEGER & 
    PTArcAnnotation_text : PTArcAnnotation --> NATURAL & 
    PTArcAnnotation /\ PTMarking = {} & 
    Node /\ Arc = {} & 
    PlaceNode /\ TransitionNode = {}

INITIALISATION
    
    ID := {SatelliteMemory_PT, page_1, p0, p1, p10, p11, p12, p2, p3, p4, p5, p6, p7, p8, p9, t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, e25, e26, e27, e28, e29, e30, e31, e32, e33, e34, e35, e36, e37, e38, e39, e40, e41, e42, e43, e44, e45, e46, e47, e48, e49, e50, e51, e52, e53, e54, e55, e56, e57, e58, e59, e60, e61, e62, e63, e64} ||
    Label := {aLabelId, aLabelId, pt_3, aLabelId, aLabelId, pt_7, aLabelId, pt_2, aLabelId, aLabelId, pt_1, aLabelId, aLabelId, pt_5, aLabelId, aLabelId, pt_8, aLabelId, aLabelId, pt_4, aLabelId, pt_6, aLabelId, aLabelId, aLabelId, aLabelId, aLabelId, aLabelId, aLabelId, aLabelId, aLabelId, aLabelId, at_7, at_8, at_10, at_11, at_12, at_2, at_3, at_6, at_4, at_1, at_9, at_5} ||
    Object := {page_1, p0, p1, p10, p11, p12, p2, p3, p4, p5, p6, p7, p8, p9, t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, e25, e26, e27, e28, e29, e30, e31, e32, e33, e34, e35, e36, e37, e38, e39, e40, e41, e42, e43, e44, e45, e46, e47, e48, e49, e50, e51, e52, e53, e54, e55, e56, e57, e58, e59, e60, e61, e62, e63, e64} ||
    PTMarking := {pt_3, pt_7, pt_2, pt_1, pt_5, pt_8, pt_4, pt_6} ||
    PTArcAnnotation := {at_7, at_8, at_10, at_11, at_12, at_2, at_3, at_6, at_4, at_1, at_9, at_5} ||
    Node := {page_1, p0, p1, p10, p11, p12, p2, p3, p4, p5, p6, p7, p8, p9, t0, t1, t2, t3, t4, t5, t6, t7, t8, t9} ||
    PlaceNode := {p0, p1, p10, p11, p12, p2, p3, p4, p5, p6, p7, p8, p9} ||
    TransitionNode := {t0, t1, t2, t3, t4, t5, t6, t7, t8, t9} ||
    Arc := {e25, e26, e27, e28, e29, e30, e31, e32, e33, e34, e35, e36, e37, e38, e39, e40, e41, e42, e43, e44, e45, e46, e47, e48, e49, e50, e51, e52, e53, e54, e55, e56, e57, e58, e59, e60, e61, e62, e63, e64, e25, e26, e27, e28, e29, e30, e31, e32, e33, e34, e35, e36, e37, e38, e39, e40, e41, e42, e43, e44, e45, e46, e47, e48, e49, e50, e51, e52, e53, e54, e55, e56, e57, e58, e59, e60, e61, e62, e63, e64} ||
    Place := {p0, p1, p10, p11, p12, p2, p3, p4, p5, p6, p7, p8, p9, p0, p1, p10, p11, p12, p2, p3, p4, p5, p6, p7, p8, p9} ||
    Transition := {t0, t1, t2, t3, t4, t5, t6, t7, t8, t9} ||
    source := {(e60|->p0), (e28|->p1), (e42|->p10), (e35|->p11), (e25|->p12), (e38|->p12), (e43|->p12), (e50|->p12), (e61|->p2), (e33|->p3), (e39|->p3), (e36|->p4), (e62|->p4), (e44|->p5), (e57|->p5), (e29|->p6), (e63|->p6), (e51|->p7), (e45|->p8), (e55|->p9), (e47|->t0), (e58|->t0), (e26|->t1), (e27|->t1), (e64|->t1), (e30|->t2), (e31|->t2), (e32|->t2), (e34|->t3), (e37|->t4), (e40|->t5), (e41|->t5), (e46|->t6), (e48|->t6), (e49|->t6), (e52|->t7), (e53|->t7), (e54|->t7), (e56|->t8), (e59|->t9), (e25|->p12), (e26|->t1), (e27|->t1), (e28|->p1), (e29|->p6), (e30|->t2), (e31|->t2), (e32|->t2), (e33|->p3), (e34|->t3), (e35|->p11), (e36|->p4), (e37|->t4), (e38|->p12), (e39|->p3), (e40|->t5), (e41|->t5), (e42|->p10), (e43|->p12), (e44|->p5), (e45|->p8), (e46|->t6), (e47|->t0), (e48|->t6), (e49|->t6), (e50|->p12), (e51|->p7), (e52|->t7), (e53|->t7), (e54|->t7), (e55|->p9), (e56|->t8), (e57|->p5), (e58|->t0), (e59|->t9), (e60|->p0), (e61|->p2), (e62|->p4), (e63|->p6), (e64|->t1), (e60|->p0), (e28|->p1), (e42|->p10), (e35|->p11), (e25|->p12), (e38|->p12), (e43|->p12), (e50|->p12), (e61|->p2), (e33|->p3), (e39|->p3), (e36|->p4), (e62|->p4), (e44|->p5), (e57|->p5), (e29|->p6), (e63|->p6), (e51|->p7), (e45|->p8), (e55|->p9), (e47|->t0), (e58|->t0), (e26|->t1), (e27|->t1), (e64|->t1), (e30|->t2), (e31|->t2), (e32|->t2), (e34|->t3), (e37|->t4), (e40|->t5), (e41|->t5), (e46|->t6), (e48|->t6), (e49|->t6), (e52|->t7), (e53|->t7), (e54|->t7), (e56|->t8), (e59|->t9), (e25|->p12), (e26|->t1), (e27|->t1), (e28|->p1), (e29|->p6), (e30|->t2), (e31|->t2), (e32|->t2), (e33|->p3), (e34|->t3), (e35|->p11), (e36|->p4), (e37|->t4), (e38|->p12), (e39|->p3), (e40|->t5), (e41|->t5), (e42|->p10), (e43|->p12), (e44|->p5), (e45|->p8), (e46|->t6), (e47|->t0), (e48|->t6), (e49|->t6), (e50|->p12), (e51|->p7), (e52|->t7), (e53|->t7), (e54|->t7), (e55|->p9), (e56|->t8), (e57|->p5), (e58|->t0), (e59|->t9), (e60|->p0), (e61|->p2), (e62|->p4), (e63|->p6), (e64|->t1), (e60|->p0), (e28|->p1), (e42|->p10), (e35|->p11), (e25|->p12), (e38|->p12), (e43|->p12), (e50|->p12), (e61|->p2), (e33|->p3), (e39|->p3), (e36|->p4), (e62|->p4), (e44|->p5), (e57|->p5), (e29|->p6), (e63|->p6), (e51|->p7), (e45|->p8), (e55|->p9), (e47|->t0), (e58|->t0), (e26|->t1), (e27|->t1), (e64|->t1), (e30|->t2), (e31|->t2), (e32|->t2), (e34|->t3), (e37|->t4), (e40|->t5), (e41|->t5), (e46|->t6), (e48|->t6), (e49|->t6), (e52|->t7), (e53|->t7), (e54|->t7), (e56|->t8), (e59|->t9), (e60|->p0), (e28|->p1), (e42|->p10), (e35|->p11), (e25|->p12), (e38|->p12), (e43|->p12), (e50|->p12), (e61|->p2), (e33|->p3), (e39|->p3), (e36|->p4), (e62|->p4), (e44|->p5), (e57|->p5), (e29|->p6), (e63|->p6), (e51|->p7), (e45|->p8), (e55|->p9), (e47|->t0), (e58|->t0), (e26|->t1), (e27|->t1), (e64|->t1), (e30|->t2), (e31|->t2), (e32|->t2), (e34|->t3), (e37|->t4), (e40|->t5), (e41|->t5), (e46|->t6), (e48|->t6), (e49|->t6), (e52|->t7), (e53|->t7), (e54|->t7), (e56|->t8), (e59|->t9), (e60|->p0), (e28|->p1), (e42|->p10), (e35|->p11), (e25|->p12), (e38|->p12), (e43|->p12), (e50|->p12), (e61|->p2), (e33|->p3), (e39|->p3), (e36|->p4), (e62|->p4), (e44|->p5), (e57|->p5), (e29|->p6), (e63|->p6), (e51|->p7), (e45|->p8), (e55|->p9), (e47|->t0), (e58|->t0), (e26|->t1), (e27|->t1), (e64|->t1), (e30|->t2), (e31|->t2), (e32|->t2), (e34|->t3), (e37|->t4), (e40|->t5), (e41|->t5), (e46|->t6), (e48|->t6), (e49|->t6), (e52|->t7), (e53|->t7), (e54|->t7), (e56|->t8), (e59|->t9), (e25|->p12), (e26|->t1), (e27|->t1), (e28|->p1), (e29|->p6), (e30|->t2), (e31|->t2), (e32|->t2), (e33|->p3), (e34|->t3), (e35|->p11), (e36|->p4), (e37|->t4), (e38|->p12), (e39|->p3), (e40|->t5), (e41|->t5), (e42|->p10), (e43|->p12), (e44|->p5), (e45|->p8), (e46|->t6), (e47|->t0), (e48|->t6), (e49|->t6), (e50|->p12), (e51|->p7), (e52|->t7), (e53|->t7), (e54|->t7), (e55|->p9), (e56|->t8), (e57|->p5), (e58|->t0), (e59|->t9), (e60|->p0), (e61|->p2), (e62|->p4), (e63|->p6), (e64|->t1), (e60|->p0), (e28|->p1), (e42|->p10), (e35|->p11), (e25|->p12), (e38|->p12), (e43|->p12), (e50|->p12), (e61|->p2), (e33|->p3), (e39|->p3), (e36|->p4), (e62|->p4), (e44|->p5), (e57|->p5), (e29|->p6), (e63|->p6), (e51|->p7), (e45|->p8), (e55|->p9), (e25|->p12), (e26|->t1), (e27|->t1), (e28|->p1), (e29|->p6), (e30|->t2), (e31|->t2), (e32|->t2), (e33|->p3), (e34|->t3), (e35|->p11), (e36|->p4), (e37|->t4), (e38|->p12), (e39|->p3), (e40|->t5), (e41|->t5), (e42|->p10), (e43|->p12), (e44|->p5), (e45|->p8), (e46|->t6), (e47|->t0), (e48|->t6), (e49|->t6), (e50|->p12), (e51|->p7), (e52|->t7), (e53|->t7), (e54|->t7), (e55|->p9), (e56|->t8), (e57|->p5), (e58|->t0), (e59|->t9), (e60|->p0), (e61|->p2), (e62|->p4), (e63|->p6), (e64|->t1)} ||
    target := {(e64|->p0), (e26|->p1), (e56|->p10), (e59|->p11), (e30|->p12), (e46|->p12), (e31|->p2), (e32|->p3), (e47|->p3), (e34|->p4), (e40|->p4), (e37|->p5), (e48|->p5), (e27|->p6), (e41|->p6), (e52|->p6), (e58|->p6), (e49|->p7), (e53|->p8), (e54|->p9), (e25|->t0), (e36|->t0), (e60|->t1), (e61|->t1), (e62|->t1), (e63|->t1), (e28|->t2), (e29|->t2), (e33|->t3), (e35|->t4), (e38|->t5), (e39|->t5), (e42|->t6), (e43|->t6), (e44|->t6), (e45|->t6), (e50|->t7), (e51|->t7), (e55|->t8), (e57|->t9), (e25|->t0), (e26|->p1), (e27|->p6), (e28|->t2), (e29|->t2), (e30|->p12), (e31|->p2), (e32|->p3), (e33|->t3), (e34|->p4), (e35|->t4), (e36|->t0), (e37|->p5), (e38|->t5), (e39|->t5), (e40|->p4), (e41|->p6), (e42|->t6), (e43|->t6), (e44|->t6), (e45|->t6), (e46|->p12), (e47|->p3), (e48|->p5), (e49|->p7), (e50|->t7), (e51|->t7), (e52|->p6), (e53|->p8), (e54|->p9), (e55|->t8), (e56|->p10), (e57|->t9), (e58|->p6), (e59|->p11), (e60|->t1), (e61|->t1), (e62|->t1), (e63|->t1), (e64|->p0), (e64|->p0), (e26|->p1), (e56|->p10), (e59|->p11), (e30|->p12), (e46|->p12), (e31|->p2), (e32|->p3), (e47|->p3), (e34|->p4), (e40|->p4), (e37|->p5), (e48|->p5), (e27|->p6), (e41|->p6), (e52|->p6), (e58|->p6), (e49|->p7), (e53|->p8), (e54|->p9), (e25|->t0), (e36|->t0), (e60|->t1), (e61|->t1), (e62|->t1), (e63|->t1), (e28|->t2), (e29|->t2), (e33|->t3), (e35|->t4), (e38|->t5), (e39|->t5), (e42|->t6), (e43|->t6), (e44|->t6), (e45|->t6), (e50|->t7), (e51|->t7), (e55|->t8), (e57|->t9), (e25|->t0), (e26|->p1), (e27|->p6), (e28|->t2), (e29|->t2), (e30|->p12), (e31|->p2), (e32|->p3), (e33|->t3), (e34|->p4), (e35|->t4), (e36|->t0), (e37|->p5), (e38|->t5), (e39|->t5), (e40|->p4), (e41|->p6), (e42|->t6), (e43|->t6), (e44|->t6), (e45|->t6), (e46|->p12), (e47|->p3), (e48|->p5), (e49|->p7), (e50|->t7), (e51|->t7), (e52|->p6), (e53|->p8), (e54|->p9), (e55|->t8), (e56|->p10), (e57|->t9), (e58|->p6), (e59|->p11), (e60|->t1), (e61|->t1), (e62|->t1), (e63|->t1), (e64|->p0), (e64|->p0), (e26|->p1), (e56|->p10), (e59|->p11), (e30|->p12), (e46|->p12), (e31|->p2), (e32|->p3), (e47|->p3), (e34|->p4), (e40|->p4), (e37|->p5), (e48|->p5), (e27|->p6), (e41|->p6), (e52|->p6), (e58|->p6), (e49|->p7), (e53|->p8), (e54|->p9), (e25|->t0), (e36|->t0), (e60|->t1), (e61|->t1), (e62|->t1), (e63|->t1), (e28|->t2), (e29|->t2), (e33|->t3), (e35|->t4), (e38|->t5), (e39|->t5), (e42|->t6), (e43|->t6), (e44|->t6), (e45|->t6), (e50|->t7), (e51|->t7), (e55|->t8), (e57|->t9), (e64|->p0), (e26|->p1), (e56|->p10), (e59|->p11), (e30|->p12), (e46|->p12), (e31|->p2), (e32|->p3), (e47|->p3), (e34|->p4), (e40|->p4), (e37|->p5), (e48|->p5), (e27|->p6), (e41|->p6), (e52|->p6), (e58|->p6), (e49|->p7), (e53|->p8), (e54|->p9), (e25|->t0), (e36|->t0), (e60|->t1), (e61|->t1), (e62|->t1), (e63|->t1), (e28|->t2), (e29|->t2), (e33|->t3), (e35|->t4), (e38|->t5), (e39|->t5), (e42|->t6), (e43|->t6), (e44|->t6), (e45|->t6), (e50|->t7), (e51|->t7), (e55|->t8), (e57|->t9), (e64|->p0), (e26|->p1), (e56|->p10), (e59|->p11), (e30|->p12), (e46|->p12), (e31|->p2), (e32|->p3), (e47|->p3), (e34|->p4), (e40|->p4), (e37|->p5), (e48|->p5), (e27|->p6), (e41|->p6), (e52|->p6), (e58|->p6), (e49|->p7), (e53|->p8), (e54|->p9), (e25|->t0), (e36|->t0), (e60|->t1), (e61|->t1), (e62|->t1), (e63|->t1), (e28|->t2), (e29|->t2), (e33|->t3), (e35|->t4), (e38|->t5), (e39|->t5), (e42|->t6), (e43|->t6), (e44|->t6), (e45|->t6), (e50|->t7), (e51|->t7), (e55|->t8), (e57|->t9), (e25|->t0), (e26|->p1), (e27|->p6), (e28|->t2), (e29|->t2), (e30|->p12), (e31|->p2), (e32|->p3), (e33|->t3), (e34|->p4), (e35|->t4), (e36|->t0), (e37|->p5), (e38|->t5), (e39|->t5), (e40|->p4), (e41|->p6), (e42|->t6), (e43|->t6), (e44|->t6), (e45|->t6), (e46|->p12), (e47|->p3), (e48|->p5), (e49|->p7), (e50|->t7), (e51|->t7), (e52|->p6), (e53|->p8), (e54|->p9), (e55|->t8), (e56|->p10), (e57|->t9), (e58|->p6), (e59|->p11), (e60|->t1), (e61|->t1), (e62|->t1), (e63|->t1), (e64|->p0), (e64|->p0), (e26|->p1), (e56|->p10), (e59|->p11), (e30|->p12), (e46|->p12), (e31|->p2), (e32|->p3), (e47|->p3), (e34|->p4), (e40|->p4), (e37|->p5), (e48|->p5), (e27|->p6), (e41|->p6), (e52|->p6), (e58|->p6), (e49|->p7), (e53|->p8), (e54|->p9), (e25|->t0), (e26|->p1), (e27|->p6), (e28|->t2), (e29|->t2), (e30|->p12), (e31|->p2), (e32|->p3), (e33|->t3), (e34|->p4), (e35|->t4), (e36|->t0), (e37|->p5), (e38|->t5), (e39|->t5), (e40|->p4), (e41|->p6), (e42|->t6), (e43|->t6), (e44|->t6), (e45|->t6), (e46|->p12), (e47|->p3), (e48|->p5), (e49|->p7), (e50|->t7), (e51|->t7), (e52|->p6), (e53|->p8), (e54|->p9), (e55|->t8), (e56|->p10), (e57|->t9), (e58|->p6), (e59|->p11), (e60|->t1), (e61|->t1), (e62|->t1), (e63|->t1), (e64|->p0)} ||
    initialMarking := {(p0|->pt_3), (p10|->pt_7), (p11|->pt_2), (p2|->pt_1), (p4|->pt_5), (p6|->pt_8), (p8|->pt_4), (p9|->pt_6), (p0|->pt_3), (p10|->pt_7), (p11|->pt_2), (p2|->pt_1), (p4|->pt_5), (p6|->pt_8), (p8|->pt_4), (p9|->pt_6), (p0|->pt_3), (p10|->pt_7), (p11|->pt_2), (p2|->pt_1), (p4|->pt_5), (p6|->pt_8), (p8|->pt_4), (p9|->pt_6), (p0|->pt_3), (p10|->pt_7), (p11|->pt_2), (p2|->pt_1), (p4|->pt_5), (p6|->pt_8), (p8|->pt_4), (p9|->pt_6), (p0|->pt_3), (p10|->pt_7), (p11|->pt_2), (p2|->pt_1), (p4|->pt_5), (p6|->pt_8), (p8|->pt_4), (p9|->pt_6), (p0|->pt_3), (p10|->pt_7), (p11|->pt_2), (p2|->pt_1), (p4|->pt_5), (p6|->pt_8), (p8|->pt_4), (p9|->pt_6)} ||
    inscription := {(e25|->at_7), (e33|->at_8), (e34|->at_10), (e36|->at_11), (e38|->at_12), (e39|->at_2), (e40|->at_3), (e41|->at_6), (e47|->at_4), (e55|->at_1), (e56|->at_9), (e58|->at_5), (e25|->at_7), (e33|->at_8), (e34|->at_10), (e36|->at_11), (e38|->at_12), (e39|->at_2), (e40|->at_3), (e41|->at_6), (e47|->at_4), (e55|->at_1), (e56|->at_9), (e58|->at_5), (e25|->at_7), (e33|->at_8), (e34|->at_10), (e36|->at_11), (e38|->at_12), (e39|->at_2), (e40|->at_3), (e41|->at_6), (e47|->at_4), (e55|->at_1), (e56|->at_9), (e58|->at_5), (e25|->at_7), (e33|->at_8), (e34|->at_10), (e36|->at_11), (e38|->at_12), (e39|->at_2), (e40|->at_3), (e41|->at_6), (e47|->at_4), (e55|->at_1), (e56|->at_9), (e58|->at_5)} ||
    Place_marking := {(p0|->0), (p1|->0), (p10|->0), (p11|->0), (p12|->0), (p2|->0), (p3|->0), (p4|->0), (p5|->0), (p6|->0), (p7|->0), (p8|->0), (p9|->0), (p0|->0), (p1|->0), (p10|->0), (p11|->0), (p12|->0), (p2|->0), (p3|->0), (p4|->0), (p5|->0), (p6|->0), (p7|->0), (p8|->0), (p9|->0), (p0|->0), (p1|->0), (p10|->0), (p11|->0), (p12|->0), (p2|->0), (p3|->0), (p4|->0), (p5|->0), (p6|->0), (p7|->0), (p8|->0), (p9|->0), (p0|->0), (p1|->0), (p10|->0), (p11|->0), (p12|->0), (p2|->0), (p3|->0), (p4|->0), (p5|->0), (p6|->0), (p7|->0), (p8|->0), (p9|->0), (p0|->0), (p1|->0), (p10|->0), (p11|->0), (p12|->0), (p2|->0), (p3|->0), (p4|->0), (p5|->0), (p6|->0), (p7|->0), (p8|->0), (p9|->0), (p0|->0), (p1|->0), (p10|->0), (p11|->0), (p12|->0), (p2|->0), (p3|->0), (p4|->0), (p5|->0), (p6|->0), (p7|->0), (p8|->0), (p9|->0)} ||
    PTMarking_text := {(pt_3|->1), (pt_7|->3), (pt_2|->1), (pt_1|->1), (pt_5|->100), (pt_8|->94), (pt_4|->1), (pt_6|->97), (pt_3|->1), (pt_7|->3), (pt_2|->1), (pt_1|->1), (pt_5|->100), (pt_8|->94), (pt_4|->1), (pt_6|->97)} ||
    Arc_value := {(e25|->0), (e26|->0), (e27|->0), (e28|->0), (e29|->0), (e30|->0), (e31|->0), (e32|->0), (e33|->0), (e34|->0), (e35|->0), (e36|->0), (e37|->0), (e38|->0), (e39|->0), (e40|->0), (e41|->0), (e42|->0), (e43|->0), (e44|->0), (e45|->0), (e46|->0), (e47|->0), (e48|->0), (e49|->0), (e50|->0), (e51|->0), (e52|->0), (e53|->0), (e54|->0), (e55|->0), (e56|->0), (e57|->0), (e58|->0), (e59|->0), (e60|->0), (e61|->0), (e62|->0), (e63|->0), (e64|->0), (e25|->0), (e26|->0), (e27|->0), (e28|->0), (e29|->0), (e30|->0), (e31|->0), (e32|->0), (e33|->0), (e34|->0), (e35|->0), (e36|->0), (e37|->0), (e38|->0), (e39|->0), (e40|->0), (e41|->0), (e42|->0), (e43|->0), (e44|->0), (e45|->0), (e46|->0), (e47|->0), (e48|->0), (e49|->0), (e50|->0), (e51|->0), (e52|->0), (e53|->0), (e54|->0), (e55|->0), (e56|->0), (e57|->0), (e58|->0), (e59|->0), (e60|->0), (e61|->0), (e62|->0), (e63|->0), (e64|->0), (e25|->0), (e26|->0), (e27|->0), (e28|->0), (e29|->0), (e30|->0), (e31|->0), (e32|->0), (e33|->0), (e34|->0), (e35|->0), (e36|->0), (e37|->0), (e38|->0), (e39|->0), (e40|->0), (e41|->0), (e42|->0), (e43|->0), (e44|->0), (e45|->0), (e46|->0), (e47|->0), (e48|->0), (e49|->0), (e50|->0), (e51|->0), (e52|->0), (e53|->0), (e54|->0), (e55|->0), (e56|->0), (e57|->0), (e58|->0), (e59|->0), (e60|->0), (e61|->0), (e62|->0), (e63|->0), (e64|->0), (e25|->0), (e26|->0), (e27|->0), (e28|->0), (e29|->0), (e30|->0), (e31|->0), (e32|->0), (e33|->0), (e34|->0), (e35|->0), (e36|->0), (e37|->0), (e38|->0), (e39|->0), (e40|->0), (e41|->0), (e42|->0), (e43|->0), (e44|->0), (e45|->0), (e46|->0), (e47|->0), (e48|->0), (e49|->0), (e50|->0), (e51|->0), (e52|->0), (e53|->0), (e54|->0), (e55|->0), (e56|->0), (e57|->0), (e58|->0), (e59|->0), (e60|->0), (e61|->0), (e62|->0), (e63|->0), (e64|->0)} ||
    PTArcAnnotation_text := {(at_7|->94), (at_8|->100), (at_10|->100), (at_11|->6), (at_12|->94), (at_2|->94), (at_3|->94), (at_6|->94), (at_4|->6), (at_1|->100), (at_9|->100), (at_5|->94), (at_7|->94), (at_8|->100), (at_10|->100), (at_11|->6), (at_12|->94), (at_2|->94), (at_3|->94), (at_6|->94), (at_4|->6), (at_1|->100), (at_9|->100), (at_5|->94)}

OPERATIONS

    updateMarking(marking) = 
        PRE
            marking : Place <-> INTEGER
        THEN
            Place_marking := Place_marking <+ marking
        END
    ;
    initialize = 
        BEGIN
            Place_marking := (initialMarking ; PTMarking_text) \/ (Place - dom(initialMarking)) * {0} ||
            Arc_value := (inscription ; PTArcAnnotation_text) \/ (Arc - dom(inscription)) * {1}
        END
    ;
    PTMarking_NEW(aPTMarking) = 
        PRE
            aPTMarking : LABEL & 
            aPTMarking /: Label
        THEN
            PTMarking := PTMarking \/ {aPTMarking} ||
            Label := Label \/ {aPTMarking} ||
            PTMarking_text := PTMarking_text \/ {(aPTMarking |-> 0)}
        END
    ;
    PTArcAnnotation_NEW(aPTArcAnnotation) = 
        PRE
            aPTArcAnnotation : LABEL & 
            aPTArcAnnotation /: Label
        THEN
            PTArcAnnotation := PTArcAnnotation \/ {aPTArcAnnotation} ||
            Label := Label \/ {aPTArcAnnotation} ||
            PTArcAnnotation_text := PTArcAnnotation_text \/ {(aPTArcAnnotation |-> 1)}
        END
    ;
    Arc_NEW(aArc,aSource,aTarget) = 
        PRE
            aArc : ID_AS & 
            aSource : Node & 
            aTarget : Node & 
            aArc /: ID
        THEN
            Arc := Arc \/ {aArc} ||
            ID := ID \/ {aArc} ||
            Object := Object \/ {aArc} ||
            source := source \/ {(aArc |-> aSource)} ||
            target := target \/ {(aArc |-> aTarget)} ||
            Arc_value := Arc_value \/ {(aArc |-> 0)}
        END
    ;
    Place_NEW(aPlace) = 
        PRE
            aPlace : ID_AS & 
            aPlace /: ID
        THEN
            PlaceNode := PlaceNode \/ {aPlace} ||
            Node := Node \/ {aPlace} ||
            ID := ID \/ {aPlace} ||
            Place := Place \/ {aPlace} ||
            Object := Object \/ {aPlace} ||
            Place_marking := Place_marking \/ {(aPlace |-> 0)}
        END
    ;
    PTMarking_Free(aPTMarking) = 
        PRE
            aPTMarking : PTMarking
        THEN
            PTMarking := PTMarking - {aPTMarking} ||
            Label := Label - {aPTMarking} ||
            initialMarking := initialMarking |>> {aPTMarking} ||
            PTMarking_text := {aPTMarking} <<| PTMarking_text
        END
    ;
    PTArcAnnotation_Free(aPTArcAnnotation) = 
        PRE
            aPTArcAnnotation : PTArcAnnotation
        THEN
            PTArcAnnotation := PTArcAnnotation - {aPTArcAnnotation} ||
            Label := Label - {aPTArcAnnotation} ||
            inscription := inscription |>> {aPTArcAnnotation} ||
            PTArcAnnotation_text := {aPTArcAnnotation} <<| PTArcAnnotation_text
        END
    ;
    Arc_Free(aArc) = 
        PRE
            aArc : Arc
        THEN
            Arc := Arc - {aArc} ||
            ID := ID - {aArc} ||
            Object := Object - {aArc} ||
            source := {aArc} <<| source ||
            target := {aArc} <<| target ||
            inscription := {aArc} <<| inscription ||
            Arc_value := {aArc} <<| Arc_value
        END
    ;
    Place_Free(aPlace) = 
        PRE
            aPlace : Place & 
            source~[{aPlace}] = {} & 
            target~[{aPlace}] = {}
        THEN
            PlaceNode := PlaceNode - {aPlace} ||
            Node := Node - {aPlace} ||
            ID := ID - {aPlace} ||
            Place := Place - {aPlace} ||
            Object := Object - {aPlace} ||
            source := source |>> {aPlace} ||
            target := target |>> {aPlace} ||
            initialMarking := {aPlace} <<| initialMarking ||
            Place_marking := {aPlace} <<| Place_marking
        END
    ;
    result <-- Node_GetOut(aNode) = 
        PRE
            aNode : Node & 
            aNode : ran(source)
        THEN
            result := source~[{aNode}]
        END
    ;
    result <-- Node_GetIn(aNode) = 
        PRE
            aNode : Node & 
            aNode : ran(target)
        THEN
            result := target~[{aNode}]
        END
    ;
    result <-- Arc_GetSource(aArc) = 
        PRE
            aArc : Arc & 
            aArc : dom(source)
        THEN
            result := source(aArc)
        END
    ;
    result <-- Arc_GetTarget(aArc) = 
        PRE
            aArc : Arc & 
            aArc : dom(target)
        THEN
            result := target(aArc)
        END
    ;
    result <-- Place_GetInitialMarking(aPlace) = 
        PRE
            aPlace : Place & 
            aPlace : dom(initialMarking)
        THEN
            result := initialMarking(aPlace)
        END
    ;
    result <-- Arc_GetInscription(aArc) = 
        PRE
            aArc : Arc & 
            aArc : dom(inscription)
        THEN
            result := inscription(aArc)
        END
    ;
    Node_SetOut(aNode,theOut) = 
        PRE
            aNode : Node & 
            theOut : FIN(Arc) & 
            (theOut * {aNode}) /<: source & 
            source~[{aNode}] = {} & 
            !(added).(
                added : theOut
             => 
                source[{added}] = {}
            )
        THEN
            source := (source |>> {aNode}) \/ (theOut * {aNode})
        END
    ;
    Node_SetIn(aNode,theIn) = 
        PRE
            aNode : Node & 
            theIn : FIN(Arc) & 
            (theIn * {aNode}) /<: target & 
            target~[{aNode}] = {} & 
            !(added).(
                added : theIn
             => 
                target[{added}] = {}
            )
        THEN
            target := (target |>> {aNode}) \/ (theIn * {aNode})
        END
    ;
    Arc_SetSource(aArc,aSource) = 
        PRE
            aArc : Arc & 
            aSource : Node & 
            {(aArc |-> aSource)} /<: source
        THEN
            source := ({aArc} <<| source) \/ {(aArc |-> aSource)}
        END
    ;
    Arc_SetTarget(aArc,aTarget) = 
        PRE
            aArc : Arc & 
            aTarget : Node & 
            {(aArc |-> aTarget)} /<: target
        THEN
            target := ({aArc} <<| target) \/ {(aArc |-> aTarget)}
        END
    ;
    Place_SetInitialMarking(aPlace,aInitialMarking) = 
        PRE
            aPlace : Place & 
            aInitialMarking : PTMarking & 
            {(aPlace |-> aInitialMarking)} /<: initialMarking & 
            initialMarking~[{aInitialMarking}] = {}
        THEN
            initialMarking := ({aPlace} <<| initialMarking) \/ {(aPlace |-> aInitialMarking)}
        END
    ;
    Arc_SetInscription(aArc,aInscription) = 
        PRE
            aArc : Arc & 
            aInscription : PTArcAnnotation & 
            {(aArc |-> aInscription)} /<: inscription & 
            inscription~[{aInscription}] = {}
        THEN
            inscription := ({aArc} <<| inscription) \/ {(aArc |-> aInscription)}
        END
    ;
    Node_UnsetOut(aNode) = 
        PRE
            aNode : Node & 
            source~[{aNode}] = {}
        THEN
            source := source |>> {aNode}
        END
    ;
    Node_UnsetIn(aNode) = 
        PRE
            aNode : Node & 
            target~[{aNode}] = {}
        THEN
            target := target |>> {aNode}
        END
    ;
    Place_UnsetInitialMarking(aPlace) = 
        PRE
            aPlace : Place
        THEN
            initialMarking := {aPlace} <<| initialMarking
        END
    ;
    Arc_UnsetInscription(aArc) = 
        PRE
            aArc : Arc
        THEN
            inscription := {aArc} <<| inscription
        END
    ;
    Node_AddOut(aNode,aOut) = 
        PRE
            aNode : Node & 
            aOut : Arc & 
            (aOut |-> aNode) /: source & 
            source[{aOut}] = {}
        THEN
            source := source \/ {(aOut |-> aNode)}
        END
    ;
    Node_AddIn(aNode,aIn) = 
        PRE
            aNode : Node & 
            aIn : Arc & 
            (aIn |-> aNode) /: target & 
            target[{aIn}] = {}
        THEN
            target := target \/ {(aIn |-> aNode)}
        END
    ;
    Node_RemoveOut(aNode,aOut) = 
        PRE
            aNode : Node & 
            aOut : Arc & 
            (aOut |-> aNode) : source & 
            card(source[{aOut}]) >= 2
        THEN
            source := source - {(aOut |-> aNode)}
        END
    ;
    Node_RemoveIn(aNode,aIn) = 
        PRE
            aNode : Node & 
            aIn : Arc & 
            (aIn |-> aNode) : target & 
            card(target[{aIn}]) >= 2
        THEN
            target := target - {(aIn |-> aNode)}
        END
    ;
    Place_RemoveInitialMarking(aPlace,aInitialMarking) = 
        PRE
            aPlace : Place & 
            aInitialMarking : PTMarking & 
            (aPlace |-> aInitialMarking) : initialMarking
        THEN
            initialMarking := initialMarking - {(aPlace |-> aInitialMarking)}
        END
    ;
    Arc_RemoveInscription(aArc,aInscription) = 
        PRE
            aArc : Arc & 
            aInscription : PTArcAnnotation & 
            (aArc |-> aInscription) : inscription
        THEN
            inscription := inscription - {(aArc |-> aInscription)}
        END
    ;
    result <-- Place_GetMarking(aPlace) = 
        PRE
            aPlace : Place & 
            aPlace : dom(Place_marking)
        THEN
            result := Place_marking(aPlace)
        END
    ;
    result <-- PTMarking_GetText(aPTMarking) = 
        PRE
            aPTMarking : PTMarking & 
            aPTMarking : dom(PTMarking_text)
        THEN
            result := PTMarking_text(aPTMarking)
        END
    ;
    result <-- Arc_GetValue(aArc) = 
        PRE
            aArc : Arc & 
            aArc : dom(Arc_value)
        THEN
            result := Arc_value(aArc)
        END
    ;
    result <-- PTArcAnnotation_GetText(aPTArcAnnotation) = 
        PRE
            aPTArcAnnotation : PTArcAnnotation & 
            aPTArcAnnotation : dom(PTArcAnnotation_text)
        THEN
            result := PTArcAnnotation_text(aPTArcAnnotation)
        END
    ;
    Place_SetMarking(aPlace,aMarking) = 
        PRE
            aPlace : Place & 
            aMarking : INTEGER
        THEN
            Place_marking := ({aPlace} <<| Place_marking) \/ {(aPlace |-> aMarking)}
        END
    ;
    PTMarking_SetText(aPTMarking,aText) = 
        PRE
            aPTMarking : PTMarking & 
            aText : NATURAL
        THEN
            PTMarking_text := ({aPTMarking} <<| PTMarking_text) \/ {(aPTMarking |-> aText)}
        END
    ;
    Arc_SetValue(aArc,aValue) = 
        PRE
            aArc : Arc & 
            aValue : INTEGER
        THEN
            Arc_value := ({aArc} <<| Arc_value) \/ {(aArc |-> aValue)}
        END
    ;
    PTArcAnnotation_SetText(aPTArcAnnotation,aText) = 
        PRE
            aPTArcAnnotation : PTArcAnnotation & 
            aText : NATURAL
        THEN
            PTArcAnnotation_text := ({aPTArcAnnotation} <<| PTArcAnnotation_text) \/ {(aPTArcAnnotation |-> aText)}
        END

END
