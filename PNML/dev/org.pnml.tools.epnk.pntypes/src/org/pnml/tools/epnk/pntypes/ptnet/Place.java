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
package org.pnml.tools.epnk.pntypes.ptnet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.ptnet.Place#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.ptnet.Place#getMarking <em>Marking</em>}</li>
 * </ul>
 *
 * @see org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage#getPlace()
 * @model annotation="meeduse generated='OK'"
 * @generated
 */
public interface Place extends org.pnml.tools.epnk.pnmlcoremodel.Place {
	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Marking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(PTMarking)
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage#getPlace_InitialMarking()
	 * @model containment="true"
	 *        annotation="meeduse generated='OK' opposite='default' opposite-lower='0' opposite-upper='1' association='initialMarking'"
	 * @generated
	 */
	PTMarking getInitialMarking();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.ptnet.Place#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(PTMarking value);

	/**
	 * Returns the value of the '<em><b>Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' attribute.
	 * @see #setMarking(int)
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage#getPlace_Marking()
	 * @model default="0" required="true" transient="true"
	 *        annotation="meeduse generated='OK'"
	 * @generated
	 */
	int getMarking();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.ptnet.Place#getMarking <em>Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' attribute.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(int value);

} // Place
