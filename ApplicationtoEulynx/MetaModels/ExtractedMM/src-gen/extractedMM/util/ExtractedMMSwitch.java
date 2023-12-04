/**
 */
package extractedMM.util;

import extractedMM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see extractedMM.ExtractedMMPackage
 * @generated
 */
public class ExtractedMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtractedMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractedMMSwitch() {
		if (modelPackage == null) {
			modelPackage = ExtractedMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ExtractedMMPackage.BASE_OBJECT_RSM: {
			BaseObjectRSM baseObjectRSM = (BaseObjectRSM) theEObject;
			T result = caseBaseObjectRSM(baseObjectRSM);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.NAMED_RESOURCE: {
			NamedResource namedResource = (NamedResource) theEObject;
			T result = caseNamedResource(namedResource);
			if (result == null)
				result = caseBaseObjectRSM(namedResource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.NETWORK_RESOURCE: {
			NetworkResource networkResource = (NetworkResource) theEObject;
			T result = caseNetworkResource(networkResource);
			if (result == null)
				result = caseNamedResource(networkResource);
			if (result == null)
				result = caseBaseObjectRSM(networkResource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.NET_ELEMENT: {
			NetElement netElement = (NetElement) theEObject;
			T result = caseNetElement(netElement);
			if (result == null)
				result = caseNetworkResource(netElement);
			if (result == null)
				result = caseNamedResource(netElement);
			if (result == null)
				result = caseBaseObjectRSM(netElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.COMPOSITION_NET_ELEMENT: {
			CompositionNetElement compositionNetElement = (CompositionNetElement) theEObject;
			T result = caseCompositionNetElement(compositionNetElement);
			if (result == null)
				result = caseNetElement(compositionNetElement);
			if (result == null)
				result = caseNetworkResource(compositionNetElement);
			if (result == null)
				result = caseNamedResource(compositionNetElement);
			if (result == null)
				result = caseBaseObjectRSM(compositionNetElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.POSITIONING_NET_ELEMENT: {
			PositioningNetElement positioningNetElement = (PositioningNetElement) theEObject;
			T result = casePositioningNetElement(positioningNetElement);
			if (result == null)
				result = caseCompositionNetElement(positioningNetElement);
			if (result == null)
				result = caseNetElement(positioningNetElement);
			if (result == null)
				result = caseNetworkResource(positioningNetElement);
			if (result == null)
				result = caseNamedResource(positioningNetElement);
			if (result == null)
				result = caseBaseObjectRSM(positioningNetElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.LINEAR_ELEMENT: {
			LinearElement linearElement = (LinearElement) theEObject;
			T result = caseLinearElement(linearElement);
			if (result == null)
				result = casePositioningNetElement(linearElement);
			if (result == null)
				result = caseCompositionNetElement(linearElement);
			if (result == null)
				result = caseNetElement(linearElement);
			if (result == null)
				result = caseNetworkResource(linearElement);
			if (result == null)
				result = caseNamedResource(linearElement);
			if (result == null)
				result = caseBaseObjectRSM(linearElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.RELATION: {
			Relation relation = (Relation) theEObject;
			T result = caseRelation(relation);
			if (result == null)
				result = caseNetworkResource(relation);
			if (result == null)
				result = caseNamedResource(relation);
			if (result == null)
				result = caseBaseObjectRSM(relation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.POSITIONED_RELATION: {
			PositionedRelation positionedRelation = (PositionedRelation) theEObject;
			T result = casePositionedRelation(positionedRelation);
			if (result == null)
				result = caseRelation(positionedRelation);
			if (result == null)
				result = caseNetworkResource(positionedRelation);
			if (result == null)
				result = caseNamedResource(positionedRelation);
			if (result == null)
				result = caseBaseObjectRSM(positionedRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.BASE_LOCATION: {
			BaseLocation baseLocation = (BaseLocation) theEObject;
			T result = caseBaseLocation(baseLocation);
			if (result == null)
				result = caseBaseObjectRSM(baseLocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.SPOT_LOCATION: {
			SpotLocation spotLocation = (SpotLocation) theEObject;
			T result = caseSpotLocation(spotLocation);
			if (result == null)
				result = caseBaseLocation(spotLocation);
			if (result == null)
				result = caseBaseObjectRSM(spotLocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.LINEAR_LOCATION: {
			LinearLocation linearLocation = (LinearLocation) theEObject;
			T result = caseLinearLocation(linearLocation);
			if (result == null)
				result = caseBaseLocation(linearLocation);
			if (result == null)
				result = caseBaseObjectRSM(linearLocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.AREA_LOCATION: {
			AreaLocation areaLocation = (AreaLocation) theEObject;
			T result = caseAreaLocation(areaLocation);
			if (result == null)
				result = caseBaseLocation(areaLocation);
			if (result == null)
				result = caseBaseObjectRSM(areaLocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT: {
			AssociatedNetElement associatedNetElement = (AssociatedNetElement) theEObject;
			T result = caseAssociatedNetElement(associatedNetElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.LATERAL_POSITION: {
			LateralPosition lateralPosition = (LateralPosition) theEObject;
			T result = caseLateralPosition(lateralPosition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.LATERAL_SIDE: {
			LateralSide lateralSide = (LateralSide) theEObject;
			T result = caseLateralSide(lateralSide);
			if (result == null)
				result = caseLateralPosition(lateralSide);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.BASE_OBJECT_EULYNX: {
			BaseObjectEULYNX baseObjectEULYNX = (BaseObjectEULYNX) theEObject;
			T result = caseBaseObjectEULYNX(baseObjectEULYNX);
			if (result == null)
				result = caseBaseObjectRSM(baseObjectEULYNX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.TVP_SECTION: {
			TvpSection tvpSection = (TvpSection) theEObject;
			T result = caseTvpSection(tvpSection);
			if (result == null)
				result = caseVirtualTrackAsset(tvpSection);
			if (result == null)
				result = caseTrackAsset(tvpSection);
			if (result == null)
				result = caseConfiguredBaseObject(tvpSection);
			if (result == null)
				result = caseBaseObjectEULYNX(tvpSection);
			if (result == null)
				result = caseBaseObjectRSM(tvpSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.VIRTUAL_TRACK_ASSET: {
			VirtualTrackAsset virtualTrackAsset = (VirtualTrackAsset) theEObject;
			T result = caseVirtualTrackAsset(virtualTrackAsset);
			if (result == null)
				result = caseTrackAsset(virtualTrackAsset);
			if (result == null)
				result = caseConfiguredBaseObject(virtualTrackAsset);
			if (result == null)
				result = caseBaseObjectEULYNX(virtualTrackAsset);
			if (result == null)
				result = caseBaseObjectRSM(virtualTrackAsset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.TRACK_ASSET: {
			TrackAsset trackAsset = (TrackAsset) theEObject;
			T result = caseTrackAsset(trackAsset);
			if (result == null)
				result = caseConfiguredBaseObject(trackAsset);
			if (result == null)
				result = caseBaseObjectEULYNX(trackAsset);
			if (result == null)
				result = caseBaseObjectRSM(trackAsset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.CONFIGURED_BASE_OBJECT: {
			ConfiguredBaseObject configuredBaseObject = (ConfiguredBaseObject) theEObject;
			T result = caseConfiguredBaseObject(configuredBaseObject);
			if (result == null)
				result = caseBaseObjectEULYNX(configuredBaseObject);
			if (result == null)
				result = caseBaseObjectRSM(configuredBaseObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.TDS_SECTION: {
			TdsSection tdsSection = (TdsSection) theEObject;
			T result = caseTdsSection(tdsSection);
			if (result == null)
				result = caseVirtualTrackAsset(tdsSection);
			if (result == null)
				result = caseTrackAsset(tdsSection);
			if (result == null)
				result = caseConfiguredBaseObject(tdsSection);
			if (result == null)
				result = caseBaseObjectEULYNX(tdsSection);
			if (result == null)
				result = caseBaseObjectRSM(tdsSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.TDS_COMPNENT: {
			TdsCompnent tdsCompnent = (TdsCompnent) theEObject;
			T result = caseTdsCompnent(tdsCompnent);
			if (result == null)
				result = caseVehiclePassageDetector(tdsCompnent);
			if (result == null)
				result = casePhysicalTrackAsset(tdsCompnent);
			if (result == null)
				result = caseTrackAsset(tdsCompnent);
			if (result == null)
				result = caseConfiguredBaseObject(tdsCompnent);
			if (result == null)
				result = caseBaseObjectEULYNX(tdsCompnent);
			if (result == null)
				result = caseBaseObjectRSM(tdsCompnent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.VEHICLE_PASSAGE_DETECTOR: {
			VehiclePassageDetector vehiclePassageDetector = (VehiclePassageDetector) theEObject;
			T result = caseVehiclePassageDetector(vehiclePassageDetector);
			if (result == null)
				result = casePhysicalTrackAsset(vehiclePassageDetector);
			if (result == null)
				result = caseTrackAsset(vehiclePassageDetector);
			if (result == null)
				result = caseConfiguredBaseObject(vehiclePassageDetector);
			if (result == null)
				result = caseBaseObjectEULYNX(vehiclePassageDetector);
			if (result == null)
				result = caseBaseObjectRSM(vehiclePassageDetector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.PHYSICAL_TRACK_ASSET: {
			PhysicalTrackAsset physicalTrackAsset = (PhysicalTrackAsset) theEObject;
			T result = casePhysicalTrackAsset(physicalTrackAsset);
			if (result == null)
				result = caseTrackAsset(physicalTrackAsset);
			if (result == null)
				result = caseConfiguredBaseObject(physicalTrackAsset);
			if (result == null)
				result = caseBaseObjectEULYNX(physicalTrackAsset);
			if (result == null)
				result = caseBaseObjectRSM(physicalTrackAsset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.VSS_LIMIT: {
			VssLimit vssLimit = (VssLimit) theEObject;
			T result = caseVssLimit(vssLimit);
			if (result == null)
				result = caseTdsCompnent(vssLimit);
			if (result == null)
				result = caseVehiclePassageDetector(vssLimit);
			if (result == null)
				result = casePhysicalTrackAsset(vssLimit);
			if (result == null)
				result = caseTrackAsset(vssLimit);
			if (result == null)
				result = caseConfiguredBaseObject(vssLimit);
			if (result == null)
				result = caseBaseObjectEULYNX(vssLimit);
			if (result == null)
				result = caseBaseObjectRSM(vssLimit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.VIRTUAL_SUB_SECTION: {
			VirtualSubSection virtualSubSection = (VirtualSubSection) theEObject;
			T result = caseVirtualSubSection(virtualSubSection);
			if (result == null)
				result = caseTdsSection(virtualSubSection);
			if (result == null)
				result = caseVirtualTrackAsset(virtualSubSection);
			if (result == null)
				result = caseTrackAsset(virtualSubSection);
			if (result == null)
				result = caseConfiguredBaseObject(virtualSubSection);
			if (result == null)
				result = caseBaseObjectEULYNX(virtualSubSection);
			if (result == null)
				result = caseBaseObjectRSM(virtualSubSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ETCS_MA_SECTION: {
			EtcsMaSection etcsMaSection = (EtcsMaSection) theEObject;
			T result = caseEtcsMaSection(etcsMaSection);
			if (result == null)
				result = caseConfiguredBaseObject(etcsMaSection);
			if (result == null)
				result = caseBaseObjectEULYNX(etcsMaSection);
			if (result == null)
				result = caseBaseObjectRSM(etcsMaSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ROUTE: {
			Route route = (Route) theEObject;
			T result = caseRoute(route);
			if (result == null)
				result = caseConfiguredBaseObject(route);
			if (result == null)
				result = caseBaseObjectEULYNX(route);
			if (result == null)
				result = caseBaseObjectRSM(route);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ETCS_ROUTE: {
			EtcsRoute etcsRoute = (EtcsRoute) theEObject;
			T result = caseEtcsRoute(etcsRoute);
			if (result == null)
				result = caseRoute(etcsRoute);
			if (result == null)
				result = caseConfiguredBaseObject(etcsRoute);
			if (result == null)
				result = caseBaseObjectEULYNX(etcsRoute);
			if (result == null)
				result = caseBaseObjectRSM(etcsRoute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ROUTE_BODY: {
			RouteBody routeBody = (RouteBody) theEObject;
			T result = caseRouteBody(routeBody);
			if (result == null)
				result = caseConfiguredBaseObject(routeBody);
			if (result == null)
				result = caseBaseObjectEULYNX(routeBody);
			if (result == null)
				result = caseBaseObjectRSM(routeBody);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ROUTE_BODY_PROPERTY: {
			RouteBodyProperty routeBodyProperty = (RouteBodyProperty) theEObject;
			T result = caseRouteBodyProperty(routeBodyProperty);
			if (result == null)
				result = caseConfiguredBaseObject(routeBodyProperty);
			if (result == null)
				result = caseBaseObjectEULYNX(routeBodyProperty);
			if (result == null)
				result = caseBaseObjectRSM(routeBodyProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.SECTION_LIST: {
			SectionList sectionList = (SectionList) theEObject;
			T result = caseSectionList(sectionList);
			if (result == null)
				result = caseRouteBodyProperty(sectionList);
			if (result == null)
				result = caseConfiguredBaseObject(sectionList);
			if (result == null)
				result = caseBaseObjectEULYNX(sectionList);
			if (result == null)
				result = caseBaseObjectRSM(sectionList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ROUTE_EXTREMITY: {
			RouteExtremity routeExtremity = (RouteExtremity) theEObject;
			T result = caseRouteExtremity(routeExtremity);
			if (result == null)
				result = caseBaseObjectEULYNX(routeExtremity);
			if (result == null)
				result = caseBaseObjectRSM(routeExtremity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ROUTE_ENTRY: {
			RouteEntry routeEntry = (RouteEntry) theEObject;
			T result = caseRouteEntry(routeEntry);
			if (result == null)
				result = caseRouteExtremity(routeEntry);
			if (result == null)
				result = caseBaseObjectEULYNX(routeEntry);
			if (result == null)
				result = caseBaseObjectRSM(routeEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ROUTE_EXIT: {
			RouteExit routeExit = (RouteExit) theEObject;
			T result = caseRouteExit(routeExit);
			if (result == null)
				result = caseRouteExtremity(routeExit);
			if (result == null)
				result = caseBaseObjectEULYNX(routeExit);
			if (result == null)
				result = caseBaseObjectRSM(routeExit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.SIGNAL: {
			Signal signal = (Signal) theEObject;
			T result = caseSignal(signal);
			if (result == null)
				result = caseTrackAsset(signal);
			if (result == null)
				result = caseConfiguredBaseObject(signal);
			if (result == null)
				result = caseBaseObjectEULYNX(signal);
			if (result == null)
				result = caseBaseObjectRSM(signal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.NON_PHYSICAL_SIGNAL: {
			NonPhysicalSignal nonPhysicalSignal = (NonPhysicalSignal) theEObject;
			T result = caseNonPhysicalSignal(nonPhysicalSignal);
			if (result == null)
				result = caseSignal(nonPhysicalSignal);
			if (result == null)
				result = caseTrackAsset(nonPhysicalSignal);
			if (result == null)
				result = caseConfiguredBaseObject(nonPhysicalSignal);
			if (result == null)
				result = caseBaseObjectEULYNX(nonPhysicalSignal);
			if (result == null)
				result = caseBaseObjectRSM(nonPhysicalSignal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.VIRTUAL_SIGNAL: {
			VirtualSignal virtualSignal = (VirtualSignal) theEObject;
			T result = caseVirtualSignal(virtualSignal);
			if (result == null)
				result = caseNonPhysicalSignal(virtualSignal);
			if (result == null)
				result = caseSignal(virtualSignal);
			if (result == null)
				result = caseTrackAsset(virtualSignal);
			if (result == null)
				result = caseConfiguredBaseObject(virtualSignal);
			if (result == null)
				result = caseBaseObjectEULYNX(virtualSignal);
			if (result == null)
				result = caseBaseObjectRSM(virtualSignal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.NET_ENTITY: {
			NetEntity netEntity = (NetEntity) theEObject;
			T result = caseNetEntity(netEntity);
			if (result == null)
				result = caseNetworkResource(netEntity);
			if (result == null)
				result = caseNamedResource(netEntity);
			if (result == null)
				result = caseBaseObjectRSM(netEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.LOCATED_NET_ENTITY: {
			LocatedNetEntity locatedNetEntity = (LocatedNetEntity) theEObject;
			T result = caseLocatedNetEntity(locatedNetEntity);
			if (result == null)
				result = caseNetEntity(locatedNetEntity);
			if (result == null)
				result = caseNetworkResource(locatedNetEntity);
			if (result == null)
				result = caseNamedResource(locatedNetEntity);
			if (result == null)
				result = caseBaseObjectRSM(locatedNetEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.SIGNAL_RSM: {
			SignalRSM signalRSM = (SignalRSM) theEObject;
			T result = caseSignalRSM(signalRSM);
			if (result == null)
				result = caseLocatedNetEntity(signalRSM);
			if (result == null)
				result = caseNetEntity(signalRSM);
			if (result == null)
				result = caseNetworkResource(signalRSM);
			if (result == null)
				result = caseNamedResource(signalRSM);
			if (result == null)
				result = caseBaseObjectRSM(signalRSM);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ROUTE_BODY_RSM: {
			RouteBodyRSM routeBodyRSM = (RouteBodyRSM) theEObject;
			T result = caseRouteBodyRSM(routeBodyRSM);
			if (result == null)
				result = caseLocatedNetEntity(routeBodyRSM);
			if (result == null)
				result = caseNetEntity(routeBodyRSM);
			if (result == null)
				result = caseNetworkResource(routeBodyRSM);
			if (result == null)
				result = caseNamedResource(routeBodyRSM);
			if (result == null)
				result = caseBaseObjectRSM(routeBodyRSM);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES: {
			EtcsSignalProperties etcsSignalProperties = (EtcsSignalProperties) theEObject;
			T result = caseEtcsSignalProperties(etcsSignalProperties);
			if (result == null)
				result = caseBaseObjectEULYNX(etcsSignalProperties);
			if (result == null)
				result = caseBaseObjectRSM(etcsSignalProperties);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ETCS_END_OF_AUTHORITY: {
			EtcsEndOfAuthority etcsEndOfAuthority = (EtcsEndOfAuthority) theEObject;
			T result = caseEtcsEndOfAuthority(etcsEndOfAuthority);
			if (result == null)
				result = caseBaseObjectEULYNX(etcsEndOfAuthority);
			if (result == null)
				result = caseBaseObjectRSM(etcsEndOfAuthority);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.DOCUMENT_ROOT: {
			DocumentRoot documentRoot = (DocumentRoot) theEObject;
			T result = caseDocumentRoot(documentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.DATA_PREP_ENTITIES: {
			DataPrepEntities dataPrepEntities = (DataPrepEntities) theEObject;
			T result = caseDataPrepEntities(dataPrepEntities);
			if (result == null)
				result = caseBaseObjectRSM(dataPrepEntities);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.RSM_ENTITIES: {
			RsmEntities rsmEntities = (RsmEntities) theEObject;
			T result = caseRsmEntities(rsmEntities);
			if (result == null)
				result = caseBaseObjectRSM(rsmEntities);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.TOPOLOGY: {
			Topology topology = (Topology) theEObject;
			T result = caseTopology(topology);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.ASSET_AND_STATE: {
			AssetAndState assetAndState = (AssetAndState) theEObject;
			T result = caseAssetAndState(assetAndState);
			if (result == null)
				result = caseConfiguredBaseObject(assetAndState);
			if (result == null)
				result = caseBaseObjectEULYNX(assetAndState);
			if (result == null)
				result = caseBaseObjectRSM(assetAndState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtractedMMPackage.SECTION_AND_VACANCY: {
			SectionAndVacancy sectionAndVacancy = (SectionAndVacancy) theEObject;
			T result = caseSectionAndVacancy(sectionAndVacancy);
			if (result == null)
				result = caseAssetAndState(sectionAndVacancy);
			if (result == null)
				result = caseConfiguredBaseObject(sectionAndVacancy);
			if (result == null)
				result = caseBaseObjectEULYNX(sectionAndVacancy);
			if (result == null)
				result = caseBaseObjectRSM(sectionAndVacancy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Object RSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Object RSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseObjectRSM(BaseObjectRSM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedResource(NamedResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkResource(NetworkResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Net Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Net Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetElement(NetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Net Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Net Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionNetElement(CompositionNetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positioning Net Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positioning Net Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositioningNetElement(PositioningNetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearElement(LinearElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positioned Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positioned Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionedRelation(PositionedRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseLocation(BaseLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spot Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spot Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpotLocation(SpotLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearLocation(LinearLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaLocation(AreaLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associated Net Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associated Net Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociatedNetElement(AssociatedNetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lateral Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lateral Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLateralPosition(LateralPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lateral Side</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lateral Side</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLateralSide(LateralSide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Object EULYNX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Object EULYNX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseObjectEULYNX(BaseObjectEULYNX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tvp Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tvp Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTvpSection(TvpSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Track Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Track Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualTrackAsset(VirtualTrackAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Track Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Track Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackAsset(TrackAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configured Base Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configured Base Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguredBaseObject(ConfiguredBaseObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tds Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tds Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTdsSection(TdsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tds Compnent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tds Compnent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTdsCompnent(TdsCompnent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Passage Detector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Passage Detector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehiclePassageDetector(VehiclePassageDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Track Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Track Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalTrackAsset(PhysicalTrackAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vss Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vss Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVssLimit(VssLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Sub Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Sub Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualSubSection(VirtualSubSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etcs Ma Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etcs Ma Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtcsMaSection(EtcsMaSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoute(Route object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etcs Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etcs Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtcsRoute(EtcsRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteBody(RouteBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Body Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Body Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteBodyProperty(RouteBodyProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionList(SectionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Extremity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Extremity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteExtremity(RouteExtremity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteEntry(RouteEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Exit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Exit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteExit(RouteExit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal(Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Physical Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Physical Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonPhysicalSignal(NonPhysicalSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualSignal(VirtualSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Net Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Net Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetEntity(NetEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Net Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Net Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedNetEntity(LocatedNetEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal RSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal RSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalRSM(SignalRSM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Body RSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Body RSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteBodyRSM(RouteBodyRSM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etcs Signal Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etcs Signal Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtcsSignalProperties(EtcsSignalProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etcs End Of Authority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etcs End Of Authority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtcsEndOfAuthority(EtcsEndOfAuthority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Prep Entities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Prep Entities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPrepEntities(DataPrepEntities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rsm Entities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rsm Entities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRsmEntities(RsmEntities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopology(Topology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset And State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset And State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetAndState(AssetAndState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section And Vacancy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section And Vacancy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionAndVacancy(SectionAndVacancy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExtractedMMSwitch
