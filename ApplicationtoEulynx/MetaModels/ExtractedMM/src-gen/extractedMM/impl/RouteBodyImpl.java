/**
 */
package extractedMM.impl;

import extractedMM.ExtractedMMPackage;
import extractedMM.RouteBody;
import extractedMM.RouteBodyRSM;
import extractedMM.RouteEntry;
import extractedMM.RouteExit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.RouteBodyImpl#getHasEntry <em>Has Entry</em>}</li>
 *   <li>{@link extractedMM.impl.RouteBodyImpl#getHasExit <em>Has Exit</em>}</li>
 *   <li>{@link extractedMM.impl.RouteBodyImpl#getRefersToRsmRoutBody <em>Refers To Rsm Rout Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteBodyImpl extends ConfiguredBaseObjectImpl implements RouteBody {
	/**
	 * The cached value of the '{@link #getHasEntry() <em>Has Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEntry()
	 * @generated
	 * @ordered
	 */
	protected RouteEntry hasEntry;

	/**
	 * The cached value of the '{@link #getHasExit() <em>Has Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasExit()
	 * @generated
	 * @ordered
	 */
	protected RouteExit hasExit;

	/**
	 * The cached value of the '{@link #getRefersToRsmRoutBody() <em>Refers To Rsm Rout Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersToRsmRoutBody()
	 * @generated
	 * @ordered
	 */
	protected RouteBodyRSM refersToRsmRoutBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.ROUTE_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteEntry getHasEntry() {
		return hasEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasEntry(RouteEntry newHasEntry, NotificationChain msgs) {
		RouteEntry oldHasEntry = hasEntry;
		hasEntry = newHasEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.ROUTE_BODY__HAS_ENTRY, oldHasEntry, newHasEntry);
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
	public void setHasEntry(RouteEntry newHasEntry) {
		if (newHasEntry != hasEntry) {
			NotificationChain msgs = null;
			if (hasEntry != null)
				msgs = ((InternalEObject) hasEntry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExtractedMMPackage.ROUTE_BODY__HAS_ENTRY, null, msgs);
			if (newHasEntry != null)
				msgs = ((InternalEObject) newHasEntry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExtractedMMPackage.ROUTE_BODY__HAS_ENTRY, null, msgs);
			msgs = basicSetHasEntry(newHasEntry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.ROUTE_BODY__HAS_ENTRY, newHasEntry,
					newHasEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteExit getHasExit() {
		return hasExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasExit(RouteExit newHasExit, NotificationChain msgs) {
		RouteExit oldHasExit = hasExit;
		hasExit = newHasExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.ROUTE_BODY__HAS_EXIT, oldHasExit, newHasExit);
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
	public void setHasExit(RouteExit newHasExit) {
		if (newHasExit != hasExit) {
			NotificationChain msgs = null;
			if (hasExit != null)
				msgs = ((InternalEObject) hasExit).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExtractedMMPackage.ROUTE_BODY__HAS_EXIT, null, msgs);
			if (newHasExit != null)
				msgs = ((InternalEObject) newHasExit).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExtractedMMPackage.ROUTE_BODY__HAS_EXIT, null, msgs);
			msgs = basicSetHasExit(newHasExit, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.ROUTE_BODY__HAS_EXIT, newHasExit,
					newHasExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteBodyRSM getRefersToRsmRoutBody() {
		if (refersToRsmRoutBody != null && refersToRsmRoutBody.eIsProxy()) {
			InternalEObject oldRefersToRsmRoutBody = (InternalEObject) refersToRsmRoutBody;
			refersToRsmRoutBody = (RouteBodyRSM) eResolveProxy(oldRefersToRsmRoutBody);
			if (refersToRsmRoutBody != oldRefersToRsmRoutBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.ROUTE_BODY__REFERS_TO_RSM_ROUT_BODY, oldRefersToRsmRoutBody,
							refersToRsmRoutBody));
			}
		}
		return refersToRsmRoutBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteBodyRSM basicGetRefersToRsmRoutBody() {
		return refersToRsmRoutBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersToRsmRoutBody(RouteBodyRSM newRefersToRsmRoutBody) {
		RouteBodyRSM oldRefersToRsmRoutBody = refersToRsmRoutBody;
		refersToRsmRoutBody = newRefersToRsmRoutBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.ROUTE_BODY__REFERS_TO_RSM_ROUT_BODY, oldRefersToRsmRoutBody,
					refersToRsmRoutBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtractedMMPackage.ROUTE_BODY__HAS_ENTRY:
			return basicSetHasEntry(null, msgs);
		case ExtractedMMPackage.ROUTE_BODY__HAS_EXIT:
			return basicSetHasExit(null, msgs);
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
		case ExtractedMMPackage.ROUTE_BODY__HAS_ENTRY:
			return getHasEntry();
		case ExtractedMMPackage.ROUTE_BODY__HAS_EXIT:
			return getHasExit();
		case ExtractedMMPackage.ROUTE_BODY__REFERS_TO_RSM_ROUT_BODY:
			if (resolve)
				return getRefersToRsmRoutBody();
			return basicGetRefersToRsmRoutBody();
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
		case ExtractedMMPackage.ROUTE_BODY__HAS_ENTRY:
			setHasEntry((RouteEntry) newValue);
			return;
		case ExtractedMMPackage.ROUTE_BODY__HAS_EXIT:
			setHasExit((RouteExit) newValue);
			return;
		case ExtractedMMPackage.ROUTE_BODY__REFERS_TO_RSM_ROUT_BODY:
			setRefersToRsmRoutBody((RouteBodyRSM) newValue);
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
		case ExtractedMMPackage.ROUTE_BODY__HAS_ENTRY:
			setHasEntry((RouteEntry) null);
			return;
		case ExtractedMMPackage.ROUTE_BODY__HAS_EXIT:
			setHasExit((RouteExit) null);
			return;
		case ExtractedMMPackage.ROUTE_BODY__REFERS_TO_RSM_ROUT_BODY:
			setRefersToRsmRoutBody((RouteBodyRSM) null);
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
		case ExtractedMMPackage.ROUTE_BODY__HAS_ENTRY:
			return hasEntry != null;
		case ExtractedMMPackage.ROUTE_BODY__HAS_EXIT:
			return hasExit != null;
		case ExtractedMMPackage.ROUTE_BODY__REFERS_TO_RSM_ROUT_BODY:
			return refersToRsmRoutBody != null;
		}
		return super.eIsSet(featureID);
	}

} //RouteBodyImpl
