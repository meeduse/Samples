/**
 */
package extractedMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Associated Net Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.AssociatedNetElement#getNetElement <em>Net Element</em>}</li>
 *   <li>{@link extractedMM.AssociatedNetElement#getAppliesInDirection <em>Applies In Direction</em>}</li>
 *   <li>{@link extractedMM.AssociatedNetElement#getHasLateralPosition <em>Has Lateral Position</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getAssociatedNetElement()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface AssociatedNetElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Net Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Element</em>' reference.
	 * @see #setNetElement(PositioningNetElement)
	 * @see extractedMM.ExtractedMMPackage#getAssociatedNetElement_NetElement()
	 * @model required="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	PositioningNetElement getNetElement();

	/**
	 * Sets the value of the '{@link extractedMM.AssociatedNetElement#getNetElement <em>Net Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Element</em>' reference.
	 * @see #getNetElement()
	 * @generated
	 */
	void setNetElement(PositioningNetElement value);

	/**
	 * Returns the value of the '<em><b>Applies In Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link extractedMM.ApplicationDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies In Direction</em>' attribute.
	 * @see extractedMM.ApplicationDirection
	 * @see #setAppliesInDirection(ApplicationDirection)
	 * @see extractedMM.ExtractedMMPackage#getAssociatedNetElement_AppliesInDirection()
	 * @model annotation="meeduse generated='NOT'"
	 * @generated
	 */
	ApplicationDirection getAppliesInDirection();

	/**
	 * Sets the value of the '{@link extractedMM.AssociatedNetElement#getAppliesInDirection <em>Applies In Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies In Direction</em>' attribute.
	 * @see extractedMM.ApplicationDirection
	 * @see #getAppliesInDirection()
	 * @generated
	 */
	void setAppliesInDirection(ApplicationDirection value);

	/**
	 * Returns the value of the '<em><b>Has Lateral Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Lateral Position</em>' containment reference.
	 * @see #setHasLateralPosition(LateralPosition)
	 * @see extractedMM.ExtractedMMPackage#getAssociatedNetElement_HasLateralPosition()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	LateralPosition getHasLateralPosition();

	/**
	 * Sets the value of the '{@link extractedMM.AssociatedNetElement#getHasLateralPosition <em>Has Lateral Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Lateral Position</em>' containment reference.
	 * @see #getHasLateralPosition()
	 * @generated
	 */
	void setHasLateralPosition(LateralPosition value);

} // AssociatedNetElement
