package com.minimalabs.fiber.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.minimalabs.fiber.services.FiberGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFiberParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "'is'", "'.'", "'class'", "'extends'", "'{'", "'}'", "'enum'", "'('", "')'", "'service'", "','", "'NONE'", "'*'", "'#'"
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
    public String getGrammarFileName() { return "../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g"; }



     	private FiberGrammarAccess grammarAccess;
     	
        public InternalFiberParser(TokenStream input, FiberGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected FiberGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_types_0_0= ruleType ) )* ( (lv_services_1_0= ruleService ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;

        EObject lv_services_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:80:28: ( ( ( (lv_types_0_0= ruleType ) )* ( (lv_services_1_0= ruleService ) )* ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:81:1: ( ( (lv_types_0_0= ruleType ) )* ( (lv_services_1_0= ruleService ) )* )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:81:1: ( ( (lv_types_0_0= ruleType ) )* ( (lv_services_1_0= ruleService ) )* )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:81:2: ( (lv_types_0_0= ruleType ) )* ( (lv_services_1_0= ruleService ) )*
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:81:2: ( (lv_types_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:82:1: (lv_types_0_0= ruleType )
            	    {
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:82:1: (lv_types_0_0= ruleType )
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:83:3: lv_types_0_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleModel131);
            	    lv_types_0_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_0_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:99:3: ( (lv_services_1_0= ruleService ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:100:1: (lv_services_1_0= ruleService )
            	    {
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:100:1: (lv_services_1_0= ruleService )
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:101:3: lv_services_1_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleModel153);
            	    lv_services_1_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"services",
            	            		lv_services_1_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:125:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:126:2: (iv_ruleType= ruleType EOF )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:127:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType190);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:134:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Class_1= ruleClass | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Class_1 = null;

        EObject this_Enumeration_2 = null;


         enterRule(); 
            
        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:137:28: ( (this_SimpleType_0= ruleSimpleType | this_Class_1= ruleClass | this_Enumeration_2= ruleEnumeration ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:138:1: (this_SimpleType_0= ruleSimpleType | this_Class_1= ruleClass | this_Enumeration_2= ruleEnumeration )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:138:1: (this_SimpleType_0= ruleSimpleType | this_Class_1= ruleClass | this_Enumeration_2= ruleEnumeration )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 18:
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
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:139:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType247);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;

                     
                            current = this_SimpleType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:149:5: this_Class_1= ruleClass
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getClassParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClass_in_ruleType274);
                    this_Class_1=ruleClass();

                    state._fsp--;

                     
                            current = this_Class_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:159:5: this_Enumeration_2= ruleEnumeration
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleType301);
                    this_Enumeration_2=ruleEnumeration();

                    state._fsp--;

                     
                            current = this_Enumeration_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleType"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:175:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:176:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:177:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType336);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType346); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:184:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_mappedType_3_0= ruleTypeId ) ) )? ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_mappedType_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:187:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_mappedType_3_0= ruleTypeId ) ) )? ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:188:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_mappedType_3_0= ruleTypeId ) ) )? )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:188:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_mappedType_3_0= ruleTypeId ) ) )? )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:188:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_mappedType_3_0= ruleTypeId ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSimpleType383); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getTypeKeyword_0());
                
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:192:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:193:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:193:1: (lv_name_1_0= RULE_ID )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:194:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType400); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:210:2: (otherlv_2= 'is' ( (lv_mappedType_3_0= ruleTypeId ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:210:4: otherlv_2= 'is' ( (lv_mappedType_3_0= ruleTypeId ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSimpleType418); 

                        	newLeafNode(otherlv_2, grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0());
                        
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:214:1: ( (lv_mappedType_3_0= ruleTypeId ) )
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:215:1: (lv_mappedType_3_0= ruleTypeId )
                    {
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:215:1: (lv_mappedType_3_0= ruleTypeId )
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:216:3: lv_mappedType_3_0= ruleTypeId
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleTypeAccess().getMappedTypeTypeIdParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeId_in_ruleSimpleType439);
                    lv_mappedType_3_0=ruleTypeId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"mappedType",
                            		lv_mappedType_3_0, 
                            		"TypeId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleTypeId"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:240:1: entryRuleTypeId returns [EObject current=null] : iv_ruleTypeId= ruleTypeId EOF ;
    public final EObject entryRuleTypeId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeId = null;


        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:241:2: (iv_ruleTypeId= ruleTypeId EOF )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:242:2: iv_ruleTypeId= ruleTypeId EOF
            {
             newCompositeNode(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId477);
            iv_ruleTypeId=ruleTypeId();

            state._fsp--;

             current =iv_ruleTypeId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId487); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeId"


    // $ANTLR start "ruleTypeId"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:249:1: ruleTypeId returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )* ) ;
    public final EObject ruleTypeId() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:252:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )* ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:253:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:253:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )* )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:253:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )*
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:253:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:254:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:254:1: (lv_name_0_0= RULE_ID )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:255:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeId529); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTypeIdAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeIdRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:271:2: (otherlv_1= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:271:4: otherlv_1= '.' this_ID_2= RULE_ID
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleTypeId547); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTypeIdAccess().getFullStopKeyword_1_0());
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeId558); 
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getTypeIdAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeId"


    // $ANTLR start "entryRuleClass"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:287:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:288:2: (iv_ruleClass= ruleClass EOF )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:289:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass595);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass605); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:296:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:299:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:300:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:300:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:300:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleClass642); 

                	newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
                
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:304:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:305:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:305:1: (lv_name_1_0= RULE_ID )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:306:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass659); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:322:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:322:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleClass677); 

                        	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getExtendsKeyword_2_0());
                        
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:326:1: ( (otherlv_3= RULE_ID ) )
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:327:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:327:1: (otherlv_3= RULE_ID )
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:328:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass697); 

                    		newLeafNode(otherlv_3, grammarAccess.getClassAccess().getSuperEntityClassCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleClass711); 

                	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:343:1: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:344:1: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:344:1: (lv_attributes_5_0= ruleAttribute )
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:345:3: lv_attributes_5_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleClass732);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleClass745); 

                	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:373:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:374:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:375:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute781);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute791); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:382:1: ruleAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_manyReference_1_0= ruleAttributeManyReference ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Enumerator lv_manyReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:385:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_manyReference_1_0= ruleAttributeManyReference ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:386:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_manyReference_1_0= ruleAttributeManyReference ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:386:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_manyReference_1_0= ruleAttributeManyReference ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:386:2: ( (otherlv_0= RULE_ID ) ) ( (lv_manyReference_1_0= ruleAttributeManyReference ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:386:2: ( (otherlv_0= RULE_ID ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:387:1: (otherlv_0= RULE_ID )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:387:1: (otherlv_0= RULE_ID )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:388:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute836); 

            		newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            	

            }


            }

            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:399:2: ( (lv_manyReference_1_0= ruleAttributeManyReference ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=23 && LA8_0<=25)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:400:1: (lv_manyReference_1_0= ruleAttributeManyReference )
                    {
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:400:1: (lv_manyReference_1_0= ruleAttributeManyReference )
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:401:3: lv_manyReference_1_0= ruleAttributeManyReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getManyReferenceAttributeManyReferenceEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeManyReference_in_ruleAttribute857);
                    lv_manyReference_1_0=ruleAttributeManyReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"manyReference",
                            		lv_manyReference_1_0, 
                            		"AttributeManyReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:417:3: ( (lv_name_2_0= RULE_ID ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:418:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:418:1: (lv_name_2_0= RULE_ID )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:419:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute875); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEnumeration"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:443:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:444:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:445:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration916);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration926); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:452:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:455:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}' ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:456:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}' )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:456:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}' )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:456:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleEnumeration963); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
                
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:460:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:461:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:461:1: (lv_name_1_0= RULE_ID )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:462:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration980); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleEnumeration997); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:482:1: ( (lv_literals_3_0= ruleEnumerationLiteral ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:483:1: (lv_literals_3_0= ruleEnumerationLiteral )
            	    {
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:483:1: (lv_literals_3_0= ruleEnumerationLiteral )
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:484:3: lv_literals_3_0= ruleEnumerationLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1018);
            	    lv_literals_3_0=ruleEnumerationLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"literals",
            	            		lv_literals_3_0, 
            	            		"EnumerationLiteral");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEnumeration1031); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:512:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:513:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:514:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1067);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral1077); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:521:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_ordinal_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_ordinal_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:524:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_ordinal_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:525:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_ordinal_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:525:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_ordinal_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:525:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_ordinal_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:525:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:526:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:526:1: (lv_name_0_0= RULE_ID )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:527:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral1119); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleEnumerationLiteral1136); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1());
                
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:547:1: ( (lv_ordinal_2_0= RULE_INT ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:548:1: (lv_ordinal_2_0= RULE_INT )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:548:1: (lv_ordinal_2_0= RULE_INT )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:549:3: lv_ordinal_2_0= RULE_INT
            {
            lv_ordinal_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationLiteral1153); 

            			newLeafNode(lv_ordinal_2_0, grammarAccess.getEnumerationLiteralAccess().getOrdinalINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ordinal",
                    		lv_ordinal_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEnumerationLiteral1170); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleService"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:577:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:578:2: (iv_ruleService= ruleService EOF )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:579:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService1206);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService1216); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:586:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_methods_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:589:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}' ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:590:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}' )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:590:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}' )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:590:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleService1253); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:594:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:595:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:595:1: (lv_name_1_0= RULE_ID )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:596:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService1270); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleService1287); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:616:1: ( (lv_methods_3_0= ruleMethod ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:617:1: (lv_methods_3_0= ruleMethod )
            	    {
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:617:1: (lv_methods_3_0= ruleMethod )
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:618:3: lv_methods_3_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getMethodsMethodParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleService1308);
            	    lv_methods_3_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_3_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleService1321); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleMethod"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:646:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:647:2: (iv_ruleMethod= ruleMethod EOF )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:648:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1357);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1367); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:655:1: ruleMethod returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:658:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:659:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:659:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:659:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:659:2: ( (otherlv_0= RULE_ID ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:660:1: (otherlv_0= RULE_ID )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:660:1: (otherlv_0= RULE_ID )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:661:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1412); 

            		newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getReturnTypeTypeCrossReference_0_0()); 
            	

            }


            }

            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:672:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:673:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:673:1: (lv_name_1_0= RULE_ID )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:674:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1429); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleMethod1446); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
                
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:694:1: ( (lv_parameters_3_0= ruleParameter ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:695:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:695:1: (lv_parameters_3_0= ruleParameter )
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:696:3: lv_parameters_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod1467);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:712:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:712:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleMethod1481); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_4_0());
            	        
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:716:1: ( (lv_parameters_5_0= ruleParameter ) )
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:717:1: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:717:1: (lv_parameters_5_0= ruleParameter )
            	    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:718:3: lv_parameters_5_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod1502);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_5_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleMethod1516); 

                	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:746:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:747:2: (iv_ruleParameter= ruleParameter EOF )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:748:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1552);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1562); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:755:1: ruleParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:758:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:759:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:759:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:759:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:759:2: ( (otherlv_0= RULE_ID ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:760:1: (otherlv_0= RULE_ID )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:760:1: (otherlv_0= RULE_ID )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:761:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1607); 

            		newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); 
            	

            }


            }

            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:772:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:773:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:773:1: (lv_name_1_0= RULE_ID )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:774:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1624); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "ruleAttributeManyReference"
    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:798:1: ruleAttributeManyReference returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= '*' ) | (enumLiteral_2= '#' ) ) ;
    public final Enumerator ruleAttributeManyReference() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:800:28: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= '*' ) | (enumLiteral_2= '#' ) ) )
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:801:1: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= '*' ) | (enumLiteral_2= '#' ) )
            {
            // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:801:1: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= '*' ) | (enumLiteral_2= '#' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt13=1;
                }
                break;
            case 24:
                {
                alt13=2;
                }
                break;
            case 25:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:801:2: (enumLiteral_0= 'NONE' )
                    {
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:801:2: (enumLiteral_0= 'NONE' )
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:801:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleAttributeManyReference1679); 

                            current = grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:807:6: (enumLiteral_1= '*' )
                    {
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:807:6: (enumLiteral_1= '*' )
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:807:8: enumLiteral_1= '*'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleAttributeManyReference1696); 

                            current = grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:813:6: (enumLiteral_2= '#' )
                    {
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:813:6: (enumLiteral_2= '#' )
                    // ../com.minimalabs.fiber.lang/src-gen/com/minimalabs/fiber/parser/antlr/internal/InternalFiber.g:813:8: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleAttributeManyReference1713); 

                            current = grammarAccess.getAttributeManyReferenceAccess().getSTRONGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAttributeManyReferenceAccess().getSTRONGEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeManyReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel131 = new BitSet(new long[]{0x0000000000244802L});
    public static final BitSet FOLLOW_ruleService_in_ruleModel153 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleType301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSimpleType383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType400 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleSimpleType418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleSimpleType439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeId529 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleTypeId547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeId558 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleClass642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass659 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleClass677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass697 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClass711 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleClass732 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleClass745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute836 = new BitSet(new long[]{0x0000000003800010L});
    public static final BitSet FOLLOW_ruleAttributeManyReference_in_ruleAttribute857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEnumeration963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration980 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumeration997 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1018 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleEnumeration1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral1119 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnumerationLiteral1136 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationLiteral1153 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnumerationLiteral1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleService1253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService1270 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleService1287 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleService1308 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleService1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1429 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMethod1446 = new BitSet(new long[]{0x0000000000500010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod1467 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_22_in_ruleMethod1481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod1502 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_20_in_ruleMethod1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAttributeManyReference1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAttributeManyReference1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAttributeManyReference1713 = new BitSet(new long[]{0x0000000000000002L});

}