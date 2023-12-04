/**
 */
package extractedMM.impl;

import extractedMM.ApplicationDirection;
import extractedMM.AssociatedNetElement;
import extractedMM.ExtractedMMPackage;
import extractedMM.LateralPosition;
import extractedMM.PositioningNetElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Associated Net Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.AssociatedNetElementImpl#getNetElement <em>Net Element</em>}</li>
 *   <li>{@link extractedMM.impl.AssociatedNetElementImpl#getAppliesInDirection <em>Applies In Direction</em>}</li>
 *   <li>{@link extractedMM.impl.AssociatedNetElementImpl#getHasLateralPosition <em>Has Lateral Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociatedNetElementImpl extends MinimalEObjectImpl.Container implements AssociatedNetElement {
	/**
	 * The cached value of the '{@link #getNetElement() <em>Net Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetElement()
	 * @generated
	 * @ordered
	 */
	protected PositioningNetElement netElement;

	/**
	 * The default value of the '{@link #getAppliesInDirection() <em>Applies In Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesInDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationDirection APPLIES_IN_DIRECTION_EDEFAULT = ApplicationDirection.UNDEFINED;

	/**
	 * The cached value of the '{@link #getAppliesInDirection() <em>Applies In Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesInDirection()
	 * @generated
	 * @ordered
	 */
	protected ApplicationDirection appliesInDirection = APPLIES_IN_DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasLateralPosition() <em>Has Lateral Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasLateralPosition()
	 * @generated
	 * @ordered
	 */
	protected LateralPosition hasLateralPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociatedNetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.ASSOCIATED_NET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositioningNetElement getNetElement() {
		if (netElement != null && netElement.eIsProxy()) {
			InternalEObject oldNetElement = (InternalEObject) netElement;
			netElement = (PositioningNetElement) eResolveProxy(oldNetElement);
			if (netElement != oldNetElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__NET_ELEMENT, oldNetElement, netElement));
			}
		}
		return netElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositioningNetElement basicGetNetElement() {
		return netElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetElement(PositioningNetElement newNetElement) {
		PositioningNetElement oldNetElement = netElement;
		netElement = newNetElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__NET_ELEMENT, oldNetElement, netElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDirection getAppliesInDirection() {
		return appliesInDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesInDirection(ApplicationDirection newAppliesInDirection) {
		ApplicationDirection oldAppliesInDirection = appliesInDirection;
		appliesInDirection = newAppliesInDirection == null ? APPLIES_IN_DIRECTION_EDEFAULT : newAppliesInDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__APPLIES_IN_DIRECTION, oldAppliesInDirection,
					appliesInDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LateralPosition getHasLateralPosition() {
		return hasLateralPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasLateralPosition(LateralPosition newHasLateralPosition, NotificationChain msgs) {
		LateralPosition oldHasLateralPosition = hasLateralPosition;
		hasLateralPosition = newHasLateralPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__HAS_LATERAL_POSITION, oldHasLateralPosition,
					newHasLateralPosition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasLateralPosition(LateralPosition newHasLateralPosition) {
		if (newHasLateralPosition != hasLateralPosition) {
			NotificationChain msgs = null;
			if (hasLateralPosition != null)
				msgs = ((InternalEObject) hasLateralPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__HAS_LATERAL_POSITION, null,
						msgs);
			if (newHasLateralPosition != null)
				msgs = ((InternalEObject) newHasLateralPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__HAS_LATERAL_POSITION, null,
						msgs);
			msgs = basicSetHasLateralPosition(newHasLateralPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__HAS_LATERAL_POSITION, newHasLateralPosition,
					newHasLateralPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__HAS_LATERAL_POSITION:
			return basicSetHasLateralPosition(null, msgs);
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
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__NET_ELEMENT:
			if (resolve)
				return getNetElement();
			return basicGetNetElement();
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__APPLIES_IN_DIRECTION:
			return getAppliesInDirection();
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__HAS_LATERAL_POSITION:
			return getHasLateralPosition();
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
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__NET_ELEMENT:
			setNetElement((PositioningNetElement) newValue);
			return;
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__APPLIES_IN_DIRECTION:
			setAppliesInDirection((ApplicationDirection) newValue);
			return;
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__HAS_LATERAL_POSITION:
			setHasLateralPosition((LateralPosition) newValue);
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
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__NET_ELEMENT:
			setNetElement((PositioningNetElement) null);
			return;
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__APPLIES_IN_DIRECTION:
			setAppliesInDirection(APPLIES_IN_DIRECTION_EDEFAULT);
			return;
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__HAS_LATERAL_POSITION:
			setHasLateralPosition((LateralPosition) null);
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
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__NET_ELEMENT:
			return netElement != null;
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__APPLIES_IN_DIRECTION:
			return appliesInDirection != APPLIES_IN_DIRECTION_EDEFAULT;
		case ExtractedMMPackage.ASSOCIATED_NET_ELEMENT__HAS_LATERAL_POSITION:
			return hasLateralPosition != null;
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
		result.append(" (appliesInDirection: ");
		result.append(appliesInDirection);
		result.append(')');
		return result.toString();
	}

} //AssociatedNetElementImpl
