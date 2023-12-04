/**
 */
package extractedMM.impl;

import extractedMM.ExtractedMMPackage;
import extractedMM.Route;
import extractedMM.RouteBody;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.RouteImpl#getAppliesToRouteBody <em>Applies To Route Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RouteImpl extends ConfiguredBaseObjectImpl implements Route {
	/**
	 * The cached value of the '{@link #getAppliesToRouteBody() <em>Applies To Route Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToRouteBody()
	 * @generated
	 * @ordered
	 */
	protected RouteBody appliesToRouteBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteBody getAppliesToRouteBody() {
		if (appliesToRouteBody != null && appliesToRouteBody.eIsProxy()) {
			InternalEObject oldAppliesToRouteBody = (InternalEObject) appliesToRouteBody;
			appliesToRouteBody = (RouteBody) eResolveProxy(oldAppliesToRouteBody);
			if (appliesToRouteBody != oldAppliesToRouteBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtractedMMPackage.ROUTE__APPLIES_TO_ROUTE_BODY, oldAppliesToRouteBody,
							appliesToRouteBody));
			}
		}
		return appliesToRouteBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteBody basicGetAppliesToRouteBody() {
		return appliesToRouteBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesToRouteBody(RouteBody newAppliesToRouteBody) {
		RouteBody oldAppliesToRouteBody = appliesToRouteBody;
		appliesToRouteBody = newAppliesToRouteBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.ROUTE__APPLIES_TO_ROUTE_BODY,
					oldAppliesToRouteBody, appliesToRouteBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtractedMMPackage.ROUTE__APPLIES_TO_ROUTE_BODY:
			if (resolve)
				return getAppliesToRouteBody();
			return basicGetAppliesToRouteBody();
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
		case ExtractedMMPackage.ROUTE__APPLIES_TO_ROUTE_BODY:
			setAppliesToRouteBody((RouteBody) newValue);
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
		case ExtractedMMPackage.ROUTE__APPLIES_TO_ROUTE_BODY:
			setAppliesToRouteBody((RouteBody) null);
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
		case ExtractedMMPackage.ROUTE__APPLIES_TO_ROUTE_BODY:
			return appliesToRouteBody != null;
		}
		return super.eIsSet(featureID);
	}

} //RouteImpl
