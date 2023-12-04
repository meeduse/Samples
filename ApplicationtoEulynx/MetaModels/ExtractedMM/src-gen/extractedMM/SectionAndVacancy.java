/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section And Vacancy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.SectionAndVacancy#getRefersToTdsSection <em>Refers To Tds Section</em>}</li>
 *   <li>{@link extractedMM.SectionAndVacancy#getInVacancyState <em>In Vacancy State</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getSectionAndVacancy()
 * @model annotation="meeduse generated='' constant='null'"
 * @generated
 */
public interface SectionAndVacancy extends AssetAndState {
	/**
	 * Returns the value of the '<em><b>Refers To Tds Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To Tds Section</em>' reference.
	 * @see #setRefersToTdsSection(TdsSection)
	 * @see extractedMM.ExtractedMMPackage#getSectionAndVacancy_RefersToTdsSection()
	 * @model required="true"
	 *        annotation="meeduse generated='' constant='null'"
	 * @generated
	 */
	TdsSection getRefersToTdsSection();

	/**
	 * Sets the value of the '{@link extractedMM.SectionAndVacancy#getRefersToTdsSection <em>Refers To Tds Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To Tds Section</em>' reference.
	 * @see #getRefersToTdsSection()
	 * @generated
	 */
	void setRefersToTdsSection(TdsSection value);

	/**
	 * Returns the value of the '<em><b>In Vacancy State</b></em>' attribute.
	 * The literals are from the enumeration {@link extractedMM.SectionVacancyTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Vacancy State</em>' attribute.
	 * @see extractedMM.SectionVacancyTypes
	 * @see #setInVacancyState(SectionVacancyTypes)
	 * @see extractedMM.ExtractedMMPackage#getSectionAndVacancy_InVacancyState()
	 * @model annotation="meeduse generated=''"
	 * @generated
	 */
	SectionVacancyTypes getInVacancyState();

	/**
	 * Sets the value of the '{@link extractedMM.SectionAndVacancy#getInVacancyState <em>In Vacancy State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Vacancy State</em>' attribute.
	 * @see extractedMM.SectionVacancyTypes
	 * @see #getInVacancyState()
	 * @generated
	 */
	void setInVacancyState(SectionVacancyTypes value);

} // SectionAndVacancy
