/**
 */
package extractedMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spot Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.SpotLocation#getAssociatedNetElements <em>Associated Net Elements</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getSpotLocation()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface SpotLocation extends BaseLocation {
	/**
	 * Returns the value of the '<em><b>Associated Net Elements</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.AssociatedNetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Net Elements</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getSpotLocation_AssociatedNetElements()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<AssociatedNetElement> getAssociatedNetElements();

} // SpotLocation
