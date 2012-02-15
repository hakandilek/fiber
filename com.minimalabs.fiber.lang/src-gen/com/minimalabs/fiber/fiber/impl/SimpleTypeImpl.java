/**
 * <copyright>
 * </copyright>
 *

 */
package com.minimalabs.fiber.fiber.impl;

import com.minimalabs.fiber.fiber.FiberPackage;
import com.minimalabs.fiber.fiber.SimpleType;
import com.minimalabs.fiber.fiber.TypeId;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.minimalabs.fiber.fiber.impl.SimpleTypeImpl#getMappedType <em>Mapped Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleTypeImpl extends TypeImpl implements SimpleType
{
  /**
   * The cached value of the '{@link #getMappedType() <em>Mapped Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedType()
   * @generated
   * @ordered
   */
  protected TypeId mappedType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleTypeImpl()
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
    return FiberPackage.Literals.SIMPLE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeId getMappedType()
  {
    return mappedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMappedType(TypeId newMappedType, NotificationChain msgs)
  {
    TypeId oldMappedType = mappedType;
    mappedType = newMappedType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FiberPackage.SIMPLE_TYPE__MAPPED_TYPE, oldMappedType, newMappedType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappedType(TypeId newMappedType)
  {
    if (newMappedType != mappedType)
    {
      NotificationChain msgs = null;
      if (mappedType != null)
        msgs = ((InternalEObject)mappedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FiberPackage.SIMPLE_TYPE__MAPPED_TYPE, null, msgs);
      if (newMappedType != null)
        msgs = ((InternalEObject)newMappedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FiberPackage.SIMPLE_TYPE__MAPPED_TYPE, null, msgs);
      msgs = basicSetMappedType(newMappedType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiberPackage.SIMPLE_TYPE__MAPPED_TYPE, newMappedType, newMappedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FiberPackage.SIMPLE_TYPE__MAPPED_TYPE:
        return basicSetMappedType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FiberPackage.SIMPLE_TYPE__MAPPED_TYPE:
        return getMappedType();
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
      case FiberPackage.SIMPLE_TYPE__MAPPED_TYPE:
        setMappedType((TypeId)newValue);
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
      case FiberPackage.SIMPLE_TYPE__MAPPED_TYPE:
        setMappedType((TypeId)null);
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
      case FiberPackage.SIMPLE_TYPE__MAPPED_TYPE:
        return mappedType != null;
    }
    return super.eIsSet(featureID);
  }

} //SimpleTypeImpl
