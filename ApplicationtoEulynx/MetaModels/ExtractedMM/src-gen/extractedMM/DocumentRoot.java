/**
 */
package extractedMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.DocumentRoot#getDataPrepEntities <em>Data Prep Entities</em>}</li>
 *   <li>{@link extractedMM.DocumentRoot#getRsmEntities <em>Rsm Entities</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getDocumentRoot()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Prep Entities</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.DataPrepEntities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Prep Entities</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getDocumentRoot_DataPrepEntities()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<DataPrepEntities> getDataPrepEntities();

	/**
	 * Returns the value of the '<em><b>Rsm Entities</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.RsmEntities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rsm Entities</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getDocumentRoot_RsmEntities()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<RsmEntities> getRsmEntities();

} // DocumentRoot
