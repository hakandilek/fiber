/*
* generated by Xtext
*/
package com.minimalabs.fiber.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.minimalabs.fiber.services.FiberGrammarAccess;

public class FiberParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FiberGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.minimalabs.fiber.parser.antlr.internal.InternalFiberParser createParser(XtextTokenStream stream) {
		return new com.minimalabs.fiber.parser.antlr.internal.InternalFiberParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public FiberGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FiberGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
