/**
 */
package extractedMM.impl;

import extractedMM.ExtractedMMPackage;
import extractedMM.SectionList;
import extractedMM.TvpSection;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.SectionListImpl#getHasSection <em>Has Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionListImpl extends RouteBodyPropertyImpl implements SectionList {
	/**
	 * The cached value of the '{@link #getHasSection() <em>Has Section</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSection()
	 * @generated
	 * @ordered
	 */
	protected EList<TvpSection> hasSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.SECTION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TvpSection> getHasSection() {
		if (hasSection == null) {
			hasSection = new EObjectResolvingEList<TvpSection>(TvpSection.class, this,
					ExtractedMMPackage.SECTION_LIST__HAS_SECTION);
		}
		return hasSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtractedMMPackage.SECTION_LIST__HAS_SECTION:
			return getHasSection();
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
		case ExtractedMMPackage.SECTION_LIST__HAS_SECTION:
			getHasSection().clear();
			getHasSection().addAll((Collection<? extends TvpSection>) newValue);
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
		case ExtractedMMPackage.SECTION_LIST__HAS_SECTION:
			getHasSection().clear();
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
		case ExtractedMMPackage.SECTION_LIST__HAS_SECTION:
			return hasSection != null && !hasSection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SectionListImpl
