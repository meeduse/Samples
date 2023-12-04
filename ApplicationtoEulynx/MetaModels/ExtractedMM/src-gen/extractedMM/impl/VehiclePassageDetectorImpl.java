/**
 */
package extractedMM.impl;

import extractedMM.ExtractedMMPackage;
import extractedMM.TdsSection;
import extractedMM.VehiclePassageDetector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Passage Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.VehiclePassageDetectorImpl#getOccupiesTdsSection <em>Occupies Tds Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VehiclePassageDetectorImpl extends PhysicalTrackAssetImpl implements VehiclePassageDetector {
	/**
	 * The cached value of the '{@link #getOccupiesTdsSection() <em>Occupies Tds Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupiesTdsSection()
	 * @generated
	 * @ordered
	 */
	protected TdsSection occupiesTdsSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehiclePassageDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.VEHICLE_PASSAGE_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TdsSection getOccupiesTdsSection() {
		if (occupiesTdsSection != null && occupiesTdsSection.eIsProxy()) {
			InternalEObject oldOccupiesTdsSection = (InternalEObject) occupiesTdsSection;
			occupiesTdsSection = (TdsSection) eResolveProxy(oldOccupiesTdsSection);
			if (occupiesTdsSection != oldOccupiesTdsSection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.VEHICLE_PASSAGE_DETECTOR__OCCUPIES_TDS_SECTION, oldOccupiesTdsSection,
							occupiesTdsSection));
			}
		}
		return occupiesTdsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TdsSection basicGetOccupiesTdsSection() {
		return occupiesTdsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupiesTdsSection(TdsSection newOccupiesTdsSection) {
		TdsSection oldOccupiesTdsSection = occupiesTdsSection;
		occupiesTdsSection = newOccupiesTdsSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.VEHICLE_PASSAGE_DETECTOR__OCCUPIES_TDS_SECTION, oldOccupiesTdsSection,
					occupiesTdsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtractedMMPackage.VEHICLE_PASSAGE_DETECTOR__OCCUPIES_TDS_SECTION:
			if (resolve)
				return getOccupiesTdsSection();
			return basicGetOccupiesTdsSection();
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
		case ExtractedMMPackage.VEHICLE_PASSAGE_DETECTOR__OCCUPIES_TDS_SECTION:
			setOccupiesTdsSection((TdsSection) newValue);
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
		case ExtractedMMPackage.VEHICLE_PASSAGE_DETECTOR__OCCUPIES_TDS_SECTION:
			setOccupiesTdsSection((TdsSection) null);
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
		case ExtractedMMPackage.VEHICLE_PASSAGE_DETECTOR__OCCUPIES_TDS_SECTION:
			return occupiesTdsSection != null;
		}
		return super.eIsSet(featureID);
	}

} //VehiclePassageDetectorImpl
