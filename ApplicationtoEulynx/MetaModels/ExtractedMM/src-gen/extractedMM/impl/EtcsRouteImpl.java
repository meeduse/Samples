/**
 */
package extractedMM.impl;

import extractedMM.EtcsMaSection;
import extractedMM.EtcsRoute;
import extractedMM.ExtractedMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etcs Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.EtcsRouteImpl#getHasMaSection <em>Has Ma Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EtcsRouteImpl extends RouteImpl implements EtcsRoute {
	/**
	 * The cached value of the '{@link #getHasMaSection() <em>Has Ma Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMaSection()
	 * @generated
	 * @ordered
	 */
	protected EList<EtcsMaSection> hasMaSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtcsRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.ETCS_ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EtcsMaSection> getHasMaSection() {
		if (hasMaSection == null) {
			hasMaSection = new EObjectContainmentEList<EtcsMaSection>(EtcsMaSection.class, this,
					ExtractedMMPackage.ETCS_ROUTE__HAS_MA_SECTION);
		}
		return hasMaSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtractedMMPackage.ETCS_ROUTE__HAS_MA_SECTION:
			return ((InternalEList<?>) getHasMaSection()).basicRemove(otherEnd, msgs);
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
		case ExtractedMMPackage.ETCS_ROUTE__HAS_MA_SECTION:
			return getHasMaSection();
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
		case ExtractedMMPackage.ETCS_ROUTE__HAS_MA_SECTION:
			getHasMaSection().clear();
			getHasMaSection().addAll((Collection<? extends EtcsMaSection>) newValue);
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
		case ExtractedMMPackage.ETCS_ROUTE__HAS_MA_SECTION:
			getHasMaSection().clear();
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
		case ExtractedMMPackage.ETCS_ROUTE__HAS_MA_SECTION:
			return hasMaSection != null && !hasMaSection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EtcsRouteImpl
