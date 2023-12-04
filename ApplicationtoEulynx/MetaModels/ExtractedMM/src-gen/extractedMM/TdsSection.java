/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tds Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.TdsSection#getAppliesToTvpsection <em>Applies To Tvpsection</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getTdsSection()
 * @model annotation="meeduse generated='' constant='null'"
 * @generated
 */
public interface TdsSection extends VirtualTrackAsset {
	/**
	 * Returns the value of the '<em><b>Applies To Tvpsection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Tvpsection</em>' reference.
	 * @see #setAppliesToTvpsection(TvpSection)
	 * @see extractedMM.ExtractedMMPackage#getTdsSection_AppliesToTvpsection()
	 * @model required="true"
	 *        annotation="meeduse generated='' constant='null'"
	 * @generated
	 */
	TvpSection getAppliesToTvpsection();

	/**
	 * Sets the value of the '{@link extractedMM.TdsSection#getAppliesToTvpsection <em>Applies To Tvpsection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To Tvpsection</em>' reference.
	 * @see #getAppliesToTvpsection()
	 * @generated
	 */
	void setAppliesToTvpsection(TvpSection value);

} // TdsSection
