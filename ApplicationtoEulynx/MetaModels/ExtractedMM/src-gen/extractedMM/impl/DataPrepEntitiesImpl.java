/**
 */
package extractedMM.impl;

import extractedMM.AssetAndState;
import extractedMM.DataPrepEntities;
import extractedMM.EtcsEndOfAuthority;
import extractedMM.EtcsMaSection;
import extractedMM.EtcsSignalProperties;
import extractedMM.ExtractedMMPackage;
import extractedMM.Route;
import extractedMM.RouteBody;
import extractedMM.RouteBodyProperty;
import extractedMM.TrackAsset;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Prep Entities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.DataPrepEntitiesImpl#getOwnsEtcsEndOfAuthority <em>Owns Etcs End Of Authority</em>}</li>
 *   <li>{@link extractedMM.impl.DataPrepEntitiesImpl#getOwnsEtcsMaSection <em>Owns Etcs Ma Section</em>}</li>
 *   <li>{@link extractedMM.impl.DataPrepEntitiesImpl#getOwnsEtcsSignalProperties <em>Owns Etcs Signal Properties</em>}</li>
 *   <li>{@link extractedMM.impl.DataPrepEntitiesImpl#getOwnsRouteBodyProperty <em>Owns Route Body Property</em>}</li>
 *   <li>{@link extractedMM.impl.DataPrepEntitiesImpl#getOwnsRouteBody <em>Owns Route Body</em>}</li>
 *   <li>{@link extractedMM.impl.DataPrepEntitiesImpl#getOwnsRoute <em>Owns Route</em>}</li>
 *   <li>{@link extractedMM.impl.DataPrepEntitiesImpl#getOwnsTrackAsset <em>Owns Track Asset</em>}</li>
 *   <li>{@link extractedMM.impl.DataPrepEntitiesImpl#getKnowsAssetAndState <em>Knows Asset And State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPrepEntitiesImpl extends BaseObjectRSMImpl implements DataPrepEntities {
	/**
	 * The cached value of the '{@link #getOwnsEtcsEndOfAuthority() <em>Owns Etcs End Of Authority</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsEtcsEndOfAuthority()
	 * @generated
	 * @ordered
	 */
	protected EList<EtcsEndOfAuthority> ownsEtcsEndOfAuthority;

	/**
	 * The cached value of the '{@link #getOwnsEtcsMaSection() <em>Owns Etcs Ma Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsEtcsMaSection()
	 * @generated
	 * @ordered
	 */
	protected EList<EtcsMaSection> ownsEtcsMaSection;

	/**
	 * The cached value of the '{@link #getOwnsEtcsSignalProperties() <em>Owns Etcs Signal Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsEtcsSignalProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<EtcsSignalProperties> ownsEtcsSignalProperties;

	/**
	 * The cached value of the '{@link #getOwnsRouteBodyProperty() <em>Owns Route Body Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsRouteBodyProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteBodyProperty> ownsRouteBodyProperty;

	/**
	 * The cached value of the '{@link #getOwnsRouteBody() <em>Owns Route Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsRouteBody()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteBody> ownsRouteBody;

	/**
	 * The cached value of the '{@link #getOwnsRoute() <em>Owns Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> ownsRoute;

	/**
	 * The cached value of the '{@link #getOwnsTrackAsset() <em>Owns Track Asset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsTrackAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<TrackAsset> ownsTrackAsset;

	/**
	 * The cached value of the '{@link #getKnowsAssetAndState() <em>Knows Asset And State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowsAssetAndState()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetAndState> knowsAssetAndState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPrepEntitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.DATA_PREP_ENTITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EtcsEndOfAuthority> getOwnsEtcsEndOfAuthority() {
		if (ownsEtcsEndOfAuthority == null) {
			ownsEtcsEndOfAuthority = new EObjectContainmentEList<EtcsEndOfAuthority>(EtcsEndOfAuthority.class, this,
					ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_END_OF_AUTHORITY);
		}
		return ownsEtcsEndOfAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EtcsMaSection> getOwnsEtcsMaSection() {
		if (ownsEtcsMaSection == null) {
			ownsEtcsMaSection = new EObjectContainmentEList<EtcsMaSection>(EtcsMaSection.class, this,
					ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_MA_SECTION);
		}
		return ownsEtcsMaSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EtcsSignalProperties> getOwnsEtcsSignalProperties() {
		if (ownsEtcsSignalProperties == null) {
			ownsEtcsSignalProperties = new EObjectContainmentEList<EtcsSignalProperties>(EtcsSignalProperties.class,
					this, ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_SIGNAL_PROPERTIES);
		}
		return ownsEtcsSignalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteBodyProperty> getOwnsRouteBodyProperty() {
		if (ownsRouteBodyProperty == null) {
			ownsRouteBodyProperty = new EObjectContainmentEList<RouteBodyProperty>(RouteBodyProperty.class, this,
					ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE_BODY_PROPERTY);
		}
		return ownsRouteBodyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteBody> getOwnsRouteBody() {
		if (ownsRouteBody == null) {
			ownsRouteBody = new EObjectContainmentEList<RouteBody>(RouteBody.class, this,
					ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE_BODY);
		}
		return ownsRouteBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getOwnsRoute() {
		if (ownsRoute == null) {
			ownsRoute = new EObjectContainmentEList<Route>(Route.class, this,
					ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE);
		}
		return ownsRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrackAsset> getOwnsTrackAsset() {
		if (ownsTrackAsset == null) {
			ownsTrackAsset = new EObjectContainmentEList<TrackAsset>(TrackAsset.class, this,
					ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_TRACK_ASSET);
		}
		return ownsTrackAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssetAndState> getKnowsAssetAndState() {
		if (knowsAssetAndState == null) {
			knowsAssetAndState = new EObjectContainmentEList<AssetAndState>(AssetAndState.class, this,
					ExtractedMMPackage.DATA_PREP_ENTITIES__KNOWS_ASSET_AND_STATE);
		}
		return knowsAssetAndState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_END_OF_AUTHORITY:
			return ((InternalEList<?>) getOwnsEtcsEndOfAuthority()).basicRemove(otherEnd, msgs);
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_MA_SECTION:
			return ((InternalEList<?>) getOwnsEtcsMaSection()).basicRemove(otherEnd, msgs);
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_SIGNAL_PROPERTIES:
			return ((InternalEList<?>) getOwnsEtcsSignalProperties()).basicRemove(otherEnd, msgs);
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE_BODY_PROPERTY:
			return ((InternalEList<?>) getOwnsRouteBodyProperty()).basicRemove(otherEnd, msgs);
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE_BODY:
			return ((InternalEList<?>) getOwnsRouteBody()).basicRemove(otherEnd, msgs);
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE:
			return ((InternalEList<?>) getOwnsRoute()).basicRemove(otherEnd, msgs);
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_TRACK_ASSET:
			return ((InternalEList<?>) getOwnsTrackAsset()).basicRemove(otherEnd, msgs);
		case ExtractedMMPackage.DATA_PREP_ENTITIES__KNOWS_ASSET_AND_STATE:
			return ((InternalEList<?>) getKnowsAssetAndState()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_END_OF_AUTHORITY:
			return getOwnsEtcsEndOfAuthority();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_MA_SECTION:
			return getOwnsEtcsMaSection();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_SIGNAL_PROPERTIES:
			return getOwnsEtcsSignalProperties();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE_BODY_PROPERTY:
			return getOwnsRouteBodyProperty();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE_BODY:
			return getOwnsRouteBody();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE:
			return getOwnsRoute();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_TRACK_ASSET:
			return getOwnsTrackAsset();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__KNOWS_ASSET_AND_STATE:
			return getKnowsAssetAndState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_END_OF_AUTHORITY:
			getOwnsEtcsEndOfAuthority().clear();
			getOwnsEtcsEndOfAuthority().addAll((Collection<? extends EtcsEndOfAuthority>) newValue);
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_MA_SECTION:
			getOwnsEtcsMaSection().clear();
			getOwnsEtcsMaSection().addAll((Collection<? extends EtcsMaSection>) newValue);
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_SIGNAL_PROPERTIES:
			getOwnsEtcsSignalProperties().clear();
			getOwnsEtcsSignalProperties().addAll((Collection<? extends EtcsSignalProperties>) newValue);
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE_BODY_PROPERTY:
			getOwnsRouteBodyProperty().clear();
			getOwnsRouteBodyProperty().addAll((Collection<? extends RouteBodyProperty>) newValue);
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE_BODY:
			getOwnsRouteBody().clear();
			getOwnsRouteBody().addAll((Collection<? extends RouteBody>) newValue);
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE:
			getOwnsRoute().clear();
			getOwnsRoute().addAll((Collection<? extends Route>) newValue);
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_TRACK_ASSET:
			getOwnsTrackAsset().clear();
			getOwnsTrackAsset().addAll((Collection<? extends TrackAsset>) newValue);
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__KNOWS_ASSET_AND_STATE:
			getKnowsAssetAndState().clear();
			getKnowsAssetAndState().addAll((Collection<? extends AssetAndState>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_END_OF_AUTHORITY:
			getOwnsEtcsEndOfAuthority().clear();
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_MA_SECTION:
			getOwnsEtcsMaSection().clear();
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_SIGNAL_PROPERTIES:
			getOwnsEtcsSignalProperties().clear();
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE_BODY_PROPERTY:
			getOwnsRouteBodyProperty().clear();
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE_BODY:
			getOwnsRouteBody().clear();
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE:
			getOwnsRoute().clear();
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_TRACK_ASSET:
			getOwnsTrackAsset().clear();
			return;
		case ExtractedMMPackage.DATA_PREP_ENTITIES__KNOWS_ASSET_AND_STATE:
			getKnowsAssetAndState().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_END_OF_AUTHORITY:
			return ownsEtcsEndOfAuthority != null && !ownsEtcsEndOfAuthority.isEmpty();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_MA_SECTION:
			return ownsEtcsMaSection != null && !ownsEtcsMaSection.isEmpty();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ETCS_SIGNAL_PROPERTIES:
			return ownsEtcsSignalProperties != null && !ownsEtcsSignalProperties.isEmpty();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE_BODY_PROPERTY:
			return ownsRouteBodyProperty != null && !ownsRouteBodyProperty.isEmpty();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE_BODY:
			return ownsRouteBody != null && !ownsRouteBody.isEmpty();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_ROUTE:
			return ownsRoute != null && !ownsRoute.isEmpty();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__OWNS_TRACK_ASSET:
			return ownsTrackAsset != null && !ownsTrackAsset.isEmpty();
		case ExtractedMMPackage.DATA_PREP_ENTITIES__KNOWS_ASSET_AND_STATE:
			return knowsAssetAndState != null && !knowsAssetAndState.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataPrepEntitiesImpl
