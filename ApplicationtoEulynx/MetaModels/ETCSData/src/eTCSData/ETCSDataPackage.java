/**
 */
package eTCSData;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eTCSData.ETCSDataFactory
 * @model kind="package"
 *        annotation="meeduse generated=''"
 * @generated
 */
public interface ETCSDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eTCSData";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/eTCSData";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eTCSData";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ETCSDataPackage eINSTANCE = eTCSData.impl.ETCSDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link eTCSData.impl.ETCSModelImpl <em>ETCS Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eTCSData.impl.ETCSModelImpl
	 * @see eTCSData.impl.ETCSDataPackageImpl#getETCSModel()
	 * @generated
	 */
	int ETCS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Trains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_MODEL__TRAINS = 0;

	/**
	 * The feature id for the '<em><b>Eulynx Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_MODEL__EULYNX_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Supervision Of Train</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_MODEL__SUPERVISION_OF_TRAIN = 2;

	/**
	 * The number of structural features of the '<em>ETCS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ETCS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETCS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eTCSData.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eTCSData.impl.TrainImpl
	 * @see eTCSData.impl.ETCSDataPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__ID = 0;

	/**
	 * The feature id for the '<em><b>Occupy Front</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__OCCUPY_FRONT = 1;

	/**
	 * The feature id for the '<em><b>Occupy Rear</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__OCCUPY_REAR = 2;

	/**
	 * The feature id for the '<em><b>Location Rear</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__LOCATION_REAR = 3;

	/**
	 * The feature id for the '<em><b>Location Front</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__LOCATION_FRONT = 4;

	/**
	 * The feature id for the '<em><b>Front MA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__FRONT_MA = 5;

	/**
	 * The feature id for the '<em><b>Rear MA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__REAR_MA = 6;

	/**
	 * The feature id for the '<em><b>Train Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__TRAIN_CONNECTED = 7;

	/**
	 * The feature id for the '<em><b>Train Re Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__TRAIN_RE_CONNECTED = 8;

	/**
	 * The feature id for the '<em><b>Kind Of Train</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__KIND_OF_TRAIN = 9;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link eTCSData.KindOfTrains <em>Kind Of Trains</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eTCSData.KindOfTrains
	 * @see eTCSData.impl.ETCSDataPackageImpl#getKindOfTrains()
	 * @generated
	 */
	int KIND_OF_TRAINS = 2;


	/**
	 * The meta object id for the '{@link eTCSData.SupervisionStatus <em>Supervision Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eTCSData.SupervisionStatus
	 * @see eTCSData.impl.ETCSDataPackageImpl#getSupervisionStatus()
	 * @generated
	 */
	int SUPERVISION_STATUS = 3;


	/**
	 * Returns the meta object for class '{@link eTCSData.ETCSModel <em>ETCS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETCS Model</em>'.
	 * @see eTCSData.ETCSModel
	 * @generated
	 */
	EClass getETCSModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eTCSData.ETCSModel#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see eTCSData.ETCSModel#getTrains()
	 * @see #getETCSModel()
	 * @generated
	 */
	EReference getETCSModel_Trains();

	/**
	 * Returns the meta object for the reference '{@link eTCSData.ETCSModel#getEulynxModel <em>Eulynx Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eulynx Model</em>'.
	 * @see eTCSData.ETCSModel#getEulynxModel()
	 * @see #getETCSModel()
	 * @generated
	 */
	EReference getETCSModel_EulynxModel();

	/**
	 * Returns the meta object for the attribute '{@link eTCSData.ETCSModel#getSupervisionOfTrain <em>Supervision Of Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supervision Of Train</em>'.
	 * @see eTCSData.ETCSModel#getSupervisionOfTrain()
	 * @see #getETCSModel()
	 * @generated
	 */
	EAttribute getETCSModel_SupervisionOfTrain();

	/**
	 * Returns the meta object for class '{@link eTCSData.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see eTCSData.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the attribute '{@link eTCSData.Train#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eTCSData.Train#getId()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Id();

	/**
	 * Returns the meta object for the reference list '{@link eTCSData.Train#getOccupyFront <em>Occupy Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occupy Front</em>'.
	 * @see eTCSData.Train#getOccupyFront()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_OccupyFront();

	/**
	 * Returns the meta object for the reference list '{@link eTCSData.Train#getOccupyRear <em>Occupy Rear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occupy Rear</em>'.
	 * @see eTCSData.Train#getOccupyRear()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_OccupyRear();

	/**
	 * Returns the meta object for the reference list '{@link eTCSData.Train#getLocationRear <em>Location Rear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location Rear</em>'.
	 * @see eTCSData.Train#getLocationRear()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_LocationRear();

	/**
	 * Returns the meta object for the reference list '{@link eTCSData.Train#getLocationFront <em>Location Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location Front</em>'.
	 * @see eTCSData.Train#getLocationFront()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_LocationFront();

	/**
	 * Returns the meta object for the reference '{@link eTCSData.Train#getFrontMA <em>Front MA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Front MA</em>'.
	 * @see eTCSData.Train#getFrontMA()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_FrontMA();

	/**
	 * Returns the meta object for the reference '{@link eTCSData.Train#getRearMA <em>Rear MA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rear MA</em>'.
	 * @see eTCSData.Train#getRearMA()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_RearMA();

	/**
	 * Returns the meta object for the attribute '{@link eTCSData.Train#isTrainConnected <em>Train Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Connected</em>'.
	 * @see eTCSData.Train#isTrainConnected()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_TrainConnected();

	/**
	 * Returns the meta object for the attribute '{@link eTCSData.Train#isTrainReConnected <em>Train Re Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Re Connected</em>'.
	 * @see eTCSData.Train#isTrainReConnected()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_TrainReConnected();

	/**
	 * Returns the meta object for the attribute '{@link eTCSData.Train#getKindOfTrain <em>Kind Of Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Of Train</em>'.
	 * @see eTCSData.Train#getKindOfTrain()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_KindOfTrain();

	/**
	 * Returns the meta object for enum '{@link eTCSData.KindOfTrains <em>Kind Of Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind Of Trains</em>'.
	 * @see eTCSData.KindOfTrains
	 * @generated
	 */
	EEnum getKindOfTrains();

	/**
	 * Returns the meta object for enum '{@link eTCSData.SupervisionStatus <em>Supervision Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supervision Status</em>'.
	 * @see eTCSData.SupervisionStatus
	 * @generated
	 */
	EEnum getSupervisionStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ETCSDataFactory getETCSDataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eTCSData.impl.ETCSModelImpl <em>ETCS Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eTCSData.impl.ETCSModelImpl
		 * @see eTCSData.impl.ETCSDataPackageImpl#getETCSModel()
		 * @generated
		 */
		EClass ETCS_MODEL = eINSTANCE.getETCSModel();

		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETCS_MODEL__TRAINS = eINSTANCE.getETCSModel_Trains();

		/**
		 * The meta object literal for the '<em><b>Eulynx Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETCS_MODEL__EULYNX_MODEL = eINSTANCE.getETCSModel_EulynxModel();

		/**
		 * The meta object literal for the '<em><b>Supervision Of Train</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETCS_MODEL__SUPERVISION_OF_TRAIN = eINSTANCE.getETCSModel_SupervisionOfTrain();

		/**
		 * The meta object literal for the '{@link eTCSData.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eTCSData.impl.TrainImpl
		 * @see eTCSData.impl.ETCSDataPackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__ID = eINSTANCE.getTrain_Id();

		/**
		 * The meta object literal for the '<em><b>Occupy Front</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__OCCUPY_FRONT = eINSTANCE.getTrain_OccupyFront();

		/**
		 * The meta object literal for the '<em><b>Occupy Rear</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__OCCUPY_REAR = eINSTANCE.getTrain_OccupyRear();

		/**
		 * The meta object literal for the '<em><b>Location Rear</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__LOCATION_REAR = eINSTANCE.getTrain_LocationRear();

		/**
		 * The meta object literal for the '<em><b>Location Front</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__LOCATION_FRONT = eINSTANCE.getTrain_LocationFront();

		/**
		 * The meta object literal for the '<em><b>Front MA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__FRONT_MA = eINSTANCE.getTrain_FrontMA();

		/**
		 * The meta object literal for the '<em><b>Rear MA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__REAR_MA = eINSTANCE.getTrain_RearMA();

		/**
		 * The meta object literal for the '<em><b>Train Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__TRAIN_CONNECTED = eINSTANCE.getTrain_TrainConnected();

		/**
		 * The meta object literal for the '<em><b>Train Re Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__TRAIN_RE_CONNECTED = eINSTANCE.getTrain_TrainReConnected();

		/**
		 * The meta object literal for the '<em><b>Kind Of Train</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__KIND_OF_TRAIN = eINSTANCE.getTrain_KindOfTrain();

		/**
		 * The meta object literal for the '{@link eTCSData.KindOfTrains <em>Kind Of Trains</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eTCSData.KindOfTrains
		 * @see eTCSData.impl.ETCSDataPackageImpl#getKindOfTrains()
		 * @generated
		 */
		EEnum KIND_OF_TRAINS = eINSTANCE.getKindOfTrains();

		/**
		 * The meta object literal for the '{@link eTCSData.SupervisionStatus <em>Supervision Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eTCSData.SupervisionStatus
		 * @see eTCSData.impl.ETCSDataPackageImpl#getSupervisionStatus()
		 * @generated
		 */
		EEnum SUPERVISION_STATUS = eINSTANCE.getSupervisionStatus();

	}

} //ETCSDataPackage
