/**
 */
package extractedMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.SectionList#getHasSection <em>Has Section</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getSectionList()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface SectionList extends RouteBodyProperty {
	/**
	 * Returns the value of the '<em><b>Has Section</b></em>' reference list.
	 * The list contents are of type {@link extractedMM.TvpSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Section</em>' reference list.
	 * @see extractedMM.ExtractedMMPackage#getSectionList_HasSection()
	 * @model required="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<TvpSection> getHasSection();

} // SectionList
