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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Arc#getSource <em>Source</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Arc#getTarget <em>Target</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Arc#getEtiq <em>Etiq</em>}</li>
 * </ul>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getArc()
 * @model annotation="meeduse generated='OK'"
 * @generated
 */
public interface Arc extends org.pnml.tools.epnk.pnmlcoremodel.Object {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.pnml.tools.epnk.pnmlcoremodel.Node#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getArc_Source()
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Node#getOut
	 * @model opposite="out" resolveProxies="false" required="true"
	 *        annotation="meeduse generated='OK' association='source'"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Arc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.pnml.tools.epnk.pnmlcoremodel.Node#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getArc_Target()
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Node#getIn
	 * @model opposite="in" resolveProxies="false" required="true"
	 *        annotation="meeduse generated='OK' association='target'"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Arc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Etiq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiq</em>' attribute.
	 * @see #setEtiq(String)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getArc_Etiq()
	 * @model id="true" required="true" transient="true"
	 *        annotation="meeduse generated='OK'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\t\t\t\t\n\t\t\t\tself.id'"
	 * @generated
	 */
	String getEtiq();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Arc#getEtiq <em>Etiq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etiq</em>' attribute.
	 * @see #getEtiq()
	 * @generated
	 */
	void setEtiq(String value);

} // Arc
