/**
 */
package extractedMM.impl;

import extractedMM.EtcsMaSection;
import extractedMM.ExtractedMMPackage;
import extractedMM.SpotLocation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etcs Ma Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.EtcsMaSectionImpl#getHasSectionEntryLocation <em>Has Section Entry Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EtcsMaSectionImpl extends ConfiguredBaseObjectImpl implements EtcsMaSection {
	/**
	 * The cached value of the '{@link #getHasSectionEntryLocation() <em>Has Section Entry Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSectionEntryLocation()
	 * @generated
	 * @ordered
	 */
	protected SpotLocation hasSectionEntryLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtcsMaSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.ETCS_MA_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpotLocation getHasSectionEntryLocation() {
		if (hasSectionEntryLocation != null && hasSectionEntryLocation.eIsProxy()) {
			InternalEObject oldHasSectionEntryLocation = (InternalEObject) hasSectionEntryLocation;
			hasSectionEntryLocation = (SpotLocation) eResolveProxy(oldHasSectionEntryLocation);
			if (hasSectionEntryLocation != oldHasSectionEntryLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.ETCS_MA_SECTION__HAS_SECTION_ENTRY_LOCATION, oldHasSectionEntryLocation,
							hasSectionEntryLocation));
			}
		}
		return hasSectionEntryLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpotLocation basicGetHasSectionEntryLocation() {
		return hasSectionEntryLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSectionEntryLocation(SpotLocation newHasSectionEntryLocation) {
		SpotLocation oldHasSectionEntryLocation = hasSectionEntryLocation;
		hasSectionEntryLocation = newHasSectionEntryLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.ETCS_MA_SECTION__HAS_SECTION_ENTRY_LOCATION, oldHasSectionEntryLocation,
					hasSectionEntryLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtractedMMPackage.ETCS_MA_SECTION__HAS_SECTION_ENTRY_LOCATION:
			if (resolve)
				return getHasSectionEntryLocation();
			return basicGetHasSectionEntryLocation();
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
		case ExtractedMMPackage.ETCS_MA_SECTION__HAS_SECTION_ENTRY_LOCATION:
			setHasSectionEntryLocation((SpotLocation) newValue);
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
		case ExtractedMMPackage.ETCS_MA_SECTION__HAS_SECTION_ENTRY_LOCATION:
			setHasSectionEntryLocation((SpotLocation) null);
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
		case ExtractedMMPackage.ETCS_MA_SECTION__HAS_SECTION_ENTRY_LOCATION:
			return hasSectionEntryLocation != null;
		}
		return super.eIsSet(featureID);
	}

} //EtcsMaSectionImpl
