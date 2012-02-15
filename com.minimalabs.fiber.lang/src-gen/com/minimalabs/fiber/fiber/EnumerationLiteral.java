/**
 * <copyright>
 * </copyright>
 *

 */
package com.minimalabs.fiber.fiber;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.minimalabs.fiber.fiber.EnumerationLiteral#getName <em>Name</em>}</li>
 *   <li>{@link com.minimalabs.fiber.fiber.EnumerationLiteral#getOrdinal <em>Ordinal</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.minimalabs.fiber.fiber.FiberPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.minimalabs.fiber.fiber.FiberPackage#getEnumerationLiteral_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.minimalabs.fiber.fiber.EnumerationLiteral#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordinal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordinal</em>' attribute.
   * @see #setOrdinal(int)
   * @see com.minimalabs.fiber.fiber.FiberPackage#getEnumerationLiteral_Ordinal()
   * @model
   * @generated
   */
  int getOrdinal();

  /**
   * Sets the value of the '{@link com.minimalabs.fiber.fiber.EnumerationLiteral#getOrdinal <em>Ordinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordinal</em>' attribute.
   * @see #getOrdinal()
   * @generated
   */
  void setOrdinal(int value);

} // EnumerationLiteral
