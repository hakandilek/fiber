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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFiberParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NONE'", "'*'", "'#'", "'type'", "'is'", "'.'", "'class'", "'{'", "'}'", "'extends'", "'enum'", "'('", "')'", "'service'", "','"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalFiberParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFiberParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFiberParser.tokenNames; }
    public String getGrammarFileName() { return "../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:61:1: ( ruleModel EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:76:1: ( rule__Model__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:88:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:89:1: ( ruleType EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:90:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType121);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:97:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:101:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:102:1: ( ( rule__Type__Alternatives ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:102:1: ( ( rule__Type__Alternatives ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:103:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:104:1: ( rule__Type__Alternatives )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:104:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType154);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleType"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:116:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:117:1: ( ruleSimpleType EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:118:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType181);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:125:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:129:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:130:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:130:1: ( ( rule__SimpleType__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:131:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:132:1: ( rule__SimpleType__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:132:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType214);
            rule__SimpleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleTypeId"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:144:1: entryRuleTypeId : ruleTypeId EOF ;
    public final void entryRuleTypeId() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:145:1: ( ruleTypeId EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:146:1: ruleTypeId EOF
            {
             before(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId241);
            ruleTypeId();

            state._fsp--;

             after(grammarAccess.getTypeIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeId"


    // $ANTLR start "ruleTypeId"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:153:1: ruleTypeId : ( ( rule__TypeId__Group__0 ) ) ;
    public final void ruleTypeId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:157:2: ( ( ( rule__TypeId__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:158:1: ( ( rule__TypeId__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:158:1: ( ( rule__TypeId__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:159:1: ( rule__TypeId__Group__0 )
            {
             before(grammarAccess.getTypeIdAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:160:1: ( rule__TypeId__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:160:2: rule__TypeId__Group__0
            {
            pushFollow(FOLLOW_rule__TypeId__Group__0_in_ruleTypeId274);
            rule__TypeId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeIdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeId"


    // $ANTLR start "entryRuleClass"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:172:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:173:1: ( ruleClass EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:174:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass301);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:181:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:185:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:186:1: ( ( rule__Class__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:186:1: ( ( rule__Class__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:187:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:188:1: ( rule__Class__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:188:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass334);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:200:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:201:1: ( ruleAttribute EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:202:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute361);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:209:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:213:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:214:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:214:1: ( ( rule__Attribute__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:215:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:216:1: ( rule__Attribute__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:216:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute394);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEnumeration"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:228:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:229:1: ( ruleEnumeration EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:230:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration421);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:237:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:241:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:242:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:242:1: ( ( rule__Enumeration__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:243:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:244:1: ( rule__Enumeration__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:244:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration454);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:256:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:257:1: ( ruleEnumerationLiteral EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:258:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral481);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:265:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:269:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:270:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:270:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:271:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:272:1: ( rule__EnumerationLiteral__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:272:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral514);
            rule__EnumerationLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleService"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:284:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:285:1: ( ruleService EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:286:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService541);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:293:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:297:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:298:1: ( ( rule__Service__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:298:1: ( ( rule__Service__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:299:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:300:1: ( rule__Service__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:300:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService574);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleMethod"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:312:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:313:1: ( ruleMethod EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:314:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod601);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:321:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:325:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:326:1: ( ( rule__Method__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:326:1: ( ( rule__Method__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:327:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:328:1: ( rule__Method__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:328:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod634);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:340:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:341:1: ( ruleParameter EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:342:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter661);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:349:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:353:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:354:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:354:1: ( ( rule__Parameter__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:355:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:356:1: ( rule__Parameter__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:356:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter694);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "ruleAttributeManyReference"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:369:1: ruleAttributeManyReference : ( ( rule__AttributeManyReference__Alternatives ) ) ;
    public final void ruleAttributeManyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:373:1: ( ( ( rule__AttributeManyReference__Alternatives ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:374:1: ( ( rule__AttributeManyReference__Alternatives ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:374:1: ( ( rule__AttributeManyReference__Alternatives ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:375:1: ( rule__AttributeManyReference__Alternatives )
            {
             before(grammarAccess.getAttributeManyReferenceAccess().getAlternatives()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:376:1: ( rule__AttributeManyReference__Alternatives )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:376:2: rule__AttributeManyReference__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeManyReference__Alternatives_in_ruleAttributeManyReference731);
            rule__AttributeManyReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeManyReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeManyReference"


    // $ANTLR start "rule__Type__Alternatives"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:387:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleClass ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:391:1: ( ( ruleSimpleType ) | ( ruleClass ) | ( ruleEnumeration ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:392:1: ( ruleSimpleType )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:392:1: ( ruleSimpleType )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:393:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives766);
                    ruleSimpleType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:398:6: ( ruleClass )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:398:6: ( ruleClass )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:399:1: ruleClass
                    {
                     before(grammarAccess.getTypeAccess().getClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClass_in_rule__Type__Alternatives783);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:404:6: ( ruleEnumeration )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:404:6: ( ruleEnumeration )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:405:1: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Type__Alternatives800);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__AttributeManyReference__Alternatives"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:415:1: rule__AttributeManyReference__Alternatives : ( ( ( 'NONE' ) ) | ( ( '*' ) ) | ( ( '#' ) ) );
    public final void rule__AttributeManyReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:419:1: ( ( ( 'NONE' ) ) | ( ( '*' ) ) | ( ( '#' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:420:1: ( ( 'NONE' ) )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:420:1: ( ( 'NONE' ) )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:421:1: ( 'NONE' )
                    {
                     before(grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0()); 
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:422:1: ( 'NONE' )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:422:3: 'NONE'
                    {
                    match(input,11,FOLLOW_11_in_rule__AttributeManyReference__Alternatives833); 

                    }

                     after(grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:427:6: ( ( '*' ) )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:427:6: ( ( '*' ) )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:428:1: ( '*' )
                    {
                     before(grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1()); 
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:429:1: ( '*' )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:429:3: '*'
                    {
                    match(input,12,FOLLOW_12_in_rule__AttributeManyReference__Alternatives854); 

                    }

                     after(grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:434:6: ( ( '#' ) )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:434:6: ( ( '#' ) )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:435:1: ( '#' )
                    {
                     before(grammarAccess.getAttributeManyReferenceAccess().getSTRONGEnumLiteralDeclaration_2()); 
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:436:1: ( '#' )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:436:3: '#'
                    {
                    match(input,13,FOLLOW_13_in_rule__AttributeManyReference__Alternatives875); 

                    }

                     after(grammarAccess.getAttributeManyReferenceAccess().getSTRONGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeManyReference__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:448:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:452:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:453:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0908);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0911);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:460:1: rule__Model__Group__0__Impl : ( ( rule__Model__TypesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:464:1: ( ( ( rule__Model__TypesAssignment_0 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:465:1: ( ( rule__Model__TypesAssignment_0 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:465:1: ( ( rule__Model__TypesAssignment_0 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:466:1: ( rule__Model__TypesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:467:1: ( rule__Model__TypesAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==17||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:467:2: rule__Model__TypesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_0_in_rule__Model__Group__0__Impl938);
            	    rule__Model__TypesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:477:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:481:1: ( rule__Model__Group__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:482:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1969);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:488:1: rule__Model__Group__1__Impl : ( ( rule__Model__ServicesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:492:1: ( ( ( rule__Model__ServicesAssignment_1 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:493:1: ( ( rule__Model__ServicesAssignment_1 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:493:1: ( ( rule__Model__ServicesAssignment_1 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:494:1: ( rule__Model__ServicesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getServicesAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:495:1: ( rule__Model__ServicesAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:495:2: rule__Model__ServicesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ServicesAssignment_1_in_rule__Model__Group__1__Impl996);
            	    rule__Model__ServicesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getServicesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__SimpleType__Group__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:509:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:513:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:514:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__01031);
            rule__SimpleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01034);
            rule__SimpleType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__0"


    // $ANTLR start "rule__SimpleType__Group__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:521:1: rule__SimpleType__Group__0__Impl : ( 'type' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:525:1: ( ( 'type' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:526:1: ( 'type' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:526:1: ( 'type' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:527:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__SimpleType__Group__0__Impl1062); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__0__Impl"


    // $ANTLR start "rule__SimpleType__Group__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:540:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:544:1: ( rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:545:2: rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__11093);
            rule__SimpleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__11096);
            rule__SimpleType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__1"


    // $ANTLR start "rule__SimpleType__Group__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:552:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:556:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:557:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:557:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:558:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:559:1: ( rule__SimpleType__NameAssignment_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:559:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl1123);
            rule__SimpleType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__1__Impl"


    // $ANTLR start "rule__SimpleType__Group__2"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:569:1: rule__SimpleType__Group__2 : rule__SimpleType__Group__2__Impl ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:573:1: ( rule__SimpleType__Group__2__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:574:2: rule__SimpleType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__21153);
            rule__SimpleType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__2"


    // $ANTLR start "rule__SimpleType__Group__2__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:580:1: rule__SimpleType__Group__2__Impl : ( ( rule__SimpleType__Group_2__0 )? ) ;
    public final void rule__SimpleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:584:1: ( ( ( rule__SimpleType__Group_2__0 )? ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:585:1: ( ( rule__SimpleType__Group_2__0 )? )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:585:1: ( ( rule__SimpleType__Group_2__0 )? )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:586:1: ( rule__SimpleType__Group_2__0 )?
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup_2()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:587:1: ( rule__SimpleType__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:587:2: rule__SimpleType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SimpleType__Group_2__0_in_rule__SimpleType__Group__2__Impl1180);
                    rule__SimpleType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__2__Impl"


    // $ANTLR start "rule__SimpleType__Group_2__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:603:1: rule__SimpleType__Group_2__0 : rule__SimpleType__Group_2__0__Impl rule__SimpleType__Group_2__1 ;
    public final void rule__SimpleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:607:1: ( rule__SimpleType__Group_2__0__Impl rule__SimpleType__Group_2__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:608:2: rule__SimpleType__Group_2__0__Impl rule__SimpleType__Group_2__1
            {
            pushFollow(FOLLOW_rule__SimpleType__Group_2__0__Impl_in_rule__SimpleType__Group_2__01217);
            rule__SimpleType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group_2__1_in_rule__SimpleType__Group_2__01220);
            rule__SimpleType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group_2__0"


    // $ANTLR start "rule__SimpleType__Group_2__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:615:1: rule__SimpleType__Group_2__0__Impl : ( 'is' ) ;
    public final void rule__SimpleType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:619:1: ( ( 'is' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:620:1: ( 'is' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:620:1: ( 'is' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:621:1: 'is'
            {
             before(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__SimpleType__Group_2__0__Impl1248); 
             after(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group_2__0__Impl"


    // $ANTLR start "rule__SimpleType__Group_2__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:634:1: rule__SimpleType__Group_2__1 : rule__SimpleType__Group_2__1__Impl ;
    public final void rule__SimpleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:638:1: ( rule__SimpleType__Group_2__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:639:2: rule__SimpleType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleType__Group_2__1__Impl_in_rule__SimpleType__Group_2__11279);
            rule__SimpleType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group_2__1"


    // $ANTLR start "rule__SimpleType__Group_2__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:645:1: rule__SimpleType__Group_2__1__Impl : ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) ) ;
    public final void rule__SimpleType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:649:1: ( ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:650:1: ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:650:1: ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:651:1: ( rule__SimpleType__MappedTypeAssignment_2_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getMappedTypeAssignment_2_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:652:1: ( rule__SimpleType__MappedTypeAssignment_2_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:652:2: rule__SimpleType__MappedTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SimpleType__MappedTypeAssignment_2_1_in_rule__SimpleType__Group_2__1__Impl1306);
            rule__SimpleType__MappedTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getMappedTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group_2__1__Impl"


    // $ANTLR start "rule__TypeId__Group__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:666:1: rule__TypeId__Group__0 : rule__TypeId__Group__0__Impl rule__TypeId__Group__1 ;
    public final void rule__TypeId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:670:1: ( rule__TypeId__Group__0__Impl rule__TypeId__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:671:2: rule__TypeId__Group__0__Impl rule__TypeId__Group__1
            {
            pushFollow(FOLLOW_rule__TypeId__Group__0__Impl_in_rule__TypeId__Group__01340);
            rule__TypeId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeId__Group__1_in_rule__TypeId__Group__01343);
            rule__TypeId__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeId__Group__0"


    // $ANTLR start "rule__TypeId__Group__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:678:1: rule__TypeId__Group__0__Impl : ( ( rule__TypeId__NameAssignment_0 ) ) ;
    public final void rule__TypeId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:682:1: ( ( ( rule__TypeId__NameAssignment_0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:683:1: ( ( rule__TypeId__NameAssignment_0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:683:1: ( ( rule__TypeId__NameAssignment_0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:684:1: ( rule__TypeId__NameAssignment_0 )
            {
             before(grammarAccess.getTypeIdAccess().getNameAssignment_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:685:1: ( rule__TypeId__NameAssignment_0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:685:2: rule__TypeId__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeId__NameAssignment_0_in_rule__TypeId__Group__0__Impl1370);
            rule__TypeId__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeIdAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeId__Group__0__Impl"


    // $ANTLR start "rule__TypeId__Group__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:695:1: rule__TypeId__Group__1 : rule__TypeId__Group__1__Impl ;
    public final void rule__TypeId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:699:1: ( rule__TypeId__Group__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:700:2: rule__TypeId__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeId__Group__1__Impl_in_rule__TypeId__Group__11400);
            rule__TypeId__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeId__Group__1"


    // $ANTLR start "rule__TypeId__Group__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:706:1: rule__TypeId__Group__1__Impl : ( ( rule__TypeId__Group_1__0 )* ) ;
    public final void rule__TypeId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:710:1: ( ( ( rule__TypeId__Group_1__0 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:711:1: ( ( rule__TypeId__Group_1__0 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:711:1: ( ( rule__TypeId__Group_1__0 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:712:1: ( rule__TypeId__Group_1__0 )*
            {
             before(grammarAccess.getTypeIdAccess().getGroup_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:713:1: ( rule__TypeId__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:713:2: rule__TypeId__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TypeId__Group_1__0_in_rule__TypeId__Group__1__Impl1427);
            	    rule__TypeId__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTypeIdAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeId__Group__1__Impl"


    // $ANTLR start "rule__TypeId__Group_1__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:727:1: rule__TypeId__Group_1__0 : rule__TypeId__Group_1__0__Impl rule__TypeId__Group_1__1 ;
    public final void rule__TypeId__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:731:1: ( rule__TypeId__Group_1__0__Impl rule__TypeId__Group_1__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:732:2: rule__TypeId__Group_1__0__Impl rule__TypeId__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeId__Group_1__0__Impl_in_rule__TypeId__Group_1__01462);
            rule__TypeId__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeId__Group_1__1_in_rule__TypeId__Group_1__01465);
            rule__TypeId__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeId__Group_1__0"


    // $ANTLR start "rule__TypeId__Group_1__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:739:1: rule__TypeId__Group_1__0__Impl : ( '.' ) ;
    public final void rule__TypeId__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:743:1: ( ( '.' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:744:1: ( '.' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:744:1: ( '.' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:745:1: '.'
            {
             before(grammarAccess.getTypeIdAccess().getFullStopKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__TypeId__Group_1__0__Impl1493); 
             after(grammarAccess.getTypeIdAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeId__Group_1__0__Impl"


    // $ANTLR start "rule__TypeId__Group_1__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:758:1: rule__TypeId__Group_1__1 : rule__TypeId__Group_1__1__Impl ;
    public final void rule__TypeId__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:762:1: ( rule__TypeId__Group_1__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:763:2: rule__TypeId__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeId__Group_1__1__Impl_in_rule__TypeId__Group_1__11524);
            rule__TypeId__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeId__Group_1__1"


    // $ANTLR start "rule__TypeId__Group_1__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:769:1: rule__TypeId__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__TypeId__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:773:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:774:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:774:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:775:1: RULE_ID
            {
             before(grammarAccess.getTypeIdAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeId__Group_1__1__Impl1551); 
             after(grammarAccess.getTypeIdAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeId__Group_1__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:790:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:794:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:795:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01584);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01587);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:802:1: rule__Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:806:1: ( ( 'class' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:807:1: ( 'class' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:807:1: ( 'class' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:808:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Class__Group__0__Impl1615); 
             after(grammarAccess.getClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:821:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:825:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:826:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11646);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11649);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:833:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:837:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:838:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:838:1: ( ( rule__Class__NameAssignment_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:839:1: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:840:1: ( rule__Class__NameAssignment_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:840:2: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl1676);
            rule__Class__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:850:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:854:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:855:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21706);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21709);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:862:1: rule__Class__Group__2__Impl : ( ( rule__Class__Group_2__0 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:866:1: ( ( ( rule__Class__Group_2__0 )? ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:867:1: ( ( rule__Class__Group_2__0 )? )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:867:1: ( ( rule__Class__Group_2__0 )? )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:868:1: ( rule__Class__Group_2__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_2()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:869:1: ( rule__Class__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:869:2: rule__Class__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_2__0_in_rule__Class__Group__2__Impl1736);
                    rule__Class__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:879:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:883:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:884:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31767);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31770);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:891:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:895:1: ( ( '{' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:896:1: ( '{' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:896:1: ( '{' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:897:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Class__Group__3__Impl1798); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:910:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:914:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:915:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41829);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41832);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:922:1: rule__Class__Group__4__Impl : ( ( rule__Class__AttributesAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:926:1: ( ( ( rule__Class__AttributesAssignment_4 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:927:1: ( ( rule__Class__AttributesAssignment_4 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:927:1: ( ( rule__Class__AttributesAssignment_4 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:928:1: ( rule__Class__AttributesAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_4()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:929:1: ( rule__Class__AttributesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:929:2: rule__Class__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Class__AttributesAssignment_4_in_rule__Class__Group__4__Impl1859);
            	    rule__Class__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:939:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:943:1: ( rule__Class__Group__5__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:944:2: rule__Class__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51890);
            rule__Class__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:950:1: rule__Class__Group__5__Impl : ( '}' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:954:1: ( ( '}' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:955:1: ( '}' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:955:1: ( '}' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:956:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Class__Group__5__Impl1918); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group_2__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:981:1: rule__Class__Group_2__0 : rule__Class__Group_2__0__Impl rule__Class__Group_2__1 ;
    public final void rule__Class__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:985:1: ( rule__Class__Group_2__0__Impl rule__Class__Group_2__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:986:2: rule__Class__Group_2__0__Impl rule__Class__Group_2__1
            {
            pushFollow(FOLLOW_rule__Class__Group_2__0__Impl_in_rule__Class__Group_2__01961);
            rule__Class__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_2__1_in_rule__Class__Group_2__01964);
            rule__Class__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__0"


    // $ANTLR start "rule__Class__Group_2__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:993:1: rule__Class__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:997:1: ( ( 'extends' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:998:1: ( 'extends' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:998:1: ( 'extends' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:999:1: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Class__Group_2__0__Impl1992); 
             after(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__0__Impl"


    // $ANTLR start "rule__Class__Group_2__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1012:1: rule__Class__Group_2__1 : rule__Class__Group_2__1__Impl ;
    public final void rule__Class__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1016:1: ( rule__Class__Group_2__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1017:2: rule__Class__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_2__1__Impl_in_rule__Class__Group_2__12023);
            rule__Class__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__1"


    // $ANTLR start "rule__Class__Group_2__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1023:1: rule__Class__Group_2__1__Impl : ( ( rule__Class__SuperEntityAssignment_2_1 ) ) ;
    public final void rule__Class__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1027:1: ( ( ( rule__Class__SuperEntityAssignment_2_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1028:1: ( ( rule__Class__SuperEntityAssignment_2_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1028:1: ( ( rule__Class__SuperEntityAssignment_2_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1029:1: ( rule__Class__SuperEntityAssignment_2_1 )
            {
             before(grammarAccess.getClassAccess().getSuperEntityAssignment_2_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1030:1: ( rule__Class__SuperEntityAssignment_2_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1030:2: rule__Class__SuperEntityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Class__SuperEntityAssignment_2_1_in_rule__Class__Group_2__1__Impl2050);
            rule__Class__SuperEntityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperEntityAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1044:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1048:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1049:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02084);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02087);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1056:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1060:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1061:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1061:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1062:1: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1063:1: ( rule__Attribute__TypeAssignment_0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1063:2: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl2114);
            rule__Attribute__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1073:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1077:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1078:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12144);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12147);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1085:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ManyReferenceAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1089:1: ( ( ( rule__Attribute__ManyReferenceAssignment_1 )? ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1090:1: ( ( rule__Attribute__ManyReferenceAssignment_1 )? )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1090:1: ( ( rule__Attribute__ManyReferenceAssignment_1 )? )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1091:1: ( rule__Attribute__ManyReferenceAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getManyReferenceAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1092:1: ( rule__Attribute__ManyReferenceAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=13)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1092:2: rule__Attribute__ManyReferenceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ManyReferenceAssignment_1_in_rule__Attribute__Group__1__Impl2174);
                    rule__Attribute__ManyReferenceAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getManyReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1102:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1106:1: ( rule__Attribute__Group__2__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1107:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22205);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1113:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1117:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1118:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1118:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1119:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1120:1: ( rule__Attribute__NameAssignment_2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1120:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2232);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1136:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1140:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1141:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__02268);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02271);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1148:1: rule__Enumeration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1152:1: ( ( 'enum' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1153:1: ( 'enum' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1153:1: ( 'enum' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1154:1: 'enum'
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Enumeration__Group__0__Impl2299); 
             after(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1167:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1171:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1172:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__12330);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12333);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1179:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1183:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1184:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1184:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1185:1: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1186:1: ( rule__Enumeration__NameAssignment_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1186:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl2360);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1196:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1200:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1201:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__22390);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22393);
            rule__Enumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1208:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1212:1: ( ( '{' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1213:1: ( '{' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1213:1: ( '{' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1214:1: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Enumeration__Group__2__Impl2421); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1227:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1231:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1232:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__32452);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32455);
            rule__Enumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1239:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__LiteralsAssignment_3 )* ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1243:1: ( ( ( rule__Enumeration__LiteralsAssignment_3 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1244:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1244:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1245:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1246:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1246:2: rule__Enumeration__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl2482);
            	    rule__Enumeration__LiteralsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1256:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1260:1: ( rule__Enumeration__Group__4__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1261:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__42513);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1267:1: rule__Enumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1271:1: ( ( '}' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1272:1: ( '}' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1272:1: ( '}' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1273:1: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Enumeration__Group__4__Impl2541); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1296:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1300:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1301:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__02582);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02585);
            rule__EnumerationLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0"


    // $ANTLR start "rule__EnumerationLiteral__Group__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1308:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1312:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1313:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1313:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1314:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1315:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1315:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl2612);
            rule__EnumerationLiteral__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1325:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1329:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1330:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__12642);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__12645);
            rule__EnumerationLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1"


    // $ANTLR start "rule__EnumerationLiteral__Group__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1337:1: rule__EnumerationLiteral__Group__1__Impl : ( '(' ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1341:1: ( ( '(' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1342:1: ( '(' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1342:1: ( '(' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1343:1: '('
            {
             before(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__EnumerationLiteral__Group__1__Impl2673); 
             after(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__2"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1356:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl rule__EnumerationLiteral__Group__3 ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1360:1: ( rule__EnumerationLiteral__Group__2__Impl rule__EnumerationLiteral__Group__3 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1361:2: rule__EnumerationLiteral__Group__2__Impl rule__EnumerationLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__22704);
            rule__EnumerationLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__3_in_rule__EnumerationLiteral__Group__22707);
            rule__EnumerationLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__2"


    // $ANTLR start "rule__EnumerationLiteral__Group__2__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1368:1: rule__EnumerationLiteral__Group__2__Impl : ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1372:1: ( ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1373:1: ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1373:1: ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1374:1: ( rule__EnumerationLiteral__OrdinalAssignment_2 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getOrdinalAssignment_2()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1375:1: ( rule__EnumerationLiteral__OrdinalAssignment_2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1375:2: rule__EnumerationLiteral__OrdinalAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__OrdinalAssignment_2_in_rule__EnumerationLiteral__Group__2__Impl2734);
            rule__EnumerationLiteral__OrdinalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getOrdinalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__2__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__3"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1385:1: rule__EnumerationLiteral__Group__3 : rule__EnumerationLiteral__Group__3__Impl ;
    public final void rule__EnumerationLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1389:1: ( rule__EnumerationLiteral__Group__3__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1390:2: rule__EnumerationLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__3__Impl_in_rule__EnumerationLiteral__Group__32764);
            rule__EnumerationLiteral__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__3"


    // $ANTLR start "rule__EnumerationLiteral__Group__3__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1396:1: rule__EnumerationLiteral__Group__3__Impl : ( ')' ) ;
    public final void rule__EnumerationLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1400:1: ( ( ')' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1401:1: ( ')' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1401:1: ( ')' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1402:1: ')'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__EnumerationLiteral__Group__3__Impl2792); 
             after(grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1423:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1427:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1428:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__02831);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__02834);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1435:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1439:1: ( ( 'service' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1440:1: ( 'service' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1440:1: ( 'service' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1441:1: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Service__Group__0__Impl2862); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1454:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1458:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1459:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__12893);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__12896);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1466:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1470:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1471:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1471:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1472:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1473:1: ( rule__Service__NameAssignment_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1473:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl2923);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1483:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1487:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1488:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__22953);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__22956);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1495:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1499:1: ( ( '{' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1500:1: ( '{' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1500:1: ( '{' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1501:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Service__Group__2__Impl2984); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1514:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1518:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1519:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__33015);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__33018);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1526:1: rule__Service__Group__3__Impl : ( ( rule__Service__MethodsAssignment_3 )* ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1530:1: ( ( ( rule__Service__MethodsAssignment_3 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1531:1: ( ( rule__Service__MethodsAssignment_3 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1531:1: ( ( rule__Service__MethodsAssignment_3 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1532:1: ( rule__Service__MethodsAssignment_3 )*
            {
             before(grammarAccess.getServiceAccess().getMethodsAssignment_3()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1533:1: ( rule__Service__MethodsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1533:2: rule__Service__MethodsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Service__MethodsAssignment_3_in_rule__Service__Group__3__Impl3045);
            	    rule__Service__MethodsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getMethodsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1543:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1547:1: ( rule__Service__Group__4__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1548:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__43076);
            rule__Service__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1554:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1558:1: ( ( '}' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1559:1: ( '}' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1559:1: ( '}' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1560:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Service__Group__4__Impl3104); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1583:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1587:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1588:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03145);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03148);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1595:1: rule__Method__Group__0__Impl : ( ( rule__Method__ReturnTypeAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1599:1: ( ( ( rule__Method__ReturnTypeAssignment_0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1600:1: ( ( rule__Method__ReturnTypeAssignment_0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1600:1: ( ( rule__Method__ReturnTypeAssignment_0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1601:1: ( rule__Method__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1602:1: ( rule__Method__ReturnTypeAssignment_0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1602:2: rule__Method__ReturnTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Method__ReturnTypeAssignment_0_in_rule__Method__Group__0__Impl3175);
            rule__Method__ReturnTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1612:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1616:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1617:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13205);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__13208);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1624:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1628:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1629:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1629:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1630:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1631:1: ( rule__Method__NameAssignment_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1631:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl3235);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1641:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1645:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1646:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__23265);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__23268);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1653:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1657:1: ( ( '(' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1658:1: ( '(' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1658:1: ( '(' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1659:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Method__Group__2__Impl3296); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1672:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1676:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1677:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__33327);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__33330);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1684:1: rule__Method__Group__3__Impl : ( ( rule__Method__ParametersAssignment_3 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1688:1: ( ( ( rule__Method__ParametersAssignment_3 )? ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1689:1: ( ( rule__Method__ParametersAssignment_3 )? )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1689:1: ( ( rule__Method__ParametersAssignment_3 )? )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1690:1: ( rule__Method__ParametersAssignment_3 )?
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1691:1: ( rule__Method__ParametersAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1691:2: rule__Method__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Method__ParametersAssignment_3_in_rule__Method__Group__3__Impl3357);
                    rule__Method__ParametersAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1701:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1705:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1706:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__43388);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__43391);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1713:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )* ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1717:1: ( ( ( rule__Method__Group_4__0 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1718:1: ( ( rule__Method__Group_4__0 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1718:1: ( ( rule__Method__Group_4__0 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1719:1: ( rule__Method__Group_4__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1720:1: ( rule__Method__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1720:2: rule__Method__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl3418);
            	    rule__Method__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1730:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1734:1: ( rule__Method__Group__5__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1735:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__53449);
            rule__Method__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1741:1: rule__Method__Group__5__Impl : ( ')' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1745:1: ( ( ')' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1746:1: ( ')' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1746:1: ( ')' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1747:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Method__Group__5__Impl3477); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group_4__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1772:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1776:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1777:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__03520);
            rule__Method__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__03523);
            rule__Method__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0"


    // $ANTLR start "rule__Method__Group_4__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1784:1: rule__Method__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1788:1: ( ( ',' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1789:1: ( ',' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1789:1: ( ',' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1790:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Method__Group_4__0__Impl3551); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0__Impl"


    // $ANTLR start "rule__Method__Group_4__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1803:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1807:1: ( rule__Method__Group_4__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1808:2: rule__Method__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__13582);
            rule__Method__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1"


    // $ANTLR start "rule__Method__Group_4__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1814:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__ParametersAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1818:1: ( ( ( rule__Method__ParametersAssignment_4_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1819:1: ( ( rule__Method__ParametersAssignment_4_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1819:1: ( ( rule__Method__ParametersAssignment_4_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1820:1: ( rule__Method__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_4_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1821:1: ( rule__Method__ParametersAssignment_4_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1821:2: rule__Method__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Method__ParametersAssignment_4_1_in_rule__Method__Group_4__1__Impl3609);
            rule__Method__ParametersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1835:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1839:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1840:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03643);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03646);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1847:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1851:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1852:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1852:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1853:1: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1854:1: ( rule__Parameter__TypeAssignment_0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1854:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl3673);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1864:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1868:1: ( rule__Parameter__Group__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1869:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13703);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1875:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1879:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1880:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1880:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1881:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1882:1: ( rule__Parameter__NameAssignment_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1882:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3730);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Model__TypesAssignment_0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1897:1: rule__Model__TypesAssignment_0 : ( ruleType ) ;
    public final void rule__Model__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1901:1: ( ( ruleType ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1902:1: ( ruleType )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1902:1: ( ruleType )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1903:1: ruleType
            {
             before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment_03769);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypesAssignment_0"


    // $ANTLR start "rule__Model__ServicesAssignment_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1912:1: rule__Model__ServicesAssignment_1 : ( ruleService ) ;
    public final void rule__Model__ServicesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1916:1: ( ( ruleService ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1917:1: ( ruleService )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1917:1: ( ruleService )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1918:1: ruleService
            {
             before(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__Model__ServicesAssignment_13800);
            ruleService();

            state._fsp--;

             after(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ServicesAssignment_1"


    // $ANTLR start "rule__SimpleType__NameAssignment_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1927:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1931:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1932:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1932:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1933:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_13831); 
             after(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__NameAssignment_1"


    // $ANTLR start "rule__SimpleType__MappedTypeAssignment_2_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1942:1: rule__SimpleType__MappedTypeAssignment_2_1 : ( ruleTypeId ) ;
    public final void rule__SimpleType__MappedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1946:1: ( ( ruleTypeId ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1947:1: ( ruleTypeId )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1947:1: ( ruleTypeId )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1948:1: ruleTypeId
            {
             before(grammarAccess.getSimpleTypeAccess().getMappedTypeTypeIdParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__SimpleType__MappedTypeAssignment_2_13862);
            ruleTypeId();

            state._fsp--;

             after(grammarAccess.getSimpleTypeAccess().getMappedTypeTypeIdParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__MappedTypeAssignment_2_1"


    // $ANTLR start "rule__TypeId__NameAssignment_0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1957:1: rule__TypeId__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TypeId__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1961:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1962:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1962:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1963:1: RULE_ID
            {
             before(grammarAccess.getTypeIdAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeId__NameAssignment_03893); 
             after(grammarAccess.getTypeIdAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeId__NameAssignment_0"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1972:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1976:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1977:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1977:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1978:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_13924); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Class__SuperEntityAssignment_2_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1987:1: rule__Class__SuperEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__SuperEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1991:1: ( ( ( RULE_ID ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1992:1: ( ( RULE_ID ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1992:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1993:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getSuperEntityClassCrossReference_2_1_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1994:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1995:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getSuperEntityClassIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__SuperEntityAssignment_2_13959); 
             after(grammarAccess.getClassAccess().getSuperEntityClassIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getSuperEntityClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SuperEntityAssignment_2_1"


    // $ANTLR start "rule__Class__AttributesAssignment_4"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2006:1: rule__Class__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2010:1: ( ( ruleAttribute ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2011:1: ( ruleAttribute )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2011:1: ( ruleAttribute )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2012:1: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Class__AttributesAssignment_43994);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__TypeAssignment_0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2021:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2025:1: ( ( ( RULE_ID ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2026:1: ( ( RULE_ID ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2026:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2027:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2028:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2029:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_04029); 
             after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_0"


    // $ANTLR start "rule__Attribute__ManyReferenceAssignment_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2040:1: rule__Attribute__ManyReferenceAssignment_1 : ( ruleAttributeManyReference ) ;
    public final void rule__Attribute__ManyReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2044:1: ( ( ruleAttributeManyReference ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2045:1: ( ruleAttributeManyReference )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2045:1: ( ruleAttributeManyReference )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2046:1: ruleAttributeManyReference
            {
             before(grammarAccess.getAttributeAccess().getManyReferenceAttributeManyReferenceEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeManyReference_in_rule__Attribute__ManyReferenceAssignment_14064);
            ruleAttributeManyReference();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getManyReferenceAttributeManyReferenceEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ManyReferenceAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2055:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2059:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2060:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2060:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2061:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_24095); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2070:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2074:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2075:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2075:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2076:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_14126); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__LiteralsAssignment_3"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2085:1: rule__Enumeration__LiteralsAssignment_3 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2089:1: ( ( ruleEnumerationLiteral ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2090:1: ( ruleEnumerationLiteral )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2090:1: ( ruleEnumerationLiteral )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2091:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__LiteralsAssignment_34157);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__LiteralsAssignment_3"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment_0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2100:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2104:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2105:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2105:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2106:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_04188); 
             after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment_0"


    // $ANTLR start "rule__EnumerationLiteral__OrdinalAssignment_2"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2115:1: rule__EnumerationLiteral__OrdinalAssignment_2 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__OrdinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2119:1: ( ( RULE_INT ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2120:1: ( RULE_INT )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2120:1: ( RULE_INT )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2121:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getOrdinalINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__OrdinalAssignment_24219); 
             after(grammarAccess.getEnumerationLiteralAccess().getOrdinalINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__OrdinalAssignment_2"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2130:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2134:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2135:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2135:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2136:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_14250); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__MethodsAssignment_3"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2145:1: rule__Service__MethodsAssignment_3 : ( ruleMethod ) ;
    public final void rule__Service__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2149:1: ( ( ruleMethod ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2150:1: ( ruleMethod )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2150:1: ( ruleMethod )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2151:1: ruleMethod
            {
             before(grammarAccess.getServiceAccess().getMethodsMethodParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Service__MethodsAssignment_34281);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getMethodsMethodParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__MethodsAssignment_3"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2160:1: rule__Method__ReturnTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Method__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2164:1: ( ( ( RULE_ID ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2165:1: ( ( RULE_ID ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2165:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2166:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeTypeCrossReference_0_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2167:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2168:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getReturnTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__ReturnTypeAssignment_04316); 
             after(grammarAccess.getMethodAccess().getReturnTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getReturnTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypeAssignment_0"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2179:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2183:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2184:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2184:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2185:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_14351); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ParametersAssignment_3"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2194:1: rule__Method__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2198:1: ( ( ruleParameter ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2199:1: ( ruleParameter )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2199:1: ( ruleParameter )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2200:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_34382);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_3"


    // $ANTLR start "rule__Method__ParametersAssignment_4_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2209:1: rule__Method__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2213:1: ( ( ruleParameter ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2214:1: ( ruleParameter )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2214:1: ( ruleParameter )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2215:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_4_14413);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_4_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2224:1: rule__Parameter__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2228:1: ( ( ( RULE_ID ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2229:1: ( ( RULE_ID ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2229:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2230:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2231:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2232:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__TypeAssignment_04448); 
             after(grammarAccess.getParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2243:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2247:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2248:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2248:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2249:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_14483); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeId__Group__0_in_ruleTypeId274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeManyReference__Alternatives_in_ruleAttributeManyReference731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Type__Alternatives783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Type__Alternatives800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AttributeManyReference__Alternatives833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AttributeManyReference__Alternatives854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AttributeManyReference__Alternatives875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0908 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_0_in_rule__Model__Group__0__Impl938 = new BitSet(new long[]{0x0000000000224002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ServicesAssignment_1_in_rule__Model__Group__1__Impl996 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__01031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleType__Group__0__Impl1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__11093 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__11096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__21153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__0_in_rule__SimpleType__Group__2__Impl1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__0__Impl_in_rule__SimpleType__Group_2__01217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__1_in_rule__SimpleType__Group_2__01220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SimpleType__Group_2__0__Impl1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__1__Impl_in_rule__SimpleType__Group_2__11279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__MappedTypeAssignment_2_1_in_rule__SimpleType__Group_2__1__Impl1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeId__Group__0__Impl_in_rule__TypeId__Group__01340 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TypeId__Group__1_in_rule__TypeId__Group__01343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeId__NameAssignment_0_in_rule__TypeId__Group__0__Impl1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeId__Group__1__Impl_in_rule__TypeId__Group__11400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeId__Group_1__0_in_rule__TypeId__Group__1__Impl1427 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__TypeId__Group_1__0__Impl_in_rule__TypeId__Group_1__01462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeId__Group_1__1_in_rule__TypeId__Group_1__01465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeId__Group_1__0__Impl1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeId__Group_1__1__Impl_in_rule__TypeId__Group_1__11524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeId__Group_1__1__Impl1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Class__Group__0__Impl1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11646 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21706 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__0_in_rule__Class__Group__2__Impl1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31767 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Class__Group__3__Impl1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41829 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__AttributesAssignment_4_in_rule__Class__Group__4__Impl1859 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Class__Group__5__Impl1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__0__Impl_in_rule__Class__Group_2__01961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_2__1_in_rule__Class__Group_2__01964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Class__Group_2__0__Impl1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__1__Impl_in_rule__Class__Group_2__12023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__SuperEntityAssignment_2_1_in_rule__Class__Group_2__1__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02084 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12144 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ManyReferenceAssignment_1_in_rule__Attribute__Group__1__Impl2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__02268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Enumeration__Group__0__Impl2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__12330 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__22390 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Enumeration__Group__2__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__32452 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl2482 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__42513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Enumeration__Group__4__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__02582 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__12642 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__12645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumerationLiteral__Group__1__Impl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__22704 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__3_in_rule__EnumerationLiteral__Group__22707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__OrdinalAssignment_2_in_rule__EnumerationLiteral__Group__2__Impl2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__3__Impl_in_rule__EnumerationLiteral__Group__32764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumerationLiteral__Group__3__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__02831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__02834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Service__Group__0__Impl2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__12893 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__12896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__22953 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__22956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Service__Group__2__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__33015 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__33018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__MethodsAssignment_3_in_rule__Service__Group__3__Impl3045 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__43076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Service__Group__4__Impl3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturnTypeAssignment_0_in_rule__Method__Group__0__Impl3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13205 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__13208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__23265 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__23268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Method__Group__2__Impl3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__33327 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__33330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_3_in_rule__Method__Group__3__Impl3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__43388 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__43391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl3418 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__53449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Method__Group__5__Impl3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__03520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__03523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Method__Group_4__0__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__13582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_4_1_in_rule__Method__Group_4__1__Impl3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment_03769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Model__ServicesAssignment_13800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_13831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__SimpleType__MappedTypeAssignment_2_13862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeId__NameAssignment_03893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_13924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__SuperEntityAssignment_2_13959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Class__AttributesAssignment_43994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_04029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeManyReference_in_rule__Attribute__ManyReferenceAssignment_14064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_24095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_14126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__LiteralsAssignment_34157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_04188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__OrdinalAssignment_24219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_14250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Service__MethodsAssignment_34281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__ReturnTypeAssignment_04316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_14351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_34382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_4_14413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__TypeAssignment_04448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_14483 = new BitSet(new long[]{0x0000000000000002L});

}