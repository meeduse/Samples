/**
 */
package extractedMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.Topology#getUsesPositionedRelation <em>Uses Positioned Relation</em>}</li>
 *   <li>{@link extractedMM.Topology#getUsesNetElement <em>Uses Net Element</em>}</li>
 *   <li>{@link extractedMM.Topology#getUsesLocation <em>Uses Location</em>}</li>
 *   <li>{@link extractedMM.Topology#getOwnsSignalRSM <em>Owns Signal RSM</em>}</li>
 *   <li>{@link extractedMM.Topology#getOwnsRouteBodyRSM <em>Owns Route Body RSM</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getTopology()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface Topology extends EObject {
	/**
	 * Returns the value of the '<em><b>Uses Positioned Relation</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.PositionedRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Positioned Relation</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getTopology_UsesPositionedRelation()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<PositionedRelation> getUsesPositionedRelation();

	/**
	 * Returns the value of the '<em><b>Uses Net Element</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.PositioningNetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Net Element</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getTopology_UsesNetElement()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<PositioningNetElement> getUsesNetElement();

	/**
	 * Returns the value of the '<em><b>Uses Location</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.BaseLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Location</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getTopology_UsesLocation()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<BaseLocation> getUsesLocation();

	/**
	 * Returns the value of the '<em><b>Owns Signal RSM</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.SignalRSM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Signal RSM</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getTopology_OwnsSignalRSM()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<SignalRSM> getOwnsSignalRSM();

	/**
	 * Returns the value of the '<em><b>Owns Route Body RSM</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.RouteBodyRSM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Route Body RSM</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getTopology_OwnsRouteBodyRSM()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<RouteBodyRSM> getOwnsRouteBodyRSM();

} // Topology
