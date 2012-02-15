package com.minimalabs.fiber.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.minimalabs.fiber.fiber.Attribute;
import com.minimalabs.fiber.fiber.Enumeration;
import com.minimalabs.fiber.fiber.EnumerationLiteral;
import com.minimalabs.fiber.fiber.FiberPackage;
import com.minimalabs.fiber.fiber.Method;
import com.minimalabs.fiber.fiber.Model;
import com.minimalabs.fiber.fiber.Parameter;
import com.minimalabs.fiber.fiber.Service;
import com.minimalabs.fiber.fiber.SimpleType;
import com.minimalabs.fiber.fiber.TypeId;
import com.minimalabs.fiber.services.FiberGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractFiberSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected FiberGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FiberPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FiberPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case FiberPackage.CLASS:
				if(context == grammarAccess.getClassRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Class(context, (com.minimalabs.fiber.fiber.Class) semanticObject); 
					return; 
				}
				else break;
			case FiberPackage.ENUMERATION:
				if(context == grammarAccess.getEnumerationRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Enumeration(context, (Enumeration) semanticObject); 
					return; 
				}
				else break;
			case FiberPackage.ENUMERATION_LITERAL:
				if(context == grammarAccess.getEnumerationLiteralRule()) {
					sequence_EnumerationLiteral(context, (EnumerationLiteral) semanticObject); 
					return; 
				}
				else break;
			case FiberPackage.METHOD:
				if(context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case FiberPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case FiberPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case FiberPackage.SERVICE:
				if(context == grammarAccess.getServiceRule()) {
					sequence_Service(context, (Service) semanticObject); 
					return; 
				}
				else break;
			case FiberPackage.SIMPLE_TYPE:
				if(context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_SimpleType(context, (SimpleType) semanticObject); 
					return; 
				}
				else break;
			case FiberPackage.TYPE_ID:
				if(context == grammarAccess.getTypeIdRule()) {
					sequence_TypeId(context, (TypeId) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (type=[Type|ID] manyReference=AttributeManyReference? name=ID)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superEntity=[Class|ID]? attributes+=Attribute*)
	 */
	protected void sequence_Class(EObject context, com.minimalabs.fiber.fiber.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ordinal=INT)
	 */
	protected void sequence_EnumerationLiteral(EObject context, EnumerationLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FiberPackage.Literals.ENUMERATION_LITERAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FiberPackage.Literals.ENUMERATION_LITERAL__NAME));
			if(transientValues.isValueTransient(semanticObject, FiberPackage.Literals.ENUMERATION_LITERAL__ORDINAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FiberPackage.Literals.ENUMERATION_LITERAL__ORDINAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnumerationLiteralAccess().getOrdinalINTTerminalRuleCall_2_0(), semanticObject.getOrdinal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID literals+=EnumerationLiteral*)
	 */
	protected void sequence_Enumeration(EObject context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (returnType=[Type|ID] name=ID parameters+=Parameter? parameters+=Parameter*)
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (types+=Type* services+=Service*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|ID] name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FiberPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FiberPackage.Literals.PARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, FiberPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FiberPackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID methods+=Method*)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID mappedType=TypeId?)
	 */
	protected void sequence_SimpleType(EObject context, SimpleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TypeId(EObject context, TypeId semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FiberPackage.Literals.TYPE_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FiberPackage.Literals.TYPE_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeIdAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
}
