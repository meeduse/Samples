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

import org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger;
import org.pnml.tools.epnk.pnmlcoremodel.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT Marking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.ptnet.PTMarking#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage#getPTMarking()
 * @model annotation="meeduse generated='OK'"
 * @generated
 */
public interface PTMarking extends Label {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(NonNegativeInteger)
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage#getPTMarking_Text()
	 * @model default="0" dataType="org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger" required="true"
	 *        annotation="meeduse generated='OK'"
	 * @generated
	 */
	NonNegativeInteger getText();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.ptnet.PTMarking#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(NonNegativeInteger value);

} // PTMarking
