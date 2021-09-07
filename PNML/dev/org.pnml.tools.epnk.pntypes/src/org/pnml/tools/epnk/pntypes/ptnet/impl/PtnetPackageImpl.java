/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.ptnet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.datatypes.pnmldatatypes.PnmldatatypesPackage;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.pntypes.ptnet.Arc;
import org.pnml.tools.epnk.pntypes.ptnet.PTArcAnnotation;
import org.pnml.tools.epnk.pntypes.ptnet.PTMarking;
import org.pnml.tools.epnk.pntypes.ptnet.PTNet;
import org.pnml.tools.epnk.pntypes.ptnet.Place;
import org.pnml.tools.epnk.pntypes.ptnet.PtnetFactory;
import org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetPackageImpl extends EPackageImpl implements PtnetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptMarkingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptArcAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

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
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetPackageImpl() {
		super(eNS_URI, PtnetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetPackage init() {
		if (isInited) return (PtnetPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPtnetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PtnetPackageImpl thePtnetPackage = registeredPtnetPackage instanceof PtnetPackageImpl ? (PtnetPackageImpl)registeredPtnetPackage : new PtnetPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PnmlcoremodelPackage.eINSTANCE.eClass();
		PnmldatatypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePtnetPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetPackage.eNS_URI, thePtnetPackage);
		return thePtnetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlace_InitialMarking() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlace_Marking() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArc_Inscription() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArc_Value() {
		return (EAttribute)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPTMarking() {
		return ptMarkingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTMarking_Text() {
		return (EAttribute)ptMarkingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPTArcAnnotation() {
		return ptArcAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTArcAnnotation_Text() {
		return (EAttribute)ptArcAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPTNet() {
		return ptNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PtnetFactory getPtnetFactory() {
		return (PtnetFactory)getEFactoryInstance();
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
		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__INITIAL_MARKING);
		createEAttribute(placeEClass, PLACE__MARKING);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__INSCRIPTION);
		createEAttribute(arcEClass, ARC__VALUE);

		ptMarkingEClass = createEClass(PT_MARKING);
		createEAttribute(ptMarkingEClass, PT_MARKING__TEXT);

		ptArcAnnotationEClass = createEClass(PT_ARC_ANNOTATION);
		createEAttribute(ptArcAnnotationEClass, PT_ARC_ANNOTATION__TEXT);

		ptNetEClass = createEClass(PT_NET);
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
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);
		PnmldatatypesPackage thePnmldatatypesPackage = (PnmldatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(PnmldatatypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		placeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPlace());
		arcEClass.getESuperTypes().add(thePnmlcoremodelPackage.getArc());
		ptMarkingEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		ptArcAnnotationEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		ptNetEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNetType());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPlace_InitialMarking(), this.getPTMarking(), null, "initialMarking", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPlace_Marking(), ecorePackage.getEInt(), "marking", "0", 1, 1, Place.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArc_Inscription(), this.getPTArcAnnotation(), null, "inscription", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getArc_Value(), ecorePackage.getEInt(), "value", "0", 1, 1, Arc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(ptMarkingEClass, PTMarking.class, "PTMarking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPTMarking_Text(), thePnmldatatypesPackage.getNonNegativeInteger(), "text", "0", 1, 1, PTMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(ptArcAnnotationEClass, PTArcAnnotation.class, "PTArcAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPTArcAnnotation_Text(), thePnmldatatypesPackage.getPositiveInteger(), "text", "1", 1, 1, PTArcAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(ptNetEClass, PTNet.class, "PTNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://epnk.tools.pnml.org/pntd
		createPntdAnnotations();
		// meeduse
		createMeeduseAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://epnk.tools.pnml.org/pntd</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPntdAnnotations() {
		String source = "http://epnk.tools.pnml.org/pntd"; //$NON-NLS-1$
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "id", "ptnet", //$NON-NLS-1$ //$NON-NLS-2$
			   "name", "PTNets", //$NON-NLS-1$ //$NON-NLS-2$
			   "type_uri", "http://www.pnml.org/version-2009/grammar/ptnet", //$NON-NLS-1$ //$NON-NLS-2$
			   "description", "Place/Transition Nets" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

	/**
	 * Initializes the annotations for <b>meeduse</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMeeduseAnnotations() {
		String source = "meeduse"; //$NON-NLS-1$
		addAnnotation
		  (placeEClass,
		   source,
		   new String[] {
			   "generated", "OK" //$NON-NLS-1$ //$NON-NLS-2$
		   });
		addAnnotation
		  (getPlace_InitialMarking(),
		   source,
		   new String[] {
			   "generated", "OK", //$NON-NLS-1$ //$NON-NLS-2$
			   "opposite", "default", //$NON-NLS-1$ //$NON-NLS-2$
			   "opposite-lower", "0", //$NON-NLS-1$ //$NON-NLS-2$
			   "opposite-upper", "1", //$NON-NLS-1$ //$NON-NLS-2$
			   "association", "initialMarking" //$NON-NLS-1$ //$NON-NLS-2$
		   });
		addAnnotation
		  (getPlace_Marking(),
		   source,
		   new String[] {
			   "generated", "OK" //$NON-NLS-1$ //$NON-NLS-2$
		   });
		addAnnotation
		  (arcEClass,
		   source,
		   new String[] {
			   "generated", "OK" //$NON-NLS-1$ //$NON-NLS-2$
		   });
		addAnnotation
		  (getArc_Inscription(),
		   source,
		   new String[] {
			   "generated", "OK", //$NON-NLS-1$ //$NON-NLS-2$
			   "opposite", "default", //$NON-NLS-1$ //$NON-NLS-2$
			   "opposite-lower", "0", //$NON-NLS-1$ //$NON-NLS-2$
			   "opposite-upper", "1", //$NON-NLS-1$ //$NON-NLS-2$
			   "association", "inscription" //$NON-NLS-1$ //$NON-NLS-2$
		   });
		addAnnotation
		  (getArc_Value(),
		   source,
		   new String[] {
			   "generated", "OK" //$NON-NLS-1$ //$NON-NLS-2$
		   });
		addAnnotation
		  (ptMarkingEClass,
		   source,
		   new String[] {
			   "generated", "OK" //$NON-NLS-1$ //$NON-NLS-2$
		   });
		addAnnotation
		  (getPTMarking_Text(),
		   source,
		   new String[] {
			   "generated", "OK" //$NON-NLS-1$ //$NON-NLS-2$
		   });
		addAnnotation
		  (ptArcAnnotationEClass,
		   source,
		   new String[] {
			   "generated", "OK" //$NON-NLS-1$ //$NON-NLS-2$
		   });
		addAnnotation
		  (getPTArcAnnotation_Text(),
		   source,
		   new String[] {
			   "generated", "OK" //$NON-NLS-1$ //$NON-NLS-2$
		   });
		addAnnotation
		  (ptNetEClass,
		   source,
		   new String[] {
			   "generated", "NOT" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //PtnetPackageImpl
