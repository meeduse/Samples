/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lateral Side</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.LateralSide#getSide <em>Side</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getLateralSide()
 * @model abstract="true"
 *        annotation="meeduse generated='NOT'"
 * @generated
 */
public interface LateralSide extends LateralPosition {
	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * The literals are from the enumeration {@link extractedMM.Side}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see extractedMM.Side
	 * @see #setSide(Side)
	 * @see extractedMM.ExtractedMMPackage#getLateralSide_Side()
	 * @model annotation="meeduse generated='NOT'"
	 * @generated
	 */
	Side getSide();

	/**
	 * Sets the value of the '{@link extractedMM.LateralSide#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see extractedMM.Side
	 * @see #getSide()
	 * @generated
	 */
	void setSide(Side value);

} // LateralSide
