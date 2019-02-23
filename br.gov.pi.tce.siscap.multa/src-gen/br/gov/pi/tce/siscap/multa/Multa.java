/**
 */
package br.gov.pi.tce.siscap.multa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.gov.pi.tce.siscap.multa.Multa#getEmpresa <em>Empresa</em>}</li>
 *   <li>{@link br.gov.pi.tce.siscap.multa.Multa#getValor <em>Valor</em>}</li>
 *   <li>{@link br.gov.pi.tce.siscap.multa.Multa#getJustificativa <em>Justificativa</em>}</li>
 *   <li>{@link br.gov.pi.tce.siscap.multa.Multa#getLinkEvidencia <em>Link Evidencia</em>}</li>
 *   <li>{@link br.gov.pi.tce.siscap.multa.Multa#isInicio <em>Inicio</em>}</li>
 *   <li>{@link br.gov.pi.tce.siscap.multa.Multa#isFim <em>Fim</em>}</li>
 * </ul>
 *
 * @see br.gov.pi.tce.siscap.multa.MultaPackage#getMulta()
 * @model
 * @generated
 */
public interface Multa extends EObject {
	/**
	 * Returns the value of the '<em><b>Empresa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empresa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empresa</em>' attribute.
	 * @see #setEmpresa(String)
	 * @see br.gov.pi.tce.siscap.multa.MultaPackage#getMulta_Empresa()
	 * @model unique="false"
	 * @generated
	 */
	String getEmpresa();

	/**
	 * Sets the value of the '{@link br.gov.pi.tce.siscap.multa.Multa#getEmpresa <em>Empresa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empresa</em>' attribute.
	 * @see #getEmpresa()
	 * @generated
	 */
	void setEmpresa(String value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(double)
	 * @see br.gov.pi.tce.siscap.multa.MultaPackage#getMulta_Valor()
	 * @model
	 * @generated
	 */
	double getValor();

	/**
	 * Sets the value of the '{@link br.gov.pi.tce.siscap.multa.Multa#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(double value);

	/**
	 * Returns the value of the '<em><b>Justificativa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justificativa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justificativa</em>' attribute.
	 * @see #setJustificativa(String)
	 * @see br.gov.pi.tce.siscap.multa.MultaPackage#getMulta_Justificativa()
	 * @model
	 * @generated
	 */
	String getJustificativa();

	/**
	 * Sets the value of the '{@link br.gov.pi.tce.siscap.multa.Multa#getJustificativa <em>Justificativa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justificativa</em>' attribute.
	 * @see #getJustificativa()
	 * @generated
	 */
	void setJustificativa(String value);

	/**
	 * Returns the value of the '<em><b>Link Evidencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Evidencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Evidencia</em>' attribute.
	 * @see #setLinkEvidencia(String)
	 * @see br.gov.pi.tce.siscap.multa.MultaPackage#getMulta_LinkEvidencia()
	 * @model
	 * @generated
	 */
	String getLinkEvidencia();

	/**
	 * Sets the value of the '{@link br.gov.pi.tce.siscap.multa.Multa#getLinkEvidencia <em>Link Evidencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Evidencia</em>' attribute.
	 * @see #getLinkEvidencia()
	 * @generated
	 */
	void setLinkEvidencia(String value);

	/**
	 * Returns the value of the '<em><b>Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inicio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inicio</em>' attribute.
	 * @see #setInicio(boolean)
	 * @see br.gov.pi.tce.siscap.multa.MultaPackage#getMulta_Inicio()
	 * @model
	 * @generated
	 */
	boolean isInicio();

	/**
	 * Sets the value of the '{@link br.gov.pi.tce.siscap.multa.Multa#isInicio <em>Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inicio</em>' attribute.
	 * @see #isInicio()
	 * @generated
	 */
	void setInicio(boolean value);

	/**
	 * Returns the value of the '<em><b>Fim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fim</em>' attribute.
	 * @see #setFim(boolean)
	 * @see br.gov.pi.tce.siscap.multa.MultaPackage#getMulta_Fim()
	 * @model
	 * @generated
	 */
	boolean isFim();

	/**
	 * Sets the value of the '{@link br.gov.pi.tce.siscap.multa.Multa#isFim <em>Fim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fim</em>' attribute.
	 * @see #isFim()
	 * @generated
	 */
	void setFim(boolean value);

} // Multa
