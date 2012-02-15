package com.minimalabs.fiber.serializer;

import com.google.inject.Inject;
import com.minimalabs.fiber.services.FiberGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractFiberSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FiberGrammarAccess grammarAccess;
	protected AbstractElementAlias match_TypeId___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FiberGrammarAccess) access;
		match_TypeId___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTypeIdAccess().getFullStopKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTypeIdAccess().getIDTerminalRuleCall_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_TypeId___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a.equals(syntax))
				emit_TypeId___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('.' ID)*
	 */
	protected void emit_TypeId___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
