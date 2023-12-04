/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etcs Ma Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.EtcsMaSection#getHasSectionEntryLocation <em>Has Section Entry Location</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getEtcsMaSection()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface EtcsMaSection extends ConfiguredBaseObject {
	/**
	 * Returns the value of the '<em><b>Has Section Entry Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Section Entry Location</em>' reference.
	 * @see #setHasSectionEntryLocation(SpotLocation)
	 * @see extractedMM.ExtractedMMPackage#getEtcsMaSection_HasSectionEntryLocation()
	 * @model required="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	SpotLocation getHasSectionEntryLocation();

	/**
	 * Sets the value of the '{@link extractedMM.EtcsMaSection#getHasSectionEntryLocation <em>Has Section Entry Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Section Entry Location</em>' reference.
	 * @see #getHasSectionEntryLocation()
	 * @generated
	 */
	void setHasSectionEntryLocation(SpotLocation value);

} // EtcsMaSection
