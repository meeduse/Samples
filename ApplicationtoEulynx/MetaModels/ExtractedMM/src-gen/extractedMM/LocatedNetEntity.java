/**
 */
package extractedMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Located Net Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.LocatedNetEntity#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getLocatedNetEntity()
 * @model abstract="true"
 *        annotation="meeduse generated='NOT'"
 * @generated
 */
public interface LocatedNetEntity extends NetEntity {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.BaseLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getLocatedNetEntity_Locations()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<BaseLocation> getLocations();

} // LocatedNetEntity
