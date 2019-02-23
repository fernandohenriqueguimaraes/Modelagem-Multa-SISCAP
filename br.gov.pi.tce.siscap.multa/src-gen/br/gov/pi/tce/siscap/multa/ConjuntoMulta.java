/**
 */
package br.gov.pi.tce.siscap.multa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjunto Multa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.gov.pi.tce.siscap.multa.ConjuntoMulta#getNomeConjunto <em>Nome Conjunto</em>}</li>
 *   <li>{@link br.gov.pi.tce.siscap.multa.ConjuntoMulta#getMultas <em>Multas</em>}</li>
 * </ul>
 *
 * @see br.gov.pi.tce.siscap.multa.MultaPackage#getConjuntoMulta()
 * @model
 * @generated
 */
public interface ConjuntoMulta extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome Conjunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome Conjunto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome Conjunto</em>' attribute.
	 * @see #setNomeConjunto(String)
	 * @see br.gov.pi.tce.siscap.multa.MultaPackage#getConjuntoMulta_NomeConjunto()
	 * @model
	 * @generated
	 */
	String getNomeConjunto();

	/**
	 * Sets the value of the '{@link br.gov.pi.tce.siscap.multa.ConjuntoMulta#getNomeConjunto <em>Nome Conjunto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Conjunto</em>' attribute.
	 * @see #getNomeConjunto()
	 * @generated
	 */
	void setNomeConjunto(String value);

	/**
	 * Returns the value of the '<em><b>Multas</b></em>' containment reference list.
	 * The list contents are of type {@link br.gov.pi.tce.siscap.multa.Multa}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multas</em>' containment reference list.
	 * @see br.gov.pi.tce.siscap.multa.MultaPackage#getConjuntoMulta_Multas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Multa> getMultas();

} // ConjuntoMulta
