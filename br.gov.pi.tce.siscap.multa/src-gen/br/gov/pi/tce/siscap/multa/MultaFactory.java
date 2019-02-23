/**
 */
package br.gov.pi.tce.siscap.multa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.gov.pi.tce.siscap.multa.MultaPackage
 * @generated
 */
public interface MultaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultaFactory eINSTANCE = br.gov.pi.tce.siscap.multa.impl.MultaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Multa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multa</em>'.
	 * @generated
	 */
	Multa createMulta();

	/**
	 * Returns a new object of class '<em>Conjunto Multa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjunto Multa</em>'.
	 * @generated
	 */
	ConjuntoMulta createConjuntoMulta();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MultaPackage getMultaPackage();

} //MultaFactory
