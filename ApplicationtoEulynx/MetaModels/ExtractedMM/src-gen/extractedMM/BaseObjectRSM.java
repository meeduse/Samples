/**
 */
package extractedMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Object RSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.BaseObjectRSM#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getBaseObjectRSM()
 * @model abstract="true"
 *        annotation="meeduse generated='NOT'"
 * @generated
 */
public interface BaseObjectRSM extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see extractedMM.ExtractedMMPackage#getBaseObjectRSM_Id()
	 * @model annotation="meeduse generated='' constant='null'"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link extractedMM.BaseObjectRSM#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // BaseObjectRSM
