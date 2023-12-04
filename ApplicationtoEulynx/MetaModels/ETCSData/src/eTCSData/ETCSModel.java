/**
 */
package eTCSData;

import extractedMM.DocumentRoot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETCS Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eTCSData.ETCSModel#getTrains <em>Trains</em>}</li>
 *   <li>{@link eTCSData.ETCSModel#getEulynxModel <em>Eulynx Model</em>}</li>
 *   <li>{@link eTCSData.ETCSModel#getSupervisionOfTrain <em>Supervision Of Train</em>}</li>
 * </ul>
 *
 * @see eTCSData.ETCSDataPackage#getETCSModel()
 * @model annotation="meeduse generated='' constant='null'"
 * @generated
 */
public interface ETCSModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Trains</b></em>' containment reference list.
	 * The list contents are of type {@link eTCSData.Train}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trains</em>' containment reference list.
	 * @see eTCSData.ETCSDataPackage#getETCSModel_Trains()
	 * @model containment="true"
	 *        annotation="meeduse generated='' association='ListOfTrains'"
	 * @generated
	 */
	EList<Train> getTrains();

	/**
	 * Returns the value of the '<em><b>Eulynx Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eulynx Model</em>' reference.
	 * @see #setEulynxModel(DocumentRoot)
	 * @see eTCSData.ETCSDataPackage#getETCSModel_EulynxModel()
	 * @model annotation="meeduse generated='null' association='EulynxModels'"
	 * @generated
	 */
	DocumentRoot getEulynxModel();

	/**
	 * Sets the value of the '{@link eTCSData.ETCSModel#getEulynxModel <em>Eulynx Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eulynx Model</em>' reference.
	 * @see #getEulynxModel()
	 * @generated
	 */
	void setEulynxModel(DocumentRoot value);

	/**
	 * Returns the value of the '<em><b>Supervision Of Train</b></em>' attribute.
	 * The literals are from the enumeration {@link eTCSData.SupervisionStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervision Of Train</em>' attribute.
	 * @see eTCSData.SupervisionStatus
	 * @see #setSupervisionOfTrain(SupervisionStatus)
	 * @see eTCSData.ETCSDataPackage#getETCSModel_SupervisionOfTrain()
	 * @model annotation="meeduse generated='null'"
	 * @generated
	 */
	SupervisionStatus getSupervisionOfTrain();

	/**
	 * Sets the value of the '{@link eTCSData.ETCSModel#getSupervisionOfTrain <em>Supervision Of Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervision Of Train</em>' attribute.
	 * @see eTCSData.SupervisionStatus
	 * @see #getSupervisionOfTrain()
	 * @generated
	 */
	void setSupervisionOfTrain(SupervisionStatus value);

} // ETCSModel
