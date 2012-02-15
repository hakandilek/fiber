/*
* generated by Xtext
*/
grammar InternalFiber;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.minimalabs.fiber.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.minimalabs.fiber.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.minimalabs.fiber.services.FiberGrammarAccess;

}

@parser::members {
 
 	private FiberGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(FiberGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getGroup()); }
(rule__Model__Group__0)
{ after(grammarAccess.getModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleType
entryRuleType 
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeAccess().getAlternatives()); }
(rule__Type__Alternatives)
{ after(grammarAccess.getTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSimpleType
entryRuleSimpleType 
:
{ before(grammarAccess.getSimpleTypeRule()); }
	 ruleSimpleType
{ after(grammarAccess.getSimpleTypeRule()); } 
	 EOF 
;

// Rule SimpleType
ruleSimpleType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSimpleTypeAccess().getGroup()); }
(rule__SimpleType__Group__0)
{ after(grammarAccess.getSimpleTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTypeId
entryRuleTypeId 
:
{ before(grammarAccess.getTypeIdRule()); }
	 ruleTypeId
{ after(grammarAccess.getTypeIdRule()); } 
	 EOF 
;

// Rule TypeId
ruleTypeId
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeIdAccess().getGroup()); }
(rule__TypeId__Group__0)
{ after(grammarAccess.getTypeIdAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleClass
entryRuleClass 
:
{ before(grammarAccess.getClassRule()); }
	 ruleClass
{ after(grammarAccess.getClassRule()); } 
	 EOF 
;

// Rule Class
ruleClass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getClassAccess().getGroup()); }
(rule__Class__Group__0)
{ after(grammarAccess.getClassAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAttribute
entryRuleAttribute 
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAttributeAccess().getGroup()); }
(rule__Attribute__Group__0)
{ after(grammarAccess.getAttributeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEnumeration
entryRuleEnumeration 
:
{ before(grammarAccess.getEnumerationRule()); }
	 ruleEnumeration
{ after(grammarAccess.getEnumerationRule()); } 
	 EOF 
;

// Rule Enumeration
ruleEnumeration
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEnumerationAccess().getGroup()); }
(rule__Enumeration__Group__0)
{ after(grammarAccess.getEnumerationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEnumerationLiteral
entryRuleEnumerationLiteral 
:
{ before(grammarAccess.getEnumerationLiteralRule()); }
	 ruleEnumerationLiteral
{ after(grammarAccess.getEnumerationLiteralRule()); } 
	 EOF 
;

// Rule EnumerationLiteral
ruleEnumerationLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getGroup()); }
(rule__EnumerationLiteral__Group__0)
{ after(grammarAccess.getEnumerationLiteralAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleService
entryRuleService 
:
{ before(grammarAccess.getServiceRule()); }
	 ruleService
{ after(grammarAccess.getServiceRule()); } 
	 EOF 
;

// Rule Service
ruleService
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getServiceAccess().getGroup()); }
(rule__Service__Group__0)
{ after(grammarAccess.getServiceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMethod
entryRuleMethod 
:
{ before(grammarAccess.getMethodRule()); }
	 ruleMethod
{ after(grammarAccess.getMethodRule()); } 
	 EOF 
;

// Rule Method
ruleMethod
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMethodAccess().getGroup()); }
(rule__Method__Group__0)
{ after(grammarAccess.getMethodAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParameter
entryRuleParameter 
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParameterAccess().getGroup()); }
(rule__Parameter__Group__0)
{ after(grammarAccess.getParameterAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule AttributeManyReference
ruleAttributeManyReference
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeManyReferenceAccess().getAlternatives()); }
(rule__AttributeManyReference__Alternatives)
{ after(grammarAccess.getAttributeManyReferenceAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Type__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); }
	ruleSimpleType
{ after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getTypeAccess().getClassParserRuleCall_1()); }
	ruleClass
{ after(grammarAccess.getTypeAccess().getClassParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); }
	ruleEnumeration
{ after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeManyReference__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0()); }
(	'NONE' 
)
{ after(grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1()); }
(	'*' 
)
{ after(grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getAttributeManyReferenceAccess().getSTRONGEnumLiteralDeclaration_2()); }
(	'#' 
)
{ after(grammarAccess.getAttributeManyReferenceAccess().getSTRONGEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Model__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getTypesAssignment_0()); }
(rule__Model__TypesAssignment_0)*
{ after(grammarAccess.getModelAccess().getTypesAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getServicesAssignment_1()); }
(rule__Model__ServicesAssignment_1)*
{ after(grammarAccess.getModelAccess().getServicesAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__SimpleType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SimpleType__Group__0__Impl
	rule__SimpleType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); }

	'type' 

