/**
 */
package br.gov.pi.tce.siscap.multa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.gov.pi.tce.siscap.multa.MultaFactory
 * @model kind="package"
 * @generated
 */
public interface MultaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "multa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/multa";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "multa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultaPackage eINSTANCE = br.gov.pi.tce.siscap.multa.impl.MultaPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.gov.pi.tce.siscap.multa.impl.MultaImpl <em>Multa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.gov.pi.tce.siscap.multa.impl.MultaImpl
	 * @see br.gov.pi.tce.siscap.multa.impl.MultaPackageImpl#getMulta()
	 * @generated
	 */
	int MULTA = 0;

	/**
	 * The feature id for the '<em><b>Empresa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTA__EMPRESA = 0;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTA__VALOR = 1;

	/**
	 * The feature id for the '<em><b>Justificativa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTA__JUSTIFICATIVA = 2;

	/**
	 * The feature id for the '<em><b>Link Evidencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTA__LINK_EVIDENCIA = 3;

	/**
	 * The feature id for the '<em><b>Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTA__INICIO = 4;

	/**
	 * The feature id for the '<em><b>Fim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTA__FIM = 5;

	/**
	 * The number of structural features of the '<em>Multa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Multa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.gov.pi.tce.siscap.multa.impl.ConjuntoMultaImpl <em>Conjunto Multa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.gov.pi.tce.siscap.multa.impl.ConjuntoMultaImpl
	 * @see br.gov.pi.tce.siscap.multa.impl.MultaPackageImpl#getConjuntoMulta()
	 * @generated
	 */
	int CONJUNTO_MULTA = 1;

	/**
	 * The feature id for the '<em><b>Nome Conjunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_MULTA__NOME_CONJUNTO = 0;

	/**
	 * The feature id for the '<em><b>Multas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_MULTA__MULTAS = 1;

	/**
	 * The number of structural features of the '<em>Conjunto Multa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_MULTA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conjunto Multa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_MULTA_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link br.gov.pi.tce.siscap.multa.Multa <em>Multa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multa</em>'.
	 * @see br.gov.pi.tce.siscap.multa.Multa
	 * @generated
	 */
	EClass getMulta();

	/**
	 * Returns the meta object for the attribute '{@link br.gov.pi.tce.siscap.multa.Multa#getEmpresa <em>Empresa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empresa</em>'.
	 * @see br.gov.pi.tce.siscap.multa.Multa#getEmpresa()
	 * @see #getMulta()
	 * @generated
	 */
	EAttribute getMulta_Empresa();

	/**
	 * Returns the meta object for the attribute '{@link br.gov.pi.tce.siscap.multa.Multa#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see br.gov.pi.tce.siscap.multa.Multa#getValor()
	 * @see #getMulta()
	 * @generated
	 */
	EAttribute getMulta_Valor();

	/**
	 * Returns the meta object for the attribute '{@link br.gov.pi.tce.siscap.multa.Multa#getJustificativa <em>Justificativa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justificativa</em>'.
	 * @see br.gov.pi.tce.siscap.multa.Multa#getJustificativa()
	 * @see #getMulta()
	 * @generated
	 */
	EAttribute getMulta_Justificativa();

	/**
	 * Returns the meta object for the attribute '{@link br.gov.pi.tce.siscap.multa.Multa#getLinkEvidencia <em>Link Evidencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Evidencia</em>'.
	 * @see br.gov.pi.tce.siscap.multa.Multa#getLinkEvidencia()
	 * @see #getMulta()
	 * @generated
	 */
	EAttribute getMulta_LinkEvidencia();

	/**
	 * Returns the meta object for the attribute '{@link br.gov.pi.tce.siscap.multa.Multa#isInicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inicio</em>'.
	 * @see br.gov.pi.tce.siscap.multa.Multa#isInicio()
	 * @see #getMulta()
	 * @generated
	 */
	EAttribute getMulta_Inicio();

	/**
	 * Returns the meta object for the attribute '{@link br.gov.pi.tce.siscap.multa.Multa#isFim <em>Fim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fim</em>'.
	 * @see br.gov.pi.tce.siscap.multa.Multa#isFim()
	 * @see #getMulta()
	 * @generated
	 */
	EAttribute getMulta_Fim();

	/**
	 * Returns the meta object for class '{@link br.gov.pi.tce.siscap.multa.ConjuntoMulta <em>Conjunto Multa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunto Multa</em>'.
	 * @see br.gov.pi.tce.siscap.multa.ConjuntoMulta
	 * @generated
	 */
	EClass getConjuntoMulta();

	/**
	 * Returns the meta object for the attribute '{@link br.gov.pi.tce.siscap.multa.ConjuntoMulta#getNomeConjunto <em>Nome Conjunto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome Conjunto</em>'.
	 * @see br.gov.pi.tce.siscap.multa.ConjuntoMulta#getNomeConjunto()
	 * @see #getConjuntoMulta()
	 * @generated
	 */
	EAttribute getConjuntoMulta_NomeConjunto();

	/**
	 * Returns the meta object for the containment reference list '{@link br.gov.pi.tce.siscap.multa.ConjuntoMulta#getMultas <em>Multas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multas</em>'.
	 * @see br.gov.pi.tce.siscap.multa.ConjuntoMulta#getMultas()
	 * @see #getConjuntoMulta()
	 * @generated
	 */
	EReference getConjuntoMulta_Multas();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MultaFactory getMultaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.gov.pi.tce.siscap.multa.impl.MultaImpl <em>Multa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.gov.pi.tce.siscap.multa.impl.MultaImpl
		 * @see br.gov.pi.tce.siscap.multa.impl.MultaPackageImpl#getMulta()
		 * @generated
		 */
		EClass MULTA = eINSTANCE.getMulta();

		/**
		 * The meta object literal for the '<em><b>Empresa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTA__EMPRESA = eINSTANCE.getMulta_Empresa();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTA__VALOR = eINSTANCE.getMulta_Valor();

		/**
		 * The meta object literal for the '<em><b>Justificativa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTA__JUSTIFICATIVA = eINSTANCE.getMulta_Justificativa();

		/**
		 * The meta object literal for the '<em><b>Link Evidencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTA__LINK_EVIDENCIA = eINSTANCE.getMulta_LinkEvidencia();

		/**
		 * The meta object literal for the '<em><b>Inicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTA__INICIO = eINSTANCE.getMulta_Inicio();

		/**
		 * The meta object literal for the '<em><b>Fim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTA__FIM = eINSTANCE.getMulta_Fim();

		/**
		 * The meta object literal for the '{@link br.gov.pi.tce.siscap.multa.impl.ConjuntoMultaImpl <em>Conjunto Multa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.gov.pi.tce.siscap.multa.impl.ConjuntoMultaImpl
		 * @see br.gov.pi.tce.siscap.multa.impl.MultaPackageImpl#getConjuntoMulta()
		 * @generated
		 */
		EClass CONJUNTO_MULTA = eINSTANCE.getConjuntoMulta();

		/**
		 * The meta object literal for the '<em><b>Nome Conjunto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONJUNTO_MULTA__NOME_CONJUNTO = eINSTANCE.getConjuntoMulta_NomeConjunto();

		/**
		 * The meta object literal for the '<em><b>Multas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONJUNTO_MULTA__MULTAS = eINSTANCE.getConjuntoMulta_Multas();

	}

} //MultaPackage
