/**
 */
package extractedMM.impl;

import extractedMM.ExtractedMMPackage;
import extractedMM.RsmEntities;
import extractedMM.Topology;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rsm Entities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.RsmEntitiesImpl#getUsesEtcsTopology <em>Uses Etcs Topology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RsmEntitiesImpl extends BaseObjectRSMImpl implements RsmEntities {
	/**
	 * The cached value of the '{@link #getUsesEtcsTopology() <em>Uses Etcs Topology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesEtcsTopology()
	 * @generated
	 * @ordered
	 */
	protected Topology usesEtcsTopology;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RsmEntitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.RSM_ENTITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topology getUsesEtcsTopology() {
		return usesEtcsTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesEtcsTopology(Topology newUsesEtcsTopology, NotificationChain msgs) {
		Topology oldUsesEtcsTopology = usesEtcsTopology;
		usesEtcsTopology = newUsesEtcsTopology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExtractedMMPackage.RSM_ENTITIES__USES_ETCS_TOPOLOGY, oldUsesEtcsTopology, newUsesEtcsTopology);
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
	public void setUsesEtcsTopology(Topology newUsesEtcsTopology) {
		if (newUsesEtcsTopology != usesEtcsTopology) {
			NotificationChain msgs = null;
			if (usesEtcsTopology != null)
				msgs = ((InternalEObject) usesEtcsTopology).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExtractedMMPackage.RSM_ENTITIES__USES_ETCS_TOPOLOGY, null, msgs);
			if (newUsesEtcsTopology != null)
				msgs = ((InternalEObject) newUsesEtcsTopology).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExtractedMMPackage.RSM_ENTITIES__USES_ETCS_TOPOLOGY, null, msgs);
			msgs = basicSetUsesEtcsTopology(newUsesEtcsTopology, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtractedMMPackage.RSM_ENTITIES__USES_ETCS_TOPOLOGY,
					newUsesEtcsTopology, newUsesEtcsTopology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtractedMMPackage.RSM_ENTITIES__USES_ETCS_TOPOLOGY:
			return basicSetUsesEtcsTopology(null, msgs);
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
		case ExtractedMMPackage.RSM_ENTITIES__USES_ETCS_TOPOLOGY:
			return getUsesEtcsTopology();
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
		case ExtractedMMPackage.RSM_ENTITIES__USES_ETCS_TOPOLOGY:
			setUsesEtcsTopology((Topology) newValue);
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
		case ExtractedMMPackage.RSM_ENTITIES__USES_ETCS_TOPOLOGY:
			setUsesEtcsTopology((Topology) null);
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
		case ExtractedMMPackage.RSM_ENTITIES__USES_ETCS_TOPOLOGY:
			return usesEtcsTopology != null;
		}
		return super.eIsSet(featureID);
	}

} //RsmEntitiesImpl
