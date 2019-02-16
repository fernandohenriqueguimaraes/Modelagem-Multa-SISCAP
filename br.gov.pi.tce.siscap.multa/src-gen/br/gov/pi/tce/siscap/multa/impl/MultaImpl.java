/**
 */
package br.gov.pi.tce.siscap.multa.impl;

import br.gov.pi.tce.siscap.multa.Multa;
import br.gov.pi.tce.siscap.multa.MultaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.gov.pi.tce.siscap.multa.impl.MultaImpl#getEmpresa <em>Empresa</em>}</li>
 *   <li>{@link br.gov.pi.tce.siscap.multa.impl.MultaImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link br.gov.pi.tce.siscap.multa.impl.MultaImpl#getJustificativa <em>Justificativa</em>}</li>
 *   <li>{@link br.gov.pi.tce.siscap.multa.impl.MultaImpl#getLinkEvidencia <em>Link Evidencia</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultaImpl extends MinimalEObjectImpl.Container implements Multa {
	/**
	 * The default value of the '{@link #getEmpresa() <em>Empresa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpresa()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPRESA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmpresa() <em>Empresa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpresa()
	 * @generated
	 * @ordered
	 */
	protected String empresa = EMPRESA_EDEFAULT;

	/**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final double VALOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected double valor = VALOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustificativa() <em>Justificativa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustificativa()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFICATIVA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustificativa() <em>Justificativa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustificativa()
	 * @generated
	 * @ordered
	 */
	protected String justificativa = JUSTIFICATIVA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkEvidencia() <em>Link Evidencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkEvidencia()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_EVIDENCIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkEvidencia() <em>Link Evidencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkEvidencia()
	 * @generated
	 * @ordered
	 */
	protected String linkEvidencia = LINK_EVIDENCIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultaPackage.Literals.MULTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmpresa(String newEmpresa) {
		String oldEmpresa = empresa;
		empresa = newEmpresa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultaPackage.MULTA__EMPRESA, oldEmpresa, empresa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValor(double newValor) {
		double oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultaPackage.MULTA__VALOR, oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJustificativa() {
		return justificativa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJustificativa(String newJustificativa) {
		String oldJustificativa = justificativa;
		justificativa = newJustificativa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultaPackage.MULTA__JUSTIFICATIVA, oldJustificativa,
					justificativa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkEvidencia() {
		return linkEvidencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkEvidencia(String newLinkEvidencia) {
		String oldLinkEvidencia = linkEvidencia;
		linkEvidencia = newLinkEvidencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultaPackage.MULTA__LINK_EVIDENCIA, oldLinkEvidencia,
					linkEvidencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MultaPackage.MULTA__EMPRESA:
			return getEmpresa();
		case MultaPackage.MULTA__VALOR:
			return getValor();
		case MultaPackage.MULTA__JUSTIFICATIVA:
			return getJustificativa();
		case MultaPackage.MULTA__LINK_EVIDENCIA:
			return getLinkEvidencia();
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
		case MultaPackage.MULTA__EMPRESA:
			setEmpresa((String) newValue);
			return;
		case MultaPackage.MULTA__VALOR:
			setValor((Double) newValue);
			return;
		case MultaPackage.MULTA__JUSTIFICATIVA:
			setJustificativa((String) newValue);
			return;
		case MultaPackage.MULTA__LINK_EVIDENCIA:
			setLinkEvidencia((String) newValue);
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
		case MultaPackage.MULTA__EMPRESA:
			setEmpresa(EMPRESA_EDEFAULT);
			return;
		case MultaPackage.MULTA__VALOR:
			setValor(VALOR_EDEFAULT);
			return;
		case MultaPackage.MULTA__JUSTIFICATIVA:
			setJustificativa(JUSTIFICATIVA_EDEFAULT);
			return;
		case MultaPackage.MULTA__LINK_EVIDENCIA:
			setLinkEvidencia(LINK_EVIDENCIA_EDEFAULT);
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
		case MultaPackage.MULTA__EMPRESA:
			return EMPRESA_EDEFAULT == null ? empresa != null : !EMPRESA_EDEFAULT.equals(empresa);
		case MultaPackage.MULTA__VALOR:
			return valor != VALOR_EDEFAULT;
		case MultaPackage.MULTA__JUSTIFICATIVA:
			return JUSTIFICATIVA_EDEFAULT == null ? justificativa != null
					: !JUSTIFICATIVA_EDEFAULT.equals(justificativa);
		case MultaPackage.MULTA__LINK_EVIDENCIA:
			return LINK_EVIDENCIA_EDEFAULT == null ? linkEvidencia != null
					: !LINK_EVIDENCIA_EDEFAULT.equals(linkEvidencia);
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
		result.append(" (empresa: ");
		result.append(empresa);
		result.append(", valor: ");
		result.append(valor);
		result.append(", justificativa: ");
		result.append(justificativa);
		result.append(", linkEvidencia: ");
		result.append(linkEvidencia);
		result.append(')');
		return result.toString();
	}

} //MultaImpl
