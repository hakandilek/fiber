/**
 * <copyright>
 * </copyright>
 *

 */
package com.minimalabs.fiber.fiber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.minimalabs.fiber.fiber.Model#getTypes <em>Types</em>}</li>
 *   <li>{@link com.minimalabs.fiber.fiber.Model#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.minimalabs.fiber.fiber.FiberPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link com.minimalabs.fiber.fiber.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see com.minimalabs.fiber.fiber.FiberPackage#getModel_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference list.
   * The list contents are of type {@link com.minimalabs.fiber.fiber.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference list.
   * @see com.minimalabs.fiber.fiber.FiberPackage#getModel_Services()
   * @model containment="true"
   * @generated
   */
  EList<Service> getServices();

} // Model
