/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positioned Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.PositionedRelation#getNavigibility <em>Navigibility</em>}</li>
 *   <li>{@link extractedMM.PositionedRelation#getPositionOnA <em>Position On A</em>}</li>
 *   <li>{@link extractedMM.PositionedRelation#getPositionOnB <em>Position On B</em>}</li>
 *   <li>{@link extractedMM.PositionedRelation#getLeadsTowards <em>Leads Towards</em>}</li>
 *   <li>{@link extractedMM.PositionedRelation#getElementA <em>Element A</em>}</li>
 *   <li>{@link extractedMM.PositionedRelation#getElementB <em>Element B</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getPositionedRelation()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface PositionedRelation extends Relation {
	/**
	 * Returns the value of the '<em><b>Navigibility</b></em>' attribute.
	 * The literals are from the enumeration {@link extractedMM.Navigability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigibility</em>' attribute.
	 * @see extractedMM.Navigability
	 * @see #setNavigibility(Navigability)
	 * @see extractedMM.ExtractedMMPackage#getPositionedRelation_Navigibility()
	 * @model annotation="meeduse generated='NOT'"
	 * @generated
	 */
	Navigability getNavigibility();

	/**
	 * Sets the value of the '{@link extractedMM.PositionedRelation#getNavigibility <em>Navigibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigibility</em>' attribute.
	 * @see extractedMM.Navigability
	 * @see #getNavigibility()
	 * @generated
	 */
	void setNavigibility(Navigability value);

	/**
	 * Returns the value of the '<em><b>Position On A</b></em>' attribute.
	 * The literals are from the enumeration {@link extractedMM.Usage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position On A</em>' attribute.
	 * @see extractedMM.Usage
	 * @see #setPositionOnA(Usage)
	 * @see extractedMM.ExtractedMMPackage#getPositionedRelation_PositionOnA()
	 * @model annotation="meeduse generated='NOT'"
	 * @generated
	 */
	Usage getPositionOnA();

	/**
	 * Sets the value of the '{@link extractedMM.PositionedRelation#getPositionOnA <em>Position On A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position On A</em>' attribute.
	 * @see extractedMM.Usage
	 * @see #getPositionOnA()
	 * @generated
	 */
	void setPositionOnA(Usage value);

	/**
	 * Returns the value of the '<em><b>Position On B</b></em>' attribute.
	 * The literals are from the enumeration {@link extractedMM.Usage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position On B</em>' attribute.
	 * @see extractedMM.Usage
	 * @see #setPositionOnB(Usage)
	 * @see extractedMM.ExtractedMMPackage#getPositionedRelation_PositionOnB()
	 * @model annotation="meeduse generated='NOT'"
	 * @generated
	 */
	Usage getPositionOnB();

	/**
	 * Sets the value of the '{@link extractedMM.PositionedRelation#getPositionOnB <em>Position On B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position On B</em>' attribute.
	 * @see extractedMM.Usage
	 * @see #getPositionOnB()
	 * @generated
	 */
	void setPositionOnB(Usage value);

	/**
	 * Returns the value of the '<em><b>Leads Towards</b></em>' attribute.
	 * The literals are from the enumeration {@link extractedMM.LeftRight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leads Towards</em>' attribute.
	 * @see extractedMM.LeftRight
	 * @see #setLeadsTowards(LeftRight)
	 * @see extractedMM.ExtractedMMPackage#getPositionedRelation_LeadsTowards()
	 * @model annotation="meeduse generated='NOT'"
	 * @generated
	 */
	LeftRight getLeadsTowards();

	/**
	 * Sets the value of the '{@link extractedMM.PositionedRelation#getLeadsTowards <em>Leads Towards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leads Towards</em>' attribute.
	 * @see extractedMM.LeftRight
	 * @see #getLeadsTowards()
	 * @generated
	 */
	void setLeadsTowards(LeftRight value);

	/**
	 * Returns the value of the '<em><b>Element A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element A</em>' reference.
	 * @see #setElementA(PositioningNetElement)
	 * @see extractedMM.ExtractedMMPackage#getPositionedRelation_ElementA()
	 * @model required="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	PositioningNetElement getElementA();

	/**
	 * Sets the value of the '{@link extractedMM.PositionedRelation#getElementA <em>Element A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element A</em>' reference.
	 * @see #getElementA()
	 * @generated
	 */
	void setElementA(PositioningNetElement value);

	/**
	 * Returns the value of the '<em><b>Element B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element B</em>' reference.
	 * @see #setElementB(PositioningNetElement)
	 * @see extractedMM.ExtractedMMPackage#getPositionedRelation_ElementB()
	 * @model required="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	PositioningNetElement getElementB();

	/**
	 * Sets the value of the '{@link extractedMM.PositionedRelation#getElementB <em>Element B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element B</em>' reference.
	 * @see #getElementB()
	 * @generated
	 */
	void setElementB(PositioningNetElement value);

} // PositionedRelation
