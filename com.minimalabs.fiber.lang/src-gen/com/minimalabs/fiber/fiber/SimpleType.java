/**
 * <copyright>
 * </copyright>
 *

 */
package com.minimalabs.fiber.fiber;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.minimalabs.fiber.fiber.SimpleType#getMappedType <em>Mapped Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.minimalabs.fiber.fiber.FiberPackage#getSimpleType()
 * @model
 * @generated
 */
public interface SimpleType extends ClassType
{
  /**
   * Returns the value of the '<em><b>Mapped Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped Type</em>' containment reference.
   * @see #setMappedType(TypeId)
   * @see com.minimalabs.fiber.fiber.FiberPackage#getSimpleType_MappedType()
   * @model containment="true"
   * @generated
   */
  TypeId getMappedType();

  /**
   * Sets the value of the '{@link com.minimalabs.fiber.fiber.SimpleType#getMappedType <em>Mapped Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped Type</em>' containment reference.
   * @see #getMappedType()
   * @generated
   */
  void setMappedType(TypeId value);

} // SimpleType
