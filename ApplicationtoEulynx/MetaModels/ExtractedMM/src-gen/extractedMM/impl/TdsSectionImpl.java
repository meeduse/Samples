/**
 */
package extractedMM.impl;

import extractedMM.ExtractedMMPackage;
import extractedMM.TdsSection;
import extractedMM.TvpSection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tds Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.TdsSectionImpl#getAppliesToTvpsection <em>Applies To Tvpsection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TdsSectionImpl extends VirtualTrackAssetImpl implements TdsSection {
	/**
	 * The cached value of the '{@link #getAppliesToTvpsection() <em>Applies To Tvpsection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToTvpsection()
	 * @generated
	 * @ordered
	 */
	protected TvpSection appliesToTvpsection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TdsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.TDS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TvpSection getAppliesToTvpsection() {
		if (appliesToTvpsection != null && appliesToTvpsection.eIsProxy()) {
			InternalEObject oldAppliesToTvpsection = (InternalEObject) appliesToTvpsection;
			appliesToTvpsection = (TvpSection) eResolveProxy(oldAppliesToTvpsection);
			if (appliesToTvpsection != oldAppliesToTvpsection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.TDS_SECTION__APPLIES_TO_TVPSECTION, oldAppliesToTvpsection,
							appliesToTvpsection));
			}
		}
		return appliesToTvpsection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TvpSection basicGetAppliesToTvpsection() {
		return appliesToTvpsection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesToTvpsection(TvpSection newAppliesToTvpsection) {
		TvpSection oldAppliesToTvpsection = appliesToTvpsection;
		appliesToTvpsection = newAppliesToTvpsection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.TDS_SECTION__APPLIES_TO_TVPSECTION,
					oldAppliesToTvpsection, appliesToTvpsection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtractedMMPackage.TDS_SECTION__APPLIES_TO_TVPSECTION:
			if (resolve)
				return getAppliesToTvpsection();
			return basicGetAppliesToTvpsection();
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
		case ExtractedMMPackage.TDS_SECTION__APPLIES_TO_TVPSECTION:
			setAppliesToTvpsection((TvpSection) newValue);
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
		case ExtractedMMPackage.TDS_SECTION__APPLIES_TO_TVPSECTION:
			setAppliesToTvpsection((TvpSection) null);
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
		case ExtractedMMPackage.TDS_SECTION__APPLIES_TO_TVPSECTION:
			return appliesToTvpsection != null;
		}
		return super.eIsSet(featureID);
	}

} //TdsSectionImpl
