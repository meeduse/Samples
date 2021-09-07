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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.AnyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getToolspecific <em>Toolspecific</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getUnknown <em>Unknown</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabel()
 * @model abstract="true"
 *        annotation="meeduse generated='NOT'"
 * @generated
 */
public interface Label extends EObject {
	/**
	 * Returns the value of the '<em><b>Toolspecific</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.ToolInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toolspecific</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolspecific</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabel_Toolspecific()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<ToolInfo> getToolspecific();

	/**
	 * Returns the value of the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphics</em>' containment reference.
	 * @see #setGraphics(Graphics)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabel_Graphics()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	Graphics getGraphics();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getGraphics <em>Graphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphics</em>' containment reference.
	 * @see #getGraphics()
	 * @generated
	 */
	void setGraphics(Graphics value);

	/**
	 * Returns the value of the '<em><b>Unknown</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.xml.type.AnyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabel_Unknown()
	 * @model containment="true"
	 *        annotation="meeduse generated='NOT'"
	 * @generated
	 */
	EList<AnyType> getUnknown();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabel_Id()
	 * @model transient="true"
	 *        annotation="meeduse generated='NOT'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\t\t\t\t\n\t\t\t\tif self.oclIsTypeOf(ptnet::PTMarking) then \n\t\t\t\t\t\'pt_\' + (ptnet::PTMarking.allInstances()-&gt;asOrderedSet()-&gt;indexOf(self.oclAsType(ptnet::PTMarking))).toString()\n\t\t\t\telse\n\t\t\t\t\tif self.oclIsTypeOf(ptnet::PTArcAnnotation) then\n\t\t\t\t\t\t\'at_\' + (ptnet::PTArcAnnotation.allInstances()-&gt;asOrderedSet()-&gt;indexOf(self.oclAsType(ptnet::PTArcAnnotation))).toString()\n\t\t\t\t\telse\n\t\t\t\t\t\t\'aLabelId\'\n\t\t\t\t\tendif\t\n\t\t\t\t\t/* A derivation rule is required for undefined Ids \052/\n\t\t\t\tendif'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Label
