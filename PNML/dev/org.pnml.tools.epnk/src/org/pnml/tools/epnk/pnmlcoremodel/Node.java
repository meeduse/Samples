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
package org.pnml.tools.epnk.pnmlcoremodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Node#getOut <em>Out</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Node#getIn <em>In</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Node#getEtiq <em>Etiq</em>}</li>
 * </ul>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getNode()
 * @model abstract="true"
 *        annotation="meeduse generated='OK'"
 * @generated
 */
public interface Node extends org.pnml.tools.epnk.pnmlcoremodel.Object {

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.Arc}.
	 * It is bidirectional and its opposite is '{@link org.pnml.tools.epnk.pnmlcoremodel.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getNode_Out()
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Arc#getSource
	 * @model opposite="source" resolveProxies="false" transient="true"
	 *        annotation="meeduse generated='OK' association='out'"
	 * @generated
	 */
	EList<Arc> getOut();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.Arc}.
	 * It is bidirectional and its opposite is '{@link org.pnml.tools.epnk.pnmlcoremodel.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getNode_In()
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Arc#getTarget
	 * @model opposite="target" resolveProxies="false" transient="true"
	 *        annotation="meeduse generated='OK' association='in'"
	 * @generated
	 */
	EList<Arc> getIn();

	/**
	 * Returns the value of the '<em><b>Etiq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiq</em>' attribute.
	 * @see #setEtiq(String)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getNode_Etiq()
	 * @model id="true" required="true" transient="true"
	 *        annotation="meeduse generated='OK'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\t\t\t\t\n\t\t\t\tself.id'"
	 * @generated
	 */
	String getEtiq();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Node#getEtiq <em>Etiq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etiq</em>' attribute.
	 * @see #getEtiq()
	 * @generated
	 */
	void setEtiq(String value);

} // Node
