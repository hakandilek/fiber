/**
 * <copyright>
 * </copyright>
 *

 */
package com.minimalabs.fiber.fiber.impl;

import com.minimalabs.fiber.fiber.Attribute;
import com.minimalabs.fiber.fiber.FiberPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.minimalabs.fiber.fiber.impl.ClassImpl#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link com.minimalabs.fiber.fiber.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends TypeImpl implements com.minimalabs.fiber.fiber.Class
{
  /**
   * The cached value of the '{@link #getSuperEntity() <em>Super Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperEntity()
   * @generated
   * @ordered
   */
  protected com.minimalabs.fiber.fiber.Class superEntity;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return FiberPackage.Literals.CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.minimalabs.fiber.fiber.Class getSuperEntity()
  {
    if (superEntity != null && superEntity.eIsProxy())
    {
      InternalEObject oldSuperEntity = (InternalEObject)superEntity;
      superEntity = (com.minimalabs.fiber.fiber.Class)eResolveProxy(oldSuperEntity);
      if (superEntity != oldSuperEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiberPackage.CLASS__SUPER_ENTITY, oldSuperEntity, superEntity));
      }
    }
    return superEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.minimalabs.fiber.fiber.Class basicGetSuperEntity()
  {
    return superEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperEntity(com.minimalabs.fiber.fiber.Class newSuperEntity)
  {
    com.minimalabs.fiber.fiber.Class oldSuperEntity = superEntity;
    superEntity = newSuperEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiberPackage.CLASS__SUPER_ENTITY, oldSuperEntity, superEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, FiberPackage.CLASS__ATTRIBUTES);
    }
    return attributes;
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
      case FiberPackage.CLASS__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
      case FiberPackage.CLASS__SUPER_ENTITY:
        if (resolve) return getSuperEntity();
        return basicGetSuperEntity();
      case FiberPackage.CLASS__ATTRIBUTES:
        return getAttributes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FiberPackage.CLASS__SUPER_ENTITY:
        setSuperEntity((com.minimalabs.fiber.fiber.Class)newValue);
        return;
      case FiberPackage.CLASS__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
      case FiberPackage.CLASS__SUPER_ENTITY:
        setSuperEntity((com.minimalabs.fiber.fiber.Class)null);
        return;
      case FiberPackage.CLASS__ATTRIBUTES:
        getAttributes().clear();
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
      case FiberPackage.CLASS__SUPER_ENTITY:
        return superEntity != null;
      case FiberPackage.CLASS__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassImpl
