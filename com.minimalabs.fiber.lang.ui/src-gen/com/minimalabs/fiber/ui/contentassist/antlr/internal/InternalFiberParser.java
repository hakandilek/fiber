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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NONE'", "'*'", "'#'", "'type'", "'is'", "'.'", "'class'", "'{'", "'}'", "':'", "','", "'enum'", "'('", "')'", "'service'"
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


    // $ANTLR start "entryRuleClassType"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:116:1: entryRuleClassType : ruleClassType EOF ;
    public final void entryRuleClassType() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:117:1: ( ruleClassType EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:118:1: ruleClassType EOF
            {
             before(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_ruleClassType_in_entryRuleClassType181);
            ruleClassType();

            state._fsp--;

             after(grammarAccess.getClassTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassType188); 

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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:125:1: ruleClassType : ( ( rule__ClassType__Alternatives ) ) ;
    public final void ruleClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:129:2: ( ( ( rule__ClassType__Alternatives ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:130:1: ( ( rule__ClassType__Alternatives ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:130:1: ( ( rule__ClassType__Alternatives ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:131:1: ( rule__ClassType__Alternatives )
            {
             before(grammarAccess.getClassTypeAccess().getAlternatives()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:132:1: ( rule__ClassType__Alternatives )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:132:2: rule__ClassType__Alternatives
            {
            pushFollow(FOLLOW_rule__ClassType__Alternatives_in_ruleClassType214);
            rule__ClassType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleClassType"


    // $ANTLR start "entryRuleSimpleType"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:144:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:145:1: ( ruleSimpleType EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:146:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType241);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType248); 

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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:153:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:157:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:158:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:158:1: ( ( rule__SimpleType__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:159:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:160:1: ( rule__SimpleType__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:160:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType274);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:172:1: entryRuleTypeId : ruleTypeId EOF ;
    public final void entryRuleTypeId() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:173:1: ( ruleTypeId EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:174:1: ruleTypeId EOF
            {
             before(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId301);
            ruleTypeId();

            state._fsp--;

             after(grammarAccess.getTypeIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId308); 

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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:181:1: ruleTypeId : ( ( rule__TypeId__Group__0 ) ) ;
    public final void ruleTypeId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:185:2: ( ( ( rule__TypeId__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:186:1: ( ( rule__TypeId__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:186:1: ( ( rule__TypeId__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:187:1: ( rule__TypeId__Group__0 )
            {
             before(grammarAccess.getTypeIdAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:188:1: ( rule__TypeId__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:188:2: rule__TypeId__Group__0
            {
            pushFollow(FOLLOW_rule__TypeId__Group__0_in_ruleTypeId334);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:200:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:201:1: ( ruleClass EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:202:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass361);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass368); 

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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:209:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:213:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:214:1: ( ( rule__Class__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:214:1: ( ( rule__Class__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:215:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:216:1: ( rule__Class__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:216:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass394);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:228:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:229:1: ( ruleAttribute EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:230:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute421);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute428); 

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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:237:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:241:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:242:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:242:1: ( ( rule__Attribute__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:243:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:244:1: ( rule__Attribute__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:244:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute454);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:256:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:257:1: ( ruleEnumeration EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:258:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration481);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration488); 

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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:265:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:269:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:270:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:270:1: ( ( rule__Enumeration__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:271:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:272:1: ( rule__Enumeration__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:272:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration514);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:284:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:285:1: ( ruleEnumerationLiteral EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:286:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral541);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral548); 

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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:293:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:297:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:298:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:298:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:299:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:300:1: ( rule__EnumerationLiteral__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:300:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral574);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:312:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:313:1: ( ruleService EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:314:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService601);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService608); 

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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:321:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:325:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:326:1: ( ( rule__Service__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:326:1: ( ( rule__Service__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:327:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:328:1: ( rule__Service__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:328:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService634);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:340:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:341:1: ( ruleMethod EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:342:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod661);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod668); 

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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:349:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:353:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:354:1: ( ( rule__Method__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:354:1: ( ( rule__Method__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:355:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:356:1: ( rule__Method__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:356:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod694);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:368:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:369:1: ( ruleParameter EOF )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:370:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter721);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter728); 

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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:377:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:381:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:382:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:382:1: ( ( rule__Parameter__Group__0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:383:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:384:1: ( rule__Parameter__Group__0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:384:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter754);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:397:1: ruleAttributeManyReference : ( ( rule__AttributeManyReference__Alternatives ) ) ;
    public final void ruleAttributeManyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:401:1: ( ( ( rule__AttributeManyReference__Alternatives ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:402:1: ( ( rule__AttributeManyReference__Alternatives ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:402:1: ( ( rule__AttributeManyReference__Alternatives ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:403:1: ( rule__AttributeManyReference__Alternatives )
            {
             before(grammarAccess.getAttributeManyReferenceAccess().getAlternatives()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:404:1: ( rule__AttributeManyReference__Alternatives )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:404:2: rule__AttributeManyReference__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeManyReference__Alternatives_in_ruleAttributeManyReference791);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:415:1: rule__Type__Alternatives : ( ( ruleClassType ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:419:1: ( ( ruleClassType ) | ( ruleEnumeration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14||LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:420:1: ( ruleClassType )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:420:1: ( ruleClassType )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:421:1: ruleClassType
                    {
                     before(grammarAccess.getTypeAccess().getClassTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleClassType_in_rule__Type__Alternatives826);
                    ruleClassType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getClassTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:426:6: ( ruleEnumeration )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:426:6: ( ruleEnumeration )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:427:1: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Type__Alternatives843);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_1()); 

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


    // $ANTLR start "rule__ClassType__Alternatives"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:437:1: rule__ClassType__Alternatives : ( ( ruleSimpleType ) | ( ruleClass ) );
    public final void rule__ClassType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:441:1: ( ( ruleSimpleType ) | ( ruleClass ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:442:1: ( ruleSimpleType )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:442:1: ( ruleSimpleType )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:443:1: ruleSimpleType
                    {
                     before(grammarAccess.getClassTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__ClassType__Alternatives875);
                    ruleSimpleType();

                    state._fsp--;

                     after(grammarAccess.getClassTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:448:6: ( ruleClass )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:448:6: ( ruleClass )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:449:1: ruleClass
                    {
                     before(grammarAccess.getClassTypeAccess().getClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClass_in_rule__ClassType__Alternatives892);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getClassTypeAccess().getClassParserRuleCall_1()); 

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
    // $ANTLR end "rule__ClassType__Alternatives"


    // $ANTLR start "rule__AttributeManyReference__Alternatives"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:459:1: rule__AttributeManyReference__Alternatives : ( ( ( 'NONE' ) ) | ( ( '*' ) ) | ( ( '#' ) ) );
    public final void rule__AttributeManyReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:463:1: ( ( ( 'NONE' ) ) | ( ( '*' ) ) | ( ( '#' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:464:1: ( ( 'NONE' ) )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:464:1: ( ( 'NONE' ) )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:465:1: ( 'NONE' )
                    {
                     before(grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0()); 
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:466:1: ( 'NONE' )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:466:3: 'NONE'
                    {
                    match(input,11,FOLLOW_11_in_rule__AttributeManyReference__Alternatives925); 

                    }

                     after(grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:471:6: ( ( '*' ) )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:471:6: ( ( '*' ) )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:472:1: ( '*' )
                    {
                     before(grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1()); 
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:473:1: ( '*' )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:473:3: '*'
                    {
                    match(input,12,FOLLOW_12_in_rule__AttributeManyReference__Alternatives946); 

                    }

                     after(grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:478:6: ( ( '#' ) )
                    {
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:478:6: ( ( '#' ) )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:479:1: ( '#' )
                    {
                     before(grammarAccess.getAttributeManyReferenceAccess().getSTRONGEnumLiteralDeclaration_2()); 
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:480:1: ( '#' )
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:480:3: '#'
                    {
                    match(input,13,FOLLOW_13_in_rule__AttributeManyReference__Alternatives967); 

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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:492:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:496:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:497:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01000);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01003);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:504:1: rule__Model__Group__0__Impl : ( ( rule__Model__TypesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:508:1: ( ( ( rule__Model__TypesAssignment_0 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:509:1: ( ( rule__Model__TypesAssignment_0 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:509:1: ( ( rule__Model__TypesAssignment_0 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:510:1: ( rule__Model__TypesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:511:1: ( rule__Model__TypesAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||LA4_0==17||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:511:2: rule__Model__TypesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_0_in_rule__Model__Group__0__Impl1030);
            	    rule__Model__TypesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:521:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:525:1: ( rule__Model__Group__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:526:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11061);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:532:1: rule__Model__Group__1__Impl : ( ( rule__Model__ServicesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:536:1: ( ( ( rule__Model__ServicesAssignment_1 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:537:1: ( ( rule__Model__ServicesAssignment_1 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:537:1: ( ( rule__Model__ServicesAssignment_1 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:538:1: ( rule__Model__ServicesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getServicesAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:539:1: ( rule__Model__ServicesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:539:2: rule__Model__ServicesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ServicesAssignment_1_in_rule__Model__Group__1__Impl1088);
            	    rule__Model__ServicesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:553:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:557:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:558:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__01123);
            rule__SimpleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01126);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:565:1: rule__SimpleType__Group__0__Impl : ( 'type' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:569:1: ( ( 'type' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:570:1: ( 'type' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:570:1: ( 'type' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:571:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__SimpleType__Group__0__Impl1154); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:584:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:588:1: ( rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:589:2: rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__11185);
            rule__SimpleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__11188);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:596:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:600:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:601:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:601:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:602:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:603:1: ( rule__SimpleType__NameAssignment_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:603:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl1215);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:613:1: rule__SimpleType__Group__2 : rule__SimpleType__Group__2__Impl ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:617:1: ( rule__SimpleType__Group__2__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:618:2: rule__SimpleType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__21245);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:624:1: rule__SimpleType__Group__2__Impl : ( ( rule__SimpleType__Group_2__0 )? ) ;
    public final void rule__SimpleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:628:1: ( ( ( rule__SimpleType__Group_2__0 )? ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:629:1: ( ( rule__SimpleType__Group_2__0 )? )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:629:1: ( ( rule__SimpleType__Group_2__0 )? )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:630:1: ( rule__SimpleType__Group_2__0 )?
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup_2()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:631:1: ( rule__SimpleType__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:631:2: rule__SimpleType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SimpleType__Group_2__0_in_rule__SimpleType__Group__2__Impl1272);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:647:1: rule__SimpleType__Group_2__0 : rule__SimpleType__Group_2__0__Impl rule__SimpleType__Group_2__1 ;
    public final void rule__SimpleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:651:1: ( rule__SimpleType__Group_2__0__Impl rule__SimpleType__Group_2__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:652:2: rule__SimpleType__Group_2__0__Impl rule__SimpleType__Group_2__1
            {
            pushFollow(FOLLOW_rule__SimpleType__Group_2__0__Impl_in_rule__SimpleType__Group_2__01309);
            rule__SimpleType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group_2__1_in_rule__SimpleType__Group_2__01312);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:659:1: rule__SimpleType__Group_2__0__Impl : ( 'is' ) ;
    public final void rule__SimpleType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:663:1: ( ( 'is' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:664:1: ( 'is' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:664:1: ( 'is' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:665:1: 'is'
            {
             before(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__SimpleType__Group_2__0__Impl1340); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:678:1: rule__SimpleType__Group_2__1 : rule__SimpleType__Group_2__1__Impl ;
    public final void rule__SimpleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:682:1: ( rule__SimpleType__Group_2__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:683:2: rule__SimpleType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleType__Group_2__1__Impl_in_rule__SimpleType__Group_2__11371);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:689:1: rule__SimpleType__Group_2__1__Impl : ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) ) ;
    public final void rule__SimpleType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:693:1: ( ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:694:1: ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:694:1: ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:695:1: ( rule__SimpleType__MappedTypeAssignment_2_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getMappedTypeAssignment_2_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:696:1: ( rule__SimpleType__MappedTypeAssignment_2_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:696:2: rule__SimpleType__MappedTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SimpleType__MappedTypeAssignment_2_1_in_rule__SimpleType__Group_2__1__Impl1398);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:710:1: rule__TypeId__Group__0 : rule__TypeId__Group__0__Impl rule__TypeId__Group__1 ;
    public final void rule__TypeId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:714:1: ( rule__TypeId__Group__0__Impl rule__TypeId__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:715:2: rule__TypeId__Group__0__Impl rule__TypeId__Group__1
            {
            pushFollow(FOLLOW_rule__TypeId__Group__0__Impl_in_rule__TypeId__Group__01432);
            rule__TypeId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeId__Group__1_in_rule__TypeId__Group__01435);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:722:1: rule__TypeId__Group__0__Impl : ( ( rule__TypeId__NameAssignment_0 ) ) ;
    public final void rule__TypeId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:726:1: ( ( ( rule__TypeId__NameAssignment_0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:727:1: ( ( rule__TypeId__NameAssignment_0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:727:1: ( ( rule__TypeId__NameAssignment_0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:728:1: ( rule__TypeId__NameAssignment_0 )
            {
             before(grammarAccess.getTypeIdAccess().getNameAssignment_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:729:1: ( rule__TypeId__NameAssignment_0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:729:2: rule__TypeId__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeId__NameAssignment_0_in_rule__TypeId__Group__0__Impl1462);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:739:1: rule__TypeId__Group__1 : rule__TypeId__Group__1__Impl ;
    public final void rule__TypeId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:743:1: ( rule__TypeId__Group__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:744:2: rule__TypeId__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeId__Group__1__Impl_in_rule__TypeId__Group__11492);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:750:1: rule__TypeId__Group__1__Impl : ( ( rule__TypeId__Group_1__0 )* ) ;
    public final void rule__TypeId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:754:1: ( ( ( rule__TypeId__Group_1__0 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:755:1: ( ( rule__TypeId__Group_1__0 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:755:1: ( ( rule__TypeId__Group_1__0 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:756:1: ( rule__TypeId__Group_1__0 )*
            {
             before(grammarAccess.getTypeIdAccess().getGroup_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:757:1: ( rule__TypeId__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:757:2: rule__TypeId__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TypeId__Group_1__0_in_rule__TypeId__Group__1__Impl1519);
            	    rule__TypeId__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:771:1: rule__TypeId__Group_1__0 : rule__TypeId__Group_1__0__Impl rule__TypeId__Group_1__1 ;
    public final void rule__TypeId__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:775:1: ( rule__TypeId__Group_1__0__Impl rule__TypeId__Group_1__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:776:2: rule__TypeId__Group_1__0__Impl rule__TypeId__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeId__Group_1__0__Impl_in_rule__TypeId__Group_1__01554);
            rule__TypeId__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeId__Group_1__1_in_rule__TypeId__Group_1__01557);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:783:1: rule__TypeId__Group_1__0__Impl : ( '.' ) ;
    public final void rule__TypeId__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:787:1: ( ( '.' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:788:1: ( '.' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:788:1: ( '.' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:789:1: '.'
            {
             before(grammarAccess.getTypeIdAccess().getFullStopKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__TypeId__Group_1__0__Impl1585); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:802:1: rule__TypeId__Group_1__1 : rule__TypeId__Group_1__1__Impl ;
    public final void rule__TypeId__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:806:1: ( rule__TypeId__Group_1__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:807:2: rule__TypeId__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeId__Group_1__1__Impl_in_rule__TypeId__Group_1__11616);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:813:1: rule__TypeId__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__TypeId__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:817:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:818:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:818:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:819:1: RULE_ID
            {
             before(grammarAccess.getTypeIdAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeId__Group_1__1__Impl1643); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:834:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:838:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:839:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01676);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01679);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:846:1: rule__Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:850:1: ( ( 'class' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:851:1: ( 'class' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:851:1: ( 'class' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:852:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Class__Group__0__Impl1707); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:865:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:869:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:870:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11738);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11741);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:877:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:881:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:882:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:882:1: ( ( rule__Class__NameAssignment_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:883:1: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:884:1: ( rule__Class__NameAssignment_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:884:2: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl1768);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:894:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:898:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:899:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21798);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21801);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:906:1: rule__Class__Group__2__Impl : ( ( rule__Class__Group_2__0 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:910:1: ( ( ( rule__Class__Group_2__0 )? ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:911:1: ( ( rule__Class__Group_2__0 )? )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:911:1: ( ( rule__Class__Group_2__0 )? )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:912:1: ( rule__Class__Group_2__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_2()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:913:1: ( rule__Class__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:913:2: rule__Class__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_2__0_in_rule__Class__Group__2__Impl1828);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:923:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:927:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:928:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31859);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31862);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:935:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:939:1: ( ( '{' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:940:1: ( '{' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:940:1: ( '{' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:941:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Class__Group__3__Impl1890); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:954:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:958:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:959:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41921);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41924);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:966:1: rule__Class__Group__4__Impl : ( ( rule__Class__AttributesAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:970:1: ( ( ( rule__Class__AttributesAssignment_4 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:971:1: ( ( rule__Class__AttributesAssignment_4 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:971:1: ( ( rule__Class__AttributesAssignment_4 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:972:1: ( rule__Class__AttributesAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_4()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:973:1: ( rule__Class__AttributesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:973:2: rule__Class__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Class__AttributesAssignment_4_in_rule__Class__Group__4__Impl1951);
            	    rule__Class__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:983:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:987:1: ( rule__Class__Group__5__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:988:2: rule__Class__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51982);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:994:1: rule__Class__Group__5__Impl : ( '}' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:998:1: ( ( '}' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:999:1: ( '}' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:999:1: ( '}' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1000:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Class__Group__5__Impl2010); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1025:1: rule__Class__Group_2__0 : rule__Class__Group_2__0__Impl rule__Class__Group_2__1 ;
    public final void rule__Class__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1029:1: ( rule__Class__Group_2__0__Impl rule__Class__Group_2__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1030:2: rule__Class__Group_2__0__Impl rule__Class__Group_2__1
            {
            pushFollow(FOLLOW_rule__Class__Group_2__0__Impl_in_rule__Class__Group_2__02053);
            rule__Class__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_2__1_in_rule__Class__Group_2__02056);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1037:1: rule__Class__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Class__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1041:1: ( ( ':' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1042:1: ( ':' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1042:1: ( ':' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1043:1: ':'
            {
             before(grammarAccess.getClassAccess().getColonKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Class__Group_2__0__Impl2084); 
             after(grammarAccess.getClassAccess().getColonKeyword_2_0()); 

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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1056:1: rule__Class__Group_2__1 : rule__Class__Group_2__1__Impl rule__Class__Group_2__2 ;
    public final void rule__Class__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1060:1: ( rule__Class__Group_2__1__Impl rule__Class__Group_2__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1061:2: rule__Class__Group_2__1__Impl rule__Class__Group_2__2
            {
            pushFollow(FOLLOW_rule__Class__Group_2__1__Impl_in_rule__Class__Group_2__12115);
            rule__Class__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_2__2_in_rule__Class__Group_2__12118);
            rule__Class__Group_2__2();

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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1068:1: rule__Class__Group_2__1__Impl : ( ( rule__Class__SuperTypesAssignment_2_1 ) ) ;
    public final void rule__Class__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1072:1: ( ( ( rule__Class__SuperTypesAssignment_2_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1073:1: ( ( rule__Class__SuperTypesAssignment_2_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1073:1: ( ( rule__Class__SuperTypesAssignment_2_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1074:1: ( rule__Class__SuperTypesAssignment_2_1 )
            {
             before(grammarAccess.getClassAccess().getSuperTypesAssignment_2_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1075:1: ( rule__Class__SuperTypesAssignment_2_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1075:2: rule__Class__SuperTypesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Class__SuperTypesAssignment_2_1_in_rule__Class__Group_2__1__Impl2145);
            rule__Class__SuperTypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperTypesAssignment_2_1()); 

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


    // $ANTLR start "rule__Class__Group_2__2"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1085:1: rule__Class__Group_2__2 : rule__Class__Group_2__2__Impl ;
    public final void rule__Class__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1089:1: ( rule__Class__Group_2__2__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1090:2: rule__Class__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_2__2__Impl_in_rule__Class__Group_2__22175);
            rule__Class__Group_2__2__Impl();

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
    // $ANTLR end "rule__Class__Group_2__2"


    // $ANTLR start "rule__Class__Group_2__2__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1096:1: rule__Class__Group_2__2__Impl : ( ( rule__Class__Group_2_2__0 )* ) ;
    public final void rule__Class__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1100:1: ( ( ( rule__Class__Group_2_2__0 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1101:1: ( ( rule__Class__Group_2_2__0 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1101:1: ( ( rule__Class__Group_2_2__0 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1102:1: ( rule__Class__Group_2_2__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_2_2()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1103:1: ( rule__Class__Group_2_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1103:2: rule__Class__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Class__Group_2_2__0_in_rule__Class__Group_2__2__Impl2202);
            	    rule__Class__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Class__Group_2__2__Impl"


    // $ANTLR start "rule__Class__Group_2_2__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1119:1: rule__Class__Group_2_2__0 : rule__Class__Group_2_2__0__Impl rule__Class__Group_2_2__1 ;
    public final void rule__Class__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1123:1: ( rule__Class__Group_2_2__0__Impl rule__Class__Group_2_2__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1124:2: rule__Class__Group_2_2__0__Impl rule__Class__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Class__Group_2_2__0__Impl_in_rule__Class__Group_2_2__02239);
            rule__Class__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_2_2__1_in_rule__Class__Group_2_2__02242);
            rule__Class__Group_2_2__1();

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
    // $ANTLR end "rule__Class__Group_2_2__0"


    // $ANTLR start "rule__Class__Group_2_2__0__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1131:1: rule__Class__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1135:1: ( ( ',' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1136:1: ( ',' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1136:1: ( ',' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1137:1: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_2_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Class__Group_2_2__0__Impl2270); 
             after(grammarAccess.getClassAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Class__Group_2_2__0__Impl"


    // $ANTLR start "rule__Class__Group_2_2__1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1150:1: rule__Class__Group_2_2__1 : rule__Class__Group_2_2__1__Impl ;
    public final void rule__Class__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1154:1: ( rule__Class__Group_2_2__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1155:2: rule__Class__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_2_2__1__Impl_in_rule__Class__Group_2_2__12301);
            rule__Class__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Class__Group_2_2__1"


    // $ANTLR start "rule__Class__Group_2_2__1__Impl"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1161:1: rule__Class__Group_2_2__1__Impl : ( ( rule__Class__SuperTypesAssignment_2_2_1 ) ) ;
    public final void rule__Class__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1165:1: ( ( ( rule__Class__SuperTypesAssignment_2_2_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1166:1: ( ( rule__Class__SuperTypesAssignment_2_2_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1166:1: ( ( rule__Class__SuperTypesAssignment_2_2_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1167:1: ( rule__Class__SuperTypesAssignment_2_2_1 )
            {
             before(grammarAccess.getClassAccess().getSuperTypesAssignment_2_2_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1168:1: ( rule__Class__SuperTypesAssignment_2_2_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1168:2: rule__Class__SuperTypesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Class__SuperTypesAssignment_2_2_1_in_rule__Class__Group_2_2__1__Impl2328);
            rule__Class__SuperTypesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperTypesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Class__Group_2_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1182:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1186:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1187:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02362);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02365);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1194:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1198:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1199:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1199:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1200:1: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1201:1: ( rule__Attribute__TypeAssignment_0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1201:2: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl2392);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1211:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1215:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1216:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12422);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12425);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1223:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ManyReferenceAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1227:1: ( ( ( rule__Attribute__ManyReferenceAssignment_1 )? ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1228:1: ( ( rule__Attribute__ManyReferenceAssignment_1 )? )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1228:1: ( ( rule__Attribute__ManyReferenceAssignment_1 )? )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1229:1: ( rule__Attribute__ManyReferenceAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getManyReferenceAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1230:1: ( rule__Attribute__ManyReferenceAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=13)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1230:2: rule__Attribute__ManyReferenceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ManyReferenceAssignment_1_in_rule__Attribute__Group__1__Impl2452);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1240:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1244:1: ( rule__Attribute__Group__2__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1245:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22483);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1251:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1255:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1256:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1256:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1257:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1258:1: ( rule__Attribute__NameAssignment_2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1258:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2510);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1274:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1278:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1279:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__02546);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02549);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1286:1: rule__Enumeration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1290:1: ( ( 'enum' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1291:1: ( 'enum' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1291:1: ( 'enum' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1292:1: 'enum'
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Enumeration__Group__0__Impl2577); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1305:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1309:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1310:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__12608);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12611);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1317:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1321:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1322:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1322:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1323:1: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1324:1: ( rule__Enumeration__NameAssignment_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1324:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl2638);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1334:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1338:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1339:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__22668);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22671);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1346:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1350:1: ( ( '{' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1351:1: ( '{' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1351:1: ( '{' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1352:1: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Enumeration__Group__2__Impl2699); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1365:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1369:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1370:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__32730);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32733);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1377:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__LiteralsAssignment_3 )* ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1381:1: ( ( ( rule__Enumeration__LiteralsAssignment_3 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1382:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1382:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1383:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1384:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1384:2: rule__Enumeration__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl2760);
            	    rule__Enumeration__LiteralsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1394:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1398:1: ( rule__Enumeration__Group__4__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1399:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__42791);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1405:1: rule__Enumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1409:1: ( ( '}' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1410:1: ( '}' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1410:1: ( '}' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1411:1: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Enumeration__Group__4__Impl2819); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1434:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1438:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1439:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__02860);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02863);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1446:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1450:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1451:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1451:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1452:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1453:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1453:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl2890);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1463:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1467:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1468:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__12920);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__12923);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1475:1: rule__EnumerationLiteral__Group__1__Impl : ( '(' ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1479:1: ( ( '(' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1480:1: ( '(' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1480:1: ( '(' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1481:1: '('
            {
             before(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__EnumerationLiteral__Group__1__Impl2951); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1494:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl rule__EnumerationLiteral__Group__3 ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1498:1: ( rule__EnumerationLiteral__Group__2__Impl rule__EnumerationLiteral__Group__3 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1499:2: rule__EnumerationLiteral__Group__2__Impl rule__EnumerationLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__22982);
            rule__EnumerationLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__3_in_rule__EnumerationLiteral__Group__22985);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1506:1: rule__EnumerationLiteral__Group__2__Impl : ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1510:1: ( ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1511:1: ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1511:1: ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1512:1: ( rule__EnumerationLiteral__OrdinalAssignment_2 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getOrdinalAssignment_2()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1513:1: ( rule__EnumerationLiteral__OrdinalAssignment_2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1513:2: rule__EnumerationLiteral__OrdinalAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__OrdinalAssignment_2_in_rule__EnumerationLiteral__Group__2__Impl3012);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1523:1: rule__EnumerationLiteral__Group__3 : rule__EnumerationLiteral__Group__3__Impl ;
    public final void rule__EnumerationLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1527:1: ( rule__EnumerationLiteral__Group__3__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1528:2: rule__EnumerationLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__3__Impl_in_rule__EnumerationLiteral__Group__33042);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1534:1: rule__EnumerationLiteral__Group__3__Impl : ( ')' ) ;
    public final void rule__EnumerationLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1538:1: ( ( ')' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1539:1: ( ')' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1539:1: ( ')' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1540:1: ')'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__EnumerationLiteral__Group__3__Impl3070); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1561:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1565:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1566:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__03109);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__03112);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1573:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1577:1: ( ( 'service' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1578:1: ( 'service' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1578:1: ( 'service' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1579:1: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Service__Group__0__Impl3140); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1592:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1596:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1597:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__13171);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__13174);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1604:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1608:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1609:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1609:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1610:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1611:1: ( rule__Service__NameAssignment_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1611:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl3201);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1621:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1625:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1626:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__23231);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__23234);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1633:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1637:1: ( ( '{' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1638:1: ( '{' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1638:1: ( '{' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1639:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Service__Group__2__Impl3262); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1652:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1656:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1657:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__33293);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__33296);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1664:1: rule__Service__Group__3__Impl : ( ( rule__Service__MethodsAssignment_3 )* ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1668:1: ( ( ( rule__Service__MethodsAssignment_3 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1669:1: ( ( rule__Service__MethodsAssignment_3 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1669:1: ( ( rule__Service__MethodsAssignment_3 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1670:1: ( rule__Service__MethodsAssignment_3 )*
            {
             before(grammarAccess.getServiceAccess().getMethodsAssignment_3()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1671:1: ( rule__Service__MethodsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1671:2: rule__Service__MethodsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Service__MethodsAssignment_3_in_rule__Service__Group__3__Impl3323);
            	    rule__Service__MethodsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1681:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1685:1: ( rule__Service__Group__4__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1686:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__43354);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1692:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1696:1: ( ( '}' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1697:1: ( '}' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1697:1: ( '}' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1698:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Service__Group__4__Impl3382); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1721:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1725:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1726:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03423);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03426);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1733:1: rule__Method__Group__0__Impl : ( ( rule__Method__ReturnTypeAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1737:1: ( ( ( rule__Method__ReturnTypeAssignment_0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1738:1: ( ( rule__Method__ReturnTypeAssignment_0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1738:1: ( ( rule__Method__ReturnTypeAssignment_0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1739:1: ( rule__Method__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1740:1: ( rule__Method__ReturnTypeAssignment_0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1740:2: rule__Method__ReturnTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Method__ReturnTypeAssignment_0_in_rule__Method__Group__0__Impl3453);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1750:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1754:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1755:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13483);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__13486);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1762:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1766:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1767:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1767:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1768:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1769:1: ( rule__Method__NameAssignment_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1769:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl3513);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1779:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1783:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1784:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__23543);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__23546);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1791:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1795:1: ( ( '(' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1796:1: ( '(' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1796:1: ( '(' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1797:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Method__Group__2__Impl3574); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1810:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1814:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1815:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__33605);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__33608);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1822:1: rule__Method__Group__3__Impl : ( ( rule__Method__ParametersAssignment_3 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1826:1: ( ( ( rule__Method__ParametersAssignment_3 )? ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1827:1: ( ( rule__Method__ParametersAssignment_3 )? )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1827:1: ( ( rule__Method__ParametersAssignment_3 )? )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1828:1: ( rule__Method__ParametersAssignment_3 )?
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1829:1: ( rule__Method__ParametersAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1829:2: rule__Method__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Method__ParametersAssignment_3_in_rule__Method__Group__3__Impl3635);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1839:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1843:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1844:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__43666);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__43669);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1851:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )* ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1855:1: ( ( ( rule__Method__Group_4__0 )* ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1856:1: ( ( rule__Method__Group_4__0 )* )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1856:1: ( ( rule__Method__Group_4__0 )* )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1857:1: ( rule__Method__Group_4__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1858:1: ( rule__Method__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1858:2: rule__Method__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl3696);
            	    rule__Method__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1868:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1872:1: ( rule__Method__Group__5__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1873:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__53727);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1879:1: rule__Method__Group__5__Impl : ( ')' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1883:1: ( ( ')' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1884:1: ( ')' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1884:1: ( ')' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1885:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Method__Group__5__Impl3755); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1910:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1914:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1915:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__03798);
            rule__Method__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__03801);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1922:1: rule__Method__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1926:1: ( ( ',' ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1927:1: ( ',' )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1927:1: ( ',' )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1928:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Method__Group_4__0__Impl3829); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1941:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1945:1: ( rule__Method__Group_4__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1946:2: rule__Method__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__13860);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1952:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__ParametersAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1956:1: ( ( ( rule__Method__ParametersAssignment_4_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1957:1: ( ( rule__Method__ParametersAssignment_4_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1957:1: ( ( rule__Method__ParametersAssignment_4_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1958:1: ( rule__Method__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_4_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1959:1: ( rule__Method__ParametersAssignment_4_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1959:2: rule__Method__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Method__ParametersAssignment_4_1_in_rule__Method__Group_4__1__Impl3887);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1973:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1977:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1978:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03921);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03924);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1985:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1989:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1990:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1990:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1991:1: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1992:1: ( rule__Parameter__TypeAssignment_0 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:1992:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl3951);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2002:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2006:1: ( rule__Parameter__Group__1__Impl )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2007:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13981);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2013:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2017:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2018:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2018:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2019:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2020:1: ( rule__Parameter__NameAssignment_1 )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2020:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4008);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2035:1: rule__Model__TypesAssignment_0 : ( ruleType ) ;
    public final void rule__Model__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2039:1: ( ( ruleType ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2040:1: ( ruleType )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2040:1: ( ruleType )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2041:1: ruleType
            {
             before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment_04047);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2050:1: rule__Model__ServicesAssignment_1 : ( ruleService ) ;
    public final void rule__Model__ServicesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2054:1: ( ( ruleService ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2055:1: ( ruleService )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2055:1: ( ruleService )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2056:1: ruleService
            {
             before(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__Model__ServicesAssignment_14078);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2065:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2069:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2070:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2070:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2071:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_14109); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2080:1: rule__SimpleType__MappedTypeAssignment_2_1 : ( ruleTypeId ) ;
    public final void rule__SimpleType__MappedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2084:1: ( ( ruleTypeId ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2085:1: ( ruleTypeId )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2085:1: ( ruleTypeId )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2086:1: ruleTypeId
            {
             before(grammarAccess.getSimpleTypeAccess().getMappedTypeTypeIdParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__SimpleType__MappedTypeAssignment_2_14140);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2095:1: rule__TypeId__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TypeId__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2099:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2100:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2100:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2101:1: RULE_ID
            {
             before(grammarAccess.getTypeIdAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeId__NameAssignment_04171); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2110:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2114:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2115:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2115:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2116:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_14202); 
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


    // $ANTLR start "rule__Class__SuperTypesAssignment_2_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2125:1: rule__Class__SuperTypesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__SuperTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2129:1: ( ( ( RULE_ID ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2130:1: ( ( RULE_ID ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2130:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2131:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getSuperTypesClassTypeCrossReference_2_1_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2132:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2133:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getSuperTypesClassTypeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__SuperTypesAssignment_2_14237); 
             after(grammarAccess.getClassAccess().getSuperTypesClassTypeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getSuperTypesClassTypeCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Class__SuperTypesAssignment_2_1"


    // $ANTLR start "rule__Class__SuperTypesAssignment_2_2_1"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2144:1: rule__Class__SuperTypesAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__SuperTypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2148:1: ( ( ( RULE_ID ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2149:1: ( ( RULE_ID ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2149:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2150:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getSuperTypesClassTypeCrossReference_2_2_1_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2151:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2152:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getSuperTypesClassTypeIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__SuperTypesAssignment_2_2_14276); 
             after(grammarAccess.getClassAccess().getSuperTypesClassTypeIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getSuperTypesClassTypeCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__Class__SuperTypesAssignment_2_2_1"


    // $ANTLR start "rule__Class__AttributesAssignment_4"
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2163:1: rule__Class__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2167:1: ( ( ruleAttribute ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2168:1: ( ruleAttribute )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2168:1: ( ruleAttribute )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2169:1: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Class__AttributesAssignment_44311);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2178:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2182:1: ( ( ( RULE_ID ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2183:1: ( ( RULE_ID ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2183:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2184:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2185:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2186:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_04346); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2197:1: rule__Attribute__ManyReferenceAssignment_1 : ( ruleAttributeManyReference ) ;
    public final void rule__Attribute__ManyReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2201:1: ( ( ruleAttributeManyReference ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2202:1: ( ruleAttributeManyReference )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2202:1: ( ruleAttributeManyReference )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2203:1: ruleAttributeManyReference
            {
             before(grammarAccess.getAttributeAccess().getManyReferenceAttributeManyReferenceEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeManyReference_in_rule__Attribute__ManyReferenceAssignment_14381);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2212:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2216:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2217:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2217:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2218:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_24412); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2227:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2231:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2232:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2232:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2233:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_14443); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2242:1: rule__Enumeration__LiteralsAssignment_3 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2246:1: ( ( ruleEnumerationLiteral ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2247:1: ( ruleEnumerationLiteral )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2247:1: ( ruleEnumerationLiteral )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2248:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__LiteralsAssignment_34474);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2257:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2261:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2262:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2262:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2263:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_04505); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2272:1: rule__EnumerationLiteral__OrdinalAssignment_2 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__OrdinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2276:1: ( ( RULE_INT ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2277:1: ( RULE_INT )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2277:1: ( RULE_INT )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2278:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getOrdinalINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__OrdinalAssignment_24536); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2287:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2291:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2292:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2292:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2293:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_14567); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2302:1: rule__Service__MethodsAssignment_3 : ( ruleMethod ) ;
    public final void rule__Service__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2306:1: ( ( ruleMethod ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2307:1: ( ruleMethod )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2307:1: ( ruleMethod )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2308:1: ruleMethod
            {
             before(grammarAccess.getServiceAccess().getMethodsMethodParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Service__MethodsAssignment_34598);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2317:1: rule__Method__ReturnTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Method__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2321:1: ( ( ( RULE_ID ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2322:1: ( ( RULE_ID ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2322:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2323:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeTypeCrossReference_0_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2324:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2325:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getReturnTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__ReturnTypeAssignment_04633); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2336:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2340:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2341:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2341:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2342:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_14668); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2351:1: rule__Method__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2355:1: ( ( ruleParameter ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2356:1: ( ruleParameter )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2356:1: ( ruleParameter )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2357:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_34699);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2366:1: rule__Method__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2370:1: ( ( ruleParameter ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2371:1: ( ruleParameter )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2371:1: ( ruleParameter )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2372:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_4_14730);
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2381:1: rule__Parameter__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2385:1: ( ( ( RULE_ID ) ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2386:1: ( ( RULE_ID ) )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2386:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2387:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); 
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2388:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2389:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__TypeAssignment_04765); 
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
    // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2400:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2404:1: ( ( RULE_ID ) )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2405:1: ( RULE_ID )
            {
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2405:1: ( RULE_ID )
            // ../com.minimalabs.fiber.lang.ui/src-gen/com/minimalabs/fiber/ui/contentassist/antlr/internal/InternalFiber.g:2406:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_14800); 
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
    public static final BitSet FOLLOW_ruleClassType_in_entryRuleClassType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Alternatives_in_ruleClassType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeId__Group__0_in_ruleTypeId334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeManyReference__Alternatives_in_ruleAttributeManyReference791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_rule__Type__Alternatives826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Type__Alternatives843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__ClassType__Alternatives875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__ClassType__Alternatives892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AttributeManyReference__Alternatives925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AttributeManyReference__Alternatives946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AttributeManyReference__Alternatives967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01000 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_0_in_rule__Model__Group__0__Impl1030 = new BitSet(new long[]{0x0000000000424002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ServicesAssignment_1_in_rule__Model__Group__1__Impl1088 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__01123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleType__Group__0__Impl1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__11185 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__11188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__21245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__0_in_rule__SimpleType__Group__2__Impl1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__0__Impl_in_rule__SimpleType__Group_2__01309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__1_in_rule__SimpleType__Group_2__01312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SimpleType__Group_2__0__Impl1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__1__Impl_in_rule__SimpleType__Group_2__11371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__MappedTypeAssignment_2_1_in_rule__SimpleType__Group_2__1__Impl1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeId__Group__0__Impl_in_rule__TypeId__Group__01432 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TypeId__Group__1_in_rule__TypeId__Group__01435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeId__NameAssignment_0_in_rule__TypeId__Group__0__Impl1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeId__Group__1__Impl_in_rule__TypeId__Group__11492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeId__Group_1__0_in_rule__TypeId__Group__1__Impl1519 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__TypeId__Group_1__0__Impl_in_rule__TypeId__Group_1__01554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeId__Group_1__1_in_rule__TypeId__Group_1__01557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeId__Group_1__0__Impl1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeId__Group_1__1__Impl_in_rule__TypeId__Group_1__11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeId__Group_1__1__Impl1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Class__Group__0__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11738 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21798 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__0_in_rule__Class__Group__2__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31859 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Class__Group__3__Impl1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41921 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__AttributesAssignment_4_in_rule__Class__Group__4__Impl1951 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Class__Group__5__Impl2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__0__Impl_in_rule__Class__Group_2__02053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_2__1_in_rule__Class__Group_2__02056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Class__Group_2__0__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__1__Impl_in_rule__Class__Group_2__12115 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Class__Group_2__2_in_rule__Class__Group_2__12118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__SuperTypesAssignment_2_1_in_rule__Class__Group_2__1__Impl2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__2__Impl_in_rule__Class__Group_2__22175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2_2__0_in_rule__Class__Group_2__2__Impl2202 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Class__Group_2_2__0__Impl_in_rule__Class__Group_2_2__02239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_2_2__1_in_rule__Class__Group_2_2__02242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class__Group_2_2__0__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2_2__1__Impl_in_rule__Class__Group_2_2__12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__SuperTypesAssignment_2_2_1_in_rule__Class__Group_2_2__1__Impl2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02362 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12422 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ManyReferenceAssignment_1_in_rule__Attribute__Group__1__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__02546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Enumeration__Group__0__Impl2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__12608 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__22668 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Enumeration__Group__2__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__32730 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl2760 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__42791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Enumeration__Group__4__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__02860 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__12920 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__12923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumerationLiteral__Group__1__Impl2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__22982 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__3_in_rule__EnumerationLiteral__Group__22985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__OrdinalAssignment_2_in_rule__EnumerationLiteral__Group__2__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__3__Impl_in_rule__EnumerationLiteral__Group__33042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EnumerationLiteral__Group__3__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__03109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__03112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Service__Group__0__Impl3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__13171 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__13174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__23231 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__23234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Service__Group__2__Impl3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__33293 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__33296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__MethodsAssignment_3_in_rule__Service__Group__3__Impl3323 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__43354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Service__Group__4__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturnTypeAssignment_0_in_rule__Method__Group__0__Impl3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13483 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__13486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__23543 = new BitSet(new long[]{0x0000000001200010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__23546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Method__Group__2__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__33605 = new BitSet(new long[]{0x0000000001200010L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__33608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_3_in_rule__Method__Group__3__Impl3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__43666 = new BitSet(new long[]{0x0000000001200010L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__43669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl3696 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__53727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Method__Group__5__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__03798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__03801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Method__Group_4__0__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__13860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_4_1_in_rule__Method__Group_4__1__Impl3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment_04047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Model__ServicesAssignment_14078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_14109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__SimpleType__MappedTypeAssignment_2_14140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeId__NameAssignment_04171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_14202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__SuperTypesAssignment_2_14237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__SuperTypesAssignment_2_2_14276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Class__AttributesAssignment_44311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_04346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeManyReference_in_rule__Attribute__ManyReferenceAssignment_14381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_24412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_14443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__LiteralsAssignment_34474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_04505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__OrdinalAssignment_24536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_14567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Service__MethodsAssignment_34598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__ReturnTypeAssignment_04633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_14668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_34699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_4_14730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__TypeAssignment_04765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_14800 = new BitSet(new long[]{0x0000000000000002L});

}