/**
 */
package br.gov.pi.tce.siscap.multa.impl;

import br.gov.pi.tce.siscap.multa.ConjuntoMulta;
import br.gov.pi.tce.siscap.multa.Multa;
import br.gov.pi.tce.siscap.multa.MultaPackage;

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
 * An implementation of the model object '<em><b>Conjunto Multa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.gov.pi.tce.siscap.multa.impl.ConjuntoMultaImpl#getNomeConjunto <em>Nome Conjunto</em>}</li>
 *   <li>{@link br.gov.pi.tce.siscap.multa.impl.ConjuntoMultaImpl#getMultas <em>Multas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConjuntoMultaImpl extends MinimalEObjectImpl.Container implements ConjuntoMulta {
	/**
	 * The default value of the '{@link #getNomeConjunto() <em>Nome Conjunto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeConjunto()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_CONJUNTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomeConjunto() <em>Nome Conjunto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeConjunto()
	 * @generated
	 * @ordered
	 */
	protected String nomeConjunto = NOME_CONJUNTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMultas() <em>Multas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultas()
	 * @generated
	 * @ordered
	 */
	protected EList<Multa> multas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjuntoMultaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultaPackage.Literals.CONJUNTO_MULTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNomeConjunto() {
		return nomeConjunto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNomeConjunto(String newNomeConjunto) {
		String oldNomeConjunto = nomeConjunto;
		nomeConjunto = newNomeConjunto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultaPackage.CONJUNTO_MULTA__NOME_CONJUNTO,
					oldNomeConjunto, nomeConjunto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Multa> getMultas() {
		if (multas == null) {
			multas = new EObjectContainmentEList<Multa>(Multa.class, this, MultaPackage.CONJUNTO_MULTA__MULTAS);
		}
		return multas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MultaPackage.CONJUNTO_MULTA__MULTAS:
			return ((InternalEList<?>) getMultas()).basicRemove(otherEnd, msgs);
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
		case MultaPackage.CONJUNTO_MULTA__NOME_CONJUNTO:
			return getNomeConjunto();
		case MultaPackage.CONJUNTO_MULTA__MULTAS:
			return getMultas();
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
		case MultaPackage.CONJUNTO_MULTA__NOME_CONJUNTO:
			setNomeConjunto((String) newValue);
			return;
		case MultaPackage.CONJUNTO_MULTA__MULTAS:
			getMultas().clear();
			getMultas().addAll((Collection<? extends Multa>) newValue);
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
		case MultaPackage.CONJUNTO_MULTA__NOME_CONJUNTO:
			setNomeConjunto(NOME_CONJUNTO_EDEFAULT);
			return;
		case MultaPackage.CONJUNTO_MULTA__MULTAS:
			getMultas().clear();
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
		case MultaPackage.CONJUNTO_MULTA__NOME_CONJUNTO:
			return NOME_CONJUNTO_EDEFAULT == null ? nomeConjunto != null : !NOME_CONJUNTO_EDEFAULT.equals(nomeConjunto);
		case MultaPackage.CONJUNTO_MULTA__MULTAS:
			return multas != null && !multas.isEmpty();
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
		result.append(" (nomeConjunto: ");
		result.append(nomeConjunto);
		result.append(')');
		return result.toString();
	}

} //ConjuntoMultaImpl
