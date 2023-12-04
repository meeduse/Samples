/**
 */
package extractedMM.impl;

import extractedMM.BaseLocation;
import extractedMM.ExtractedMMPackage;
import extractedMM.LocatedNetEntity;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Located Net Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.LocatedNetEntityImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LocatedNetEntityImpl extends NetEntityImpl implements LocatedNetEntity {
	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseLocation> locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatedNetEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.LOCATED_NET_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseLocation> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<BaseLocation>(BaseLocation.class, this,
					ExtractedMMPackage.LOCATED_NET_ENTITY__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtractedMMPackage.LOCATED_NET_ENTITY__LOCATIONS:
			return ((InternalEList<?>) getLocations()).basicRemove(otherEnd, msgs);
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
		case ExtractedMMPackage.LOCATED_NET_ENTITY__LOCATIONS:
			return getLocations();
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
		case ExtractedMMPackage.LOCATED_NET_ENTITY__LOCATIONS:
			getLocations().clear();
			getLocations().addAll((Collection<? extends BaseLocation>) newValue);
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
		case ExtractedMMPackage.LOCATED_NET_ENTITY__LOCATIONS:
			getLocations().clear();
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
		case ExtractedMMPackage.LOCATED_NET_ENTITY__LOCATIONS:
			return locations != null && !locations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocatedNetEntityImpl
