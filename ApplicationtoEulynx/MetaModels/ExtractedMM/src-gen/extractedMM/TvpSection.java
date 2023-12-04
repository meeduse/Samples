/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tvp Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.TvpSection#getIsLocatedAt <em>Is Located At</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getTvpSection()
 * @model annotation="meeduse generated='' constant='null'"
 * @generated
 */
public interface TvpSection extends VirtualTrackAsset {
	/**
	 * Returns the value of the '<em><b>Is Located At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Located At</em>' reference.
	 * @see #setIsLocatedAt(AreaLocation)
	 * @see extractedMM.ExtractedMMPackage#getTvpSection_IsLocatedAt()
	 * @model required="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	AreaLocation getIsLocatedAt();

	/**
	 * Sets the value of the '{@link extractedMM.TvpSection#getIsLocatedAt <em>Is Located At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Located At</em>' reference.
	 * @see #getIsLocatedAt()
	 * @generated
	 */
	void setIsLocatedAt(AreaLocation value);

} // TvpSection
