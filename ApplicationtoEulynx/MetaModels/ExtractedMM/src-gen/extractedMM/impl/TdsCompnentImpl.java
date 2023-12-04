/**
 */
package extractedMM.impl;

import extractedMM.ExtractedMMPackage;
import extractedMM.TdsCompnent;
import extractedMM.TdsSection;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tds Compnent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.TdsCompnentImpl#getLimitsTdsSection <em>Limits Tds Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TdsCompnentImpl extends VehiclePassageDetectorImpl implements TdsCompnent {
	/**
	 * The cached value of the '{@link #getLimitsTdsSection() <em>Limits Tds Section</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitsTdsSection()
	 * @generated
	 * @ordered
	 */
	protected EList<TdsSection> limitsTdsSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TdsCompnentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.TDS_COMPNENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TdsSection> getLimitsTdsSection() {
		if (limitsTdsSection == null) {
			limitsTdsSection = new EObjectResolvingEList<TdsSection>(TdsSection.class, this,
					ExtractedMMPackage.TDS_COMPNENT__LIMITS_TDS_SECTION);
		}
		return limitsTdsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtractedMMPackage.TDS_COMPNENT__LIMITS_TDS_SECTION:
			return getLimitsTdsSection();
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
		case ExtractedMMPackage.TDS_COMPNENT__LIMITS_TDS_SECTION:
			getLimitsTdsSection().clear();
			getLimitsTdsSection().addAll((Collection<? extends TdsSection>) newValue);
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
		case ExtractedMMPackage.TDS_COMPNENT__LIMITS_TDS_SECTION:
			getLimitsTdsSection().clear();
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
		case ExtractedMMPackage.TDS_COMPNENT__LIMITS_TDS_SECTION:
			return limitsTdsSection != null && !limitsTdsSection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TdsCompnentImpl
