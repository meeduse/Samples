/**
 */
package eTCSData;

import extractedMM.VirtualSubSection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eTCSData.Train#getId <em>Id</em>}</li>
 *   <li>{@link eTCSData.Train#getOccupyFront <em>Occupy Front</em>}</li>
 *   <li>{@link eTCSData.Train#getOccupyRear <em>Occupy Rear</em>}</li>
 *   <li>{@link eTCSData.Train#getLocationRear <em>Location Rear</em>}</li>
 *   <li>{@link eTCSData.Train#getLocationFront <em>Location Front</em>}</li>
 *   <li>{@link eTCSData.Train#getFrontMA <em>Front MA</em>}</li>
 *   <li>{@link eTCSData.Train#getRearMA <em>Rear MA</em>}</li>
 *   <li>{@link eTCSData.Train#isTrainConnected <em>Train Connected</em>}</li>
 *   <li>{@link eTCSData.Train#isTrainReConnected <em>Train Re Connected</em>}</li>
 *   <li>{@link eTCSData.Train#getKindOfTrain <em>Kind Of Train</em>}</li>
 * </ul>
 *
 * @see eTCSData.ETCSDataPackage#getTrain()
 * @model annotation="meeduse generated='' constant='null'"
 * @generated
 */
public interface Train extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see eTCSData.ETCSDataPackage#getTrain_Id()
	 * @model annotation="meeduse generated='NOT'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link eTCSData.Train#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Occupy Front</b></em>' reference list.
	 * The list contents are of type {@link extractedMM.VirtualSubSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupy Front</em>' reference list.
	 * @see eTCSData.ETCSDataPackage#getTrain_OccupyFront()
	 * @model annotation="meeduse generated='null' association='TrainFront'"
	 * @generated
	 */
	EList<VirtualSubSection> getOccupyFront();

	/**
	 * Returns the value of the '<em><b>Occupy Rear</b></em>' reference list.
	 * The list contents are of type {@link extractedMM.VirtualSubSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupy Rear</em>' reference list.
	 * @see eTCSData.ETCSDataPackage#getTrain_OccupyRear()
	 * @model annotation="meeduse generated='null' association='TrainRear'"
	 * @generated
	 */
	EList<VirtualSubSection> getOccupyRear();

	/**
	 * Returns the value of the '<em><b>Location Rear</b></em>' reference list.
	 * The list contents are of type {@link extractedMM.VirtualSubSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Rear</em>' reference list.
	 * @see eTCSData.ETCSDataPackage#getTrain_LocationRear()
	 * @model annotation="meeduse generated='null' association='TrainRearLocation'"
	 * @generated
	 */
	EList<VirtualSubSection> getLocationRear();

	/**
	 * Returns the value of the '<em><b>Location Front</b></em>' reference list.
	 * The list contents are of type {@link extractedMM.VirtualSubSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Front</em>' reference list.
	 * @see eTCSData.ETCSDataPackage#getTrain_LocationFront()
	 * @model annotation="meeduse generated='null' association='TrainFrontLocation'"
	 * @generated
	 */
	EList<VirtualSubSection> getLocationFront();

	/**
	 * Returns the value of the '<em><b>Front MA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front MA</em>' reference.
	 * @see #setFrontMA(VirtualSubSection)
	 * @see eTCSData.ETCSDataPackage#getTrain_FrontMA()
	 * @model annotation="meeduse generated='null' association='frontMA'"
	 * @generated
	 */
	VirtualSubSection getFrontMA();

	/**
	 * Sets the value of the '{@link eTCSData.Train#getFrontMA <em>Front MA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front MA</em>' reference.
	 * @see #getFrontMA()
	 * @generated
	 */
	void setFrontMA(VirtualSubSection value);

	/**
	 * Returns the value of the '<em><b>Rear MA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rear MA</em>' reference.
	 * @see #setRearMA(VirtualSubSection)
	 * @see eTCSData.ETCSDataPackage#getTrain_RearMA()
	 * @model annotation="meeduse generated='null' association='rearMA'"
	 * @generated
	 */
	VirtualSubSection getRearMA();

	/**
	 * Sets the value of the '{@link eTCSData.Train#getRearMA <em>Rear MA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rear MA</em>' reference.
	 * @see #getRearMA()
	 * @generated
	 */
	void setRearMA(VirtualSubSection value);

	/**
	 * Returns the value of the '<em><b>Train Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Connected</em>' attribute.
	 * @see #setTrainConnected(boolean)
	 * @see eTCSData.ETCSDataPackage#getTrain_TrainConnected()
	 * @model dataType="types.Boolean"
	 *        annotation="meeduse generated='null'"
	 * @generated
	 */
	boolean isTrainConnected();

	/**
	 * Sets the value of the '{@link eTCSData.Train#isTrainConnected <em>Train Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Connected</em>' attribute.
	 * @see #isTrainConnected()
	 * @generated
	 */
	void setTrainConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Train Re Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Re Connected</em>' attribute.
	 * @see #setTrainReConnected(boolean)
	 * @see eTCSData.ETCSDataPackage#getTrain_TrainReConnected()
	 * @model dataType="types.Boolean"
	 *        annotation="meeduse generated='null'"
	 * @generated
	 */
	boolean isTrainReConnected();

	/**
	 * Sets the value of the '{@link eTCSData.Train#isTrainReConnected <em>Train Re Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Re Connected</em>' attribute.
	 * @see #isTrainReConnected()
	 * @generated
	 */
	void setTrainReConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Kind Of Train</b></em>' attribute.
	 * The literals are from the enumeration {@link eTCSData.KindOfTrains}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Of Train</em>' attribute.
	 * @see eTCSData.KindOfTrains
	 * @see #setKindOfTrain(KindOfTrains)
	 * @see eTCSData.ETCSDataPackage#getTrain_KindOfTrain()
	 * @model annotation="meeduse generated='null' constant='null'"
	 * @generated
	 */
	KindOfTrains getKindOfTrain();

	/**
	 * Sets the value of the '{@link eTCSData.Train#getKindOfTrain <em>Kind Of Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Of Train</em>' attribute.
	 * @see eTCSData.KindOfTrains
	 * @see #getKindOfTrain()
	 * @generated
	 */
	void setKindOfTrain(KindOfTrains value);

} // Train
