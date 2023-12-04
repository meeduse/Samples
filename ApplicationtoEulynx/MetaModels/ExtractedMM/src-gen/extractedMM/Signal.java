/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.Signal#getRefersToRsmSignal <em>Refers To Rsm Signal</em>}</li>
 *   <li>{@link extractedMM.Signal#getHasGroupMainSignal <em>Has Group Main Signal</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getSignal()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface Signal extends TrackAsset {
	/**
	 * Returns the value of the '<em><b>Refers To Rsm Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To Rsm Signal</em>' reference.
	 * @see #setRefersToRsmSignal(SignalRSM)
	 * @see extractedMM.ExtractedMMPackage#getSignal_RefersToRsmSignal()
	 * @model required="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	SignalRSM getRefersToRsmSignal();

	/**
	 * Sets the value of the '{@link extractedMM.Signal#getRefersToRsmSignal <em>Refers To Rsm Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To Rsm Signal</em>' reference.
	 * @see #getRefersToRsmSignal()
	 * @generated
	 */
	void setRefersToRsmSignal(SignalRSM value);

	/**
	 * Returns the value of the '<em><b>Has Group Main Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Group Main Signal</em>' reference.
	 * @see #setHasGroupMainSignal(RouteEntry)
	 * @see extractedMM.ExtractedMMPackage#getSignal_HasGroupMainSignal()
	 * @model annotation="meeduse generated='NOT'"
	 * @generated
	 */
	RouteEntry getHasGroupMainSignal();

	/**
	 * Sets the value of the '{@link extractedMM.Signal#getHasGroupMainSignal <em>Has Group Main Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Group Main Signal</em>' reference.
	 * @see #getHasGroupMainSignal()
	 * @generated
	 */
	void setHasGroupMainSignal(RouteEntry value);

} // Signal
