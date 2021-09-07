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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.pntypes.ptnet.PTMarking;
import org.pnml.tools.epnk.pntypes.ptnet.Place;
import org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.ptnet.impl.PlaceImpl#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.ptnet.impl.PlaceImpl#getMarking <em>Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl implements Place {
	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected PTMarking initialMarking;

	/**
	 * The default value of the '{@link #getMarking() <em>Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int MARKING_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMarking() <em>Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarking()
	 * @generated
	 * @ordered
	 */
	protected int marking = MARKING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PtnetPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTMarking getInitialMarking() {
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(PTMarking newInitialMarking, NotificationChain msgs) {
		PTMarking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetPackage.PLACE__INITIAL_MARKING, oldInitialMarking, newInitialMarking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialMarking(PTMarking newInitialMarking) {
		if (newInitialMarking != initialMarking) {
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = ((InternalEObject)initialMarking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetPackage.PLACE__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = ((InternalEObject)newInitialMarking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetPackage.PLACE__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.PLACE__INITIAL_MARKING, newInitialMarking, newInitialMarking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMarking() {
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarking(int newMarking) {
		int oldMarking = marking;
		marking = newMarking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.PLACE__MARKING, oldMarking, marking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PtnetPackage.PLACE__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PtnetPackage.PLACE__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetPackage.PLACE__MARKING:
				return getMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PtnetPackage.PLACE__INITIAL_MARKING:
				setInitialMarking((PTMarking)newValue);
				return;
			case PtnetPackage.PLACE__MARKING:
				setMarking((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PtnetPackage.PLACE__INITIAL_MARKING:
				setInitialMarking((PTMarking)null);
				return;
			case PtnetPackage.PLACE__MARKING:
				setMarking(MARKING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PtnetPackage.PLACE__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetPackage.PLACE__MARKING:
				return marking != MARKING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (marking: "); //$NON-NLS-1$
		result.append(marking);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
