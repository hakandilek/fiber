/**
 * <copyright>
 * </copyright>
 *

 */
package com.minimalabs.fiber.fiber.impl;

import com.minimalabs.fiber.fiber.Attribute;
import com.minimalabs.fiber.fiber.AttributeManyReference;
import com.minimalabs.fiber.fiber.Enumeration;
import com.minimalabs.fiber.fiber.EnumerationLiteral;
import com.minimalabs.fiber.fiber.FiberFactory;
import com.minimalabs.fiber.fiber.FiberPackage;
import com.minimalabs.fiber.fiber.Method;
import com.minimalabs.fiber.fiber.Model;
import com.minimalabs.fiber.fiber.Parameter;
import com.minimalabs.fiber.fiber.Service;
import com.minimalabs.fiber.fiber.SimpleType;
import com.minimalabs.fiber.fiber.Type;
import com.minimalabs.fiber.fiber.TypeId;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FiberFactoryImpl extends EFactoryImpl implements FiberFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FiberFactory init()
  {
    try
    {
      FiberFactory theFiberFactory = (FiberFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.minimalabs.com/fiber/Fiber"); 
      if (theFiberFactory != null)
      {
        return theFiberFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FiberFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FiberFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FiberPackage.MODEL: return createModel();
      case FiberPackage.TYPE: return createType();
      case FiberPackage.SIMPLE_TYPE: return createSimpleType();
      case FiberPackage.TYPE_ID: return createTypeId();
      case FiberPackage.CLASS: return createClass();
      case FiberPackage.ATTRIBUTE: return createAttribute();
      case FiberPackage.ENUMERATION: return createEnumeration();
      case FiberPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
      case FiberPackage.SERVICE: return createService();
      case FiberPackage.METHOD: return createMethod();
      case FiberPackage.PARAMETER: return createParameter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FiberPackage.ATTRIBUTE_MANY_REFERENCE:
        return createAttributeManyReferenceFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FiberPackage.ATTRIBUTE_MANY_REFERENCE:
        return convertAttributeManyReferenceToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleType createSimpleType()
  {
    SimpleTypeImpl simpleType = new SimpleTypeImpl();
    return simpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeId createTypeId()
  {
    TypeIdImpl typeId = new TypeIdImpl();
    return typeId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.minimalabs.fiber.fiber.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral createEnumerationLiteral()
  {
    EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
    return enumerationLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeManyReference createAttributeManyReferenceFromString(EDataType eDataType, String initialValue)
  {
    AttributeManyReference result = AttributeManyReference.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeManyReferenceToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FiberPackage getFiberPackage()
  {
    return (FiberPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FiberPackage getPackage()
  {
    return FiberPackage.eINSTANCE;
  }

} //FiberFactoryImpl
