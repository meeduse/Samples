/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.Route#getAppliesToRouteBody <em>Applies To Route Body</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getRoute()
 * @model abstract="true"
 *        annotation="meeduse generated='NOT'"
 * @generated
 */
public interface Route extends ConfiguredBaseObject {
	/**
	 * Returns the value of the '<em><b>Applies To Route Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Route Body</em>' reference.
	 * @see #setAppliesToRouteBody(RouteBody)
	 * @see extractedMM.ExtractedMMPackage#getRoute_AppliesToRouteBody()
	 * @model required="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	RouteBody getAppliesToRouteBody();

	/**
	 * Sets the value of the '{@link extractedMM.Route#getAppliesToRouteBody <em>Applies To Route Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To Route Body</em>' reference.
	 * @see #getAppliesToRouteBody()
	 * @generated
	 */
	void setAppliesToRouteBody(RouteBody value);

} // Route
