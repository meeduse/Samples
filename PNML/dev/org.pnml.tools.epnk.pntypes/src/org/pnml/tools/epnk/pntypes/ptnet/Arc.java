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
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.ptnet.Arc#getInscription <em>Inscription</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.ptnet.Arc#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage#getArc()
 * @model annotation="meeduse generated='OK'"
 * @generated
 */
public interface Arc extends org.pnml.tools.epnk.pnmlcoremodel.Arc {
	/**
	 * Returns the value of the '<em><b>Inscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inscription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inscription</em>' containment reference.
	 * @see #setInscription(PTArcAnnotation)
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage#getArc_Inscription()
	 * @model containment="true"
	 *        annotation="meeduse generated='OK' opposite='default' opposite-lower='0' opposite-upper='1' association='inscription'"
	 * @generated
	 */
	PTArcAnnotation getInscription();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.ptnet.Arc#getInscription <em>Inscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inscription</em>' containment reference.
	 * @see #getInscription()
	 * @generated
	 */
	void setInscription(PTArcAnnotation value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage#getArc_Value()
	 * @model default="0" required="true" transient="true"
	 *        annotation="meeduse generated='OK'"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.ptnet.Arc#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Arc
