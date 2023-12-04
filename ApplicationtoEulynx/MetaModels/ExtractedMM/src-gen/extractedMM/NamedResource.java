/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.NamedResource#getLongname <em>Longname</em>}</li>
 *   <li>{@link extractedMM.NamedResource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getNamedResource()
 * @model abstract="true"
 *        annotation="meeduse generated='NOT'"
 * @generated
 */
public interface NamedResource extends BaseObjectRSM {
	/**
	 * Returns the value of the '<em><b>Longname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longname</em>' attribute.
	 * @see #setLongname(String)
	 * @see extractedMM.ExtractedMMPackage#getNamedResource_Longname()
	 * @model annotation="meeduse generated='NOT'"
	 * @generated
	 */
	String getLongname();

	/**
	 * Sets the value of the '{@link extractedMM.NamedResource#getLongname <em>Longname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longname</em>' attribute.
	 * @see #getLongname()
	 * @generated
	 */
	void setLongname(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see extractedMM.ExtractedMMPackage#getNamedResource_Name()
	 * @model annotation="meeduse generated='NOT'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link extractedMM.NamedResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedResource
