/**
 * <copyright>
 * </copyright>
 *

 */
package com.minimalabs.fiber.fiber.impl;

import com.minimalabs.fiber.fiber.EnumerationLiteral;
import com.minimalabs.fiber.fiber.FiberPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.minimalabs.fiber.fiber.impl.EnumerationLiteralImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.minimalabs.fiber.fiber.impl.EnumerationLiteralImpl#getOrdinal <em>Ordinal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationLiteralImpl extends MinimalEObjectImpl.Container implements EnumerationLiteral
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdinal()
   * @generated
   * @ordered
   */
  protected static final int ORDINAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdinal()
   * @generated
   * @ordered
   */
  protected int ordinal = ORDINAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationLiteralImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FiberPackage.Literals.ENUMERATION_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiberPackage.ENUMERATION_LITERAL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOrdinal()
  {
    return ordinal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrdinal(int newOrdinal)
  {
    int oldOrdinal = ordinal;
    ordinal = newOrdinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiberPackage.ENUMERATION_LITERAL__ORDINAL, oldOrdinal, ordinal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FiberPackage.ENUMERATION_LITERAL__NAME:
        return getName();
      case FiberPackage.ENUMERATION_LITERAL__ORDINAL:
        return getOrdinal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FiberPackage.ENUMERATION_LITERAL__NAME:
        setName((String)newValue);
        return;
      case FiberPackage.ENUMERATION_LITERAL__ORDINAL:
        setOrdinal((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FiberPackage.ENUMERATION_LITERAL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FiberPackage.ENUMERATION_LITERAL__ORDINAL:
        setOrdinal(ORDINAL_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FiberPackage.ENUMERATION_LITERAL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FiberPackage.ENUMERATION_LITERAL__ORDINAL:
        return ordinal != ORDINAL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", ordinal: ");
    result.append(ordinal);
    result.append(')');
    return result.toString();
  }

} //EnumerationLiteralImpl
