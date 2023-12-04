/**
 */
package extractedMM.impl;

import extractedMM.AreaLocation;
import extractedMM.ExtractedMMPackage;
import extractedMM.TvpSection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tvp Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.TvpSectionImpl#getIsLocatedAt <em>Is Located At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TvpSectionImpl extends VirtualTrackAssetImpl implements TvpSection {
	/**
	 * The cached value of the '{@link #getIsLocatedAt() <em>Is Located At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLocatedAt()
	 * @generated
	 * @ordered
	 */
	protected AreaLocation isLocatedAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TvpSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.TVP_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaLocation getIsLocatedAt() {
		if (isLocatedAt != null && isLocatedAt.eIsProxy()) {
			InternalEObject oldIsLocatedAt = (InternalEObject) isLocatedAt;
			isLocatedAt = (AreaLocation) eResolveProxy(oldIsLocatedAt);
			if (isLocatedAt != oldIsLocatedAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.TVP_SECTION__IS_LOCATED_AT, oldIsLocatedAt, isLocatedAt));
			}
		}
		return isLocatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaLocation basicGetIsLocatedAt() {
		return isLocatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocatedAt(AreaLocation newIsLocatedAt) {
		AreaLocation oldIsLocatedAt = isLocatedAt;
		isLocatedAt = newIsLocatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.TVP_SECTION__IS_LOCATED_AT,
					oldIsLocatedAt, isLocatedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtractedMMPackage.TVP_SECTION__IS_LOCATED_AT:
			if (resolve)
				return getIsLocatedAt();
			return basicGetIsLocatedAt();
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
		case ExtractedMMPackage.TVP_SECTION__IS_LOCATED_AT:
			setIsLocatedAt((AreaLocation) newValue);
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
		case ExtractedMMPackage.TVP_SECTION__IS_LOCATED_AT:
			setIsLocatedAt((AreaLocation) null);
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
		case ExtractedMMPackage.TVP_SECTION__IS_LOCATED_AT:
			return isLocatedAt != null;
		}
		return super.eIsSet(featureID);
	}

} //TvpSectionImpl
