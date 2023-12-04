/**
 */
package extractedMM.impl;

import extractedMM.BaseLocation;
import extractedMM.ExtractedMMPackage;
import extractedMM.PositionedRelation;
import extractedMM.PositioningNetElement;
import extractedMM.RouteBodyRSM;
import extractedMM.SignalRSM;
import extractedMM.Topology;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.TopologyImpl#getUsesPositionedRelation <em>Uses Positioned Relation</em>}</li>
 *   <li>{@link extractedMM.impl.TopologyImpl#getUsesNetElement <em>Uses Net Element</em>}</li>
 *   <li>{@link extractedMM.impl.TopologyImpl#getUsesLocation <em>Uses Location</em>}</li>
 *   <li>{@link extractedMM.impl.TopologyImpl#getOwnsSignalRSM <em>Owns Signal RSM</em>}</li>
 *   <li>{@link extractedMM.impl.TopologyImpl#getOwnsRouteBodyRSM <em>Owns Route Body RSM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologyImpl extends MinimalEObjectImpl.Container implements Topology {
	/**
	 * The cached value of the '{@link #getUsesPositionedRelation() <em>Uses Positioned Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesPositionedRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<PositionedRelation> usesPositionedRelation;

	/**
	 * The cached value of the '{@link #getUsesNetElement() <em>Uses Net Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesNetElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PositioningNetElement> usesNetElement;

	/**
	 * The cached value of the '{@link #getUsesLocation() <em>Uses Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseLocation> usesLocation;

	/**
	 * The cached value of the '{@link #getOwnsSignalRSM() <em>Owns Signal RSM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsSignalRSM()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalRSM> ownsSignalRSM;

	/**
	 * The cached value of the '{@link #getOwnsRouteBodyRSM() <em>Owns Route Body RSM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsRouteBodyRSM()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteBodyRSM> ownsRouteBodyRSM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.TOPOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositionedRelation> getUsesPositionedRelation() {
		if (usesPositionedRelation == null) {
			usesPositionedRelation = new EObjectContainmentEList<PositionedRelation>(PositionedRelation.class, this,
					ExtractedMMPackage.TOPOLOGY__USES_POSITIONED_RELATION);
		}
		return usesPositionedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositioningNetElement> getUsesNetElement() {
		if (usesNetElement == null) {
			usesNetElement = new EObjectContainmentEList<PositioningNetElement>(PositioningNetElement.class, this,
					ExtractedMMPackage.TOPOLOGY__USES_NET_ELEMENT);
		}
		return usesNetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseLocation> getUsesLocation() {
		if (usesLocation == null) {
			usesLocation = new EObjectContainmentEList<BaseLocation>(BaseLocation.class, this,
					ExtractedMMPackage.TOPOLOGY__USES_LOCATION);
		}
		return usesLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalRSM> getOwnsSignalRSM() {
		if (ownsSignalRSM == null) {
			ownsSignalRSM = new EObjectContainmentEList<SignalRSM>(SignalRSM.class, this,
					ExtractedMMPackage.TOPOLOGY__OWNS_SIGNAL_RSM);
		}
		return ownsSignalRSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteBodyRSM> getOwnsRouteBodyRSM() {
		if (ownsRouteBodyRSM == null) {
			ownsRouteBodyRSM = new EObjectContainmentEList<RouteBodyRSM>(RouteBodyRSM.class, this,
					ExtractedMMPackage.TOPOLOGY__OWNS_ROUTE_BODY_RSM);
		}
		return ownsRouteBodyRSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtractedMMPackage.TOPOLOGY__USES_POSITIONED_RELATION:
			return ((InternalEList<?>) getUsesPositionedRelation()).basicRemove(otherEnd, msgs);
		case ExtractedMMPackage.TOPOLOGY__USES_NET_ELEMENT:
			return ((InternalEList<?>) getUsesNetElement()).basicRemove(otherEnd, msgs);
		case ExtractedMMPackage.TOPOLOGY__USES_LOCATION:
			return ((InternalEList<?>) getUsesLocation()).basicRemove(otherEnd, msgs);
		case ExtractedMMPackage.TOPOLOGY__OWNS_SIGNAL_RSM:
			return ((InternalEList<?>) getOwnsSignalRSM()).basicRemove(otherEnd, msgs);
		case ExtractedMMPackage.TOPOLOGY__OWNS_ROUTE_BODY_RSM:
			return ((InternalEList<?>) getOwnsRouteBodyRSM()).basicRemove(otherEnd, msgs);
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
		case ExtractedMMPackage.TOPOLOGY__USES_POSITIONED_RELATION:
			return getUsesPositionedRelation();
		case ExtractedMMPackage.TOPOLOGY__USES_NET_ELEMENT:
			return getUsesNetElement();
		case ExtractedMMPackage.TOPOLOGY__USES_LOCATION:
			return getUsesLocation();
		case ExtractedMMPackage.TOPOLOGY__OWNS_SIGNAL_RSM:
			return getOwnsSignalRSM();
		case ExtractedMMPackage.TOPOLOGY__OWNS_ROUTE_BODY_RSM:
			return getOwnsRouteBodyRSM();
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
		case ExtractedMMPackage.TOPOLOGY__USES_POSITIONED_RELATION:
			getUsesPositionedRelation().clear();
			getUsesPositionedRelation().addAll((Collection<? extends PositionedRelation>) newValue);
			return;
		case ExtractedMMPackage.TOPOLOGY__USES_NET_ELEMENT:
			getUsesNetElement().clear();
			getUsesNetElement().addAll((Collection<? extends PositioningNetElement>) newValue);
			return;
		case ExtractedMMPackage.TOPOLOGY__USES_LOCATION:
			getUsesLocation().clear();
			getUsesLocation().addAll((Collection<? extends BaseLocation>) newValue);
			return;
		case ExtractedMMPackage.TOPOLOGY__OWNS_SIGNAL_RSM:
			getOwnsSignalRSM().clear();
			getOwnsSignalRSM().addAll((Collection<? extends SignalRSM>) newValue);
			return;
		case ExtractedMMPackage.TOPOLOGY__OWNS_ROUTE_BODY_RSM:
			getOwnsRouteBodyRSM().clear();
			getOwnsRouteBodyRSM().addAll((Collection<? extends RouteBodyRSM>) newValue);
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
		case ExtractedMMPackage.TOPOLOGY__USES_POSITIONED_RELATION:
			getUsesPositionedRelation().clear();
			return;
		case ExtractedMMPackage.TOPOLOGY__USES_NET_ELEMENT:
			getUsesNetElement().clear();
			return;
		case ExtractedMMPackage.TOPOLOGY__USES_LOCATION:
			getUsesLocation().clear();
			return;
		case ExtractedMMPackage.TOPOLOGY__OWNS_SIGNAL_RSM:
			getOwnsSignalRSM().clear();
			return;
		case ExtractedMMPackage.TOPOLOGY__OWNS_ROUTE_BODY_RSM:
			getOwnsRouteBodyRSM().clear();
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
		case ExtractedMMPackage.TOPOLOGY__USES_POSITIONED_RELATION:
			return usesPositionedRelation != null && !usesPositionedRelation.isEmpty();
		case ExtractedMMPackage.TOPOLOGY__USES_NET_ELEMENT:
			return usesNetElement != null && !usesNetElement.isEmpty();
		case ExtractedMMPackage.TOPOLOGY__USES_LOCATION:
			return usesLocation != null && !usesLocation.isEmpty();
		case ExtractedMMPackage.TOPOLOGY__OWNS_SIGNAL_RSM:
			return ownsSignalRSM != null && !ownsSignalRSM.isEmpty();
		case ExtractedMMPackage.TOPOLOGY__OWNS_ROUTE_BODY_RSM:
			return ownsRouteBodyRSM != null && !ownsRouteBodyRSM.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TopologyImpl