{ after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SimpleType__Group__1__Impl
	rule__SimpleType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); }
(rule__SimpleType__NameAssignment_1)
{ after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SimpleType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getGroup_2()); }
(rule__SimpleType__Group_2__0)?
{ after(grammarAccess.getSimpleTypeAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__SimpleType__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SimpleType__Group_2__0__Impl
	rule__SimpleType__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); }

	'is' 

{ after(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleType__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SimpleType__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getMappedTypeAssignment_2_1()); }
(rule__SimpleType__MappedTypeAssignment_2_1)
{ after(grammarAccess.getSimpleTypeAccess().getMappedTypeAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__TypeId__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeId__Group__0__Impl
	rule__TypeId__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeId__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeIdAccess().getNameAssignment_0()); }
(rule__TypeId__NameAssignment_0)
{ after(grammarAccess.getTypeIdAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TypeId__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeId__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeId__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeIdAccess().getGroup_1()); }
(rule__TypeId__Group_1__0)*
{ after(grammarAccess.getTypeIdAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__TypeId__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeId__Group_1__0__Impl
	rule__TypeId__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeId__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeIdAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getTypeIdAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TypeId__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TypeId__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeId__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeIdAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getTypeIdAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Class__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__0__Impl
	rule__Class__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getClassKeyword_0()); }

	'class' 

{ after(grammarAccess.getClassAccess().getClassKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__1__Impl
	rule__Class__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getNameAssignment_1()); }
(rule__Class__NameAssignment_1)
{ after(grammarAccess.getClassAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__2__Impl
	rule__Class__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getGroup_2()); }
(rule__Class__Group_2__0)?
{ after(grammarAccess.getClassAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__3__Impl
	rule__Class__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__4__Impl
	rule__Class__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAttributesAssignment_4()); }
(rule__Class__AttributesAssignment_4)*
{ after(grammarAccess.getClassAccess().getAttributesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Class__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_2__0__Impl
	rule__Class__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); }

	'extends' 

{ after(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getSuperEntityAssignment_2_1()); }
(rule__Class__SuperEntityAssignment_2_1)
{ after(grammarAccess.getClassAccess().getSuperEntityAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); }
(rule__Attribute__TypeAssignment_0)
{ after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getManyReferenceAssignment_1()); }
(rule__Attribute__ManyReferenceAssignment_1)?
{ after(grammarAccess.getAttributeAccess().getManyReferenceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getNameAssignment_2()); }
(rule__Attribute__NameAssignment_2)
{ after(grammarAccess.getAttributeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Enumeration__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group__0__Impl
	rule__Enumeration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); }

	'enum' 

{ after(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group__1__Impl
	rule__Enumeration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); }
(rule__Enumeration__NameAssignment_1)
{ after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group__2__Impl
	rule__Enumeration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group__3__Impl
	rule__Enumeration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); }
(rule__Enumeration__LiteralsAssignment_3)*
{ after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Enumeration__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__EnumerationLiteral__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumerationLiteral__Group__0__Impl
	rule__EnumerationLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); }
(rule__EnumerationLiteral__NameAssignment_0)
{ after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationLiteral__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumerationLiteral__Group__1__Impl
	rule__EnumerationLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationLiteral__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumerationLiteral__Group__2__Impl
	rule__EnumerationLiteral__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getOrdinalAssignment_2()); }
