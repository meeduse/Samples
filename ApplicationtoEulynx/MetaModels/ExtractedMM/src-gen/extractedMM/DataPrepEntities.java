/**
 */
package extractedMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Prep Entities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.DataPrepEntities#getOwnsEtcsEndOfAuthority <em>Owns Etcs End Of Authority</em>}</li>
 *   <li>{@link extractedMM.DataPrepEntities#getOwnsEtcsMaSection <em>Owns Etcs Ma Section</em>}</li>
 *   <li>{@link extractedMM.DataPrepEntities#getOwnsEtcsSignalProperties <em>Owns Etcs Signal Properties</em>}</li>
 *   <li>{@link extractedMM.DataPrepEntities#getOwnsRouteBodyProperty <em>Owns Route Body Property</em>}</li>
 *   <li>{@link extractedMM.DataPrepEntities#getOwnsRouteBody <em>Owns Route Body</em>}</li>
 *   <li>{@link extractedMM.DataPrepEntities#getOwnsRoute <em>Owns Route</em>}</li>
 *   <li>{@link extractedMM.DataPrepEntities#getOwnsTrackAsset <em>Owns Track Asset</em>}</li>
 *   <li>{@link extractedMM.DataPrepEntities#getKnowsAssetAndState <em>Knows Asset And State</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getDataPrepEntities()
 * @model annotation="meeduse generated='NOT'"
 * @generated
 */
public interface DataPrepEntities extends BaseObjectRSM {
	/**
	 * Returns the value of the '<em><b>Owns Etcs End Of Authority</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.EtcsEndOfAuthority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Etcs End Of Authority</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getDataPrepEntities_OwnsEtcsEndOfAuthority()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<EtcsEndOfAuthority> getOwnsEtcsEndOfAuthority();

	/**
	 * Returns the value of the '<em><b>Owns Etcs Ma Section</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.EtcsMaSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Etcs Ma Section</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getDataPrepEntities_OwnsEtcsMaSection()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<EtcsMaSection> getOwnsEtcsMaSection();

	/**
	 * Returns the value of the '<em><b>Owns Etcs Signal Properties</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.EtcsSignalProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Etcs Signal Properties</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getDataPrepEntities_OwnsEtcsSignalProperties()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<EtcsSignalProperties> getOwnsEtcsSignalProperties();

	/**
	 * Returns the value of the '<em><b>Owns Route Body Property</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.RouteBodyProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Route Body Property</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getDataPrepEntities_OwnsRouteBodyProperty()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<RouteBodyProperty> getOwnsRouteBodyProperty();

	/**
	 * Returns the value of the '<em><b>Owns Route Body</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.RouteBody}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Route Body</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getDataPrepEntities_OwnsRouteBody()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<RouteBody> getOwnsRouteBody();

	/**
	 * Returns the value of the '<em><b>Owns Route</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Route</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getDataPrepEntities_OwnsRoute()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<Route> getOwnsRoute();

	/**
	 * Returns the value of the '<em><b>Owns Track Asset</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.TrackAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Track Asset</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getDataPrepEntities_OwnsTrackAsset()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<TrackAsset> getOwnsTrackAsset();

	/**
	 * Returns the value of the '<em><b>Knows Asset And State</b></em>' containment reference list.
	 * The list contents are of type {@link extractedMM.AssetAndState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knows Asset And State</em>' containment reference list.
	 * @see extractedMM.ExtractedMMPackage#getDataPrepEntities_KnowsAssetAndState()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<AssetAndState> getKnowsAssetAndState();

} // DataPrepEntities
