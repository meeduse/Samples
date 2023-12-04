/**
 */
package extractedMM.impl;

import extractedMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtractedMMFactoryImpl extends EFactoryImpl implements ExtractedMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtractedMMFactory init() {
		try {
			ExtractedMMFactory theExtractedMMFactory = (ExtractedMMFactory) EPackage.Registry.INSTANCE
					.getEFactory(ExtractedMMPackage.eNS_URI);
			if (theExtractedMMFactory != null) {
				return theExtractedMMFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtractedMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractedMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ExtractedMMPackage.NET_ELEMENT:
			return createNetElement();
		case ExtractedMMPackage.POSITIONING_NET_ELEMENT:
			return createPositioningNetElement();
		case ExtractedMMPackage.LINEAR_ELEMENT:
			return createLinearElement();
		case ExtractedMMPackage.RELATION:
			return createRelation();
		case ExtractedMMPackage.POSITIONED_RELATION:
			return createPositionedRelation();
		case ExtractedMMPackage.SPOT_LOCATION:
			return createSpotLocation();
		case ExtractedMMPackage.LINEAR_LOCATION:
			return createLinearLocation();
		case ExtractedMMPackage.AREA_LOCATION:
			return createAreaLocation();
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT:
			return createAssociatedNetElement();
		case ExtractedMMPackage.LATERAL_POSITION:
			return createLateralPosition();
		case ExtractedMMPackage.TVP_SECTION:
			return createTvpSection();
		case ExtractedMMPackage.TDS_SECTION:
			return createTdsSection();
		case ExtractedMMPackage.TDS_COMPNENT:
			return createTdsCompnent();
		case ExtractedMMPackage.VSS_LIMIT:
			return createVssLimit();
		case ExtractedMMPackage.VIRTUAL_SUB_SECTION:
			return createVirtualSubSection();
		case ExtractedMMPackage.ETCS_MA_SECTION:
			return createEtcsMaSection();
		case ExtractedMMPackage.ETCS_ROUTE:
			return createEtcsRoute();
		case ExtractedMMPackage.ROUTE_BODY:
			return createRouteBody();
		case ExtractedMMPackage.SECTION_LIST:
			return createSectionList();
		case ExtractedMMPackage.ROUTE_ENTRY:
			return createRouteEntry();
		case ExtractedMMPackage.ROUTE_EXIT:
			return createRouteExit();
		case ExtractedMMPackage.SIGNAL:
			return createSignal();
		case ExtractedMMPackage.NON_PHYSICAL_SIGNAL:
			return createNonPhysicalSignal();
		case ExtractedMMPackage.VIRTUAL_SIGNAL:
			return createVirtualSignal();
		case ExtractedMMPackage.NET_ENTITY:
			return createNetEntity();
		case ExtractedMMPackage.SIGNAL_RSM:
			return createSignalRSM();
		case ExtractedMMPackage.ROUTE_BODY_RSM:
			return createRouteBodyRSM();
		case ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES:
			return createEtcsSignalProperties();
		case ExtractedMMPackage.ETCS_END_OF_AUTHORITY:
			return createEtcsEndOfAuthority();
		case ExtractedMMPackage.DOCUMENT_ROOT:
			return createDocumentRoot();
		case ExtractedMMPackage.DATA_PREP_ENTITIES:
			return createDataPrepEntities();
		case ExtractedMMPackage.RSM_ENTITIES:
			return createRsmEntities();
		case ExtractedMMPackage.TOPOLOGY:
			return createTopology();
		case ExtractedMMPackage.SECTION_AND_VACANCY:
			return createSectionAndVacancy();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ExtractedMMPackage.NAVIGABILITY:
			return createNavigabilityFromString(eDataType, initialValue);
		case ExtractedMMPackage.USAGE:
			return createUsageFromString(eDataType, initialValue);
		case ExtractedMMPackage.LEFT_RIGHT:
			return createLeftRightFromString(eDataType, initialValue);
		case ExtractedMMPackage.APPLICATION_DIRECTION:
			return createApplicationDirectionFromString(eDataType, initialValue);
		case ExtractedMMPackage.SIDE:
			return createSideFromString(eDataType, initialValue);
		case ExtractedMMPackage.SECTION_VACANCY_TYPES:
			return createSectionVacancyTypesFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ExtractedMMPackage.NAVIGABILITY:
			return convertNavigabilityToString(eDataType, instanceValue);
		case ExtractedMMPackage.USAGE:
			return convertUsageToString(eDataType, instanceValue);
		case ExtractedMMPackage.LEFT_RIGHT:
			return convertLeftRightToString(eDataType, instanceValue);
		case ExtractedMMPackage.APPLICATION_DIRECTION:
			return convertApplicationDirectionToString(eDataType, instanceValue);
		case ExtractedMMPackage.SIDE:
			return convertSideToString(eDataType, instanceValue);
		case ExtractedMMPackage.SECTION_VACANCY_TYPES:
			return convertSectionVacancyTypesToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetElement createNetElement() {
		NetElementImpl netElement = new NetElementImpl();
		return netElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositioningNetElement createPositioningNetElement() {
		PositioningNetElementImpl positioningNetElement = new PositioningNetElementImpl();
		return positioningNetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearElement createLinearElement() {
		LinearElementImpl linearElement = new LinearElementImpl();
		return linearElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionedRelation createPositionedRelation() {
		PositionedRelationImpl positionedRelation = new PositionedRelationImpl();
		return positionedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpotLocation createSpotLocation() {
		SpotLocationImpl spotLocation = new SpotLocationImpl();
		return spotLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearLocation createLinearLocation() {
		LinearLocationImpl linearLocation = new LinearLocationImpl();
		return linearLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaLocation createAreaLocation() {
		AreaLocationImpl areaLocation = new AreaLocationImpl();
		return areaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociatedNetElement createAssociatedNetElement() {
		AssociatedNetElementImpl associatedNetElement = new AssociatedNetElementImpl();
		return associatedNetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LateralPosition createLateralPosition() {
		LateralPositionImpl lateralPosition = new LateralPositionImpl();
		return lateralPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TvpSection createTvpSection() {
		TvpSectionImpl tvpSection = new TvpSectionImpl();
		return tvpSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TdsSection createTdsSection() {
		TdsSectionImpl tdsSection = new TdsSectionImpl();
		return tdsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TdsCompnent createTdsCompnent() {
		TdsCompnentImpl tdsCompnent = new TdsCompnentImpl();
		return tdsCompnent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VssLimit createVssLimit() {
		VssLimitImpl vssLimit = new VssLimitImpl();
		return vssLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSubSection createVirtualSubSection() {
		VirtualSubSectionImpl virtualSubSection = new VirtualSubSectionImpl();
		return virtualSubSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtcsMaSection createEtcsMaSection() {
		EtcsMaSectionImpl etcsMaSection = new EtcsMaSectionImpl();
		return etcsMaSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtcsRoute createEtcsRoute() {
		EtcsRouteImpl etcsRoute = new EtcsRouteImpl();
		return etcsRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteBody createRouteBody() {
		RouteBodyImpl routeBody = new RouteBodyImpl();
		return routeBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionList createSectionList() {
		SectionListImpl sectionList = new SectionListImpl();
		return sectionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteEntry createRouteEntry() {
		RouteEntryImpl routeEntry = new RouteEntryImpl();
		return routeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteExit createRouteExit() {
		RouteExitImpl routeExit = new RouteExitImpl();
		return routeExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonPhysicalSignal createNonPhysicalSignal() {
		NonPhysicalSignalImpl nonPhysicalSignal = new NonPhysicalSignalImpl();
		return nonPhysicalSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSignal createVirtualSignal() {
		VirtualSignalImpl virtualSignal = new VirtualSignalImpl();
		return virtualSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetEntity createNetEntity() {
		NetEntityImpl netEntity = new NetEntityImpl();
		return netEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalRSM createSignalRSM() {
		SignalRSMImpl signalRSM = new SignalRSMImpl();
		return signalRSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteBodyRSM createRouteBodyRSM() {
		RouteBodyRSMImpl routeBodyRSM = new RouteBodyRSMImpl();
		return routeBodyRSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtcsSignalProperties createEtcsSignalProperties() {
		EtcsSignalPropertiesImpl etcsSignalProperties = new EtcsSignalPropertiesImpl();
		return etcsSignalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtcsEndOfAuthority createEtcsEndOfAuthority() {
		EtcsEndOfAuthorityImpl etcsEndOfAuthority = new EtcsEndOfAuthorityImpl();
		return etcsEndOfAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPrepEntities createDataPrepEntities() {
		DataPrepEntitiesImpl dataPrepEntities = new DataPrepEntitiesImpl();
		return dataPrepEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RsmEntities createRsmEntities() {
		RsmEntitiesImpl rsmEntities = new RsmEntitiesImpl();
		return rsmEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topology createTopology() {
		TopologyImpl topology = new TopologyImpl();
		return topology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionAndVacancy createSectionAndVacancy() {
		SectionAndVacancyImpl sectionAndVacancy = new SectionAndVacancyImpl();
		return sectionAndVacancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navigability createNavigabilityFromString(EDataType eDataType, String initialValue) {
		Navigability result = Navigability.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNavigabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage createUsageFromString(EDataType eDataType, String initialValue) {
		Usage result = Usage.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftRight createLeftRightFromString(EDataType eDataType, String initialValue) {
		LeftRight result = LeftRight.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeftRightToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDirection createApplicationDirectionFromString(EDataType eDataType, String initialValue) {
		ApplicationDirection result = ApplicationDirection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Side createSideFromString(EDataType eDataType, String initialValue) {
		Side result = Side.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSideToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionVacancyTypes createSectionVacancyTypesFromString(EDataType eDataType, String initialValue) {
		SectionVacancyTypes result = SectionVacancyTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSectionVacancyTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractedMMPackage getExtractedMMPackage() {
		return (ExtractedMMPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtractedMMPackage getPackage() {
		return ExtractedMMPackage.eINSTANCE;
	}

} //ExtractedMMFactoryImpl
