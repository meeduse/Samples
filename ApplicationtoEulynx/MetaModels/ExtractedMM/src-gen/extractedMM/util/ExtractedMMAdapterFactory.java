/**
 */
package extractedMM.util;

import extractedMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see extractedMM.ExtractedMMPackage
 * @generated
 */
public class ExtractedMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtractedMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractedMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExtractedMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractedMMSwitch<Adapter> modelSwitch = new ExtractedMMSwitch<Adapter>() {
		@Override
		public Adapter caseBaseObjectRSM(BaseObjectRSM object) {
			return createBaseObjectRSMAdapter();
		}

		@Override
		public Adapter caseNamedResource(NamedResource object) {
			return createNamedResourceAdapter();
		}

		@Override
		public Adapter caseNetworkResource(NetworkResource object) {
			return createNetworkResourceAdapter();
		}

		@Override
		public Adapter caseNetElement(NetElement object) {
			return createNetElementAdapter();
		}

		@Override
		public Adapter caseCompositionNetElement(CompositionNetElement object) {
			return createCompositionNetElementAdapter();
		}

		@Override
		public Adapter casePositioningNetElement(PositioningNetElement object) {
			return createPositioningNetElementAdapter();
		}

		@Override
		public Adapter caseLinearElement(LinearElement object) {
			return createLinearElementAdapter();
		}

		@Override
		public Adapter caseRelation(Relation object) {
			return createRelationAdapter();
		}

		@Override
		public Adapter casePositionedRelation(PositionedRelation object) {
			return createPositionedRelationAdapter();
		}

		@Override
		public Adapter caseBaseLocation(BaseLocation object) {
			return createBaseLocationAdapter();
		}

		@Override
		public Adapter caseSpotLocation(SpotLocation object) {
			return createSpotLocationAdapter();
		}

		@Override
		public Adapter caseLinearLocation(LinearLocation object) {
			return createLinearLocationAdapter();
		}

		@Override
		public Adapter caseAreaLocation(AreaLocation object) {
			return createAreaLocationAdapter();
		}

		@Override
		public Adapter caseAssociatedNetElement(AssociatedNetElement object) {
			return createAssociatedNetElementAdapter();
		}

		@Override
		public Adapter caseLateralPosition(LateralPosition object) {
			return createLateralPositionAdapter();
		}

		@Override
		public Adapter caseLateralSide(LateralSide object) {
			return createLateralSideAdapter();
		}

		@Override
		public Adapter caseBaseObjectEULYNX(BaseObjectEULYNX object) {
			return createBaseObjectEULYNXAdapter();
		}

		@Override
		public Adapter caseTvpSection(TvpSection object) {
			return createTvpSectionAdapter();
		}

		@Override
		public Adapter caseVirtualTrackAsset(VirtualTrackAsset object) {
			return createVirtualTrackAssetAdapter();
		}

		@Override
		public Adapter caseTrackAsset(TrackAsset object) {
			return createTrackAssetAdapter();
		}

		@Override
		public Adapter caseConfiguredBaseObject(ConfiguredBaseObject object) {
			return createConfiguredBaseObjectAdapter();
		}

		@Override
		public Adapter caseTdsSection(TdsSection object) {
			return createTdsSectionAdapter();
		}

		@Override
		public Adapter caseTdsCompnent(TdsCompnent object) {
			return createTdsCompnentAdapter();
		}

		@Override
		public Adapter caseVehiclePassageDetector(VehiclePassageDetector object) {
			return createVehiclePassageDetectorAdapter();
		}

		@Override
		public Adapter casePhysicalTrackAsset(PhysicalTrackAsset object) {
			return createPhysicalTrackAssetAdapter();
		}

		@Override
		public Adapter caseVssLimit(VssLimit object) {
			return createVssLimitAdapter();
		}

		@Override
		public Adapter caseVirtualSubSection(VirtualSubSection object) {
			return createVirtualSubSectionAdapter();
		}

		@Override
		public Adapter caseEtcsMaSection(EtcsMaSection object) {
			return createEtcsMaSectionAdapter();
		}

		@Override
		public Adapter caseRoute(Route object) {
			return createRouteAdapter();
		}

		@Override
		public Adapter caseEtcsRoute(EtcsRoute object) {
			return createEtcsRouteAdapter();
		}

