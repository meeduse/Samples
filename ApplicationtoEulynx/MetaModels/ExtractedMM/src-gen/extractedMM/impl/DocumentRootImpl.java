/**
 */
package extractedMM.impl;

import extractedMM.DataPrepEntities;
import extractedMM.DocumentRoot;
import extractedMM.ExtractedMMPackage;
import extractedMM.RsmEntities;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extractedMM.impl.DocumentRootImpl#getDataPrepEntities <em>Data Prep Entities</em>}</li>
 *   <li>{@link extractedMM.impl.DocumentRootImpl#getRsmEntities <em>Rsm Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getDataPrepEntities() <em>Data Prep Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPrepEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPrepEntities> dataPrepEntities;

	/**
	 * The cached value of the '{@link #getRsmEntities() <em>Rsm Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRsmEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<RsmEntities> rsmEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtractedMMPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPrepEntities> getDataPrepEntities() {
		if (dataPrepEntities == null) {
			dataPrepEntities = new EObjectContainmentEList<DataPrepEntities>(DataPrepEntities.class, this,
					ExtractedMMPackage.DOCUMENT_ROOT__DATA_PREP_ENTITIES);
		}
		return dataPrepEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RsmEntities> getRsmEntities() {
		if (rsmEntities == null) {
			rsmEntities = new EObjectContainmentEList<RsmEntities>(RsmEntities.class, this,
					ExtractedMMPackage.DOCUMENT_ROOT__RSM_ENTITIES);
		}
		return rsmEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtractedMMPackage.DOCUMENT_ROOT__DATA_PREP_ENTITIES:
			return ((InternalEList<?>) getDataPrepEntities()).basicRemove(otherEnd, msgs);
		case ExtractedMMPackage.DOCUMENT_ROOT__RSM_ENTITIES:
			return ((InternalEList<?>) getRsmEntities()).basicRemove(otherEnd, msgs);
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
		case ExtractedMMPackage.DOCUMENT_ROOT__DATA_PREP_ENTITIES:
			return getDataPrepEntities();
		case ExtractedMMPackage.DOCUMENT_ROOT__RSM_ENTITIES:
			return getRsmEntities();
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
		case ExtractedMMPackage.DOCUMENT_ROOT__DATA_PREP_ENTITIES:
			getDataPrepEntities().clear();
			getDataPrepEntities().addAll((Collection<? extends DataPrepEntities>) newValue);
			return;
		case ExtractedMMPackage.DOCUMENT_ROOT__RSM_ENTITIES:
			getRsmEntities().clear();
			getRsmEntities().addAll((Collection<? extends RsmEntities>) newValue);
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
		case ExtractedMMPackage.DOCUMENT_ROOT__DATA_PREP_ENTITIES:
			getDataPrepEntities().clear();
			return;
		case ExtractedMMPackage.DOCUMENT_ROOT__RSM_ENTITIES:
			getRsmEntities().clear();
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
		case ExtractedMMPackage.DOCUMENT_ROOT__DATA_PREP_ENTITIES:
			return dataPrepEntities != null && !dataPrepEntities.isEmpty();
		case ExtractedMMPackage.DOCUMENT_ROOT__RSM_ENTITIES:
			return rsmEntities != null && !rsmEntities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentRootImpl
