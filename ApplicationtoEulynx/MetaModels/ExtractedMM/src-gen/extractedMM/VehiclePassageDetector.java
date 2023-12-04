/**
 */
package extractedMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Passage Detector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.VehiclePassageDetector#getOccupiesTdsSection <em>Occupies Tds Section</em>}</li>
 * </ul>
 *
 * @see extractedMM.ExtractedMMPackage#getVehiclePassageDetector()
 * @model abstract="true"
 *        annotation="meeduse generated='NOT'"
 * @generated
 */
public interface VehiclePassageDetector extends PhysicalTrackAsset {

	/**
	 * Returns the value of the '<em><b>Occupies Tds Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupies Tds Section</em>' reference.
	 * @see #setOccupiesTdsSection(TdsSection)
	 * @see extractedMM.ExtractedMMPackage#getVehiclePassageDetector_OccupiesTdsSection()
	 * @model
	 * @generated
	 */
	TdsSection getOccupiesTdsSection();

	/**
	 * Sets the value of the '{@link extractedMM.VehiclePassageDetector#getOccupiesTdsSection <em>Occupies Tds Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupies Tds Section</em>' reference.
	 * @see #getOccupiesTdsSection()
	 * @generated
	 */
	void setOccupiesTdsSection(TdsSection value);
} // VehiclePassageDetector
