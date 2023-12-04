/**
 */
package extractedMM.impl;

import extractedMM.ApplicationDirection;
import extractedMM.AreaLocation;
import extractedMM.AssetAndState;
import extractedMM.AssociatedNetElement;
import extractedMM.BaseLocation;
import extractedMM.BaseObjectEULYNX;
import extractedMM.BaseObjectRSM;
import extractedMM.CompositionNetElement;
import extractedMM.ConfiguredBaseObject;
import extractedMM.DataPrepEntities;
import extractedMM.DocumentRoot;
import extractedMM.EtcsEndOfAuthority;
import extractedMM.EtcsMaSection;
import extractedMM.EtcsRoute;
import extractedMM.EtcsSignalProperties;
import extractedMM.ExtractedMMFactory;
import extractedMM.ExtractedMMPackage;
import extractedMM.LateralPosition;
import extractedMM.LateralSide;
import extractedMM.LeftRight;
import extractedMM.LinearElement;
import extractedMM.LinearLocation;
import extractedMM.LocatedNetEntity;
import extractedMM.NamedResource;
import extractedMM.Navigability;
import extractedMM.NetElement;
import extractedMM.NetEntity;
import extractedMM.NetworkResource;
import extractedMM.NonPhysicalSignal;
import extractedMM.PhysicalTrackAsset;
import extractedMM.PositionedRelation;
import extractedMM.PositioningNetElement;
import extractedMM.Relation;
import extractedMM.Route;
import extractedMM.RouteBody;
import extractedMM.RouteBodyProperty;
import extractedMM.RouteBodyRSM;
import extractedMM.RouteEntry;
import extractedMM.RouteExit;
import extractedMM.RouteExtremity;
import extractedMM.RsmEntities;
import extractedMM.SectionAndVacancy;
import extractedMM.SectionList;
import extractedMM.SectionVacancyTypes;
import extractedMM.Side;
import extractedMM.Signal;
import extractedMM.SignalRSM;
import extractedMM.SpotLocation;
import extractedMM.TdsCompnent;
import extractedMM.TdsSection;
import extractedMM.Topology;
import extractedMM.TrackAsset;
import extractedMM.TvpSection;
import extractedMM.Usage;
import extractedMM.VehiclePassageDetector;
import extractedMM.VirtualSignal;
import extractedMM.VirtualSubSection;
import extractedMM.VirtualTrackAsset;
import extractedMM.VssLimit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtractedMMPackageImpl extends EPackageImpl implements ExtractedMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseObjectRSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionNetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positioningNetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionedRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spotLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associatedNetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lateralPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lateralSideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseObjectEULYNXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tvpSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualTrackAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuredBaseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdsCompnentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehiclePassageDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalTrackAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vssLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualSubSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcsMaSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcsRouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeBodyPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeExtremityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeExitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonPhysicalSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatedNetEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalRSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeBodyRSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcsSignalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcsEndOfAuthorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPrepEntitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsmEntitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetAndStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionAndVacancyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum navigabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum leftRightEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicationDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sideEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sectionVacancyTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see extractedMM.ExtractedMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtractedMMPackageImpl() {
		super(eNS_URI, ExtractedMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ExtractedMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtractedMMPackage init() {
		if (isInited)
			return (ExtractedMMPackage) EPackage.Registry.INSTANCE.getEPackage(ExtractedMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExtractedMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExtractedMMPackageImpl theExtractedMMPackage = registeredExtractedMMPackage instanceof ExtractedMMPackageImpl
				? (ExtractedMMPackageImpl) registeredExtractedMMPackage
				: new ExtractedMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theExtractedMMPackage.createPackageContents();

		// Initialize created meta-data
		theExtractedMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtractedMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtractedMMPackage.eNS_URI, theExtractedMMPackage);
		return theExtractedMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseObjectRSM() {
		return baseObjectRSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseObjectRSM_Id() {
		return (EAttribute) baseObjectRSMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedResource() {
		return namedResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedResource_Longname() {
		return (EAttribute) namedResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedResource_Name() {
		return (EAttribute) namedResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkResource() {
		return networkResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetElement() {
		return netElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionNetElement() {
		return compositionNetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositioningNetElement() {
		return positioningNetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearElement() {
		return linearElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionedRelation() {
		return positionedRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionedRelation_Navigibility() {
		return (EAttribute) positionedRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionedRelation_PositionOnA() {
		return (EAttribute) positionedRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionedRelation_PositionOnB() {
		return (EAttribute) positionedRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionedRelation_LeadsTowards() {
		return (EAttribute) positionedRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedRelation_ElementA() {
		return (EReference) positionedRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedRelation_ElementB() {
		return (EReference) positionedRelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseLocation() {
		return baseLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpotLocation() {
		return spotLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpotLocation_AssociatedNetElements() {
		return (EReference) spotLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearLocation() {
		return linearLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearLocation_AssociatedNetElements() {
		return (EReference) linearLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaLocation() {
		return areaLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAreaLocation_AssociatedNetElements() {
		return (EReference) areaLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociatedNetElement() {
		return associatedNetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociatedNetElement_NetElement() {
		return (EReference) associatedNetElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociatedNetElement_AppliesInDirection() {
		return (EAttribute) associatedNetElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociatedNetElement_HasLateralPosition() {
		return (EReference) associatedNetElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLateralPosition() {
		return lateralPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLateralSide() {
		return lateralSideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLateralSide_Side() {
		return (EAttribute) lateralSideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseObjectEULYNX() {
		return baseObjectEULYNXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTvpSection() {
		return tvpSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTvpSection_IsLocatedAt() {
		return (EReference) tvpSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualTrackAsset() {
		return virtualTrackAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrackAsset() {
		return trackAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguredBaseObject() {
		return configuredBaseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTdsSection() {
		return tdsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTdsSection_AppliesToTvpsection() {
		return (EReference) tdsSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTdsCompnent() {
		return tdsCompnentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTdsCompnent_LimitsTdsSection() {
		return (EReference) tdsCompnentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehiclePassageDetector() {
		return vehiclePassageDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehiclePassageDetector_OccupiesTdsSection() {
		return (EReference) vehiclePassageDetectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalTrackAsset() {
		return physicalTrackAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVssLimit() {
		return vssLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualSubSection() {
		return virtualSubSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtcsMaSection() {
		return etcsMaSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtcsMaSection_HasSectionEntryLocation() {
		return (EReference) etcsMaSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoute() {
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_AppliesToRouteBody() {
		return (EReference) routeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtcsRoute() {
		return etcsRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtcsRoute_HasMaSection() {
		return (EReference) etcsRouteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteBody() {
		return routeBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteBody_HasEntry() {
		return (EReference) routeBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteBody_HasExit() {
		return (EReference) routeBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteBody_RefersToRsmRoutBody() {
		return (EReference) routeBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteBodyProperty() {
		return routeBodyPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteBodyProperty_AppliesToRouteBody() {
		return (EReference) routeBodyPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionList() {
		return sectionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionList_HasSection() {
		return (EReference) sectionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteExtremity() {
		return routeExtremityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteEntry() {
		return routeEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteExit() {
		return routeExitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_RefersToRsmSignal() {
		return (EReference) signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_HasGroupMainSignal() {
		return (EReference) signalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonPhysicalSignal() {
		return nonPhysicalSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualSignal() {
		return virtualSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetEntity() {
		return netEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocatedNetEntity() {
		return locatedNetEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocatedNetEntity_Locations() {
		return (EReference) locatedNetEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalRSM() {
		return signalRSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteBodyRSM() {
		return routeBodyRSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtcsSignalProperties() {
		return etcsSignalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtcsSignalProperties_RefersToEoA() {
		return (EReference) etcsSignalPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtcsSignalProperties_AppliesToSignal() {
		return (EReference) etcsSignalPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtcsEndOfAuthority() {
		return etcsEndOfAuthorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataPrepEntities() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RsmEntities() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPrepEntities() {
		return dataPrepEntitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPrepEntities_OwnsEtcsEndOfAuthority() {
		return (EReference) dataPrepEntitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPrepEntities_OwnsEtcsMaSection() {
		return (EReference) dataPrepEntitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPrepEntities_OwnsEtcsSignalProperties() {
		return (EReference) dataPrepEntitiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPrepEntities_OwnsRouteBodyProperty() {
		return (EReference) dataPrepEntitiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPrepEntities_OwnsRouteBody() {
		return (EReference) dataPrepEntitiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPrepEntities_OwnsRoute() {
		return (EReference) dataPrepEntitiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPrepEntities_OwnsTrackAsset() {
		return (EReference) dataPrepEntitiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPrepEntities_KnowsAssetAndState() {
		return (EReference) dataPrepEntitiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRsmEntities() {
		return rsmEntitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRsmEntities_UsesEtcsTopology() {
		return (EReference) rsmEntitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopology() {
		return topologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopology_UsesPositionedRelation() {
		return (EReference) topologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopology_UsesNetElement() {
		return (EReference) topologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopology_UsesLocation() {
		return (EReference) topologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopology_OwnsSignalRSM() {
		return (EReference) topologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopology_OwnsRouteBodyRSM() {
		return (EReference) topologyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssetAndState() {
		return assetAndStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionAndVacancy() {
		return sectionAndVacancyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionAndVacancy_RefersToTdsSection() {
		return (EReference) sectionAndVacancyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionAndVacancy_InVacancyState() {
		return (EAttribute) sectionAndVacancyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNavigability() {
		return navigabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUsage() {
		return usageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLeftRight() {
		return leftRightEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApplicationDirection() {
		return applicationDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSide() {
		return sideEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSectionVacancyTypes() {
		return sectionVacancyTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractedMMFactory getExtractedMMFactory() {
		return (ExtractedMMFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		baseObjectRSMEClass = createEClass(BASE_OBJECT_RSM);
		createEAttribute(baseObjectRSMEClass, BASE_OBJECT_RSM__ID);

		namedResourceEClass = createEClass(NAMED_RESOURCE);
		createEAttribute(namedResourceEClass, NAMED_RESOURCE__LONGNAME);
		createEAttribute(namedResourceEClass, NAMED_RESOURCE__NAME);

		networkResourceEClass = createEClass(NETWORK_RESOURCE);

		netElementEClass = createEClass(NET_ELEMENT);

		compositionNetElementEClass = createEClass(COMPOSITION_NET_ELEMENT);

		positioningNetElementEClass = createEClass(POSITIONING_NET_ELEMENT);

		linearElementEClass = createEClass(LINEAR_ELEMENT);

		relationEClass = createEClass(RELATION);

		positionedRelationEClass = createEClass(POSITIONED_RELATION);
		createEAttribute(positionedRelationEClass, POSITIONED_RELATION__NAVIGIBILITY);
		createEAttribute(positionedRelationEClass, POSITIONED_RELATION__POSITION_ON_A);
		createEAttribute(positionedRelationEClass, POSITIONED_RELATION__POSITION_ON_B);
		createEAttribute(positionedRelationEClass, POSITIONED_RELATION__LEADS_TOWARDS);
		createEReference(positionedRelationEClass, POSITIONED_RELATION__ELEMENT_A);
		createEReference(positionedRelationEClass, POSITIONED_RELATION__ELEMENT_B);

		baseLocationEClass = createEClass(BASE_LOCATION);

		spotLocationEClass = createEClass(SPOT_LOCATION);
		createEReference(spotLocationEClass, SPOT_LOCATION__ASSOCIATED_NET_ELEMENTS);

		linearLocationEClass = createEClass(LINEAR_LOCATION);
		createEReference(linearLocationEClass, LINEAR_LOCATION__ASSOCIATED_NET_ELEMENTS);

		areaLocationEClass = createEClass(AREA_LOCATION);
		createEReference(areaLocationEClass, AREA_LOCATION__ASSOCIATED_NET_ELEMENTS);

		associatedNetElementEClass = createEClass(ASSOCIATED_NET_ELEMENT);
		createEReference(associatedNetElementEClass, ASSOCIATED_NET_ELEMENT__NET_ELEMENT);
		createEAttribute(associatedNetElementEClass, ASSOCIATED_NET_ELEMENT__APPLIES_IN_DIRECTION);
		createEReference(associatedNetElementEClass, ASSOCIATED_NET_ELEMENT__HAS_LATERAL_POSITION);

		lateralPositionEClass = createEClass(LATERAL_POSITION);

		lateralSideEClass = createEClass(LATERAL_SIDE);
		createEAttribute(lateralSideEClass, LATERAL_SIDE__SIDE);

		baseObjectEULYNXEClass = createEClass(BASE_OBJECT_EULYNX);

		tvpSectionEClass = createEClass(TVP_SECTION);
		createEReference(tvpSectionEClass, TVP_SECTION__IS_LOCATED_AT);

		virtualTrackAssetEClass = createEClass(VIRTUAL_TRACK_ASSET);

		trackAssetEClass = createEClass(TRACK_ASSET);

		configuredBaseObjectEClass = createEClass(CONFIGURED_BASE_OBJECT);

		tdsSectionEClass = createEClass(TDS_SECTION);
		createEReference(tdsSectionEClass, TDS_SECTION__APPLIES_TO_TVPSECTION);

		tdsCompnentEClass = createEClass(TDS_COMPNENT);
		createEReference(tdsCompnentEClass, TDS_COMPNENT__LIMITS_TDS_SECTION);

		vehiclePassageDetectorEClass = createEClass(VEHICLE_PASSAGE_DETECTOR);
		createEReference(vehiclePassageDetectorEClass, VEHICLE_PASSAGE_DETECTOR__OCCUPIES_TDS_SECTION);

		physicalTrackAssetEClass = createEClass(PHYSICAL_TRACK_ASSET);

		vssLimitEClass = createEClass(VSS_LIMIT);

		virtualSubSectionEClass = createEClass(VIRTUAL_SUB_SECTION);

		etcsMaSectionEClass = createEClass(ETCS_MA_SECTION);
		createEReference(etcsMaSectionEClass, ETCS_MA_SECTION__HAS_SECTION_ENTRY_LOCATION);

		routeEClass = createEClass(ROUTE);
		createEReference(routeEClass, ROUTE__APPLIES_TO_ROUTE_BODY);

		etcsRouteEClass = createEClass(ETCS_ROUTE);
		createEReference(etcsRouteEClass, ETCS_ROUTE__HAS_MA_SECTION);

		routeBodyEClass = createEClass(ROUTE_BODY);
		createEReference(routeBodyEClass, ROUTE_BODY__HAS_ENTRY);
		createEReference(routeBodyEClass, ROUTE_BODY__HAS_EXIT);
		createEReference(routeBodyEClass, ROUTE_BODY__REFERS_TO_RSM_ROUT_BODY);

		routeBodyPropertyEClass = createEClass(ROUTE_BODY_PROPERTY);
		createEReference(routeBodyPropertyEClass, ROUTE_BODY_PROPERTY__APPLIES_TO_ROUTE_BODY);

		sectionListEClass = createEClass(SECTION_LIST);
		createEReference(sectionListEClass, SECTION_LIST__HAS_SECTION);

		routeExtremityEClass = createEClass(ROUTE_EXTREMITY);

		routeEntryEClass = createEClass(ROUTE_ENTRY);

		routeExitEClass = createEClass(ROUTE_EXIT);

		signalEClass = createEClass(SIGNAL);
		createEReference(signalEClass, SIGNAL__REFERS_TO_RSM_SIGNAL);
		createEReference(signalEClass, SIGNAL__HAS_GROUP_MAIN_SIGNAL);

		nonPhysicalSignalEClass = createEClass(NON_PHYSICAL_SIGNAL);

		virtualSignalEClass = createEClass(VIRTUAL_SIGNAL);

		netEntityEClass = createEClass(NET_ENTITY);

		locatedNetEntityEClass = createEClass(LOCATED_NET_ENTITY);
		createEReference(locatedNetEntityEClass, LOCATED_NET_ENTITY__LOCATIONS);

		signalRSMEClass = createEClass(SIGNAL_RSM);

		routeBodyRSMEClass = createEClass(ROUTE_BODY_RSM);

		etcsSignalPropertiesEClass = createEClass(ETCS_SIGNAL_PROPERTIES);
		createEReference(etcsSignalPropertiesEClass, ETCS_SIGNAL_PROPERTIES__REFERS_TO_EO_A);
		createEReference(etcsSignalPropertiesEClass, ETCS_SIGNAL_PROPERTIES__APPLIES_TO_SIGNAL);

		etcsEndOfAuthorityEClass = createEClass(ETCS_END_OF_AUTHORITY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATA_PREP_ENTITIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RSM_ENTITIES);

		dataPrepEntitiesEClass = createEClass(DATA_PREP_ENTITIES);
		createEReference(dataPrepEntitiesEClass, DATA_PREP_ENTITIES__OWNS_ETCS_END_OF_AUTHORITY);
		createEReference(dataPrepEntitiesEClass, DATA_PREP_ENTITIES__OWNS_ETCS_MA_SECTION);
		createEReference(dataPrepEntitiesEClass, DATA_PREP_ENTITIES__OWNS_ETCS_SIGNAL_PROPERTIES);
		createEReference(dataPrepEntitiesEClass, DATA_PREP_ENTITIES__OWNS_ROUTE_BODY_PROPERTY);
		createEReference(dataPrepEntitiesEClass, DATA_PREP_ENTITIES__OWNS_ROUTE_BODY);
		createEReference(dataPrepEntitiesEClass, DATA_PREP_ENTITIES__OWNS_ROUTE);
		createEReference(dataPrepEntitiesEClass, DATA_PREP_ENTITIES__OWNS_TRACK_ASSET);
		createEReference(dataPrepEntitiesEClass, DATA_PREP_ENTITIES__KNOWS_ASSET_AND_STATE);

		rsmEntitiesEClass = createEClass(RSM_ENTITIES);
		createEReference(rsmEntitiesEClass, RSM_ENTITIES__USES_ETCS_TOPOLOGY);

		topologyEClass = createEClass(TOPOLOGY);
		createEReference(topologyEClass, TOPOLOGY__USES_POSITIONED_RELATION);
		createEReference(topologyEClass, TOPOLOGY__USES_NET_ELEMENT);
		createEReference(topologyEClass, TOPOLOGY__USES_LOCATION);
		createEReference(topologyEClass, TOPOLOGY__OWNS_SIGNAL_RSM);
		createEReference(topologyEClass, TOPOLOGY__OWNS_ROUTE_BODY_RSM);

		assetAndStateEClass = createEClass(ASSET_AND_STATE);

		sectionAndVacancyEClass = createEClass(SECTION_AND_VACANCY);
		createEReference(sectionAndVacancyEClass, SECTION_AND_VACANCY__REFERS_TO_TDS_SECTION);
		createEAttribute(sectionAndVacancyEClass, SECTION_AND_VACANCY__IN_VACANCY_STATE);

		// Create enums
		navigabilityEEnum = createEEnum(NAVIGABILITY);
		usageEEnum = createEEnum(USAGE);
		leftRightEEnum = createEEnum(LEFT_RIGHT);
		applicationDirectionEEnum = createEEnum(APPLICATION_DIRECTION);
		sideEEnum = createEEnum(SIDE);
		sectionVacancyTypesEEnum = createEEnum(SECTION_VACANCY_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedResourceEClass.getESuperTypes().add(this.getBaseObjectRSM());
		networkResourceEClass.getESuperTypes().add(this.getNamedResource());
		netElementEClass.getESuperTypes().add(this.getNetworkResource());
		compositionNetElementEClass.getESuperTypes().add(this.getNetElement());
		positioningNetElementEClass.getESuperTypes().add(this.getCompositionNetElement());
		linearElementEClass.getESuperTypes().add(this.getPositioningNetElement());
		relationEClass.getESuperTypes().add(this.getNetworkResource());
		positionedRelationEClass.getESuperTypes().add(this.getRelation());
		baseLocationEClass.getESuperTypes().add(this.getBaseObjectRSM());
		spotLocationEClass.getESuperTypes().add(this.getBaseLocation());
		linearLocationEClass.getESuperTypes().add(this.getBaseLocation());
		areaLocationEClass.getESuperTypes().add(this.getBaseLocation());
		lateralSideEClass.getESuperTypes().add(this.getLateralPosition());
		baseObjectEULYNXEClass.getESuperTypes().add(this.getBaseObjectRSM());
		tvpSectionEClass.getESuperTypes().add(this.getVirtualTrackAsset());
		virtualTrackAssetEClass.getESuperTypes().add(this.getTrackAsset());
		trackAssetEClass.getESuperTypes().add(this.getConfiguredBaseObject());
		configuredBaseObjectEClass.getESuperTypes().add(this.getBaseObjectEULYNX());
		tdsSectionEClass.getESuperTypes().add(this.getVirtualTrackAsset());
		tdsCompnentEClass.getESuperTypes().add(this.getVehiclePassageDetector());
		vehiclePassageDetectorEClass.getESuperTypes().add(this.getPhysicalTrackAsset());
		physicalTrackAssetEClass.getESuperTypes().add(this.getTrackAsset());
		vssLimitEClass.getESuperTypes().add(this.getTdsCompnent());
		virtualSubSectionEClass.getESuperTypes().add(this.getTdsSection());
		etcsMaSectionEClass.getESuperTypes().add(this.getConfiguredBaseObject());
		routeEClass.getESuperTypes().add(this.getConfiguredBaseObject());
		etcsRouteEClass.getESuperTypes().add(this.getRoute());
		routeBodyEClass.getESuperTypes().add(this.getConfiguredBaseObject());
		routeBodyPropertyEClass.getESuperTypes().add(this.getConfiguredBaseObject());
		sectionListEClass.getESuperTypes().add(this.getRouteBodyProperty());
		routeExtremityEClass.getESuperTypes().add(this.getBaseObjectEULYNX());
		routeEntryEClass.getESuperTypes().add(this.getRouteExtremity());
		routeExitEClass.getESuperTypes().add(this.getRouteExtremity());
		signalEClass.getESuperTypes().add(this.getTrackAsset());
		nonPhysicalSignalEClass.getESuperTypes().add(this.getSignal());
		virtualSignalEClass.getESuperTypes().add(this.getNonPhysicalSignal());
		netEntityEClass.getESuperTypes().add(this.getNetworkResource());
		locatedNetEntityEClass.getESuperTypes().add(this.getNetEntity());
		signalRSMEClass.getESuperTypes().add(this.getLocatedNetEntity());
		routeBodyRSMEClass.getESuperTypes().add(this.getLocatedNetEntity());
		etcsSignalPropertiesEClass.getESuperTypes().add(this.getBaseObjectEULYNX());
		etcsEndOfAuthorityEClass.getESuperTypes().add(this.getBaseObjectEULYNX());
		dataPrepEntitiesEClass.getESuperTypes().add(this.getBaseObjectRSM());
		rsmEntitiesEClass.getESuperTypes().add(this.getBaseObjectRSM());
		assetAndStateEClass.getESuperTypes().add(this.getConfiguredBaseObject());
		sectionAndVacancyEClass.getESuperTypes().add(this.getAssetAndState());

		// Initialize classes, features, and operations; add parameters
		initEClass(baseObjectRSMEClass, BaseObjectRSM.class, "BaseObjectRSM", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseObjectRSM_Id(), ecorePackage.getEInt(), "Id", null, 0, 1, BaseObjectRSM.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedResourceEClass, NamedResource.class, "NamedResource", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedResource_Longname(), ecorePackage.getEString(), "longname", null, 0, 1,
				NamedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedResource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkResourceEClass, NetworkResource.class, "NetworkResource", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(netElementEClass, NetElement.class, "NetElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositionNetElementEClass, CompositionNetElement.class, "CompositionNetElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positioningNetElementEClass, PositioningNetElement.class, "PositioningNetElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linearElementEClass, LinearElement.class, "LinearElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionedRelationEClass, PositionedRelation.class, "PositionedRelation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionedRelation_Navigibility(), this.getNavigability(), "navigibility", null, 0, 1,
				PositionedRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionedRelation_PositionOnA(), this.getUsage(), "positionOnA", null, 0, 1,
				PositionedRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionedRelation_PositionOnB(), this.getUsage(), "positionOnB", null, 0, 1,
				PositionedRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionedRelation_LeadsTowards(), this.getLeftRight(), "leadsTowards", null, 0, 1,
				PositionedRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedRelation_ElementA(), this.getPositioningNetElement(), null, "elementA", null, 1, 1,
				PositionedRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedRelation_ElementB(), this.getPositioningNetElement(), null, "elementB", null, 1, 1,
				PositionedRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseLocationEClass, BaseLocation.class, "BaseLocation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(spotLocationEClass, SpotLocation.class, "SpotLocation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpotLocation_AssociatedNetElements(), this.getAssociatedNetElement(), null,
				"associatedNetElements", null, 0, -1, SpotLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearLocationEClass, LinearLocation.class, "LinearLocation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinearLocation_AssociatedNetElements(), this.getAssociatedNetElement(), null,
				"associatedNetElements", null, 0, -1, LinearLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaLocationEClass, AreaLocation.class, "AreaLocation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAreaLocation_AssociatedNetElements(), this.getAssociatedNetElement(), null,
				"associatedNetElements", null, 0, -1, AreaLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associatedNetElementEClass, AssociatedNetElement.class, "AssociatedNetElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociatedNetElement_NetElement(), this.getPositioningNetElement(), null, "netElement", null,
				1, 1, AssociatedNetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociatedNetElement_AppliesInDirection(), this.getApplicationDirection(),
				"appliesInDirection", null, 0, 1, AssociatedNetElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociatedNetElement_HasLateralPosition(), this.getLateralPosition(), null,
				"hasLateralPosition", null, 0, 1, AssociatedNetElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lateralPositionEClass, LateralPosition.class, "LateralPosition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lateralSideEClass, LateralSide.class, "LateralSide", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLateralSide_Side(), this.getSide(), "side", null, 0, 1, LateralSide.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseObjectEULYNXEClass, BaseObjectEULYNX.class, "BaseObjectEULYNX", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tvpSectionEClass, TvpSection.class, "TvpSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTvpSection_IsLocatedAt(), this.getAreaLocation(), null, "isLocatedAt", null, 1, 1,
				TvpSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualTrackAssetEClass, VirtualTrackAsset.class, "VirtualTrackAsset", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(trackAssetEClass, TrackAsset.class, "TrackAsset", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(configuredBaseObjectEClass, ConfiguredBaseObject.class, "ConfiguredBaseObject", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tdsSectionEClass, TdsSection.class, "TdsSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTdsSection_AppliesToTvpsection(), this.getTvpSection(), null, "appliesToTvpsection", null, 1,
				1, TdsSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tdsCompnentEClass, TdsCompnent.class, "TdsCompnent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTdsCompnent_LimitsTdsSection(), this.getTdsSection(), null, "limitsTdsSection", null, 0, -1,
				TdsCompnent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehiclePassageDetectorEClass, VehiclePassageDetector.class, "VehiclePassageDetector", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehiclePassageDetector_OccupiesTdsSection(), this.getTdsSection(), null, "occupiesTdsSection",
				null, 0, 1, VehiclePassageDetector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalTrackAssetEClass, PhysicalTrackAsset.class, "PhysicalTrackAsset", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(vssLimitEClass, VssLimit.class, "VssLimit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualSubSectionEClass, VirtualSubSection.class, "VirtualSubSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(etcsMaSectionEClass, EtcsMaSection.class, "EtcsMaSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEtcsMaSection_HasSectionEntryLocation(), this.getSpotLocation(), null,
				"hasSectionEntryLocation", null, 1, 1, EtcsMaSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeEClass, Route.class, "Route", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoute_AppliesToRouteBody(), this.getRouteBody(), null, "appliesToRouteBody", null, 1, 1,
				Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etcsRouteEClass, EtcsRoute.class, "EtcsRoute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEtcsRoute_HasMaSection(), this.getEtcsMaSection(), null, "hasMaSection", null, 0, -1,
				EtcsRoute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeBodyEClass, RouteBody.class, "RouteBody", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouteBody_HasEntry(), this.getRouteEntry(), null, "hasEntry", null, 1, 1, RouteBody.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouteBody_HasExit(), this.getRouteExit(), null, "hasExit", null, 1, 1, RouteBody.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouteBody_RefersToRsmRoutBody(), this.getRouteBodyRSM(), null, "refersToRsmRoutBody", null, 1,
				1, RouteBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeBodyPropertyEClass, RouteBodyProperty.class, "RouteBodyProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouteBodyProperty_AppliesToRouteBody(), this.getRouteBody(), null, "appliesToRouteBody", null,
				1, 1, RouteBodyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionListEClass, SectionList.class, "SectionList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSectionList_HasSection(), this.getTvpSection(), null, "hasSection", null, 1, -1,
				SectionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeExtremityEClass, RouteExtremity.class, "RouteExtremity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(routeEntryEClass, RouteEntry.class, "RouteEntry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(routeExitEClass, RouteExit.class, "RouteExit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_RefersToRsmSignal(), this.getSignalRSM(), null, "refersToRsmSignal", null, 1, 1,
				Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_HasGroupMainSignal(), this.getRouteEntry(), null, "hasGroupMainSignal", null, 0, 1,
				Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonPhysicalSignalEClass, NonPhysicalSignal.class, "NonPhysicalSignal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualSignalEClass, VirtualSignal.class, "VirtualSignal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(netEntityEClass, NetEntity.class, "NetEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(locatedNetEntityEClass, LocatedNetEntity.class, "LocatedNetEntity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocatedNetEntity_Locations(), this.getBaseLocation(), null, "locations", null, 0, -1,
				LocatedNetEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalRSMEClass, SignalRSM.class, "SignalRSM", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(routeBodyRSMEClass, RouteBodyRSM.class, "RouteBodyRSM", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(etcsSignalPropertiesEClass, EtcsSignalProperties.class, "EtcsSignalProperties", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEtcsSignalProperties_RefersToEoA(), this.getEtcsEndOfAuthority(), null, "refersToEoA", null,
				0, 1, EtcsSignalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtcsSignalProperties_AppliesToSignal(), this.getSignal(), null, "appliesToSignal", null, 1, 1,
				EtcsSignalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etcsEndOfAuthorityEClass, EtcsEndOfAuthority.class, "EtcsEndOfAuthority", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentRoot_DataPrepEntities(), this.getDataPrepEntities(), null, "dataPrepEntities", null,
				0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RsmEntities(), this.getRsmEntities(), null, "rsmEntities", null, 0, -1,
				DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPrepEntitiesEClass, DataPrepEntities.class, "DataPrepEntities", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPrepEntities_OwnsEtcsEndOfAuthority(), this.getEtcsEndOfAuthority(), null,
				"ownsEtcsEndOfAuthority", null, 0, -1, DataPrepEntities.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPrepEntities_OwnsEtcsMaSection(), this.getEtcsMaSection(), null, "ownsEtcsMaSection",
				null, 0, -1, DataPrepEntities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPrepEntities_OwnsEtcsSignalProperties(), this.getEtcsSignalProperties(), null,
				"ownsEtcsSignalProperties", null, 0, -1, DataPrepEntities.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPrepEntities_OwnsRouteBodyProperty(), this.getRouteBodyProperty(), null,
				"ownsRouteBodyProperty", null, 0, -1, DataPrepEntities.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPrepEntities_OwnsRouteBody(), this.getRouteBody(), null, "ownsRouteBody", null, 0, -1,
				DataPrepEntities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPrepEntities_OwnsRoute(), this.getRoute(), null, "ownsRoute", null, 0, -1,
				DataPrepEntities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPrepEntities_OwnsTrackAsset(), this.getTrackAsset(), null, "ownsTrackAsset", null, 0, -1,
				DataPrepEntities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPrepEntities_KnowsAssetAndState(), this.getAssetAndState(), null, "KnowsAssetAndState",
				null, 0, -1, DataPrepEntities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rsmEntitiesEClass, RsmEntities.class, "RsmEntities", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRsmEntities_UsesEtcsTopology(), this.getTopology(), null, "usesEtcsTopology", null, 0, 1,
				RsmEntities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topologyEClass, Topology.class, "Topology", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopology_UsesPositionedRelation(), this.getPositionedRelation(), null,
				"usesPositionedRelation", null, 0, -1, Topology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopology_UsesNetElement(), this.getPositioningNetElement(), null, "usesNetElement", null, 0,
				-1, Topology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopology_UsesLocation(), this.getBaseLocation(), null, "usesLocation", null, 0, -1,
				Topology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopology_OwnsSignalRSM(), this.getSignalRSM(), null, "ownsSignalRSM", null, 0, -1,
				Topology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopology_OwnsRouteBodyRSM(), this.getRouteBodyRSM(), null, "ownsRouteBodyRSM", null, 0, -1,
				Topology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetAndStateEClass, AssetAndState.class, "AssetAndState", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sectionAndVacancyEClass, SectionAndVacancy.class, "SectionAndVacancy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSectionAndVacancy_RefersToTdsSection(), this.getTdsSection(), null, "refersToTdsSection",
				null, 1, 1, SectionAndVacancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionAndVacancy_InVacancyState(), this.getSectionVacancyTypes(), "inVacancyState", null, 0,
				1, SectionAndVacancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(navigabilityEEnum, Navigability.class, "Navigability");
		addEEnumLiteral(navigabilityEEnum, Navigability.BOTH);
		addEEnumLiteral(navigabilityEEnum, Navigability.AB);
		addEEnumLiteral(navigabilityEEnum, Navigability.BA);
		addEEnumLiteral(navigabilityEEnum, Navigability.NONE);

		initEEnum(usageEEnum, Usage.class, "Usage");
		addEEnumLiteral(usageEEnum, Usage.START);
		addEEnumLiteral(usageEEnum, Usage.END);

		initEEnum(leftRightEEnum, LeftRight.class, "LeftRight");
		addEEnumLiteral(leftRightEEnum, LeftRight.LEFT);
		addEEnumLiteral(leftRightEEnum, LeftRight.RIGHT);

		initEEnum(applicationDirectionEEnum, ApplicationDirection.class, "ApplicationDirection");
		addEEnumLiteral(applicationDirectionEEnum, ApplicationDirection.UNDEFINED);
		addEEnumLiteral(applicationDirectionEEnum, ApplicationDirection.NORMAL);
		addEEnumLiteral(applicationDirectionEEnum, ApplicationDirection.REVERSE);
		addEEnumLiteral(applicationDirectionEEnum, ApplicationDirection.BOTH);

		initEEnum(sideEEnum, Side.class, "Side");
		addEEnumLiteral(sideEEnum, Side.UNDEFINED);
		addEEnumLiteral(sideEEnum, Side.LEFT);
		addEEnumLiteral(sideEEnum, Side.RIGHT);
		addEEnumLiteral(sideEEnum, Side.CENTRE);
		addEEnumLiteral(sideEEnum, Side.BOTH);

		initEEnum(sectionVacancyTypesEEnum, SectionVacancyTypes.class, "SectionVacancyTypes");
		addEEnumLiteral(sectionVacancyTypesEEnum, SectionVacancyTypes.EOCCUPIED);
		addEEnumLiteral(sectionVacancyTypesEEnum, SectionVacancyTypes.EVACANT);
		addEEnumLiteral(sectionVacancyTypesEEnum, SectionVacancyTypes.EAMBIGIOUS);
		addEEnumLiteral(sectionVacancyTypesEEnum, SectionVacancyTypes.EUNKNOWN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// meeduse
		createMeeduseAnnotations();
	}

	/**
	 * Initializes the annotations for <b>meeduse</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMeeduseAnnotations() {
		String source = "meeduse";
		addAnnotation(this, source, new String[] { "generated", "" });
		addAnnotation(baseObjectRSMEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getBaseObjectRSM_Id(), source, new String[] { "generated", "", "constant", null });
		addAnnotation(namedResourceEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getNamedResource_Longname(), source, new String[] { "generated", "NOT" });
		addAnnotation(getNamedResource_Name(), source, new String[] { "generated", "NOT" });
		addAnnotation(networkResourceEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(netElementEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(compositionNetElementEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(positioningNetElementEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(linearElementEClass, source, new String[] { "generated", "", "constant", null });
		addAnnotation(relationEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(positionedRelationEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getPositionedRelation_Navigibility(), source, new String[] { "generated", "NOT" });
		addAnnotation(getPositionedRelation_PositionOnA(), source, new String[] { "generated", "NOT" });
		addAnnotation(getPositionedRelation_PositionOnB(), source, new String[] { "generated", "NOT" });
		addAnnotation(getPositionedRelation_LeadsTowards(), source, new String[] { "generated", "NOT" });
		addAnnotation(getPositionedRelation_ElementA(), source, new String[] { "generated", "NOT" });
		addAnnotation(getPositionedRelation_ElementB(), source, new String[] { "generated", "NOT" });
		addAnnotation(navigabilityEEnum, source, new String[] { "generated", "NOT" });
		addAnnotation(usageEEnum, source, new String[] { "generated", "NOT" });
		addAnnotation(leftRightEEnum, source, new String[] { "generated", "NOT" });
		addAnnotation(baseLocationEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(spotLocationEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getSpotLocation_AssociatedNetElements(), source, new String[] { "generated", "NOT" });
		addAnnotation(linearLocationEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getLinearLocation_AssociatedNetElements(), source, new String[] { "generated", "NOT" });
		addAnnotation(areaLocationEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getAreaLocation_AssociatedNetElements(), source, new String[] { "generated", "NOT" });
		addAnnotation(associatedNetElementEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getAssociatedNetElement_NetElement(), source, new String[] { "generated", "NOT" });
		addAnnotation(getAssociatedNetElement_AppliesInDirection(), source, new String[] { "generated", "NOT" });
		addAnnotation(getAssociatedNetElement_HasLateralPosition(), source, new String[] { "generated", "NOT" });
		addAnnotation(applicationDirectionEEnum, source, new String[] { "generated", "NOT" });
		addAnnotation(lateralPositionEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(lateralSideEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getLateralSide_Side(), source, new String[] { "generated", "NOT" });
		addAnnotation(sideEEnum, source, new String[] { "generated", "NOT" });
		addAnnotation(baseObjectEULYNXEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(tvpSectionEClass, source, new String[] { "generated", "", "constant", null });
		addAnnotation(getTvpSection_IsLocatedAt(), source, new String[] { "generated", "NOT" });
		addAnnotation(virtualTrackAssetEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(trackAssetEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(configuredBaseObjectEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(tdsSectionEClass, source, new String[] { "generated", "", "constant", null });
		addAnnotation(getTdsSection_AppliesToTvpsection(), source, new String[] { "generated", "", "constant", null });
		addAnnotation(tdsCompnentEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getTdsCompnent_LimitsTdsSection(), source, new String[] { "generated", "NOT" });
		addAnnotation(vehiclePassageDetectorEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(physicalTrackAssetEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(vssLimitEClass, source, new String[] { "generated", "", "constant", null });
		addAnnotation(virtualSubSectionEClass, source, new String[] { "generated", "", "constant", null });
		addAnnotation(etcsMaSectionEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getEtcsMaSection_HasSectionEntryLocation(), source, new String[] { "generated", "NOT" });
		addAnnotation(routeEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getRoute_AppliesToRouteBody(), source, new String[] { "generated", "NOT" });
		addAnnotation(etcsRouteEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getEtcsRoute_HasMaSection(), source, new String[] { "generated", "NOT" });
		addAnnotation(routeBodyEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getRouteBody_HasEntry(), source, new String[] { "generated", "NOT" });
		addAnnotation(getRouteBody_HasExit(), source, new String[] { "generated", "NOT" });
		addAnnotation(getRouteBody_RefersToRsmRoutBody(), source, new String[] { "generated", "NOT" });
		addAnnotation(routeBodyPropertyEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getRouteBodyProperty_AppliesToRouteBody(), source, new String[] { "generated", "NOT" });
		addAnnotation(sectionListEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getSectionList_HasSection(), source, new String[] { "generated", "NOT" });
		addAnnotation(routeExtremityEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(routeEntryEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(routeExitEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(signalEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getSignal_RefersToRsmSignal(), source, new String[] { "generated", "NOT" });
		addAnnotation(getSignal_HasGroupMainSignal(), source, new String[] { "generated", "NOT" });
		addAnnotation(nonPhysicalSignalEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(virtualSignalEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(netEntityEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(locatedNetEntityEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getLocatedNetEntity_Locations(), source, new String[] { "generated", "NOT" });
		addAnnotation(signalRSMEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(routeBodyRSMEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(etcsSignalPropertiesEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getEtcsSignalProperties_RefersToEoA(), source, new String[] { "generated", "NOT" });
		addAnnotation(getEtcsSignalProperties_AppliesToSignal(), source, new String[] { "generated", "NOT" });
		addAnnotation(etcsEndOfAuthorityEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(documentRootEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getDocumentRoot_DataPrepEntities(), source, new String[] { "generated", "NOT" });
		addAnnotation(getDocumentRoot_RsmEntities(), source, new String[] { "generated", "NOT" });
		addAnnotation(dataPrepEntitiesEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getDataPrepEntities_OwnsEtcsEndOfAuthority(), source, new String[] { "generated", "NOT" });
		addAnnotation(getDataPrepEntities_OwnsEtcsMaSection(), source, new String[] { "generated", "NOT" });
		addAnnotation(getDataPrepEntities_OwnsEtcsSignalProperties(), source, new String[] { "generated", "NOT" });
		addAnnotation(getDataPrepEntities_OwnsRouteBodyProperty(), source, new String[] { "generated", "NOT" });
		addAnnotation(getDataPrepEntities_OwnsRouteBody(), source, new String[] { "generated", "NOT" });
		addAnnotation(getDataPrepEntities_OwnsRoute(), source, new String[] { "generated", "NOT" });
		addAnnotation(getDataPrepEntities_OwnsTrackAsset(), source, new String[] { "generated", "NOT" });
		addAnnotation(getDataPrepEntities_KnowsAssetAndState(), source, new String[] { "generated", "NOT" });
		addAnnotation(rsmEntitiesEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getRsmEntities_UsesEtcsTopology(), source, new String[] { "generated", "NOT" });
		addAnnotation(topologyEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(getTopology_UsesPositionedRelation(), source, new String[] { "generated", "NOT" });
		addAnnotation(getTopology_UsesNetElement(), source, new String[] { "generated", "NOT" });
		addAnnotation(getTopology_UsesLocation(), source, new String[] { "generated", "NOT" });
		addAnnotation(getTopology_OwnsSignalRSM(), source, new String[] { "generated", "NOT" });
		addAnnotation(getTopology_OwnsRouteBodyRSM(), source, new String[] { "generated", "NOT" });
		addAnnotation(assetAndStateEClass, source, new String[] { "generated", "NOT" });
		addAnnotation(sectionAndVacancyEClass, source, new String[] { "generated", "", "constant", null });
		addAnnotation(getSectionAndVacancy_RefersToTdsSection(), source,
				new String[] { "generated", "", "constant", null });
		addAnnotation(getSectionAndVacancy_InVacancyState(), source, new String[] { "generated", "" });
		addAnnotation(sectionVacancyTypesEEnum, source, new String[] { "generated", "" });
	}

} //ExtractedMMPackageImpl
