/**
 */
package extractedMM.impl;

import extractedMM.EtcsEndOfAuthority;
import extractedMM.EtcsSignalProperties;
import extractedMM.ExtractedMMPackage;
import extractedMM.Signal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etcs Signal Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.EtcsSignalPropertiesImpl#getRefersToEoA <em>Refers To Eo A</em>}</li>
 *   <li>{@link extractedMM.impl.EtcsSignalPropertiesImpl#getAppliesToSignal <em>Applies To Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EtcsSignalPropertiesImpl extends BaseObjectEULYNXImpl implements EtcsSignalProperties {
	/**
	 * The cached value of the '{@link #getRefersToEoA() <em>Refers To Eo A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersToEoA()
	 * @generated
	 * @ordered
	 */
	protected EtcsEndOfAuthority refersToEoA;

	/**
	 * The cached value of the '{@link #getAppliesToSignal() <em>Applies To Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal appliesToSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtcsSignalPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.ETCS_SIGNAL_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtcsEndOfAuthority getRefersToEoA() {
		if (refersToEoA != null && refersToEoA.eIsProxy()) {
			InternalEObject oldRefersToEoA = (InternalEObject) refersToEoA;
			refersToEoA = (EtcsEndOfAuthority) eResolveProxy(oldRefersToEoA);
			if (refersToEoA != oldRefersToEoA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES__REFERS_TO_EO_A, oldRefersToEoA, refersToEoA));
			}
		}
		return refersToEoA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtcsEndOfAuthority basicGetRefersToEoA() {
		return refersToEoA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersToEoA(EtcsEndOfAuthority newRefersToEoA) {
		EtcsEndOfAuthority oldRefersToEoA = refersToEoA;
		refersToEoA = newRefersToEoA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES__REFERS_TO_EO_A, oldRefersToEoA, refersToEoA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getAppliesToSignal() {
		if (appliesToSignal != null && appliesToSignal.eIsProxy()) {
			InternalEObject oldAppliesToSignal = (InternalEObject) appliesToSignal;
			appliesToSignal = (Signal) eResolveProxy(oldAppliesToSignal);
			if (appliesToSignal != oldAppliesToSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES__APPLIES_TO_SIGNAL, oldAppliesToSignal,
							appliesToSignal));
			}
		}
		return appliesToSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetAppliesToSignal() {
		return appliesToSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesToSignal(Signal newAppliesToSignal) {
		Signal oldAppliesToSignal = appliesToSignal;
		appliesToSignal = newAppliesToSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES__APPLIES_TO_SIGNAL, oldAppliesToSignal, appliesToSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES__REFERS_TO_EO_A:
			if (resolve)
				return getRefersToEoA();
			return basicGetRefersToEoA();
		case ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES__APPLIES_TO_SIGNAL:
			if (resolve)
				return getAppliesToSignal();
			return basicGetAppliesToSignal();
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
		case ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES__REFERS_TO_EO_A:
			setRefersToEoA((EtcsEndOfAuthority) newValue);
			return;
		case ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES__APPLIES_TO_SIGNAL:
			setAppliesToSignal((Signal) newValue);
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
		case ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES__REFERS_TO_EO_A:
			setRefersToEoA((EtcsEndOfAuthority) null);
			return;
		case ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES__APPLIES_TO_SIGNAL:
			setAppliesToSignal((Signal) null);
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
		case ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES__REFERS_TO_EO_A:
			return refersToEoA != null;
		case ExtractedMMPackage.ETCS_SIGNAL_PROPERTIES__APPLIES_TO_SIGNAL:
			return appliesToSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //EtcsSignalPropertiesImpl
