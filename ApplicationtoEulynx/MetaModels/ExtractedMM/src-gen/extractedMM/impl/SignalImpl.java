/**
 */
package extractedMM.impl;

import extractedMM.ExtractedMMPackage;
import extractedMM.RouteEntry;
import extractedMM.Signal;
import extractedMM.SignalRSM;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.SignalImpl#getRefersToRsmSignal <em>Refers To Rsm Signal</em>}</li>
 *   <li>{@link extractedMM.impl.SignalImpl#getHasGroupMainSignal <em>Has Group Main Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalImpl extends TrackAssetImpl implements Signal {
	/**
	 * The cached value of the '{@link #getRefersToRsmSignal() <em>Refers To Rsm Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersToRsmSignal()
	 * @generated
	 * @ordered
	 */
	protected SignalRSM refersToRsmSignal;

	/**
	 * The cached value of the '{@link #getHasGroupMainSignal() <em>Has Group Main Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasGroupMainSignal()
	 * @generated
	 * @ordered
	 */
	protected RouteEntry hasGroupMainSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalRSM getRefersToRsmSignal() {
		if (refersToRsmSignal != null && refersToRsmSignal.eIsProxy()) {
			InternalEObject oldRefersToRsmSignal = (InternalEObject) refersToRsmSignal;
			refersToRsmSignal = (SignalRSM) eResolveProxy(oldRefersToRsmSignal);
			if (refersToRsmSignal != oldRefersToRsmSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.SIGNAL__REFERS_TO_RSM_SIGNAL, oldRefersToRsmSignal, refersToRsmSignal));
			}
		}
		return refersToRsmSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalRSM basicGetRefersToRsmSignal() {
		return refersToRsmSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersToRsmSignal(SignalRSM newRefersToRsmSignal) {
		SignalRSM oldRefersToRsmSignal = refersToRsmSignal;
		refersToRsmSignal = newRefersToRsmSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.SIGNAL__REFERS_TO_RSM_SIGNAL,
					oldRefersToRsmSignal, refersToRsmSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteEntry getHasGroupMainSignal() {
		if (hasGroupMainSignal != null && hasGroupMainSignal.eIsProxy()) {
			InternalEObject oldHasGroupMainSignal = (InternalEObject) hasGroupMainSignal;
			hasGroupMainSignal = (RouteEntry) eResolveProxy(oldHasGroupMainSignal);
			if (hasGroupMainSignal != oldHasGroupMainSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.SIGNAL__HAS_GROUP_MAIN_SIGNAL, oldHasGroupMainSignal,
							hasGroupMainSignal));
			}
		}
		return hasGroupMainSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteEntry basicGetHasGroupMainSignal() {
		return hasGroupMainSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasGroupMainSignal(RouteEntry newHasGroupMainSignal) {
		RouteEntry oldHasGroupMainSignal = hasGroupMainSignal;
		hasGroupMainSignal = newHasGroupMainSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.SIGNAL__HAS_GROUP_MAIN_SIGNAL,
					oldHasGroupMainSignal, hasGroupMainSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtractedMMPackage.SIGNAL__REFERS_TO_RSM_SIGNAL:
			if (resolve)
				return getRefersToRsmSignal();
			return basicGetRefersToRsmSignal();
		case ExtractedMMPackage.SIGNAL__HAS_GROUP_MAIN_SIGNAL:
			if (resolve)
				return getHasGroupMainSignal();
			return basicGetHasGroupMainSignal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExtractedMMPackage.SIGNAL__REFERS_TO_RSM_SIGNAL:
			setRefersToRsmSignal((SignalRSM) newValue);
			return;
		case ExtractedMMPackage.SIGNAL__HAS_GROUP_MAIN_SIGNAL:
			setHasGroupMainSignal((RouteEntry) newValue);
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
		case ExtractedMMPackage.SIGNAL__REFERS_TO_RSM_SIGNAL:
			setRefersToRsmSignal((SignalRSM) null);
			return;
		case ExtractedMMPackage.SIGNAL__HAS_GROUP_MAIN_SIGNAL:
			setHasGroupMainSignal((RouteEntry) null);
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
		case ExtractedMMPackage.SIGNAL__REFERS_TO_RSM_SIGNAL:
			return refersToRsmSignal != null;
		case ExtractedMMPackage.SIGNAL__HAS_GROUP_MAIN_SIGNAL:
			return hasGroupMainSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //SignalImpl
