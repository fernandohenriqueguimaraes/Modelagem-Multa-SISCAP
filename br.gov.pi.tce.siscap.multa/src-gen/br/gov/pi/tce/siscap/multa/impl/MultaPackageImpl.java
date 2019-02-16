/**
 */
package br.gov.pi.tce.siscap.multa.impl;

import br.gov.pi.tce.siscap.multa.Multa;
import br.gov.pi.tce.siscap.multa.MultaFactory;
import br.gov.pi.tce.siscap.multa.MultaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultaPackageImpl extends EPackageImpl implements MultaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see br.gov.pi.tce.siscap.multa.MultaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MultaPackageImpl() {
		super(eNS_URI, MultaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MultaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MultaPackage init() {
		if (isInited)
			return (MultaPackage) EPackage.Registry.INSTANCE.getEPackage(MultaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMultaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MultaPackageImpl theMultaPackage = registeredMultaPackage instanceof MultaPackageImpl
				? (MultaPackageImpl) registeredMultaPackage
				: new MultaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMultaPackage.createPackageContents();

		// Initialize created meta-data
		theMultaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMultaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MultaPackage.eNS_URI, theMultaPackage);
		return theMultaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMulta() {
		return multaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMulta_Empresa() {
		return (EAttribute) multaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMulta_Valor() {
		return (EAttribute) multaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMulta_Justificativa() {
		return (EAttribute) multaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMulta_LinkEvidencia() {
		return (EAttribute) multaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultaFactory getMultaFactory() {
		return (MultaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		multaEClass = createEClass(MULTA);
		createEAttribute(multaEClass, MULTA__EMPRESA);
		createEAttribute(multaEClass, MULTA__VALOR);
		createEAttribute(multaEClass, MULTA__JUSTIFICATIVA);
		createEAttribute(multaEClass, MULTA__LINK_EVIDENCIA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(multaEClass, Multa.class, "Multa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMulta_Empresa(), ecorePackage.getEString(), "empresa", null, 0, 1, Multa.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMulta_Valor(), ecorePackage.getEDouble(), "valor", null, 0, 1, Multa.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMulta_Justificativa(), ecorePackage.getEString(), "justificativa", null, 0, 1, Multa.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMulta_LinkEvidencia(), ecorePackage.getEString(), "linkEvidencia", null, 0, 1, Multa.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MultaPackageImpl
