/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.RouteBody#getHasEntry <em>Has Entry</em>}</li>
 *   <li>{@link extractedMM.RouteBody#getHasExit <em>Has Exit</em>}</li>
 *   <li>{@link extractedMM.RouteBody#getRefersToRsmRoutBody <em>Refers To Rsm Rout Body</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getRouteBody()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface RouteBody extends ConfiguredBaseObject {
	/**
	 * Returns the value of the '<em><b>Has Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Entry</em>' containment reference.
	 * @see #setHasEntry(RouteEntry)
	 * @see extractedMM.ExtractedMMPackage#getRouteBody_HasEntry()
	 * @model containment="true" required="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	RouteEntry getHasEntry();

	/**
	 * Sets the value of the '{@link extractedMM.RouteBody#getHasEntry <em>Has Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Entry</em>' containment reference.
	 * @see #getHasEntry()
	 * @generated
	 */
	void setHasEntry(RouteEntry value);

	/**
	 * Returns the value of the '<em><b>Has Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Exit</em>' containment reference.
	 * @see #setHasExit(RouteExit)
	 * @see extractedMM.ExtractedMMPackage#getRouteBody_HasExit()
	 * @model containment="true" required="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	RouteExit getHasExit();

	/**
	 * Sets the value of the '{@link extractedMM.RouteBody#getHasExit <em>Has Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Exit</em>' containment reference.
	 * @see #getHasExit()
	 * @generated
	 */
	void setHasExit(RouteExit value);

	/**
	 * Returns the value of the '<em><b>Refers To Rsm Rout Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To Rsm Rout Body</em>' reference.
	 * @see #setRefersToRsmRoutBody(RouteBodyRSM)
	 * @see extractedMM.ExtractedMMPackage#getRouteBody_RefersToRsmRoutBody()
	 * @model required="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	RouteBodyRSM getRefersToRsmRoutBody();

	/**
	 * Sets the value of the '{@link extractedMM.RouteBody#getRefersToRsmRoutBody <em>Refers To Rsm Rout Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To Rsm Rout Body</em>' reference.
	 * @see #getRefersToRsmRoutBody()
	 * @generated
	 */
	void setRefersToRsmRoutBody(RouteBodyRSM value);

} // RouteBody
