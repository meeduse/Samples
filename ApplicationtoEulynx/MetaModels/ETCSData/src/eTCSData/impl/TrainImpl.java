/**
 */
package eTCSData.impl;

import eTCSData.ETCSDataPackage;
import eTCSData.KindOfTrains;
import eTCSData.Train;
import extractedMM.VirtualSubSection;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eTCSData.impl.TrainImpl#getId <em>Id</em>}</li>
 *   <li>{@link eTCSData.impl.TrainImpl#getOccupyFront <em>Occupy Front</em>}</li>
 *   <li>{@link eTCSData.impl.TrainImpl#getOccupyRear <em>Occupy Rear</em>}</li>
 *   <li>{@link eTCSData.impl.TrainImpl#getLocationRear <em>Location Rear</em>}</li>
 *   <li>{@link eTCSData.impl.TrainImpl#getLocationFront <em>Location Front</em>}</li>
 *   <li>{@link eTCSData.impl.TrainImpl#getFrontMA <em>Front MA</em>}</li>
 *   <li>{@link eTCSData.impl.TrainImpl#getRearMA <em>Rear MA</em>}</li>
 *   <li>{@link eTCSData.impl.TrainImpl#isTrainConnected <em>Train Connected</em>}</li>
 *   <li>{@link eTCSData.impl.TrainImpl#isTrainReConnected <em>Train Re Connected</em>}</li>
 *   <li>{@link eTCSData.impl.TrainImpl#getKindOfTrain <em>Kind Of Train</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainImpl extends MinimalEObjectImpl.Container implements Train {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOccupyFront() <em>Occupy Front</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupyFront()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualSubSection> occupyFront;

	/**
	 * The cached value of the '{@link #getOccupyRear() <em>Occupy Rear</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupyRear()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualSubSection> occupyRear;

	/**
	 * The cached value of the '{@link #getLocationRear() <em>Location Rear</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationRear()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualSubSection> locationRear;

	/**
	 * The cached value of the '{@link #getLocationFront() <em>Location Front</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationFront()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualSubSection> locationFront;

	/**
	 * The cached value of the '{@link #getFrontMA() <em>Front MA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontMA()
	 * @generated
	 * @ordered
	 */
	protected VirtualSubSection frontMA;

	/**
	 * The cached value of the '{@link #getRearMA() <em>Rear MA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearMA()
	 * @generated
	 * @ordered
	 */
	protected VirtualSubSection rearMA;

	/**
	 * The default value of the '{@link #isTrainConnected() <em>Train Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAIN_CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrainConnected() <em>Train Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean trainConnected = TRAIN_CONNECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrainReConnected() <em>Train Re Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainReConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAIN_RE_CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrainReConnected() <em>Train Re Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainReConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean trainReConnected = TRAIN_RE_CONNECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getKindOfTrain() <em>Kind Of Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfTrain()
	 * @generated
	 * @ordered
	 */
	protected static final KindOfTrains KIND_OF_TRAIN_EDEFAULT = KindOfTrains.TIMSERTMS;

	/**
	 * The cached value of the '{@link #getKindOfTrain() <em>Kind Of Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfTrain()
	 * @generated
	 * @ordered
	 */
	protected KindOfTrains kindOfTrain = KIND_OF_TRAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ETCSDataPackage.Literals.TRAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETCSDataPackage.TRAIN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualSubSection> getOccupyFront() {
		if (occupyFront == null) {
			occupyFront = new EObjectResolvingEList<VirtualSubSection>(VirtualSubSection.class, this, ETCSDataPackage.TRAIN__OCCUPY_FRONT);
		}
		return occupyFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualSubSection> getOccupyRear() {
		if (occupyRear == null) {
			occupyRear = new EObjectResolvingEList<VirtualSubSection>(VirtualSubSection.class, this, ETCSDataPackage.TRAIN__OCCUPY_REAR);
		}
		return occupyRear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualSubSection> getLocationRear() {
		if (locationRear == null) {
			locationRear = new EObjectResolvingEList<VirtualSubSection>(VirtualSubSection.class, this, ETCSDataPackage.TRAIN__LOCATION_REAR);
		}
		return locationRear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualSubSection> getLocationFront() {
		if (locationFront == null) {
			locationFront = new EObjectResolvingEList<VirtualSubSection>(VirtualSubSection.class, this, ETCSDataPackage.TRAIN__LOCATION_FRONT);
		}
		return locationFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSubSection getFrontMA() {
		if (frontMA != null && frontMA.eIsProxy()) {
			InternalEObject oldFrontMA = (InternalEObject)frontMA;
			frontMA = (VirtualSubSection)eResolveProxy(oldFrontMA);
			if (frontMA != oldFrontMA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETCSDataPackage.TRAIN__FRONT_MA, oldFrontMA, frontMA));
			}
		}
		return frontMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSubSection basicGetFrontMA() {
		return frontMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontMA(VirtualSubSection newFrontMA) {
		VirtualSubSection oldFrontMA = frontMA;
		frontMA = newFrontMA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETCSDataPackage.TRAIN__FRONT_MA, oldFrontMA, frontMA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSubSection getRearMA() {
		if (rearMA != null && rearMA.eIsProxy()) {
			InternalEObject oldRearMA = (InternalEObject)rearMA;
			rearMA = (VirtualSubSection)eResolveProxy(oldRearMA);
			if (rearMA != oldRearMA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETCSDataPackage.TRAIN__REAR_MA, oldRearMA, rearMA));
			}
		}
		return rearMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSubSection basicGetRearMA() {
		return rearMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRearMA(VirtualSubSection newRearMA) {
		VirtualSubSection oldRearMA = rearMA;
		rearMA = newRearMA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETCSDataPackage.TRAIN__REAR_MA, oldRearMA, rearMA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrainConnected() {
		return trainConnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainConnected(boolean newTrainConnected) {
		boolean oldTrainConnected = trainConnected;
		trainConnected = newTrainConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETCSDataPackage.TRAIN__TRAIN_CONNECTED, oldTrainConnected, trainConnected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrainReConnected() {
		return trainReConnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainReConnected(boolean newTrainReConnected) {
		boolean oldTrainReConnected = trainReConnected;
		trainReConnected = newTrainReConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETCSDataPackage.TRAIN__TRAIN_RE_CONNECTED, oldTrainReConnected, trainReConnected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindOfTrains getKindOfTrain() {
		return kindOfTrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindOfTrain(KindOfTrains newKindOfTrain) {
		KindOfTrains oldKindOfTrain = kindOfTrain;
		kindOfTrain = newKindOfTrain == null ? KIND_OF_TRAIN_EDEFAULT : newKindOfTrain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETCSDataPackage.TRAIN__KIND_OF_TRAIN, oldKindOfTrain, kindOfTrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ETCSDataPackage.TRAIN__ID:
				return getId();
			case ETCSDataPackage.TRAIN__OCCUPY_FRONT:
				return getOccupyFront();
			case ETCSDataPackage.TRAIN__OCCUPY_REAR:
				return getOccupyRear();
			case ETCSDataPackage.TRAIN__LOCATION_REAR:
				return getLocationRear();
			case ETCSDataPackage.TRAIN__LOCATION_FRONT:
				return getLocationFront();
			case ETCSDataPackage.TRAIN__FRONT_MA:
				if (resolve) return getFrontMA();
				return basicGetFrontMA();
			case ETCSDataPackage.TRAIN__REAR_MA:
				if (resolve) return getRearMA();
				return basicGetRearMA();
			case ETCSDataPackage.TRAIN__TRAIN_CONNECTED:
				return isTrainConnected();
			case ETCSDataPackage.TRAIN__TRAIN_RE_CONNECTED:
				return isTrainReConnected();
			case ETCSDataPackage.TRAIN__KIND_OF_TRAIN:
				return getKindOfTrain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ETCSDataPackage.TRAIN__ID:
				setId((String)newValue);
				return;
			case ETCSDataPackage.TRAIN__OCCUPY_FRONT:
				getOccupyFront().clear();
				getOccupyFront().addAll((Collection<? extends VirtualSubSection>)newValue);
				return;
			case ETCSDataPackage.TRAIN__OCCUPY_REAR:
				getOccupyRear().clear();
				getOccupyRear().addAll((Collection<? extends VirtualSubSection>)newValue);
				return;
			case ETCSDataPackage.TRAIN__LOCATION_REAR:
				getLocationRear().clear();
				getLocationRear().addAll((Collection<? extends VirtualSubSection>)newValue);
				return;
			case ETCSDataPackage.TRAIN__LOCATION_FRONT:
				getLocationFront().clear();
				getLocationFront().addAll((Collection<? extends VirtualSubSection>)newValue);
				return;
			case ETCSDataPackage.TRAIN__FRONT_MA:
				setFrontMA((VirtualSubSection)newValue);
				return;
			case ETCSDataPackage.TRAIN__REAR_MA:
				setRearMA((VirtualSubSection)newValue);
				return;
			case ETCSDataPackage.TRAIN__TRAIN_CONNECTED:
				setTrainConnected((Boolean)newValue);
				return;
			case ETCSDataPackage.TRAIN__TRAIN_RE_CONNECTED:
				setTrainReConnected((Boolean)newValue);
				return;
			case ETCSDataPackage.TRAIN__KIND_OF_TRAIN:
				setKindOfTrain((KindOfTrains)newValue);
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
			case ETCSDataPackage.TRAIN__ID:
				setId(ID_EDEFAULT);
				return;
			case ETCSDataPackage.TRAIN__OCCUPY_FRONT:
				getOccupyFront().clear();
				return;
			case ETCSDataPackage.TRAIN__OCCUPY_REAR:
				getOccupyRear().clear();
				return;
			case ETCSDataPackage.TRAIN__LOCATION_REAR:
				getLocationRear().clear();
				return;
			case ETCSDataPackage.TRAIN__LOCATION_FRONT:
				getLocationFront().clear();
				return;
			case ETCSDataPackage.TRAIN__FRONT_MA:
				setFrontMA((VirtualSubSection)null);
				return;
			case ETCSDataPackage.TRAIN__REAR_MA:
				setRearMA((VirtualSubSection)null);
				return;
			case ETCSDataPackage.TRAIN__TRAIN_CONNECTED:
				setTrainConnected(TRAIN_CONNECTED_EDEFAULT);
				return;
			case ETCSDataPackage.TRAIN__TRAIN_RE_CONNECTED:
				setTrainReConnected(TRAIN_RE_CONNECTED_EDEFAULT);
				return;
			case ETCSDataPackage.TRAIN__KIND_OF_TRAIN:
				setKindOfTrain(KIND_OF_TRAIN_EDEFAULT);
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
			case ETCSDataPackage.TRAIN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ETCSDataPackage.TRAIN__OCCUPY_FRONT:
				return occupyFront != null && !occupyFront.isEmpty();
			case ETCSDataPackage.TRAIN__OCCUPY_REAR:
				return occupyRear != null && !occupyRear.isEmpty();
			case ETCSDataPackage.TRAIN__LOCATION_REAR:
				return locationRear != null && !locationRear.isEmpty();
			case ETCSDataPackage.TRAIN__LOCATION_FRONT:
				return locationFront != null && !locationFront.isEmpty();
			case ETCSDataPackage.TRAIN__FRONT_MA:
				return frontMA != null;
			case ETCSDataPackage.TRAIN__REAR_MA:
				return rearMA != null;
			case ETCSDataPackage.TRAIN__TRAIN_CONNECTED:
				return trainConnected != TRAIN_CONNECTED_EDEFAULT;
			case ETCSDataPackage.TRAIN__TRAIN_RE_CONNECTED:
				return trainReConnected != TRAIN_RE_CONNECTED_EDEFAULT;
			case ETCSDataPackage.TRAIN__KIND_OF_TRAIN:
				return kindOfTrain != KIND_OF_TRAIN_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Id: ");
		result.append(id);
		result.append(", TrainConnected: ");
		result.append(trainConnected);
		result.append(", TrainReConnected: ");
		result.append(trainReConnected);
		result.append(", KindOfTrain: ");
		result.append(kindOfTrain);
		result.append(')');
		return result.toString();
	}

} //TrainImpl
