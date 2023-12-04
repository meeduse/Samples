/**
 */
package extractedMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see extractedMM.ExtractedMMFactory
 * @model kind="package"
 *        annotation="meeduse generated=''"
 * @generated
 */
public interface ExtractedMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extractedMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/extractedMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extractedMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtractedMMPackage eINSTANCE = extractedMM.impl.ExtractedMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link extractedMM.impl.BaseObjectRSMImpl <em>Base Object RSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.BaseObjectRSMImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getBaseObjectRSM()
	 * @generated
	 */
	int BASE_OBJECT_RSM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_RSM__ID = 0;

	/**
	 * The number of structural features of the '<em>Base Object RSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_RSM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Base Object RSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_RSM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.NamedResourceImpl <em>Named Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.NamedResourceImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getNamedResource()
	 * @generated
	 */
	int NAMED_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RESOURCE__ID = BASE_OBJECT_RSM__ID;

	/**
	 * The feature id for the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RESOURCE__LONGNAME = BASE_OBJECT_RSM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RESOURCE__NAME = BASE_OBJECT_RSM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RESOURCE_FEATURE_COUNT = BASE_OBJECT_RSM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RESOURCE_OPERATION_COUNT = BASE_OBJECT_RSM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.NetworkResourceImpl <em>Network Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.NetworkResourceImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getNetworkResource()
	 * @generated
	 */
	int NETWORK_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_RESOURCE__ID = NAMED_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_RESOURCE__LONGNAME = NAMED_RESOURCE__LONGNAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_RESOURCE__NAME = NAMED_RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Network Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_RESOURCE_FEATURE_COUNT = NAMED_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_RESOURCE_OPERATION_COUNT = NAMED_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.NetElementImpl <em>Net Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.NetElementImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getNetElement()
	 * @generated
	 */
	int NET_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ELEMENT__ID = NETWORK_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ELEMENT__LONGNAME = NETWORK_RESOURCE__LONGNAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ELEMENT__NAME = NETWORK_RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Net Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ELEMENT_FEATURE_COUNT = NETWORK_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Net Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ELEMENT_OPERATION_COUNT = NETWORK_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.CompositionNetElementImpl <em>Composition Net Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.CompositionNetElementImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getCompositionNetElement()
	 * @generated
	 */
	int COMPOSITION_NET_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_NET_ELEMENT__ID = NET_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_NET_ELEMENT__LONGNAME = NET_ELEMENT__LONGNAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_NET_ELEMENT__NAME = NET_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Composition Net Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_NET_ELEMENT_FEATURE_COUNT = NET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composition Net Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_NET_ELEMENT_OPERATION_COUNT = NET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.PositioningNetElementImpl <em>Positioning Net Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.PositioningNetElementImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getPositioningNetElement()
	 * @generated
	 */
	int POSITIONING_NET_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONING_NET_ELEMENT__ID = COMPOSITION_NET_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONING_NET_ELEMENT__LONGNAME = COMPOSITION_NET_ELEMENT__LONGNAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONING_NET_ELEMENT__NAME = COMPOSITION_NET_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Positioning Net Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONING_NET_ELEMENT_FEATURE_COUNT = COMPOSITION_NET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positioning Net Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONING_NET_ELEMENT_OPERATION_COUNT = COMPOSITION_NET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.LinearElementImpl <em>Linear Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.LinearElementImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getLinearElement()
	 * @generated
	 */
	int LINEAR_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ELEMENT__ID = POSITIONING_NET_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ELEMENT__LONGNAME = POSITIONING_NET_ELEMENT__LONGNAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ELEMENT__NAME = POSITIONING_NET_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Linear Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ELEMENT_FEATURE_COUNT = POSITIONING_NET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linear Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ELEMENT_OPERATION_COUNT = POSITIONING_NET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.RelationImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ID = NETWORK_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LONGNAME = NETWORK_RESOURCE__LONGNAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = NETWORK_RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = NETWORK_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = NETWORK_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.PositionedRelationImpl <em>Positioned Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.PositionedRelationImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getPositionedRelation()
	 * @generated
	 */
	int POSITIONED_RELATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RELATION__ID = RELATION__ID;

	/**
	 * The feature id for the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RELATION__LONGNAME = RELATION__LONGNAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RELATION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Navigibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RELATION__NAVIGIBILITY = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position On A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RELATION__POSITION_ON_A = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position On B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RELATION__POSITION_ON_B = RELATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Leads Towards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RELATION__LEADS_TOWARDS = RELATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Element A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RELATION__ELEMENT_A = RELATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Element B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RELATION__ELEMENT_B = RELATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Positioned Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Positioned Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.BaseLocationImpl <em>Base Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.BaseLocationImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getBaseLocation()
	 * @generated
	 */
	int BASE_LOCATION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_LOCATION__ID = BASE_OBJECT_RSM__ID;

	/**
	 * The number of structural features of the '<em>Base Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_LOCATION_FEATURE_COUNT = BASE_OBJECT_RSM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_LOCATION_OPERATION_COUNT = BASE_OBJECT_RSM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.SpotLocationImpl <em>Spot Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.SpotLocationImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getSpotLocation()
	 * @generated
	 */
	int SPOT_LOCATION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LOCATION__ID = BASE_LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Associated Net Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LOCATION__ASSOCIATED_NET_ELEMENTS = BASE_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spot Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LOCATION_FEATURE_COUNT = BASE_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Spot Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LOCATION_OPERATION_COUNT = BASE_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.LinearLocationImpl <em>Linear Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.LinearLocationImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getLinearLocation()
	 * @generated
	 */
	int LINEAR_LOCATION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LOCATION__ID = BASE_LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Associated Net Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LOCATION__ASSOCIATED_NET_ELEMENTS = BASE_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linear Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LOCATION_FEATURE_COUNT = BASE_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Linear Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LOCATION_OPERATION_COUNT = BASE_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.AreaLocationImpl <em>Area Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.AreaLocationImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getAreaLocation()
	 * @generated
	 */
	int AREA_LOCATION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LOCATION__ID = BASE_LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Associated Net Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LOCATION__ASSOCIATED_NET_ELEMENTS = BASE_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Area Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LOCATION_FEATURE_COUNT = BASE_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Area Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LOCATION_OPERATION_COUNT = BASE_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.AssociatedNetElementImpl <em>Associated Net Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.AssociatedNetElementImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getAssociatedNetElement()
	 * @generated
	 */
	int ASSOCIATED_NET_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Net Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_NET_ELEMENT__NET_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Applies In Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_NET_ELEMENT__APPLIES_IN_DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Has Lateral Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_NET_ELEMENT__HAS_LATERAL_POSITION = 2;

	/**
	 * The number of structural features of the '<em>Associated Net Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_NET_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Associated Net Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_NET_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.LateralPositionImpl <em>Lateral Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.LateralPositionImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getLateralPosition()
	 * @generated
	 */
	int LATERAL_POSITION = 14;

	/**
	 * The number of structural features of the '<em>Lateral Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATERAL_POSITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Lateral Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATERAL_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.LateralSideImpl <em>Lateral Side</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.LateralSideImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getLateralSide()
	 * @generated
	 */
	int LATERAL_SIDE = 15;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATERAL_SIDE__SIDE = LATERAL_POSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lateral Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATERAL_SIDE_FEATURE_COUNT = LATERAL_POSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lateral Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATERAL_SIDE_OPERATION_COUNT = LATERAL_POSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.BaseObjectEULYNXImpl <em>Base Object EULYNX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.BaseObjectEULYNXImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getBaseObjectEULYNX()
	 * @generated
	 */
	int BASE_OBJECT_EULYNX = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_EULYNX__ID = BASE_OBJECT_RSM__ID;

	/**
	 * The number of structural features of the '<em>Base Object EULYNX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_EULYNX_FEATURE_COUNT = BASE_OBJECT_RSM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base Object EULYNX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_EULYNX_OPERATION_COUNT = BASE_OBJECT_RSM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.ConfiguredBaseObjectImpl <em>Configured Base Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.ConfiguredBaseObjectImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getConfiguredBaseObject()
	 * @generated
	 */
	int CONFIGURED_BASE_OBJECT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_BASE_OBJECT__ID = BASE_OBJECT_EULYNX__ID;

	/**
	 * The number of structural features of the '<em>Configured Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_BASE_OBJECT_FEATURE_COUNT = BASE_OBJECT_EULYNX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Configured Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_BASE_OBJECT_OPERATION_COUNT = BASE_OBJECT_EULYNX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.TrackAssetImpl <em>Track Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.TrackAssetImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getTrackAsset()
	 * @generated
	 */
	int TRACK_ASSET = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ASSET__ID = CONFIGURED_BASE_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Track Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ASSET_FEATURE_COUNT = CONFIGURED_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Track Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ASSET_OPERATION_COUNT = CONFIGURED_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.VirtualTrackAssetImpl <em>Virtual Track Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.VirtualTrackAssetImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getVirtualTrackAsset()
	 * @generated
	 */
	int VIRTUAL_TRACK_ASSET = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TRACK_ASSET__ID = TRACK_ASSET__ID;

	/**
	 * The number of structural features of the '<em>Virtual Track Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TRACK_ASSET_FEATURE_COUNT = TRACK_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Virtual Track Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TRACK_ASSET_OPERATION_COUNT = TRACK_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.TvpSectionImpl <em>Tvp Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.TvpSectionImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getTvpSection()
	 * @generated
	 */
	int TVP_SECTION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVP_SECTION__ID = VIRTUAL_TRACK_ASSET__ID;

	/**
	 * The feature id for the '<em><b>Is Located At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVP_SECTION__IS_LOCATED_AT = VIRTUAL_TRACK_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tvp Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVP_SECTION_FEATURE_COUNT = VIRTUAL_TRACK_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tvp Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVP_SECTION_OPERATION_COUNT = VIRTUAL_TRACK_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.TdsSectionImpl <em>Tds Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.TdsSectionImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getTdsSection()
	 * @generated
	 */
	int TDS_SECTION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDS_SECTION__ID = VIRTUAL_TRACK_ASSET__ID;

	/**
	 * The feature id for the '<em><b>Applies To Tvpsection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDS_SECTION__APPLIES_TO_TVPSECTION = VIRTUAL_TRACK_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tds Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDS_SECTION_FEATURE_COUNT = VIRTUAL_TRACK_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tds Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDS_SECTION_OPERATION_COUNT = VIRTUAL_TRACK_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.PhysicalTrackAssetImpl <em>Physical Track Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.PhysicalTrackAssetImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getPhysicalTrackAsset()
	 * @generated
	 */
	int PHYSICAL_TRACK_ASSET = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TRACK_ASSET__ID = TRACK_ASSET__ID;

	/**
	 * The number of structural features of the '<em>Physical Track Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TRACK_ASSET_FEATURE_COUNT = TRACK_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Track Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TRACK_ASSET_OPERATION_COUNT = TRACK_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.VehiclePassageDetectorImpl <em>Vehicle Passage Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.VehiclePassageDetectorImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getVehiclePassageDetector()
	 * @generated
	 */
	int VEHICLE_PASSAGE_DETECTOR = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PASSAGE_DETECTOR__ID = PHYSICAL_TRACK_ASSET__ID;

	/**
	 * The feature id for the '<em><b>Occupies Tds Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PASSAGE_DETECTOR__OCCUPIES_TDS_SECTION = PHYSICAL_TRACK_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vehicle Passage Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PASSAGE_DETECTOR_FEATURE_COUNT = PHYSICAL_TRACK_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vehicle Passage Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PASSAGE_DETECTOR_OPERATION_COUNT = PHYSICAL_TRACK_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.TdsCompnentImpl <em>Tds Compnent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.TdsCompnentImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getTdsCompnent()
	 * @generated
	 */
	int TDS_COMPNENT = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDS_COMPNENT__ID = VEHICLE_PASSAGE_DETECTOR__ID;

	/**
	 * The feature id for the '<em><b>Occupies Tds Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDS_COMPNENT__OCCUPIES_TDS_SECTION = VEHICLE_PASSAGE_DETECTOR__OCCUPIES_TDS_SECTION;

	/**
	 * The feature id for the '<em><b>Limits Tds Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDS_COMPNENT__LIMITS_TDS_SECTION = VEHICLE_PASSAGE_DETECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tds Compnent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDS_COMPNENT_FEATURE_COUNT = VEHICLE_PASSAGE_DETECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tds Compnent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDS_COMPNENT_OPERATION_COUNT = VEHICLE_PASSAGE_DETECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.VssLimitImpl <em>Vss Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.VssLimitImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getVssLimit()
	 * @generated
	 */
	int VSS_LIMIT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSS_LIMIT__ID = TDS_COMPNENT__ID;

	/**
	 * The feature id for the '<em><b>Occupies Tds Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSS_LIMIT__OCCUPIES_TDS_SECTION = TDS_COMPNENT__OCCUPIES_TDS_SECTION;

	/**
	 * The feature id for the '<em><b>Limits Tds Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSS_LIMIT__LIMITS_TDS_SECTION = TDS_COMPNENT__LIMITS_TDS_SECTION;

	/**
	 * The number of structural features of the '<em>Vss Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSS_LIMIT_FEATURE_COUNT = TDS_COMPNENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vss Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSS_LIMIT_OPERATION_COUNT = TDS_COMPNENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.VirtualSubSectionImpl <em>Virtual Sub Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.VirtualSubSectionImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getVirtualSubSection()
	 * @generated
	 */
	int VIRTUAL_SUB_SECTION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SUB_SECTION__ID = TDS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Applies To Tvpsection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SUB_SECTION__APPLIES_TO_TVPSECTION = TDS_SECTION__APPLIES_TO_TVPSECTION;

	/**
	 * The number of structural features of the '<em>Virtual Sub Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SUB_SECTION_FEATURE_COUNT = TDS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Virtual Sub Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SUB_SECTION_OPERATION_COUNT = TDS_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.EtcsMaSectionImpl <em>Etcs Ma Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.EtcsMaSectionImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getEtcsMaSection()
	 * @generated
	 */
	int ETCS_MA_SECTION = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_MA_SECTION__ID = CONFIGURED_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Has Section Entry Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_MA_SECTION__HAS_SECTION_ENTRY_LOCATION = CONFIGURED_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Etcs Ma Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_MA_SECTION_FEATURE_COUNT = CONFIGURED_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Etcs Ma Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_MA_SECTION_OPERATION_COUNT = CONFIGURED_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.RouteImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ID = CONFIGURED_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Applies To Route Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__APPLIES_TO_ROUTE_BODY = CONFIGURED_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = CONFIGURED_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = CONFIGURED_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.EtcsRouteImpl <em>Etcs Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.EtcsRouteImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getEtcsRoute()
	 * @generated
	 */
	int ETCS_ROUTE = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_ROUTE__ID = ROUTE__ID;

	/**
	 * The feature id for the '<em><b>Applies To Route Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_ROUTE__APPLIES_TO_ROUTE_BODY = ROUTE__APPLIES_TO_ROUTE_BODY;

	/**
	 * The feature id for the '<em><b>Has Ma Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_ROUTE__HAS_MA_SECTION = ROUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Etcs Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_ROUTE_FEATURE_COUNT = ROUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Etcs Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_ROUTE_OPERATION_COUNT = ROUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.RouteBodyImpl <em>Route Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.RouteBodyImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getRouteBody()
	 * @generated
	 */
	int ROUTE_BODY = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY__ID = CONFIGURED_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Has Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY__HAS_ENTRY = CONFIGURED_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY__HAS_EXIT = CONFIGURED_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refers To Rsm Rout Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY__REFERS_TO_RSM_ROUT_BODY = CONFIGURED_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Route Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY_FEATURE_COUNT = CONFIGURED_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Route Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY_OPERATION_COUNT = CONFIGURED_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.RouteBodyPropertyImpl <em>Route Body Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.RouteBodyPropertyImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getRouteBodyProperty()
	 * @generated
	 */
	int ROUTE_BODY_PROPERTY = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY_PROPERTY__ID = CONFIGURED_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Applies To Route Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY_PROPERTY__APPLIES_TO_ROUTE_BODY = CONFIGURED_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Route Body Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY_PROPERTY_FEATURE_COUNT = CONFIGURED_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Route Body Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY_PROPERTY_OPERATION_COUNT = CONFIGURED_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.SectionListImpl <em>Section List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.SectionListImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getSectionList()
	 * @generated
	 */
	int SECTION_LIST = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST__ID = ROUTE_BODY_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Applies To Route Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST__APPLIES_TO_ROUTE_BODY = ROUTE_BODY_PROPERTY__APPLIES_TO_ROUTE_BODY;

	/**
	 * The feature id for the '<em><b>Has Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST__HAS_SECTION = ROUTE_BODY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST_FEATURE_COUNT = ROUTE_BODY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST_OPERATION_COUNT = ROUTE_BODY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.RouteExtremityImpl <em>Route Extremity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.RouteExtremityImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getRouteExtremity()
	 * @generated
	 */
	int ROUTE_EXTREMITY = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXTREMITY__ID = BASE_OBJECT_EULYNX__ID;

	/**
	 * The number of structural features of the '<em>Route Extremity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXTREMITY_FEATURE_COUNT = BASE_OBJECT_EULYNX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Route Extremity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXTREMITY_OPERATION_COUNT = BASE_OBJECT_EULYNX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.RouteEntryImpl <em>Route Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.RouteEntryImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getRouteEntry()
	 * @generated
	 */
	int ROUTE_ENTRY = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ENTRY__ID = ROUTE_EXTREMITY__ID;

	/**
	 * The number of structural features of the '<em>Route Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ENTRY_FEATURE_COUNT = ROUTE_EXTREMITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Route Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ENTRY_OPERATION_COUNT = ROUTE_EXTREMITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.RouteExitImpl <em>Route Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.RouteExitImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getRouteExit()
	 * @generated
	 */
	int ROUTE_EXIT = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXIT__ID = ROUTE_EXTREMITY__ID;

	/**
	 * The number of structural features of the '<em>Route Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXIT_FEATURE_COUNT = ROUTE_EXTREMITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Route Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXIT_OPERATION_COUNT = ROUTE_EXTREMITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.SignalImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ID = TRACK_ASSET__ID;

	/**
	 * The feature id for the '<em><b>Refers To Rsm Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__REFERS_TO_RSM_SIGNAL = TRACK_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Group Main Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__HAS_GROUP_MAIN_SIGNAL = TRACK_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = TRACK_ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = TRACK_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.NonPhysicalSignalImpl <em>Non Physical Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.NonPhysicalSignalImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getNonPhysicalSignal()
	 * @generated
	 */
	int NON_PHYSICAL_SIGNAL = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PHYSICAL_SIGNAL__ID = SIGNAL__ID;

	/**
	 * The feature id for the '<em><b>Refers To Rsm Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PHYSICAL_SIGNAL__REFERS_TO_RSM_SIGNAL = SIGNAL__REFERS_TO_RSM_SIGNAL;

	/**
	 * The feature id for the '<em><b>Has Group Main Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PHYSICAL_SIGNAL__HAS_GROUP_MAIN_SIGNAL = SIGNAL__HAS_GROUP_MAIN_SIGNAL;

	/**
	 * The number of structural features of the '<em>Non Physical Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PHYSICAL_SIGNAL_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Physical Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PHYSICAL_SIGNAL_OPERATION_COUNT = SIGNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.VirtualSignalImpl <em>Virtual Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.VirtualSignalImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getVirtualSignal()
	 * @generated
	 */
	int VIRTUAL_SIGNAL = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SIGNAL__ID = NON_PHYSICAL_SIGNAL__ID;

	/**
	 * The feature id for the '<em><b>Refers To Rsm Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SIGNAL__REFERS_TO_RSM_SIGNAL = NON_PHYSICAL_SIGNAL__REFERS_TO_RSM_SIGNAL;

	/**
	 * The feature id for the '<em><b>Has Group Main Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SIGNAL__HAS_GROUP_MAIN_SIGNAL = NON_PHYSICAL_SIGNAL__HAS_GROUP_MAIN_SIGNAL;

	/**
	 * The number of structural features of the '<em>Virtual Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SIGNAL_FEATURE_COUNT = NON_PHYSICAL_SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Virtual Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SIGNAL_OPERATION_COUNT = NON_PHYSICAL_SIGNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.NetEntityImpl <em>Net Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.NetEntityImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getNetEntity()
	 * @generated
	 */
	int NET_ENTITY = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ENTITY__ID = NETWORK_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ENTITY__LONGNAME = NETWORK_RESOURCE__LONGNAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ENTITY__NAME = NETWORK_RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Net Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ENTITY_FEATURE_COUNT = NETWORK_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Net Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ENTITY_OPERATION_COUNT = NETWORK_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.LocatedNetEntityImpl <em>Located Net Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.LocatedNetEntityImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getLocatedNetEntity()
	 * @generated
	 */
	int LOCATED_NET_ENTITY = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_NET_ENTITY__ID = NET_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_NET_ENTITY__LONGNAME = NET_ENTITY__LONGNAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_NET_ENTITY__NAME = NET_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_NET_ENTITY__LOCATIONS = NET_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Located Net Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_NET_ENTITY_FEATURE_COUNT = NET_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Located Net Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_NET_ENTITY_OPERATION_COUNT = NET_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.SignalRSMImpl <em>Signal RSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.SignalRSMImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getSignalRSM()
	 * @generated
	 */
	int SIGNAL_RSM = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RSM__ID = LOCATED_NET_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RSM__LONGNAME = LOCATED_NET_ENTITY__LONGNAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RSM__NAME = LOCATED_NET_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RSM__LOCATIONS = LOCATED_NET_ENTITY__LOCATIONS;

	/**
	 * The number of structural features of the '<em>Signal RSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RSM_FEATURE_COUNT = LOCATED_NET_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signal RSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RSM_OPERATION_COUNT = LOCATED_NET_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.RouteBodyRSMImpl <em>Route Body RSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.RouteBodyRSMImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getRouteBodyRSM()
	 * @generated
	 */
	int ROUTE_BODY_RSM = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY_RSM__ID = LOCATED_NET_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY_RSM__LONGNAME = LOCATED_NET_ENTITY__LONGNAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY_RSM__NAME = LOCATED_NET_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY_RSM__LOCATIONS = LOCATED_NET_ENTITY__LOCATIONS;

	/**
	 * The number of structural features of the '<em>Route Body RSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY_RSM_FEATURE_COUNT = LOCATED_NET_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Route Body RSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_BODY_RSM_OPERATION_COUNT = LOCATED_NET_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.EtcsSignalPropertiesImpl <em>Etcs Signal Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.EtcsSignalPropertiesImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getEtcsSignalProperties()
	 * @generated
	 */
	int ETCS_SIGNAL_PROPERTIES = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_SIGNAL_PROPERTIES__ID = BASE_OBJECT_EULYNX__ID;

	/**
	 * The feature id for the '<em><b>Refers To Eo A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_SIGNAL_PROPERTIES__REFERS_TO_EO_A = BASE_OBJECT_EULYNX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applies To Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_SIGNAL_PROPERTIES__APPLIES_TO_SIGNAL = BASE_OBJECT_EULYNX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Etcs Signal Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_SIGNAL_PROPERTIES_FEATURE_COUNT = BASE_OBJECT_EULYNX_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Etcs Signal Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_SIGNAL_PROPERTIES_OPERATION_COUNT = BASE_OBJECT_EULYNX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.EtcsEndOfAuthorityImpl <em>Etcs End Of Authority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.EtcsEndOfAuthorityImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getEtcsEndOfAuthority()
	 * @generated
	 */
	int ETCS_END_OF_AUTHORITY = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_END_OF_AUTHORITY__ID = BASE_OBJECT_EULYNX__ID;

	/**
	 * The number of structural features of the '<em>Etcs End Of Authority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_END_OF_AUTHORITY_FEATURE_COUNT = BASE_OBJECT_EULYNX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Etcs End Of Authority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_END_OF_AUTHORITY_OPERATION_COUNT = BASE_OBJECT_EULYNX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.DocumentRootImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 45;

	/**
	 * The feature id for the '<em><b>Data Prep Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_PREP_ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Rsm Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RSM_ENTITIES = 1;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.DataPrepEntitiesImpl <em>Data Prep Entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.DataPrepEntitiesImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getDataPrepEntities()
	 * @generated
	 */
	int DATA_PREP_ENTITIES = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREP_ENTITIES__ID = BASE_OBJECT_RSM__ID;

	/**
	 * The feature id for the '<em><b>Owns Etcs End Of Authority</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREP_ENTITIES__OWNS_ETCS_END_OF_AUTHORITY = BASE_OBJECT_RSM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owns Etcs Ma Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREP_ENTITIES__OWNS_ETCS_MA_SECTION = BASE_OBJECT_RSM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owns Etcs Signal Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREP_ENTITIES__OWNS_ETCS_SIGNAL_PROPERTIES = BASE_OBJECT_RSM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owns Route Body Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREP_ENTITIES__OWNS_ROUTE_BODY_PROPERTY = BASE_OBJECT_RSM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owns Route Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREP_ENTITIES__OWNS_ROUTE_BODY = BASE_OBJECT_RSM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owns Route</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREP_ENTITIES__OWNS_ROUTE = BASE_OBJECT_RSM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owns Track Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREP_ENTITIES__OWNS_TRACK_ASSET = BASE_OBJECT_RSM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Knows Asset And State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREP_ENTITIES__KNOWS_ASSET_AND_STATE = BASE_OBJECT_RSM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Data Prep Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREP_ENTITIES_FEATURE_COUNT = BASE_OBJECT_RSM_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Data Prep Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREP_ENTITIES_OPERATION_COUNT = BASE_OBJECT_RSM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.RsmEntitiesImpl <em>Rsm Entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.RsmEntitiesImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getRsmEntities()
	 * @generated
	 */
	int RSM_ENTITIES = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSM_ENTITIES__ID = BASE_OBJECT_RSM__ID;

	/**
	 * The feature id for the '<em><b>Uses Etcs Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSM_ENTITIES__USES_ETCS_TOPOLOGY = BASE_OBJECT_RSM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rsm Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSM_ENTITIES_FEATURE_COUNT = BASE_OBJECT_RSM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rsm Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSM_ENTITIES_OPERATION_COUNT = BASE_OBJECT_RSM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.TopologyImpl <em>Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.TopologyImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getTopology()
	 * @generated
	 */
	int TOPOLOGY = 48;

	/**
	 * The feature id for the '<em><b>Uses Positioned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY__USES_POSITIONED_RELATION = 0;

	/**
	 * The feature id for the '<em><b>Uses Net Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY__USES_NET_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Uses Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY__USES_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Owns Signal RSM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY__OWNS_SIGNAL_RSM = 3;

	/**
	 * The feature id for the '<em><b>Owns Route Body RSM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY__OWNS_ROUTE_BODY_RSM = 4;

	/**
	 * The number of structural features of the '<em>Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.AssetAndStateImpl <em>Asset And State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.AssetAndStateImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getAssetAndState()
	 * @generated
	 */
	int ASSET_AND_STATE = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_AND_STATE__ID = CONFIGURED_BASE_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Asset And State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_AND_STATE_FEATURE_COUNT = CONFIGURED_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asset And State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_AND_STATE_OPERATION_COUNT = CONFIGURED_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.impl.SectionAndVacancyImpl <em>Section And Vacancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.impl.SectionAndVacancyImpl
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getSectionAndVacancy()
	 * @generated
	 */
	int SECTION_AND_VACANCY = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_AND_VACANCY__ID = ASSET_AND_STATE__ID;

	/**
	 * The feature id for the '<em><b>Refers To Tds Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_AND_VACANCY__REFERS_TO_TDS_SECTION = ASSET_AND_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Vacancy State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_AND_VACANCY__IN_VACANCY_STATE = ASSET_AND_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Section And Vacancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_AND_VACANCY_FEATURE_COUNT = ASSET_AND_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Section And Vacancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_AND_VACANCY_OPERATION_COUNT = ASSET_AND_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extractedMM.Navigability <em>Navigability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.Navigability
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getNavigability()
	 * @generated
	 */
	int NAVIGABILITY = 51;

	/**
	 * The meta object id for the '{@link extractedMM.Usage <em>Usage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.Usage
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getUsage()
	 * @generated
	 */
	int USAGE = 52;

	/**
	 * The meta object id for the '{@link extractedMM.LeftRight <em>Left Right</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.LeftRight
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getLeftRight()
	 * @generated
	 */
	int LEFT_RIGHT = 53;

	/**
	 * The meta object id for the '{@link extractedMM.ApplicationDirection <em>Application Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.ApplicationDirection
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getApplicationDirection()
	 * @generated
	 */
	int APPLICATION_DIRECTION = 54;

	/**
	 * The meta object id for the '{@link extractedMM.Side <em>Side</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.Side
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getSide()
	 * @generated
	 */
	int SIDE = 55;

	/**
	 * The meta object id for the '{@link extractedMM.SectionVacancyTypes <em>Section Vacancy Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extractedMM.SectionVacancyTypes
	 * @see extractedMM.impl.ExtractedMMPackageImpl#getSectionVacancyTypes()
	 * @generated
	 */
	int SECTION_VACANCY_TYPES = 56;

	/**
	 * Returns the meta object for class '{@link extractedMM.BaseObjectRSM <em>Base Object RSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Object RSM</em>'.
	 * @see extractedMM.BaseObjectRSM
	 * @generated
	 */
	EClass getBaseObjectRSM();

	/**
	 * Returns the meta object for the attribute '{@link extractedMM.BaseObjectRSM#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see extractedMM.BaseObjectRSM#getId()
	 * @see #getBaseObjectRSM()
	 * @generated
	 */
	EAttribute getBaseObjectRSM_Id();

	/**
	 * Returns the meta object for class '{@link extractedMM.NamedResource <em>Named Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Resource</em>'.
	 * @see extractedMM.NamedResource
	 * @generated
	 */
	EClass getNamedResource();

	/**
	 * Returns the meta object for the attribute '{@link extractedMM.NamedResource#getLongname <em>Longname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longname</em>'.
	 * @see extractedMM.NamedResource#getLongname()
	 * @see #getNamedResource()
	 * @generated
	 */
	EAttribute getNamedResource_Longname();

	/**
	 * Returns the meta object for the attribute '{@link extractedMM.NamedResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see extractedMM.NamedResource#getName()
	 * @see #getNamedResource()
	 * @generated
	 */
	EAttribute getNamedResource_Name();

	/**
	 * Returns the meta object for class '{@link extractedMM.NetworkResource <em>Network Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Resource</em>'.
	 * @see extractedMM.NetworkResource
	 * @generated
	 */
	EClass getNetworkResource();

	/**
	 * Returns the meta object for class '{@link extractedMM.NetElement <em>Net Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net Element</em>'.
	 * @see extractedMM.NetElement
	 * @generated
	 */
	EClass getNetElement();

	/**
	 * Returns the meta object for class '{@link extractedMM.CompositionNetElement <em>Composition Net Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Net Element</em>'.
	 * @see extractedMM.CompositionNetElement
	 * @generated
	 */
	EClass getCompositionNetElement();

	/**
	 * Returns the meta object for class '{@link extractedMM.PositioningNetElement <em>Positioning Net Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioning Net Element</em>'.
	 * @see extractedMM.PositioningNetElement
	 * @generated
	 */
	EClass getPositioningNetElement();

	/**
	 * Returns the meta object for class '{@link extractedMM.LinearElement <em>Linear Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Element</em>'.
	 * @see extractedMM.LinearElement
	 * @generated
	 */
	EClass getLinearElement();

	/**
	 * Returns the meta object for class '{@link extractedMM.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see extractedMM.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for class '{@link extractedMM.PositionedRelation <em>Positioned Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned Relation</em>'.
	 * @see extractedMM.PositionedRelation
	 * @generated
	 */
	EClass getPositionedRelation();

	/**
	 * Returns the meta object for the attribute '{@link extractedMM.PositionedRelation#getNavigibility <em>Navigibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigibility</em>'.
	 * @see extractedMM.PositionedRelation#getNavigibility()
	 * @see #getPositionedRelation()
	 * @generated
	 */
	EAttribute getPositionedRelation_Navigibility();

	/**
	 * Returns the meta object for the attribute '{@link extractedMM.PositionedRelation#getPositionOnA <em>Position On A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position On A</em>'.
	 * @see extractedMM.PositionedRelation#getPositionOnA()
	 * @see #getPositionedRelation()
	 * @generated
	 */
	EAttribute getPositionedRelation_PositionOnA();

	/**
	 * Returns the meta object for the attribute '{@link extractedMM.PositionedRelation#getPositionOnB <em>Position On B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position On B</em>'.
	 * @see extractedMM.PositionedRelation#getPositionOnB()
	 * @see #getPositionedRelation()
	 * @generated
	 */
	EAttribute getPositionedRelation_PositionOnB();

	/**
	 * Returns the meta object for the attribute '{@link extractedMM.PositionedRelation#getLeadsTowards <em>Leads Towards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leads Towards</em>'.
	 * @see extractedMM.PositionedRelation#getLeadsTowards()
	 * @see #getPositionedRelation()
	 * @generated
	 */
	EAttribute getPositionedRelation_LeadsTowards();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.PositionedRelation#getElementA <em>Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element A</em>'.
	 * @see extractedMM.PositionedRelation#getElementA()
	 * @see #getPositionedRelation()
	 * @generated
	 */
	EReference getPositionedRelation_ElementA();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.PositionedRelation#getElementB <em>Element B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element B</em>'.
	 * @see extractedMM.PositionedRelation#getElementB()
	 * @see #getPositionedRelation()
	 * @generated
	 */
	EReference getPositionedRelation_ElementB();

	/**
	 * Returns the meta object for class '{@link extractedMM.BaseLocation <em>Base Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Location</em>'.
	 * @see extractedMM.BaseLocation
	 * @generated
	 */
	EClass getBaseLocation();

	/**
	 * Returns the meta object for class '{@link extractedMM.SpotLocation <em>Spot Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spot Location</em>'.
	 * @see extractedMM.SpotLocation
	 * @generated
	 */
	EClass getSpotLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.SpotLocation#getAssociatedNetElements <em>Associated Net Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associated Net Elements</em>'.
	 * @see extractedMM.SpotLocation#getAssociatedNetElements()
	 * @see #getSpotLocation()
	 * @generated
	 */
	EReference getSpotLocation_AssociatedNetElements();

	/**
	 * Returns the meta object for class '{@link extractedMM.LinearLocation <em>Linear Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Location</em>'.
	 * @see extractedMM.LinearLocation
	 * @generated
	 */
	EClass getLinearLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.LinearLocation#getAssociatedNetElements <em>Associated Net Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associated Net Elements</em>'.
	 * @see extractedMM.LinearLocation#getAssociatedNetElements()
	 * @see #getLinearLocation()
	 * @generated
	 */
	EReference getLinearLocation_AssociatedNetElements();

	/**
	 * Returns the meta object for class '{@link extractedMM.AreaLocation <em>Area Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Location</em>'.
	 * @see extractedMM.AreaLocation
	 * @generated
	 */
	EClass getAreaLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.AreaLocation#getAssociatedNetElements <em>Associated Net Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associated Net Elements</em>'.
	 * @see extractedMM.AreaLocation#getAssociatedNetElements()
	 * @see #getAreaLocation()
	 * @generated
	 */
	EReference getAreaLocation_AssociatedNetElements();

	/**
	 * Returns the meta object for class '{@link extractedMM.AssociatedNetElement <em>Associated Net Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associated Net Element</em>'.
	 * @see extractedMM.AssociatedNetElement
	 * @generated
	 */
	EClass getAssociatedNetElement();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.AssociatedNetElement#getNetElement <em>Net Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Net Element</em>'.
	 * @see extractedMM.AssociatedNetElement#getNetElement()
	 * @see #getAssociatedNetElement()
	 * @generated
	 */
	EReference getAssociatedNetElement_NetElement();

	/**
	 * Returns the meta object for the attribute '{@link extractedMM.AssociatedNetElement#getAppliesInDirection <em>Applies In Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applies In Direction</em>'.
	 * @see extractedMM.AssociatedNetElement#getAppliesInDirection()
	 * @see #getAssociatedNetElement()
	 * @generated
	 */
	EAttribute getAssociatedNetElement_AppliesInDirection();

	/**
	 * Returns the meta object for the containment reference '{@link extractedMM.AssociatedNetElement#getHasLateralPosition <em>Has Lateral Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Lateral Position</em>'.
	 * @see extractedMM.AssociatedNetElement#getHasLateralPosition()
	 * @see #getAssociatedNetElement()
	 * @generated
	 */
	EReference getAssociatedNetElement_HasLateralPosition();

	/**
	 * Returns the meta object for class '{@link extractedMM.LateralPosition <em>Lateral Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lateral Position</em>'.
	 * @see extractedMM.LateralPosition
	 * @generated
	 */
	EClass getLateralPosition();

	/**
	 * Returns the meta object for class '{@link extractedMM.LateralSide <em>Lateral Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lateral Side</em>'.
	 * @see extractedMM.LateralSide
	 * @generated
	 */
	EClass getLateralSide();

	/**
	 * Returns the meta object for the attribute '{@link extractedMM.LateralSide#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see extractedMM.LateralSide#getSide()
	 * @see #getLateralSide()
	 * @generated
	 */
	EAttribute getLateralSide_Side();

	/**
	 * Returns the meta object for class '{@link extractedMM.BaseObjectEULYNX <em>Base Object EULYNX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Object EULYNX</em>'.
	 * @see extractedMM.BaseObjectEULYNX
	 * @generated
	 */
	EClass getBaseObjectEULYNX();

	/**
	 * Returns the meta object for class '{@link extractedMM.TvpSection <em>Tvp Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tvp Section</em>'.
	 * @see extractedMM.TvpSection
	 * @generated
	 */
	EClass getTvpSection();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.TvpSection#getIsLocatedAt <em>Is Located At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Located At</em>'.
	 * @see extractedMM.TvpSection#getIsLocatedAt()
	 * @see #getTvpSection()
	 * @generated
	 */
	EReference getTvpSection_IsLocatedAt();

	/**
	 * Returns the meta object for class '{@link extractedMM.VirtualTrackAsset <em>Virtual Track Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Track Asset</em>'.
	 * @see extractedMM.VirtualTrackAsset
	 * @generated
	 */
	EClass getVirtualTrackAsset();

	/**
	 * Returns the meta object for class '{@link extractedMM.TrackAsset <em>Track Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track Asset</em>'.
	 * @see extractedMM.TrackAsset
	 * @generated
	 */
	EClass getTrackAsset();

	/**
	 * Returns the meta object for class '{@link extractedMM.ConfiguredBaseObject <em>Configured Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configured Base Object</em>'.
	 * @see extractedMM.ConfiguredBaseObject
	 * @generated
	 */
	EClass getConfiguredBaseObject();

	/**
	 * Returns the meta object for class '{@link extractedMM.TdsSection <em>Tds Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tds Section</em>'.
	 * @see extractedMM.TdsSection
	 * @generated
	 */
	EClass getTdsSection();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.TdsSection#getAppliesToTvpsection <em>Applies To Tvpsection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To Tvpsection</em>'.
	 * @see extractedMM.TdsSection#getAppliesToTvpsection()
	 * @see #getTdsSection()
	 * @generated
	 */
	EReference getTdsSection_AppliesToTvpsection();

	/**
	 * Returns the meta object for class '{@link extractedMM.TdsCompnent <em>Tds Compnent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tds Compnent</em>'.
	 * @see extractedMM.TdsCompnent
	 * @generated
	 */
	EClass getTdsCompnent();

	/**
	 * Returns the meta object for the reference list '{@link extractedMM.TdsCompnent#getLimitsTdsSection <em>Limits Tds Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Limits Tds Section</em>'.
	 * @see extractedMM.TdsCompnent#getLimitsTdsSection()
	 * @see #getTdsCompnent()
	 * @generated
	 */
	EReference getTdsCompnent_LimitsTdsSection();

	/**
	 * Returns the meta object for class '{@link extractedMM.VehiclePassageDetector <em>Vehicle Passage Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Passage Detector</em>'.
	 * @see extractedMM.VehiclePassageDetector
	 * @generated
	 */
	EClass getVehiclePassageDetector();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.VehiclePassageDetector#getOccupiesTdsSection <em>Occupies Tds Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Occupies Tds Section</em>'.
	 * @see extractedMM.VehiclePassageDetector#getOccupiesTdsSection()
	 * @see #getVehiclePassageDetector()
	 * @generated
	 */
	EReference getVehiclePassageDetector_OccupiesTdsSection();

	/**
	 * Returns the meta object for class '{@link extractedMM.PhysicalTrackAsset <em>Physical Track Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Track Asset</em>'.
	 * @see extractedMM.PhysicalTrackAsset
	 * @generated
	 */
	EClass getPhysicalTrackAsset();

	/**
	 * Returns the meta object for class '{@link extractedMM.VssLimit <em>Vss Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vss Limit</em>'.
	 * @see extractedMM.VssLimit
	 * @generated
	 */
	EClass getVssLimit();

	/**
	 * Returns the meta object for class '{@link extractedMM.VirtualSubSection <em>Virtual Sub Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Sub Section</em>'.
	 * @see extractedMM.VirtualSubSection
	 * @generated
	 */
	EClass getVirtualSubSection();

	/**
	 * Returns the meta object for class '{@link extractedMM.EtcsMaSection <em>Etcs Ma Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etcs Ma Section</em>'.
	 * @see extractedMM.EtcsMaSection
	 * @generated
	 */
	EClass getEtcsMaSection();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.EtcsMaSection#getHasSectionEntryLocation <em>Has Section Entry Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Section Entry Location</em>'.
	 * @see extractedMM.EtcsMaSection#getHasSectionEntryLocation()
	 * @see #getEtcsMaSection()
	 * @generated
	 */
	EReference getEtcsMaSection_HasSectionEntryLocation();

	/**
	 * Returns the meta object for class '{@link extractedMM.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see extractedMM.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.Route#getAppliesToRouteBody <em>Applies To Route Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To Route Body</em>'.
	 * @see extractedMM.Route#getAppliesToRouteBody()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_AppliesToRouteBody();

	/**
	 * Returns the meta object for class '{@link extractedMM.EtcsRoute <em>Etcs Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etcs Route</em>'.
	 * @see extractedMM.EtcsRoute
	 * @generated
	 */
	EClass getEtcsRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.EtcsRoute#getHasMaSection <em>Has Ma Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Ma Section</em>'.
	 * @see extractedMM.EtcsRoute#getHasMaSection()
	 * @see #getEtcsRoute()
	 * @generated
	 */
	EReference getEtcsRoute_HasMaSection();

	/**
	 * Returns the meta object for class '{@link extractedMM.RouteBody <em>Route Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Body</em>'.
	 * @see extractedMM.RouteBody
	 * @generated
	 */
	EClass getRouteBody();

	/**
	 * Returns the meta object for the containment reference '{@link extractedMM.RouteBody#getHasEntry <em>Has Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Entry</em>'.
	 * @see extractedMM.RouteBody#getHasEntry()
	 * @see #getRouteBody()
	 * @generated
	 */
	EReference getRouteBody_HasEntry();

	/**
	 * Returns the meta object for the containment reference '{@link extractedMM.RouteBody#getHasExit <em>Has Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Exit</em>'.
	 * @see extractedMM.RouteBody#getHasExit()
	 * @see #getRouteBody()
	 * @generated
	 */
	EReference getRouteBody_HasExit();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.RouteBody#getRefersToRsmRoutBody <em>Refers To Rsm Rout Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To Rsm Rout Body</em>'.
	 * @see extractedMM.RouteBody#getRefersToRsmRoutBody()
	 * @see #getRouteBody()
	 * @generated
	 */
	EReference getRouteBody_RefersToRsmRoutBody();

	/**
	 * Returns the meta object for class '{@link extractedMM.RouteBodyProperty <em>Route Body Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Body Property</em>'.
	 * @see extractedMM.RouteBodyProperty
	 * @generated
	 */
	EClass getRouteBodyProperty();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.RouteBodyProperty#getAppliesToRouteBody <em>Applies To Route Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To Route Body</em>'.
	 * @see extractedMM.RouteBodyProperty#getAppliesToRouteBody()
	 * @see #getRouteBodyProperty()
	 * @generated
	 */
	EReference getRouteBodyProperty_AppliesToRouteBody();

	/**
	 * Returns the meta object for class '{@link extractedMM.SectionList <em>Section List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section List</em>'.
	 * @see extractedMM.SectionList
	 * @generated
	 */
	EClass getSectionList();

	/**
	 * Returns the meta object for the reference list '{@link extractedMM.SectionList#getHasSection <em>Has Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Section</em>'.
	 * @see extractedMM.SectionList#getHasSection()
	 * @see #getSectionList()
	 * @generated
	 */
	EReference getSectionList_HasSection();

	/**
	 * Returns the meta object for class '{@link extractedMM.RouteExtremity <em>Route Extremity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Extremity</em>'.
	 * @see extractedMM.RouteExtremity
	 * @generated
	 */
	EClass getRouteExtremity();

	/**
	 * Returns the meta object for class '{@link extractedMM.RouteEntry <em>Route Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Entry</em>'.
	 * @see extractedMM.RouteEntry
	 * @generated
	 */
	EClass getRouteEntry();

	/**
	 * Returns the meta object for class '{@link extractedMM.RouteExit <em>Route Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Exit</em>'.
	 * @see extractedMM.RouteExit
	 * @generated
	 */
	EClass getRouteExit();

	/**
	 * Returns the meta object for class '{@link extractedMM.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see extractedMM.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.Signal#getRefersToRsmSignal <em>Refers To Rsm Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To Rsm Signal</em>'.
	 * @see extractedMM.Signal#getRefersToRsmSignal()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_RefersToRsmSignal();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.Signal#getHasGroupMainSignal <em>Has Group Main Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Group Main Signal</em>'.
	 * @see extractedMM.Signal#getHasGroupMainSignal()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_HasGroupMainSignal();

	/**
	 * Returns the meta object for class '{@link extractedMM.NonPhysicalSignal <em>Non Physical Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Physical Signal</em>'.
	 * @see extractedMM.NonPhysicalSignal
	 * @generated
	 */
	EClass getNonPhysicalSignal();

	/**
	 * Returns the meta object for class '{@link extractedMM.VirtualSignal <em>Virtual Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Signal</em>'.
	 * @see extractedMM.VirtualSignal
	 * @generated
	 */
	EClass getVirtualSignal();

	/**
	 * Returns the meta object for class '{@link extractedMM.NetEntity <em>Net Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net Entity</em>'.
	 * @see extractedMM.NetEntity
	 * @generated
	 */
	EClass getNetEntity();

	/**
	 * Returns the meta object for class '{@link extractedMM.LocatedNetEntity <em>Located Net Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Net Entity</em>'.
	 * @see extractedMM.LocatedNetEntity
	 * @generated
	 */
	EClass getLocatedNetEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.LocatedNetEntity#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see extractedMM.LocatedNetEntity#getLocations()
	 * @see #getLocatedNetEntity()
	 * @generated
	 */
	EReference getLocatedNetEntity_Locations();

	/**
	 * Returns the meta object for class '{@link extractedMM.SignalRSM <em>Signal RSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal RSM</em>'.
	 * @see extractedMM.SignalRSM
	 * @generated
	 */
	EClass getSignalRSM();

	/**
	 * Returns the meta object for class '{@link extractedMM.RouteBodyRSM <em>Route Body RSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Body RSM</em>'.
	 * @see extractedMM.RouteBodyRSM
	 * @generated
	 */
	EClass getRouteBodyRSM();

	/**
	 * Returns the meta object for class '{@link extractedMM.EtcsSignalProperties <em>Etcs Signal Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etcs Signal Properties</em>'.
	 * @see extractedMM.EtcsSignalProperties
	 * @generated
	 */
	EClass getEtcsSignalProperties();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.EtcsSignalProperties#getRefersToEoA <em>Refers To Eo A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To Eo A</em>'.
	 * @see extractedMM.EtcsSignalProperties#getRefersToEoA()
	 * @see #getEtcsSignalProperties()
	 * @generated
	 */
	EReference getEtcsSignalProperties_RefersToEoA();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.EtcsSignalProperties#getAppliesToSignal <em>Applies To Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To Signal</em>'.
	 * @see extractedMM.EtcsSignalProperties#getAppliesToSignal()
	 * @see #getEtcsSignalProperties()
	 * @generated
	 */
	EReference getEtcsSignalProperties_AppliesToSignal();

	/**
	 * Returns the meta object for class '{@link extractedMM.EtcsEndOfAuthority <em>Etcs End Of Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etcs End Of Authority</em>'.
	 * @see extractedMM.EtcsEndOfAuthority
	 * @generated
	 */
	EClass getEtcsEndOfAuthority();

	/**
	 * Returns the meta object for class '{@link extractedMM.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see extractedMM.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.DocumentRoot#getDataPrepEntities <em>Data Prep Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Prep Entities</em>'.
	 * @see extractedMM.DocumentRoot#getDataPrepEntities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataPrepEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.DocumentRoot#getRsmEntities <em>Rsm Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rsm Entities</em>'.
	 * @see extractedMM.DocumentRoot#getRsmEntities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RsmEntities();

	/**
	 * Returns the meta object for class '{@link extractedMM.DataPrepEntities <em>Data Prep Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Prep Entities</em>'.
	 * @see extractedMM.DataPrepEntities
	 * @generated
	 */
	EClass getDataPrepEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.DataPrepEntities#getOwnsEtcsEndOfAuthority <em>Owns Etcs End Of Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Etcs End Of Authority</em>'.
	 * @see extractedMM.DataPrepEntities#getOwnsEtcsEndOfAuthority()
	 * @see #getDataPrepEntities()
	 * @generated
	 */
	EReference getDataPrepEntities_OwnsEtcsEndOfAuthority();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.DataPrepEntities#getOwnsEtcsMaSection <em>Owns Etcs Ma Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Etcs Ma Section</em>'.
	 * @see extractedMM.DataPrepEntities#getOwnsEtcsMaSection()
	 * @see #getDataPrepEntities()
	 * @generated
	 */
	EReference getDataPrepEntities_OwnsEtcsMaSection();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.DataPrepEntities#getOwnsEtcsSignalProperties <em>Owns Etcs Signal Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Etcs Signal Properties</em>'.
	 * @see extractedMM.DataPrepEntities#getOwnsEtcsSignalProperties()
	 * @see #getDataPrepEntities()
	 * @generated
	 */
	EReference getDataPrepEntities_OwnsEtcsSignalProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.DataPrepEntities#getOwnsRouteBodyProperty <em>Owns Route Body Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Route Body Property</em>'.
	 * @see extractedMM.DataPrepEntities#getOwnsRouteBodyProperty()
	 * @see #getDataPrepEntities()
	 * @generated
	 */
	EReference getDataPrepEntities_OwnsRouteBodyProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.DataPrepEntities#getOwnsRouteBody <em>Owns Route Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Route Body</em>'.
	 * @see extractedMM.DataPrepEntities#getOwnsRouteBody()
	 * @see #getDataPrepEntities()
	 * @generated
	 */
	EReference getDataPrepEntities_OwnsRouteBody();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.DataPrepEntities#getOwnsRoute <em>Owns Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Route</em>'.
	 * @see extractedMM.DataPrepEntities#getOwnsRoute()
	 * @see #getDataPrepEntities()
	 * @generated
	 */
	EReference getDataPrepEntities_OwnsRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.DataPrepEntities#getOwnsTrackAsset <em>Owns Track Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Track Asset</em>'.
	 * @see extractedMM.DataPrepEntities#getOwnsTrackAsset()
	 * @see #getDataPrepEntities()
	 * @generated
	 */
	EReference getDataPrepEntities_OwnsTrackAsset();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.DataPrepEntities#getKnowsAssetAndState <em>Knows Asset And State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knows Asset And State</em>'.
	 * @see extractedMM.DataPrepEntities#getKnowsAssetAndState()
	 * @see #getDataPrepEntities()
	 * @generated
	 */
	EReference getDataPrepEntities_KnowsAssetAndState();

	/**
	 * Returns the meta object for class '{@link extractedMM.RsmEntities <em>Rsm Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rsm Entities</em>'.
	 * @see extractedMM.RsmEntities
	 * @generated
	 */
	EClass getRsmEntities();

	/**
	 * Returns the meta object for the containment reference '{@link extractedMM.RsmEntities#getUsesEtcsTopology <em>Uses Etcs Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uses Etcs Topology</em>'.
	 * @see extractedMM.RsmEntities#getUsesEtcsTopology()
	 * @see #getRsmEntities()
	 * @generated
	 */
	EReference getRsmEntities_UsesEtcsTopology();

	/**
	 * Returns the meta object for class '{@link extractedMM.Topology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology</em>'.
	 * @see extractedMM.Topology
	 * @generated
	 */
	EClass getTopology();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.Topology#getUsesPositionedRelation <em>Uses Positioned Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Positioned Relation</em>'.
	 * @see extractedMM.Topology#getUsesPositionedRelation()
	 * @see #getTopology()
	 * @generated
	 */
	EReference getTopology_UsesPositionedRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.Topology#getUsesNetElement <em>Uses Net Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Net Element</em>'.
	 * @see extractedMM.Topology#getUsesNetElement()
	 * @see #getTopology()
	 * @generated
	 */
	EReference getTopology_UsesNetElement();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.Topology#getUsesLocation <em>Uses Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Location</em>'.
	 * @see extractedMM.Topology#getUsesLocation()
	 * @see #getTopology()
	 * @generated
	 */
	EReference getTopology_UsesLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.Topology#getOwnsSignalRSM <em>Owns Signal RSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Signal RSM</em>'.
	 * @see extractedMM.Topology#getOwnsSignalRSM()
	 * @see #getTopology()
	 * @generated
	 */
	EReference getTopology_OwnsSignalRSM();

	/**
	 * Returns the meta object for the containment reference list '{@link extractedMM.Topology#getOwnsRouteBodyRSM <em>Owns Route Body RSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Route Body RSM</em>'.
	 * @see extractedMM.Topology#getOwnsRouteBodyRSM()
	 * @see #getTopology()
	 * @generated
	 */
	EReference getTopology_OwnsRouteBodyRSM();

	/**
	 * Returns the meta object for class '{@link extractedMM.AssetAndState <em>Asset And State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset And State</em>'.
	 * @see extractedMM.AssetAndState
	 * @generated
	 */
	EClass getAssetAndState();

	/**
	 * Returns the meta object for class '{@link extractedMM.SectionAndVacancy <em>Section And Vacancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section And Vacancy</em>'.
	 * @see extractedMM.SectionAndVacancy
	 * @generated
	 */
	EClass getSectionAndVacancy();

	/**
	 * Returns the meta object for the reference '{@link extractedMM.SectionAndVacancy#getRefersToTdsSection <em>Refers To Tds Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To Tds Section</em>'.
	 * @see extractedMM.SectionAndVacancy#getRefersToTdsSection()
	 * @see #getSectionAndVacancy()
	 * @generated
	 */
	EReference getSectionAndVacancy_RefersToTdsSection();

	/**
	 * Returns the meta object for the attribute '{@link extractedMM.SectionAndVacancy#getInVacancyState <em>In Vacancy State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Vacancy State</em>'.
	 * @see extractedMM.SectionAndVacancy#getInVacancyState()
	 * @see #getSectionAndVacancy()
	 * @generated
	 */
	EAttribute getSectionAndVacancy_InVacancyState();

	/**
	 * Returns the meta object for enum '{@link extractedMM.Navigability <em>Navigability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Navigability</em>'.
	 * @see extractedMM.Navigability
	 * @generated
	 */
	EEnum getNavigability();

	/**
	 * Returns the meta object for enum '{@link extractedMM.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usage</em>'.
	 * @see extractedMM.Usage
	 * @generated
	 */
	EEnum getUsage();

	/**
	 * Returns the meta object for enum '{@link extractedMM.LeftRight <em>Left Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Left Right</em>'.
	 * @see extractedMM.LeftRight
	 * @generated
	 */
	EEnum getLeftRight();

	/**
	 * Returns the meta object for enum '{@link extractedMM.ApplicationDirection <em>Application Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application Direction</em>'.
	 * @see extractedMM.ApplicationDirection
	 * @generated
	 */
	EEnum getApplicationDirection();

	/**
	 * Returns the meta object for enum '{@link extractedMM.Side <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Side</em>'.
	 * @see extractedMM.Side
	 * @generated
	 */
	EEnum getSide();

	/**
	 * Returns the meta object for enum '{@link extractedMM.SectionVacancyTypes <em>Section Vacancy Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Section Vacancy Types</em>'.
	 * @see extractedMM.SectionVacancyTypes
	 * @generated
	 */
	EEnum getSectionVacancyTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtractedMMFactory getExtractedMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link extractedMM.impl.BaseObjectRSMImpl <em>Base Object RSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.BaseObjectRSMImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getBaseObjectRSM()
		 * @generated
		 */
		EClass BASE_OBJECT_RSM = eINSTANCE.getBaseObjectRSM();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_OBJECT_RSM__ID = eINSTANCE.getBaseObjectRSM_Id();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.NamedResourceImpl <em>Named Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.NamedResourceImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getNamedResource()
		 * @generated
		 */
		EClass NAMED_RESOURCE = eINSTANCE.getNamedResource();

		/**
		 * The meta object literal for the '<em><b>Longname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_RESOURCE__LONGNAME = eINSTANCE.getNamedResource_Longname();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_RESOURCE__NAME = eINSTANCE.getNamedResource_Name();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.NetworkResourceImpl <em>Network Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.NetworkResourceImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getNetworkResource()
		 * @generated
		 */
		EClass NETWORK_RESOURCE = eINSTANCE.getNetworkResource();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.NetElementImpl <em>Net Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.NetElementImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getNetElement()
		 * @generated
		 */
		EClass NET_ELEMENT = eINSTANCE.getNetElement();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.CompositionNetElementImpl <em>Composition Net Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.CompositionNetElementImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getCompositionNetElement()
		 * @generated
		 */
		EClass COMPOSITION_NET_ELEMENT = eINSTANCE.getCompositionNetElement();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.PositioningNetElementImpl <em>Positioning Net Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.PositioningNetElementImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getPositioningNetElement()
		 * @generated
		 */
		EClass POSITIONING_NET_ELEMENT = eINSTANCE.getPositioningNetElement();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.LinearElementImpl <em>Linear Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.LinearElementImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getLinearElement()
		 * @generated
		 */
		EClass LINEAR_ELEMENT = eINSTANCE.getLinearElement();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.RelationImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.PositionedRelationImpl <em>Positioned Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.PositionedRelationImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getPositionedRelation()
		 * @generated
		 */
		EClass POSITIONED_RELATION = eINSTANCE.getPositionedRelation();

		/**
		 * The meta object literal for the '<em><b>Navigibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED_RELATION__NAVIGIBILITY = eINSTANCE.getPositionedRelation_Navigibility();

		/**
		 * The meta object literal for the '<em><b>Position On A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED_RELATION__POSITION_ON_A = eINSTANCE.getPositionedRelation_PositionOnA();

		/**
		 * The meta object literal for the '<em><b>Position On B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED_RELATION__POSITION_ON_B = eINSTANCE.getPositionedRelation_PositionOnB();

		/**
		 * The meta object literal for the '<em><b>Leads Towards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED_RELATION__LEADS_TOWARDS = eINSTANCE.getPositionedRelation_LeadsTowards();

		/**
		 * The meta object literal for the '<em><b>Element A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_RELATION__ELEMENT_A = eINSTANCE.getPositionedRelation_ElementA();

		/**
		 * The meta object literal for the '<em><b>Element B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_RELATION__ELEMENT_B = eINSTANCE.getPositionedRelation_ElementB();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.BaseLocationImpl <em>Base Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.BaseLocationImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getBaseLocation()
		 * @generated
		 */
		EClass BASE_LOCATION = eINSTANCE.getBaseLocation();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.SpotLocationImpl <em>Spot Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.SpotLocationImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getSpotLocation()
		 * @generated
		 */
		EClass SPOT_LOCATION = eINSTANCE.getSpotLocation();

		/**
		 * The meta object literal for the '<em><b>Associated Net Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPOT_LOCATION__ASSOCIATED_NET_ELEMENTS = eINSTANCE.getSpotLocation_AssociatedNetElements();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.LinearLocationImpl <em>Linear Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.LinearLocationImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getLinearLocation()
		 * @generated
		 */
		EClass LINEAR_LOCATION = eINSTANCE.getLinearLocation();

		/**
		 * The meta object literal for the '<em><b>Associated Net Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEAR_LOCATION__ASSOCIATED_NET_ELEMENTS = eINSTANCE.getLinearLocation_AssociatedNetElements();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.AreaLocationImpl <em>Area Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.AreaLocationImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getAreaLocation()
		 * @generated
		 */
		EClass AREA_LOCATION = eINSTANCE.getAreaLocation();

		/**
		 * The meta object literal for the '<em><b>Associated Net Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA_LOCATION__ASSOCIATED_NET_ELEMENTS = eINSTANCE.getAreaLocation_AssociatedNetElements();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.AssociatedNetElementImpl <em>Associated Net Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.AssociatedNetElementImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getAssociatedNetElement()
		 * @generated
		 */
		EClass ASSOCIATED_NET_ELEMENT = eINSTANCE.getAssociatedNetElement();

		/**
		 * The meta object literal for the '<em><b>Net Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATED_NET_ELEMENT__NET_ELEMENT = eINSTANCE.getAssociatedNetElement_NetElement();

		/**
		 * The meta object literal for the '<em><b>Applies In Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATED_NET_ELEMENT__APPLIES_IN_DIRECTION = eINSTANCE
				.getAssociatedNetElement_AppliesInDirection();

		/**
		 * The meta object literal for the '<em><b>Has Lateral Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATED_NET_ELEMENT__HAS_LATERAL_POSITION = eINSTANCE
				.getAssociatedNetElement_HasLateralPosition();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.LateralPositionImpl <em>Lateral Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.LateralPositionImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getLateralPosition()
		 * @generated
		 */
		EClass LATERAL_POSITION = eINSTANCE.getLateralPosition();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.LateralSideImpl <em>Lateral Side</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.LateralSideImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getLateralSide()
		 * @generated
		 */
		EClass LATERAL_SIDE = eINSTANCE.getLateralSide();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATERAL_SIDE__SIDE = eINSTANCE.getLateralSide_Side();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.BaseObjectEULYNXImpl <em>Base Object EULYNX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.BaseObjectEULYNXImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getBaseObjectEULYNX()
		 * @generated
		 */
		EClass BASE_OBJECT_EULYNX = eINSTANCE.getBaseObjectEULYNX();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.TvpSectionImpl <em>Tvp Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.TvpSectionImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getTvpSection()
		 * @generated
		 */
		EClass TVP_SECTION = eINSTANCE.getTvpSection();

		/**
		 * The meta object literal for the '<em><b>Is Located At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVP_SECTION__IS_LOCATED_AT = eINSTANCE.getTvpSection_IsLocatedAt();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.VirtualTrackAssetImpl <em>Virtual Track Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.VirtualTrackAssetImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getVirtualTrackAsset()
		 * @generated
		 */
		EClass VIRTUAL_TRACK_ASSET = eINSTANCE.getVirtualTrackAsset();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.TrackAssetImpl <em>Track Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.TrackAssetImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getTrackAsset()
		 * @generated
		 */
		EClass TRACK_ASSET = eINSTANCE.getTrackAsset();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.ConfiguredBaseObjectImpl <em>Configured Base Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.ConfiguredBaseObjectImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getConfiguredBaseObject()
		 * @generated
		 */
		EClass CONFIGURED_BASE_OBJECT = eINSTANCE.getConfiguredBaseObject();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.TdsSectionImpl <em>Tds Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.TdsSectionImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getTdsSection()
		 * @generated
		 */
		EClass TDS_SECTION = eINSTANCE.getTdsSection();

		/**
		 * The meta object literal for the '<em><b>Applies To Tvpsection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDS_SECTION__APPLIES_TO_TVPSECTION = eINSTANCE.getTdsSection_AppliesToTvpsection();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.TdsCompnentImpl <em>Tds Compnent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.TdsCompnentImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getTdsCompnent()
		 * @generated
		 */
		EClass TDS_COMPNENT = eINSTANCE.getTdsCompnent();

		/**
		 * The meta object literal for the '<em><b>Limits Tds Section</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDS_COMPNENT__LIMITS_TDS_SECTION = eINSTANCE.getTdsCompnent_LimitsTdsSection();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.VehiclePassageDetectorImpl <em>Vehicle Passage Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.VehiclePassageDetectorImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getVehiclePassageDetector()
		 * @generated
		 */
		EClass VEHICLE_PASSAGE_DETECTOR = eINSTANCE.getVehiclePassageDetector();

		/**
		 * The meta object literal for the '<em><b>Occupies Tds Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_PASSAGE_DETECTOR__OCCUPIES_TDS_SECTION = eINSTANCE
				.getVehiclePassageDetector_OccupiesTdsSection();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.PhysicalTrackAssetImpl <em>Physical Track Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.PhysicalTrackAssetImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getPhysicalTrackAsset()
		 * @generated
		 */
		EClass PHYSICAL_TRACK_ASSET = eINSTANCE.getPhysicalTrackAsset();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.VssLimitImpl <em>Vss Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.VssLimitImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getVssLimit()
		 * @generated
		 */
		EClass VSS_LIMIT = eINSTANCE.getVssLimit();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.VirtualSubSectionImpl <em>Virtual Sub Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.VirtualSubSectionImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getVirtualSubSection()
		 * @generated
		 */
		EClass VIRTUAL_SUB_SECTION = eINSTANCE.getVirtualSubSection();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.EtcsMaSectionImpl <em>Etcs Ma Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.EtcsMaSectionImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getEtcsMaSection()
		 * @generated
		 */
		EClass ETCS_MA_SECTION = eINSTANCE.getEtcsMaSection();

		/**
		 * The meta object literal for the '<em><b>Has Section Entry Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETCS_MA_SECTION__HAS_SECTION_ENTRY_LOCATION = eINSTANCE.getEtcsMaSection_HasSectionEntryLocation();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.RouteImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Applies To Route Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__APPLIES_TO_ROUTE_BODY = eINSTANCE.getRoute_AppliesToRouteBody();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.EtcsRouteImpl <em>Etcs Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.EtcsRouteImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getEtcsRoute()
		 * @generated
		 */
		EClass ETCS_ROUTE = eINSTANCE.getEtcsRoute();

		/**
		 * The meta object literal for the '<em><b>Has Ma Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETCS_ROUTE__HAS_MA_SECTION = eINSTANCE.getEtcsRoute_HasMaSection();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.RouteBodyImpl <em>Route Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.RouteBodyImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getRouteBody()
		 * @generated
		 */
		EClass ROUTE_BODY = eINSTANCE.getRouteBody();

		/**
		 * The meta object literal for the '<em><b>Has Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_BODY__HAS_ENTRY = eINSTANCE.getRouteBody_HasEntry();

		/**
		 * The meta object literal for the '<em><b>Has Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_BODY__HAS_EXIT = eINSTANCE.getRouteBody_HasExit();

		/**
		 * The meta object literal for the '<em><b>Refers To Rsm Rout Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_BODY__REFERS_TO_RSM_ROUT_BODY = eINSTANCE.getRouteBody_RefersToRsmRoutBody();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.RouteBodyPropertyImpl <em>Route Body Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.RouteBodyPropertyImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getRouteBodyProperty()
		 * @generated
		 */
		EClass ROUTE_BODY_PROPERTY = eINSTANCE.getRouteBodyProperty();

		/**
		 * The meta object literal for the '<em><b>Applies To Route Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_BODY_PROPERTY__APPLIES_TO_ROUTE_BODY = eINSTANCE.getRouteBodyProperty_AppliesToRouteBody();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.SectionListImpl <em>Section List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.SectionListImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getSectionList()
		 * @generated
		 */
		EClass SECTION_LIST = eINSTANCE.getSectionList();

		/**
		 * The meta object literal for the '<em><b>Has Section</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_LIST__HAS_SECTION = eINSTANCE.getSectionList_HasSection();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.RouteExtremityImpl <em>Route Extremity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.RouteExtremityImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getRouteExtremity()
		 * @generated
		 */
		EClass ROUTE_EXTREMITY = eINSTANCE.getRouteExtremity();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.RouteEntryImpl <em>Route Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.RouteEntryImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getRouteEntry()
		 * @generated
		 */
		EClass ROUTE_ENTRY = eINSTANCE.getRouteEntry();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.RouteExitImpl <em>Route Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.RouteExitImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getRouteExit()
		 * @generated
		 */
		EClass ROUTE_EXIT = eINSTANCE.getRouteExit();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.SignalImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Refers To Rsm Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__REFERS_TO_RSM_SIGNAL = eINSTANCE.getSignal_RefersToRsmSignal();

		/**
		 * The meta object literal for the '<em><b>Has Group Main Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__HAS_GROUP_MAIN_SIGNAL = eINSTANCE.getSignal_HasGroupMainSignal();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.NonPhysicalSignalImpl <em>Non Physical Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.NonPhysicalSignalImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getNonPhysicalSignal()
		 * @generated
		 */
		EClass NON_PHYSICAL_SIGNAL = eINSTANCE.getNonPhysicalSignal();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.VirtualSignalImpl <em>Virtual Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.VirtualSignalImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getVirtualSignal()
		 * @generated
		 */
		EClass VIRTUAL_SIGNAL = eINSTANCE.getVirtualSignal();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.NetEntityImpl <em>Net Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.NetEntityImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getNetEntity()
		 * @generated
		 */
		EClass NET_ENTITY = eINSTANCE.getNetEntity();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.LocatedNetEntityImpl <em>Located Net Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.LocatedNetEntityImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getLocatedNetEntity()
		 * @generated
		 */
		EClass LOCATED_NET_ENTITY = eINSTANCE.getLocatedNetEntity();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATED_NET_ENTITY__LOCATIONS = eINSTANCE.getLocatedNetEntity_Locations();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.SignalRSMImpl <em>Signal RSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.SignalRSMImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getSignalRSM()
		 * @generated
		 */
		EClass SIGNAL_RSM = eINSTANCE.getSignalRSM();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.RouteBodyRSMImpl <em>Route Body RSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.RouteBodyRSMImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getRouteBodyRSM()
		 * @generated
		 */
		EClass ROUTE_BODY_RSM = eINSTANCE.getRouteBodyRSM();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.EtcsSignalPropertiesImpl <em>Etcs Signal Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.EtcsSignalPropertiesImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getEtcsSignalProperties()
		 * @generated
		 */
		EClass ETCS_SIGNAL_PROPERTIES = eINSTANCE.getEtcsSignalProperties();

		/**
		 * The meta object literal for the '<em><b>Refers To Eo A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETCS_SIGNAL_PROPERTIES__REFERS_TO_EO_A = eINSTANCE.getEtcsSignalProperties_RefersToEoA();

		/**
		 * The meta object literal for the '<em><b>Applies To Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETCS_SIGNAL_PROPERTIES__APPLIES_TO_SIGNAL = eINSTANCE.getEtcsSignalProperties_AppliesToSignal();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.EtcsEndOfAuthorityImpl <em>Etcs End Of Authority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.EtcsEndOfAuthorityImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getEtcsEndOfAuthority()
		 * @generated
		 */
		EClass ETCS_END_OF_AUTHORITY = eINSTANCE.getEtcsEndOfAuthority();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.DocumentRootImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Data Prep Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATA_PREP_ENTITIES = eINSTANCE.getDocumentRoot_DataPrepEntities();

		/**
		 * The meta object literal for the '<em><b>Rsm Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RSM_ENTITIES = eINSTANCE.getDocumentRoot_RsmEntities();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.DataPrepEntitiesImpl <em>Data Prep Entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.DataPrepEntitiesImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getDataPrepEntities()
		 * @generated
		 */
		EClass DATA_PREP_ENTITIES = eINSTANCE.getDataPrepEntities();

		/**
		 * The meta object literal for the '<em><b>Owns Etcs End Of Authority</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREP_ENTITIES__OWNS_ETCS_END_OF_AUTHORITY = eINSTANCE
				.getDataPrepEntities_OwnsEtcsEndOfAuthority();

		/**
		 * The meta object literal for the '<em><b>Owns Etcs Ma Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREP_ENTITIES__OWNS_ETCS_MA_SECTION = eINSTANCE.getDataPrepEntities_OwnsEtcsMaSection();

		/**
		 * The meta object literal for the '<em><b>Owns Etcs Signal Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREP_ENTITIES__OWNS_ETCS_SIGNAL_PROPERTIES = eINSTANCE
				.getDataPrepEntities_OwnsEtcsSignalProperties();

		/**
		 * The meta object literal for the '<em><b>Owns Route Body Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREP_ENTITIES__OWNS_ROUTE_BODY_PROPERTY = eINSTANCE.getDataPrepEntities_OwnsRouteBodyProperty();

		/**
		 * The meta object literal for the '<em><b>Owns Route Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREP_ENTITIES__OWNS_ROUTE_BODY = eINSTANCE.getDataPrepEntities_OwnsRouteBody();

		/**
		 * The meta object literal for the '<em><b>Owns Route</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREP_ENTITIES__OWNS_ROUTE = eINSTANCE.getDataPrepEntities_OwnsRoute();

		/**
		 * The meta object literal for the '<em><b>Owns Track Asset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREP_ENTITIES__OWNS_TRACK_ASSET = eINSTANCE.getDataPrepEntities_OwnsTrackAsset();

		/**
		 * The meta object literal for the '<em><b>Knows Asset And State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PREP_ENTITIES__KNOWS_ASSET_AND_STATE = eINSTANCE.getDataPrepEntities_KnowsAssetAndState();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.RsmEntitiesImpl <em>Rsm Entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.RsmEntitiesImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getRsmEntities()
		 * @generated
		 */
		EClass RSM_ENTITIES = eINSTANCE.getRsmEntities();

		/**
		 * The meta object literal for the '<em><b>Uses Etcs Topology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSM_ENTITIES__USES_ETCS_TOPOLOGY = eINSTANCE.getRsmEntities_UsesEtcsTopology();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.TopologyImpl <em>Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.TopologyImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getTopology()
		 * @generated
		 */
		EClass TOPOLOGY = eINSTANCE.getTopology();

		/**
		 * The meta object literal for the '<em><b>Uses Positioned Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY__USES_POSITIONED_RELATION = eINSTANCE.getTopology_UsesPositionedRelation();

		/**
		 * The meta object literal for the '<em><b>Uses Net Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY__USES_NET_ELEMENT = eINSTANCE.getTopology_UsesNetElement();

		/**
		 * The meta object literal for the '<em><b>Uses Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY__USES_LOCATION = eINSTANCE.getTopology_UsesLocation();

		/**
		 * The meta object literal for the '<em><b>Owns Signal RSM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY__OWNS_SIGNAL_RSM = eINSTANCE.getTopology_OwnsSignalRSM();

		/**
		 * The meta object literal for the '<em><b>Owns Route Body RSM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY__OWNS_ROUTE_BODY_RSM = eINSTANCE.getTopology_OwnsRouteBodyRSM();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.AssetAndStateImpl <em>Asset And State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.AssetAndStateImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getAssetAndState()
		 * @generated
		 */
		EClass ASSET_AND_STATE = eINSTANCE.getAssetAndState();

		/**
		 * The meta object literal for the '{@link extractedMM.impl.SectionAndVacancyImpl <em>Section And Vacancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.impl.SectionAndVacancyImpl
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getSectionAndVacancy()
		 * @generated
		 */
		EClass SECTION_AND_VACANCY = eINSTANCE.getSectionAndVacancy();

		/**
		 * The meta object literal for the '<em><b>Refers To Tds Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_AND_VACANCY__REFERS_TO_TDS_SECTION = eINSTANCE.getSectionAndVacancy_RefersToTdsSection();

		/**
		 * The meta object literal for the '<em><b>In Vacancy State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_AND_VACANCY__IN_VACANCY_STATE = eINSTANCE.getSectionAndVacancy_InVacancyState();

		/**
		 * The meta object literal for the '{@link extractedMM.Navigability <em>Navigability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.Navigability
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getNavigability()
		 * @generated
		 */
		EEnum NAVIGABILITY = eINSTANCE.getNavigability();

		/**
		 * The meta object literal for the '{@link extractedMM.Usage <em>Usage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.Usage
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getUsage()
		 * @generated
		 */
		EEnum USAGE = eINSTANCE.getUsage();

		/**
		 * The meta object literal for the '{@link extractedMM.LeftRight <em>Left Right</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.LeftRight
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getLeftRight()
		 * @generated
		 */
		EEnum LEFT_RIGHT = eINSTANCE.getLeftRight();

		/**
		 * The meta object literal for the '{@link extractedMM.ApplicationDirection <em>Application Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.ApplicationDirection
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getApplicationDirection()
		 * @generated
		 */
		EEnum APPLICATION_DIRECTION = eINSTANCE.getApplicationDirection();

		/**
		 * The meta object literal for the '{@link extractedMM.Side <em>Side</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.Side
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getSide()
		 * @generated
		 */
		EEnum SIDE = eINSTANCE.getSide();

		/**
		 * The meta object literal for the '{@link extractedMM.SectionVacancyTypes <em>Section Vacancy Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extractedMM.SectionVacancyTypes
		 * @see extractedMM.impl.ExtractedMMPackageImpl#getSectionVacancyTypes()
		 * @generated
		 */
		EEnum SECTION_VACANCY_TYPES = eINSTANCE.getSectionVacancyTypes();

	}

} //ExtractedMMPackage
