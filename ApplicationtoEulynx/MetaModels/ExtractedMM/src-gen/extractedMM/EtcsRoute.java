/**
 */
package extractedMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etcs Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.EtcsRoute#getHasMaSection <em>Has Ma Section</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getEtcsRoute()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface EtcsRoute extends Route {
	/**
	 * Returns the value of the '<em><b>Has Ma Section</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.EtcsMaSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Ma Section</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getEtcsRoute_HasMaSection()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<EtcsMaSection> getHasMaSection();

} // EtcsRoute
