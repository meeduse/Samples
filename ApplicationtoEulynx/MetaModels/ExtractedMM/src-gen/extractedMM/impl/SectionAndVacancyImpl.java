/**
 */
package extractedMM.impl;

import extractedMM.ExtractedMMPackage;
import extractedMM.SectionAndVacancy;
import extractedMM.SectionVacancyTypes;
import extractedMM.TdsSection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section And Vacancy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.SectionAndVacancyImpl#getRefersToTdsSection <em>Refers To Tds Section</em>}</li>
 *   <li>{@link extractedMM.impl.SectionAndVacancyImpl#getInVacancyState <em>In Vacancy State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionAndVacancyImpl extends AssetAndStateImpl implements SectionAndVacancy {
	/**
	 * The cached value of the '{@link #getRefersToTdsSection() <em>Refers To Tds Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersToTdsSection()
	 * @generated
	 * @ordered
	 */
	protected TdsSection refersToTdsSection;

	/**
	 * The default value of the '{@link #getInVacancyState() <em>In Vacancy State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInVacancyState()
	 * @generated
	 * @ordered
	 */
	protected static final SectionVacancyTypes IN_VACANCY_STATE_EDEFAULT = SectionVacancyTypes.EOCCUPIED;

	/**
	 * The cached value of the '{@link #getInVacancyState() <em>In Vacancy State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInVacancyState()
	 * @generated
	 * @ordered
	 */
	protected SectionVacancyTypes inVacancyState = IN_VACANCY_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionAndVacancyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.SECTION_AND_VACANCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TdsSection getRefersToTdsSection() {
		if (refersToTdsSection != null && refersToTdsSection.eIsProxy()) {
			InternalEObject oldRefersToTdsSection = (InternalEObject) refersToTdsSection;
			refersToTdsSection = (TdsSection) eResolveProxy(oldRefersToTdsSection);
			if (refersToTdsSection != oldRefersToTdsSection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.SECTION_AND_VACANCY__REFERS_TO_TDS_SECTION, oldRefersToTdsSection,
							refersToTdsSection));
			}
		}
		return refersToTdsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TdsSection basicGetRefersToTdsSection() {
		return refersToTdsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersToTdsSection(TdsSection newRefersToTdsSection) {
		TdsSection oldRefersToTdsSection = refersToTdsSection;
		refersToTdsSection = newRefersToTdsSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.SECTION_AND_VACANCY__REFERS_TO_TDS_SECTION, oldRefersToTdsSection,
					refersToTdsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionVacancyTypes getInVacancyState() {
		return inVacancyState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInVacancyState(SectionVacancyTypes newInVacancyState) {
		SectionVacancyTypes oldInVacancyState = inVacancyState;
		inVacancyState = newInVacancyState == null ? IN_VACANCY_STATE_EDEFAULT : newInVacancyState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.SECTION_AND_VACANCY__IN_VACANCY_STATE, oldInVacancyState, inVacancyState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtractedMMPackage.SECTION_AND_VACANCY__REFERS_TO_TDS_SECTION:
			if (resolve)
				return getRefersToTdsSection();
			return basicGetRefersToTdsSection();
		case ExtractedMMPackage.SECTION_AND_VACANCY__IN_VACANCY_STATE:
			return getInVacancyState();
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
		case ExtractedMMPackage.SECTION_AND_VACANCY__REFERS_TO_TDS_SECTION:
			setRefersToTdsSection((TdsSection) newValue);
			return;
		case ExtractedMMPackage.SECTION_AND_VACANCY__IN_VACANCY_STATE:
			setInVacancyState((SectionVacancyTypes) newValue);
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
		case ExtractedMMPackage.SECTION_AND_VACANCY__REFERS_TO_TDS_SECTION:
			setRefersToTdsSection((TdsSection) null);
			return;
		case ExtractedMMPackage.SECTION_AND_VACANCY__IN_VACANCY_STATE:
			setInVacancyState(IN_VACANCY_STATE_EDEFAULT);
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
		case ExtractedMMPackage.SECTION_AND_VACANCY__REFERS_TO_TDS_SECTION:
			return refersToTdsSection != null;
		case ExtractedMMPackage.SECTION_AND_VACANCY__IN_VACANCY_STATE:
			return inVacancyState != IN_VACANCY_STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (inVacancyState: ");
		result.append(inVacancyState);
		result.append(')');
		return result.toString();
	}

} //SectionAndVacancyImpl