		@Override
		public Adapter caseRouteBody(RouteBody object) {
			return createRouteBodyAdapter();
		}

		@Override
		public Adapter caseRouteBodyProperty(RouteBodyProperty object) {
			return createRouteBodyPropertyAdapter();
		}

		@Override
		public Adapter caseSectionList(SectionList object) {
			return createSectionListAdapter();
		}

		@Override
		public Adapter caseRouteExtremity(RouteExtremity object) {
			return createRouteExtremityAdapter();
		}

		@Override
		public Adapter caseRouteEntry(RouteEntry object) {
			return createRouteEntryAdapter();
		}

		@Override
		public Adapter caseRouteExit(RouteExit object) {
			return createRouteExitAdapter();
		}

		@Override
		public Adapter caseSignal(Signal object) {
			return createSignalAdapter();
		}

		@Override
		public Adapter caseNonPhysicalSignal(NonPhysicalSignal object) {
			return createNonPhysicalSignalAdapter();
		}

		@Override
		public Adapter caseVirtualSignal(VirtualSignal object) {
			return createVirtualSignalAdapter();
		}

		@Override
		public Adapter caseNetEntity(NetEntity object) {
			return createNetEntityAdapter();
		}

		@Override
		public Adapter caseLocatedNetEntity(LocatedNetEntity object) {
			return createLocatedNetEntityAdapter();
		}

		@Override
		public Adapter caseSignalRSM(SignalRSM object) {
			return createSignalRSMAdapter();
		}

		@Override
		public Adapter caseRouteBodyRSM(RouteBodyRSM object) {
			return createRouteBodyRSMAdapter();
		}

		@Override
		public Adapter caseEtcsSignalProperties(EtcsSignalProperties object) {
			return createEtcsSignalPropertiesAdapter();
		}

