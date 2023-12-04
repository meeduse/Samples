/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rsm Entities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.RsmEntities#getUsesEtcsTopology <em>Uses Etcs Topology</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getRsmEntities()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface RsmEntities extends BaseObjectRSM {
	/**
	 * Returns the value of the '<em><b>Uses Etcs Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Etcs Topology</em>' containment reference.
	 * @see #setUsesEtcsTopology(Topology)
	 * @see extractedMM.ExtractedMMPackage#getRsmEntities_UsesEtcsTopology()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	Topology getUsesEtcsTopology();

	/**
	 * Sets the value of the '{@link extractedMM.RsmEntities#getUsesEtcsTopology <em>Uses Etcs Topology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Etcs Topology</em>' containment reference.
	 * @see #getUsesEtcsTopology()
	 * @generated
	 */
	void setUsesEtcsTopology(Topology value);

} // RsmEntities
