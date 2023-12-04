/**
 */
package extractedMM.impl;

import extractedMM.AssociatedNetElement;
import extractedMM.ExtractedMMPackage;
import extractedMM.LinearLocation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.LinearLocationImpl#getAssociatedNetElements <em>Associated Net Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearLocationImpl extends BaseLocationImpl implements LinearLocation {
	/**
	 * The cached value of the '{@link #getAssociatedNetElements() <em>Associated Net Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedNetElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociatedNetElement> associatedNetElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.LINEAR_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociatedNetElement> getAssociatedNetElements() {
		if (associatedNetElements == null) {
			associatedNetElements = new EObjectContainmentEList<AssociatedNetElement>(AssociatedNetElement.class, this,
					ExtractedMMPackage.LINEAR_LOCATION__ASSOCIATED_NET_ELEMENTS);
		}
		return associatedNetElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtractedMMPackage.LINEAR_LOCATION__ASSOCIATED_NET_ELEMENTS:
			return ((InternalEList<?>) getAssociatedNetElements()).basicRemove(otherEnd, msgs);
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
		case ExtractedMMPackage.LINEAR_LOCATION__ASSOCIATED_NET_ELEMENTS:
			return getAssociatedNetElements();
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
		case ExtractedMMPackage.LINEAR_LOCATION__ASSOCIATED_NET_ELEMENTS:
			getAssociatedNetElements().clear();
			getAssociatedNetElements().addAll((Collection<? extends AssociatedNetElement>) newValue);
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
		case ExtractedMMPackage.LINEAR_LOCATION__ASSOCIATED_NET_ELEMENTS:
			getAssociatedNetElements().clear();
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
		case ExtractedMMPackage.LINEAR_LOCATION__ASSOCIATED_NET_ELEMENTS:
			return associatedNetElements != null && !associatedNetElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinearLocationImpl
