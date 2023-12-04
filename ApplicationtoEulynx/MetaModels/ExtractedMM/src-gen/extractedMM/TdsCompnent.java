/**
 */
package extractedMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tds Compnent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.TdsCompnent#getLimitsTdsSection <em>Limits Tds Section</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getTdsCompnent()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface TdsCompnent extends VehiclePassageDetector {
	/**
	 * Returns the value of the '<em><b>Limits Tds Section</b></em>' reference list.
	 * The list contents are of type {@link extractedMM.TdsSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limits Tds Section</em>' reference list.
	 * @see extractedMM.ExtractedMMPackage#getTdsCompnent_LimitsTdsSection()
	 * @model annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<TdsSection> getLimitsTdsSection();

} // TdsCompnent