		@Override
		public Adapter caseEtcsEndOfAuthority(EtcsEndOfAuthority object) {
			return createEtcsEndOfAuthorityAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseDataPrepEntities(DataPrepEntities object) {
			return createDataPrepEntitiesAdapter();
		}

		@Override
		public Adapter caseRsmEntities(RsmEntities object) {
			return createRsmEntitiesAdapter();
		}

		@Override
		public Adapter caseTopology(Topology object) {
			return createTopologyAdapter();
		}

		@Override
		public Adapter caseAssetAndState(AssetAndState object) {
			return createAssetAndStateAdapter();
		}

		@Override
		public Adapter caseSectionAndVacancy(SectionAndVacancy object) {
			return createSectionAndVacancyAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.BaseObjectRSM <em>Base Object RSM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.BaseObjectRSM
	 * @generated
	 */
	public Adapter createBaseObjectRSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.NamedResource <em>Named Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.NamedResource
	 * @generated
	 */
	public Adapter createNamedResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.NetworkResource <em>Network Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.NetworkResource
	 * @generated
	 */
	public Adapter createNetworkResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.NetElement <em>Net Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.NetElement
	 * @generated
	 */
	public Adapter createNetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.CompositionNetElement <em>Composition Net Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.CompositionNetElement
	 * @generated
	 */
	public Adapter createCompositionNetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.PositioningNetElement <em>Positioning Net Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.PositioningNetElement
	 * @generated
	 */
	public Adapter createPositioningNetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.LinearElement <em>Linear Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.LinearElement
	 * @generated
	 */
	public Adapter createLinearElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.PositionedRelation <em>Positioned Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.PositionedRelation
	 * @generated
	 */
	public Adapter createPositionedRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.BaseLocation <em>Base Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.BaseLocation
	 * @generated
	 */
	public Adapter createBaseLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.SpotLocation <em>Spot Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.SpotLocation
	 * @generated
	 */
	public Adapter createSpotLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.LinearLocation <em>Linear Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.LinearLocation
	 * @generated
	 */
	public Adapter createLinearLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.AreaLocation <em>Area Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.AreaLocation
	 * @generated
	 */
	public Adapter createAreaLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.AssociatedNetElement <em>Associated Net Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.AssociatedNetElement
	 * @generated
	 */
	public Adapter createAssociatedNetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.LateralPosition <em>Lateral Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.LateralPosition
	 * @generated
	 */
	public Adapter createLateralPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.LateralSide <em>Lateral Side</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.LateralSide
	 * @generated
	 */
	public Adapter createLateralSideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.BaseObjectEULYNX <em>Base Object EULYNX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.BaseObjectEULYNX
	 * @generated
	 */
	public Adapter createBaseObjectEULYNXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.TvpSection <em>Tvp Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.TvpSection
	 * @generated
	 */
	public Adapter createTvpSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.VirtualTrackAsset <em>Virtual Track Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.VirtualTrackAsset
	 * @generated
	 */
	public Adapter createVirtualTrackAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.TrackAsset <em>Track Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.TrackAsset
	 * @generated
	 */
	public Adapter createTrackAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.ConfiguredBaseObject <em>Configured Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.ConfiguredBaseObject
	 * @generated
	 */
	public Adapter createConfiguredBaseObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.TdsSection <em>Tds Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.TdsSection
	 * @generated
	 */
	public Adapter createTdsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.TdsCompnent <em>Tds Compnent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.TdsCompnent
	 * @generated
	 */
	public Adapter createTdsCompnentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.VehiclePassageDetector <em>Vehicle Passage Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.VehiclePassageDetector
	 * @generated
	 */
	public Adapter createVehiclePassageDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.PhysicalTrackAsset <em>Physical Track Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.PhysicalTrackAsset
	 * @generated
	 */
	public Adapter createPhysicalTrackAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.VssLimit <em>Vss Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.VssLimit
	 * @generated
	 */
	public Adapter createVssLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.VirtualSubSection <em>Virtual Sub Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.VirtualSubSection
	 * @generated
	 */
	public Adapter createVirtualSubSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.EtcsMaSection <em>Etcs Ma Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.EtcsMaSection
	 * @generated
	 */
	public Adapter createEtcsMaSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.EtcsRoute <em>Etcs Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.EtcsRoute
	 * @generated
	 */
	public Adapter createEtcsRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.RouteBody <em>Route Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.RouteBody
	 * @generated
	 */
	public Adapter createRouteBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.RouteBodyProperty <em>Route Body Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.RouteBodyProperty
	 * @generated
	 */
	public Adapter createRouteBodyPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.SectionList <em>Section List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.SectionList
	 * @generated
	 */
	public Adapter createSectionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.RouteExtremity <em>Route Extremity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.RouteExtremity
	 * @generated
	 */
	public Adapter createRouteExtremityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.RouteEntry <em>Route Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.RouteEntry
	 * @generated
	 */
	public Adapter createRouteEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.RouteExit <em>Route Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.RouteExit
	 * @generated
	 */
	public Adapter createRouteExitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.NonPhysicalSignal <em>Non Physical Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.NonPhysicalSignal
	 * @generated
	 */
	public Adapter createNonPhysicalSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.VirtualSignal <em>Virtual Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.VirtualSignal
	 * @generated
	 */
	public Adapter createVirtualSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.NetEntity <em>Net Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.NetEntity
	 * @generated
	 */
	public Adapter createNetEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.LocatedNetEntity <em>Located Net Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.LocatedNetEntity
	 * @generated
	 */
	public Adapter createLocatedNetEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.SignalRSM <em>Signal RSM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.SignalRSM
	 * @generated
	 */
	public Adapter createSignalRSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.RouteBodyRSM <em>Route Body RSM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.RouteBodyRSM
	 * @generated
	 */
	public Adapter createRouteBodyRSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.EtcsSignalProperties <em>Etcs Signal Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.EtcsSignalProperties
	 * @generated
	 */
	public Adapter createEtcsSignalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.EtcsEndOfAuthority <em>Etcs End Of Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.EtcsEndOfAuthority
	 * @generated
	 */
	public Adapter createEtcsEndOfAuthorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.DataPrepEntities <em>Data Prep Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.DataPrepEntities
	 * @generated
	 */
	public Adapter createDataPrepEntitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.RsmEntities <em>Rsm Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.RsmEntities
	 * @generated
	 */
	public Adapter createRsmEntitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.Topology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.Topology
	 * @generated
	 */
	public Adapter createTopologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.AssetAndState <em>Asset And State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.AssetAndState
	 * @generated
	 */
	public Adapter createAssetAndStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extractedMM.SectionAndVacancy <em>Section And Vacancy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extractedMM.SectionAndVacancy
	 * @generated
	 */
	public Adapter createSectionAndVacancyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExtractedMMAdapterFactory
