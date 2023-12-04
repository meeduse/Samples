/**
 */
package eTCSData.impl;

import eTCSData.ETCSDataPackage;
import eTCSData.ETCSModel;
import eTCSData.SupervisionStatus;
import eTCSData.Train;

import extractedMM.DocumentRoot;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eTCSData.impl.ETCSModelImpl#getTrains <em>Trains</em>}</li>
 *   <li>{@link eTCSData.impl.ETCSModelImpl#getEulynxModel <em>Eulynx Model</em>}</li>
 *   <li>{@link eTCSData.impl.ETCSModelImpl#getSupervisionOfTrain <em>Supervision Of Train</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCSModelImpl extends MinimalEObjectImpl.Container implements ETCSModel {
	/**
	 * The cached value of the '{@link #getTrains() <em>Trains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrains()
	 * @generated
	 * @ordered
	 */
	protected EList<Train> trains;

	/**
	 * The cached value of the '{@link #getEulynxModel() <em>Eulynx Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEulynxModel()
	 * @generated
	 * @ordered
	 */
	protected DocumentRoot eulynxModel;

	/**
	 * The default value of the '{@link #getSupervisionOfTrain() <em>Supervision Of Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisionOfTrain()
	 * @generated
	 * @ordered
	 */
	protected static final SupervisionStatus SUPERVISION_OF_TRAIN_EDEFAULT = SupervisionStatus.ACTIVE;

	/**
	 * The cached value of the '{@link #getSupervisionOfTrain() <em>Supervision Of Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisionOfTrain()
	 * @generated
	 * @ordered
	 */
	protected SupervisionStatus supervisionOfTrain = SUPERVISION_OF_TRAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCSModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ETCSDataPackage.Literals.ETCS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Train> getTrains() {
		if (trains == null) {
			trains = new EObjectContainmentEList<Train>(Train.class, this, ETCSDataPackage.ETCS_MODEL__TRAINS);
		}
		return trains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot getEulynxModel() {
		if (eulynxModel != null && eulynxModel.eIsProxy()) {
			InternalEObject oldEulynxModel = (InternalEObject)eulynxModel;
			eulynxModel = (DocumentRoot)eResolveProxy(oldEulynxModel);
			if (eulynxModel != oldEulynxModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETCSDataPackage.ETCS_MODEL__EULYNX_MODEL, oldEulynxModel, eulynxModel));
			}
		}
		return eulynxModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot basicGetEulynxModel() {
		return eulynxModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEulynxModel(DocumentRoot newEulynxModel) {
		DocumentRoot oldEulynxModel = eulynxModel;
		eulynxModel = newEulynxModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETCSDataPackage.ETCS_MODEL__EULYNX_MODEL, oldEulynxModel, eulynxModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisionStatus getSupervisionOfTrain() {
		return supervisionOfTrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervisionOfTrain(SupervisionStatus newSupervisionOfTrain) {
		SupervisionStatus oldSupervisionOfTrain = supervisionOfTrain;
		supervisionOfTrain = newSupervisionOfTrain == null ? SUPERVISION_OF_TRAIN_EDEFAULT : newSupervisionOfTrain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETCSDataPackage.ETCS_MODEL__SUPERVISION_OF_TRAIN, oldSupervisionOfTrain, supervisionOfTrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ETCSDataPackage.ETCS_MODEL__TRAINS:
				return ((InternalEList<?>)getTrains()).basicRemove(otherEnd, msgs);
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
			case ETCSDataPackage.ETCS_MODEL__TRAINS:
				return getTrains();
			case ETCSDataPackage.ETCS_MODEL__EULYNX_MODEL:
				if (resolve) return getEulynxModel();
				return basicGetEulynxModel();
			case ETCSDataPackage.ETCS_MODEL__SUPERVISION_OF_TRAIN:
				return getSupervisionOfTrain();
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
			case ETCSDataPackage.ETCS_MODEL__TRAINS:
				getTrains().clear();
				getTrains().addAll((Collection<? extends Train>)newValue);
				return;
			case ETCSDataPackage.ETCS_MODEL__EULYNX_MODEL:
				setEulynxModel((DocumentRoot)newValue);
				return;
			case ETCSDataPackage.ETCS_MODEL__SUPERVISION_OF_TRAIN:
				setSupervisionOfTrain((SupervisionStatus)newValue);
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
			case ETCSDataPackage.ETCS_MODEL__TRAINS:
				getTrains().clear();
				return;
			case ETCSDataPackage.ETCS_MODEL__EULYNX_MODEL:
				setEulynxModel((DocumentRoot)null);
				return;
			case ETCSDataPackage.ETCS_MODEL__SUPERVISION_OF_TRAIN:
				setSupervisionOfTrain(SUPERVISION_OF_TRAIN_EDEFAULT);
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
			case ETCSDataPackage.ETCS_MODEL__TRAINS:
				return trains != null && !trains.isEmpty();
			case ETCSDataPackage.ETCS_MODEL__EULYNX_MODEL:
				return eulynxModel != null;
			case ETCSDataPackage.ETCS_MODEL__SUPERVISION_OF_TRAIN:
				return supervisionOfTrain != SUPERVISION_OF_TRAIN_EDEFAULT;
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
		result.append(" (SupervisionOfTrain: ");
		result.append(supervisionOfTrain);
		result.append(')');
		return result.toString();
	}

} //ETCSModelImpl
