/**
 */
package extractedMM.impl;

import extractedMM.ExtractedMMPackage;
import extractedMM.LeftRight;
import extractedMM.Navigability;
import extractedMM.PositionedRelation;
import extractedMM.PositioningNetElement;
import extractedMM.Usage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positioned Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.PositionedRelationImpl#getNavigibility <em>Navigibility</em>}</li>
 *   <li>{@link extractedMM.impl.PositionedRelationImpl#getPositionOnA <em>Position On A</em>}</li>
 *   <li>{@link extractedMM.impl.PositionedRelationImpl#getPositionOnB <em>Position On B</em>}</li>
 *   <li>{@link extractedMM.impl.PositionedRelationImpl#getLeadsTowards <em>Leads Towards</em>}</li>
 *   <li>{@link extractedMM.impl.PositionedRelationImpl#getElementA <em>Element A</em>}</li>
 *   <li>{@link extractedMM.impl.PositionedRelationImpl#getElementB <em>Element B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionedRelationImpl extends RelationImpl implements PositionedRelation {
	/**
	 * The default value of the '{@link #getNavigibility() <em>Navigibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigibility()
	 * @generated
	 * @ordered
	 */
	protected static final Navigability NAVIGIBILITY_EDEFAULT = Navigability.BOTH;

	/**
	 * The cached value of the '{@link #getNavigibility() <em>Navigibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigibility()
	 * @generated
	 * @ordered
	 */
	protected Navigability navigibility = NAVIGIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionOnA() <em>Position On A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionOnA()
	 * @generated
	 * @ordered
	 */
	protected static final Usage POSITION_ON_A_EDEFAULT = Usage.START;

	/**
	 * The cached value of the '{@link #getPositionOnA() <em>Position On A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionOnA()
	 * @generated
	 * @ordered
	 */
	protected Usage positionOnA = POSITION_ON_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionOnB() <em>Position On B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionOnB()
	 * @generated
	 * @ordered
	 */
	protected static final Usage POSITION_ON_B_EDEFAULT = Usage.START;

	/**
	 * The cached value of the '{@link #getPositionOnB() <em>Position On B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionOnB()
	 * @generated
	 * @ordered
	 */
	protected Usage positionOnB = POSITION_ON_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeadsTowards() <em>Leads Towards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadsTowards()
	 * @generated
	 * @ordered
	 */
	protected static final LeftRight LEADS_TOWARDS_EDEFAULT = LeftRight.LEFT;

	/**
	 * The cached value of the '{@link #getLeadsTowards() <em>Leads Towards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadsTowards()
	 * @generated
	 * @ordered
	 */
	protected LeftRight leadsTowards = LEADS_TOWARDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementA() <em>Element A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementA()
	 * @generated
	 * @ordered
	 */
	protected PositioningNetElement elementA;

	/**
	 * The cached value of the '{@link #getElementB() <em>Element B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementB()
	 * @generated
	 * @ordered
	 */
	protected PositioningNetElement elementB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionedRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.POSITIONED_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navigability getNavigibility() {
		return navigibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigibility(Navigability newNavigibility) {
		Navigability oldNavigibility = navigibility;
		navigibility = newNavigibility == null ? NAVIGIBILITY_EDEFAULT : newNavigibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.POSITIONED_RELATION__NAVIGIBILITY,
					oldNavigibility, navigibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage getPositionOnA() {
		return positionOnA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionOnA(Usage newPositionOnA) {
		Usage oldPositionOnA = positionOnA;
		positionOnA = newPositionOnA == null ? POSITION_ON_A_EDEFAULT : newPositionOnA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.POSITIONED_RELATION__POSITION_ON_A,
					oldPositionOnA, positionOnA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage getPositionOnB() {
		return positionOnB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionOnB(Usage newPositionOnB) {
		Usage oldPositionOnB = positionOnB;
		positionOnB = newPositionOnB == null ? POSITION_ON_B_EDEFAULT : newPositionOnB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.POSITIONED_RELATION__POSITION_ON_B,
					oldPositionOnB, positionOnB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftRight getLeadsTowards() {
		return leadsTowards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeadsTowards(LeftRight newLeadsTowards) {
		LeftRight oldLeadsTowards = leadsTowards;
		leadsTowards = newLeadsTowards == null ? LEADS_TOWARDS_EDEFAULT : newLeadsTowards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.POSITIONED_RELATION__LEADS_TOWARDS,
					oldLeadsTowards, leadsTowards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositioningNetElement getElementA() {
		if (elementA != null && elementA.eIsProxy()) {
			InternalEObject oldElementA = (InternalEObject) elementA;
			elementA = (PositioningNetElement) eResolveProxy(oldElementA);
			if (elementA != oldElementA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.POSITIONED_RELATION__ELEMENT_A, oldElementA, elementA));
			}
		}
		return elementA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositioningNetElement basicGetElementA() {
		return elementA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementA(PositioningNetElement newElementA) {
		PositioningNetElement oldElementA = elementA;
		elementA = newElementA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.POSITIONED_RELATION__ELEMENT_A,
					oldElementA, elementA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositioningNetElement getElementB() {
		if (elementB != null && elementB.eIsProxy()) {
			InternalEObject oldElementB = (InternalEObject) elementB;
			elementB = (PositioningNetElement) eResolveProxy(oldElementB);
			if (elementB != oldElementB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.POSITIONED_RELATION__ELEMENT_B, oldElementB, elementB));
			}
		}
		return elementB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositioningNetElement basicGetElementB() {
		return elementB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementB(PositioningNetElement newElementB) {
		PositioningNetElement oldElementB = elementB;
		elementB = newElementB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.POSITIONED_RELATION__ELEMENT_B,
					oldElementB, elementB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtractedMMPackage.POSITIONED_RELATION__NAVIGIBILITY:
			return getNavigibility();
		case ExtractedMMPackage.POSITIONED_RELATION__POSITION_ON_A:
			return getPositionOnA();
		case ExtractedMMPackage.POSITIONED_RELATION__POSITION_ON_B:
			return getPositionOnB();
		case ExtractedMMPackage.POSITIONED_RELATION__LEADS_TOWARDS:
			return getLeadsTowards();
		case ExtractedMMPackage.POSITIONED_RELATION__ELEMENT_A:
			if (resolve)
				return getElementA();
			return basicGetElementA();
		case ExtractedMMPackage.POSITIONED_RELATION__ELEMENT_B:
			if (resolve)
				return getElementB();
			return basicGetElementB();
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
		case ExtractedMMPackage.POSITIONED_RELATION__NAVIGIBILITY:
			setNavigibility((Navigability) newValue);
			return;
		case ExtractedMMPackage.POSITIONED_RELATION__POSITION_ON_A:
			setPositionOnA((Usage) newValue);
			return;
		case ExtractedMMPackage.POSITIONED_RELATION__POSITION_ON_B:
			setPositionOnB((Usage) newValue);
			return;
		case ExtractedMMPackage.POSITIONED_RELATION__LEADS_TOWARDS:
			setLeadsTowards((LeftRight) newValue);
			return;
		case ExtractedMMPackage.POSITIONED_RELATION__ELEMENT_A:
			setElementA((PositioningNetElement) newValue);
			return;
		case ExtractedMMPackage.POSITIONED_RELATION__ELEMENT_B:
			setElementB((PositioningNetElement) newValue);
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
		case ExtractedMMPackage.POSITIONED_RELATION__NAVIGIBILITY:
			setNavigibility(NAVIGIBILITY_EDEFAULT);
			return;
		case ExtractedMMPackage.POSITIONED_RELATION__POSITION_ON_A:
			setPositionOnA(POSITION_ON_A_EDEFAULT);
			return;
		case ExtractedMMPackage.POSITIONED_RELATION__POSITION_ON_B:
			setPositionOnB(POSITION_ON_B_EDEFAULT);
			return;
		case ExtractedMMPackage.POSITIONED_RELATION__LEADS_TOWARDS:
			setLeadsTowards(LEADS_TOWARDS_EDEFAULT);
			return;
		case ExtractedMMPackage.POSITIONED_RELATION__ELEMENT_A:
			setElementA((PositioningNetElement) null);
			return;
		case ExtractedMMPackage.POSITIONED_RELATION__ELEMENT_B:
			setElementB((PositioningNetElement) null);
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
		case ExtractedMMPackage.POSITIONED_RELATION__NAVIGIBILITY:
			return navigibility != NAVIGIBILITY_EDEFAULT;
		case ExtractedMMPackage.POSITIONED_RELATION__POSITION_ON_A:
			return positionOnA != POSITION_ON_A_EDEFAULT;
		case ExtractedMMPackage.POSITIONED_RELATION__POSITION_ON_B:
			return positionOnB != POSITION_ON_B_EDEFAULT;
		case ExtractedMMPackage.POSITIONED_RELATION__LEADS_TOWARDS:
			return leadsTowards != LEADS_TOWARDS_EDEFAULT;
		case ExtractedMMPackage.POSITIONED_RELATION__ELEMENT_A:
			return elementA != null;
		case ExtractedMMPackage.POSITIONED_RELATION__ELEMENT_B:
			return elementB != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (navigibility: ");
		result.append(navigibility);
		result.append(", positionOnA: ");
		result.append(positionOnA);
		result.append(", positionOnB: ");
		result.append(positionOnB);
		result.append(", leadsTowards: ");
		result.append(leadsTowards);
		result.append(')');
		return result.toString();
	}

} //PositionedRelationImpl
