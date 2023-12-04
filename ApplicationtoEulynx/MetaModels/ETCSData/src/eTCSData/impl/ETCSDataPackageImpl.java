/**
 */
package eTCSData.impl;

import eTCSData.ETCSDataFactory;
import eTCSData.ETCSDataPackage;
import eTCSData.ETCSModel;
import eTCSData.KindOfTrains;
import eTCSData.SupervisionStatus;
import eTCSData.Train;

import extractedMM.ExtractedMMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import types.TypesPackage;
import types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ETCSDataPackageImpl extends EPackageImpl implements ETCSDataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kindOfTrainsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supervisionStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eTCSData.ETCSDataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ETCSDataPackageImpl() {
		super(eNS_URI, ETCSDataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ETCSDataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ETCSDataPackage init() {
		if (isInited) return (ETCSDataPackage)EPackage.Registry.INSTANCE.getEPackage(ETCSDataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredETCSDataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ETCSDataPackageImpl theETCSDataPackage = registeredETCSDataPackage instanceof ETCSDataPackageImpl ? (ETCSDataPackageImpl)registeredETCSDataPackage : new ETCSDataPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ExtractedMMPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theETCSDataPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theETCSDataPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theETCSDataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ETCSDataPackage.eNS_URI, theETCSDataPackage);
		return theETCSDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETCSModel() {
		return etcsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETCSModel_Trains() {
		return (EReference)etcsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETCSModel_EulynxModel() {
		return (EReference)etcsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETCSModel_SupervisionOfTrain() {
		return (EAttribute)etcsModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrain() {
		return trainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_Id() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_OccupyFront() {
		return (EReference)trainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_OccupyRear() {
		return (EReference)trainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_LocationRear() {
		return (EReference)trainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_LocationFront() {
		return (EReference)trainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_FrontMA() {
		return (EReference)trainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_RearMA() {
		return (EReference)trainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_TrainConnected() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_TrainReConnected() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_KindOfTrain() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKindOfTrains() {
		return kindOfTrainsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupervisionStatus() {
		return supervisionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETCSDataFactory getETCSDataFactory() {
		return (ETCSDataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		etcsModelEClass = createEClass(ETCS_MODEL);
		createEReference(etcsModelEClass, ETCS_MODEL__TRAINS);
		createEReference(etcsModelEClass, ETCS_MODEL__EULYNX_MODEL);
		createEAttribute(etcsModelEClass, ETCS_MODEL__SUPERVISION_OF_TRAIN);

		trainEClass = createEClass(TRAIN);
		createEAttribute(trainEClass, TRAIN__ID);
		createEReference(trainEClass, TRAIN__OCCUPY_FRONT);
		createEReference(trainEClass, TRAIN__OCCUPY_REAR);
		createEReference(trainEClass, TRAIN__LOCATION_REAR);
		createEReference(trainEClass, TRAIN__LOCATION_FRONT);
		createEReference(trainEClass, TRAIN__FRONT_MA);
		createEReference(trainEClass, TRAIN__REAR_MA);
		createEAttribute(trainEClass, TRAIN__TRAIN_CONNECTED);
		createEAttribute(trainEClass, TRAIN__TRAIN_RE_CONNECTED);
		createEAttribute(trainEClass, TRAIN__KIND_OF_TRAIN);

		// Create enums
		kindOfTrainsEEnum = createEEnum(KIND_OF_TRAINS);
		supervisionStatusEEnum = createEEnum(SUPERVISION_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExtractedMMPackage theExtractedMMPackage = (ExtractedMMPackage)EPackage.Registry.INSTANCE.getEPackage(ExtractedMMPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(etcsModelEClass, ETCSModel.class, "ETCSModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getETCSModel_Trains(), this.getTrain(), null, "trains", null, 0, -1, ETCSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETCSModel_EulynxModel(), theExtractedMMPackage.getDocumentRoot(), null, "EulynxModel", null, 0, 1, ETCSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETCSModel_SupervisionOfTrain(), this.getSupervisionStatus(), "SupervisionOfTrain", null, 0, 1, ETCSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainEClass, Train.class, "Train", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrain_Id(), ecorePackage.getEString(), "Id", null, 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_OccupyFront(), theExtractedMMPackage.getVirtualSubSection(), null, "occupyFront", null, 0, -1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_OccupyRear(), theExtractedMMPackage.getVirtualSubSection(), null, "occupyRear", null, 0, -1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_LocationRear(), theExtractedMMPackage.getVirtualSubSection(), null, "locationRear", null, 0, -1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_LocationFront(), theExtractedMMPackage.getVirtualSubSection(), null, "locationFront", null, 0, -1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_FrontMA(), theExtractedMMPackage.getVirtualSubSection(), null, "frontMA", null, 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_RearMA(), theExtractedMMPackage.getVirtualSubSection(), null, "rearMA", null, 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_TrainConnected(), theTypesPackage.getBoolean(), "TrainConnected", null, 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_TrainReConnected(), theTypesPackage.getBoolean(), "TrainReConnected", null, 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_KindOfTrain(), this.getKindOfTrains(), "KindOfTrain", null, 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(kindOfTrainsEEnum, KindOfTrains.class, "KindOfTrains");
		addEEnumLiteral(kindOfTrainsEEnum, KindOfTrains.TIMSERTMS);
		addEEnumLiteral(kindOfTrainsEEnum, KindOfTrains.ERTMS);
		addEEnumLiteral(kindOfTrainsEEnum, KindOfTrains.NO_ERTMS);

		initEEnum(supervisionStatusEEnum, SupervisionStatus.class, "SupervisionStatus");
		addEEnumLiteral(supervisionStatusEEnum, SupervisionStatus.ACTIVE);
		addEEnumLiteral(supervisionStatusEEnum, SupervisionStatus.DEACTIVE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// meeduse
		createMeeduseAnnotations();
	}

	/**
	 * Initializes the annotations for <b>meeduse</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMeeduseAnnotations() {
		String source = "meeduse";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "generated", ""
		   });
		addAnnotation
		  (etcsModelEClass,
		   source,
		   new String[] {
			   "generated", "",
			   "constant", null
		   });
		addAnnotation
		  (getETCSModel_Trains(),
		   source,
		   new String[] {
			   "generated", "",
			   "association", "ListOfTrains"
		   });
		addAnnotation
		  (getETCSModel_EulynxModel(),
		   source,
		   new String[] {
			   "generated", null,
			   "association", "EulynxModels"
		   });
		addAnnotation
		  (getETCSModel_SupervisionOfTrain(),
		   source,
		   new String[] {
			   "generated", null
		   });
		addAnnotation
		  (trainEClass,
		   source,
		   new String[] {
			   "generated", "",
			   "constant", null
		   });
		addAnnotation
		  (getTrain_Id(),
		   source,
		   new String[] {
			   "generated", "NOT"
		   });
		addAnnotation
		  (getTrain_OccupyFront(),
		   source,
		   new String[] {
			   "generated", null,
			   "association", "TrainFront"
		   });
		addAnnotation
		  (getTrain_OccupyRear(),
		   source,
		   new String[] {
			   "generated", null,
			   "association", "TrainRear"
		   });
		addAnnotation
		  (getTrain_LocationRear(),
		   source,
		   new String[] {
			   "generated", null,
			   "association", "TrainRearLocation"
		   });
		addAnnotation
		  (getTrain_LocationFront(),
		   source,
		   new String[] {
			   "generated", null,
			   "association", "TrainFrontLocation"
		   });
		addAnnotation
		  (getTrain_FrontMA(),
		   source,
		   new String[] {
			   "generated", null,
			   "association", "frontMA"
		   });
		addAnnotation
		  (getTrain_RearMA(),
		   source,
		   new String[] {
			   "generated", null,
			   "association", "rearMA"
		   });
		addAnnotation
		  (getTrain_TrainConnected(),
		   source,
		   new String[] {
			   "generated", null
		   });
		addAnnotation
		  (getTrain_TrainReConnected(),
		   source,
		   new String[] {
			   "generated", null
		   });
		addAnnotation
		  (getTrain_KindOfTrain(),
		   source,
		   new String[] {
			   "generated", null,
			   "constant", null
		   });
	}

} //ETCSDataPackageImpl
