/**
 * <copyright>
 * </copyright>
 *

 */
package com.minimalabs.fiber.fiber;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.minimalabs.fiber.fiber.Class#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link com.minimalabs.fiber.fiber.Class#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.minimalabs.fiber.fiber.FiberPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Type
{
  /**
   * Returns the value of the '<em><b>Super Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Entity</em>' reference.
   * @see #setSuperEntity(Class)
   * @see com.minimalabs.fiber.fiber.FiberPackage#getClass_SuperEntity()
   * @model
   * @generated
   */
  Class getSuperEntity();

  /**
   * Sets the value of the '{@link com.minimalabs.fiber.fiber.Class#getSuperEntity <em>Super Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Entity</em>' reference.
   * @see #getSuperEntity()
   * @generated
   */
  void setSuperEntity(Class value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link com.minimalabs.fiber.fiber.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see com.minimalabs.fiber.fiber.FiberPackage#getClass_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Class
