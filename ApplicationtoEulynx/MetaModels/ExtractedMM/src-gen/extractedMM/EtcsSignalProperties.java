/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etcs Signal Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.EtcsSignalProperties#getRefersToEoA <em>Refers To Eo A</em>}</li>
 *   <li>{@link extractedMM.EtcsSignalProperties#getAppliesToSignal <em>Applies To Signal</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getEtcsSignalProperties()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface EtcsSignalProperties extends BaseObjectEULYNX {
	/**
	 * Returns the value of the '<em><b>Refers To Eo A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To Eo A</em>' reference.
	 * @see #setRefersToEoA(EtcsEndOfAuthority)
	 * @see extractedMM.ExtractedMMPackage#getEtcsSignalProperties_RefersToEoA()
	 * @model annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EtcsEndOfAuthority getRefersToEoA();

	/**
	 * Sets the value of the '{@link extractedMM.EtcsSignalProperties#getRefersToEoA <em>Refers To Eo A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To Eo A</em>' reference.
	 * @see #getRefersToEoA()
	 * @generated
	 */
	void setRefersToEoA(EtcsEndOfAuthority value);

	/**
	 * Returns the value of the '<em><b>Applies To Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Signal</em>' reference.
	 * @see #setAppliesToSignal(Signal)
	 * @see extractedMM.ExtractedMMPackage#getEtcsSignalProperties_AppliesToSignal()
	 * @model required="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	Signal getAppliesToSignal();

	/**
	 * Sets the value of the '{@link extractedMM.EtcsSignalProperties#getAppliesToSignal <em>Applies To Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To Signal</em>' reference.
	 * @see #getAppliesToSignal()
	 * @generated
	 */
	void setAppliesToSignal(Signal value);

} // EtcsSignalProperties