(rule__EnumerationLiteral__OrdinalAssignment_2)
{ after(grammarAccess.getEnumerationLiteralAccess().getOrdinalAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationLiteral__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumerationLiteral__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Service__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__0__Impl
	rule__Service__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getServiceKeyword_0()); }

	'service' 

{ after(grammarAccess.getServiceAccess().getServiceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__1__Impl
	rule__Service__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getNameAssignment_1()); }
(rule__Service__NameAssignment_1)
{ after(grammarAccess.getServiceAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__2__Impl
	rule__Service__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__3__Impl
	rule__Service__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getMethodsAssignment_3()); }
(rule__Service__MethodsAssignment_3)*
{ after(grammarAccess.getServiceAccess().getMethodsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Method__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group__0__Impl
	rule__Method__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); }
(rule__Method__ReturnTypeAssignment_0)
{ after(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Method__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group__1__Impl
	rule__Method__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getNameAssignment_1()); }
(rule__Method__NameAssignment_1)
{ after(grammarAccess.getMethodAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Method__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group__2__Impl
	rule__Method__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); }

	'(' 

{ after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Method__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group__3__Impl
	rule__Method__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getParametersAssignment_3()); }
(rule__Method__ParametersAssignment_3)?
{ after(grammarAccess.getMethodAccess().getParametersAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Method__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group__4__Impl
	rule__Method__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getGroup_4()); }
(rule__Method__Group_4__0)*
{ after(grammarAccess.getMethodAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Method__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); }

	')' 

{ after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Method__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group_4__0__Impl
	rule__Method__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); }

	',' 

{ after(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Method__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Method__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getParametersAssignment_4_1()); }
(rule__Method__ParametersAssignment_4_1)
{ after(grammarAccess.getMethodAccess().getParametersAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Parameter__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__0__Impl
	rule__Parameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getTypeAssignment_0()); }
(rule__Parameter__TypeAssignment_0)
{ after(grammarAccess.getParameterAccess().getTypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameAssignment_1()); }
(rule__Parameter__NameAssignment_1)
{ after(grammarAccess.getParameterAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__TypesAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0_0()); }
	ruleType{ after(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__ServicesAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_1_0()); }
	ruleService{ after(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__MappedTypeAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getMappedTypeTypeIdParserRuleCall_2_1_0()); }
	ruleTypeId{ after(grammarAccess.getSimpleTypeAccess().getMappedTypeTypeIdParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeId__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeIdAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getTypeIdAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__SuperEntityAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getSuperEntityClassCrossReference_2_1_0()); }
(
{ before(grammarAccess.getClassAccess().getSuperEntityClassIDTerminalRuleCall_2_1_0_1()); }
	RULE_ID{ after(grammarAccess.getClassAccess().getSuperEntityClassIDTerminalRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getClassAccess().getSuperEntityClassCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__AttributesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0()); }
	ruleAttribute{ after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__TypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); }
(
{ before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__ManyReferenceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getManyReferenceAttributeManyReferenceEnumRuleCall_1_0()); }
	ruleAttributeManyReference{ after(grammarAccess.getAttributeAccess().getManyReferenceAttributeManyReferenceEnumRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__LiteralsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); }
	ruleEnumerationLiteral{ after(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__OrdinalAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getOrdinalINTTerminalRuleCall_2_0()); }
	RULE_INT{ after(grammarAccess.getEnumerationLiteralAccess().getOrdinalINTTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Service__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Service__MethodsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getMethodsMethodParserRuleCall_3_0()); }
	ruleMethod{ after(grammarAccess.getServiceAccess().getMethodsMethodParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Method__ReturnTypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getReturnTypeTypeCrossReference_0_0()); }
(
{ before(grammarAccess.getMethodAccess().getReturnTypeTypeIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getMethodAccess().getReturnTypeTypeIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getMethodAccess().getReturnTypeTypeCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Method__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Method__ParametersAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0()); }
	ruleParameter{ after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Method__ParametersAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_1_0()); }
	ruleParameter{ after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__TypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); }
(
{ before(grammarAccess.getParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

