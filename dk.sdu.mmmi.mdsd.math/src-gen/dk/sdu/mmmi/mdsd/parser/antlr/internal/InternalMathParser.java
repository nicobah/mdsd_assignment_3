package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'('", "'int'", "','", "')'", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'let'", "'in'", "'end'", "'external'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDeclaration ) )* ( (lv_variables_3_0= ruleVarBinding ) )* ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_externals_2_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDeclaration ) )* ( (lv_variables_3_0= ruleVarBinding ) )* ) )
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDeclaration ) )* ( (lv_variables_3_0= ruleVarBinding ) )* )
            {
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDeclaration ) )* ( (lv_variables_3_0= ruleVarBinding ) )* )
            // InternalMath.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDeclaration ) )* ( (lv_variables_3_0= ruleVarBinding ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getProgramKeyword_0());
            		
            // InternalMath.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:101:3: ( (lv_externals_2_0= ruleExternalDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:102:4: (lv_externals_2_0= ruleExternalDeclaration )
            	    {
            	    // InternalMath.g:102:4: (lv_externals_2_0= ruleExternalDeclaration )
            	    // InternalMath.g:103:5: lv_externals_2_0= ruleExternalDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getMathExpAccess().getExternalsExternalDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_externals_2_0=ruleExternalDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"externals",
            	    						lv_externals_2_0,
            	    						"dk.sdu.mmmi.mdsd.Math.ExternalDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMath.g:120:3: ( (lv_variables_3_0= ruleVarBinding ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:121:4: (lv_variables_3_0= ruleVarBinding )
            	    {
            	    // InternalMath.g:121:4: (lv_variables_3_0= ruleVarBinding )
            	    // InternalMath.g:122:5: lv_variables_3_0= ruleVarBinding
            	    {

            	    					newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVarBindingParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_variables_3_0=ruleVarBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_3_0,
            	    						"dk.sdu.mmmi.mdsd.Math.VarBinding");
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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleParameter"
    // InternalMath.g:143:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMath.g:143:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMath.g:144:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMath.g:150:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_params_2_0= 'int' ) ) (otherlv_3= ',' ( (lv_params_4_0= 'int' ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_params_2_0=null;
        Token otherlv_3=null;
        Token lv_params_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMath.g:156:2: ( ( () otherlv_1= '(' ( ( (lv_params_2_0= 'int' ) ) (otherlv_3= ',' ( (lv_params_4_0= 'int' ) ) )* )? otherlv_5= ')' ) )
            // InternalMath.g:157:2: ( () otherlv_1= '(' ( ( (lv_params_2_0= 'int' ) ) (otherlv_3= ',' ( (lv_params_4_0= 'int' ) ) )* )? otherlv_5= ')' )
            {
            // InternalMath.g:157:2: ( () otherlv_1= '(' ( ( (lv_params_2_0= 'int' ) ) (otherlv_3= ',' ( (lv_params_4_0= 'int' ) ) )* )? otherlv_5= ')' )
            // InternalMath.g:158:3: () otherlv_1= '(' ( ( (lv_params_2_0= 'int' ) ) (otherlv_3= ',' ( (lv_params_4_0= 'int' ) ) )* )? otherlv_5= ')'
            {
            // InternalMath.g:158:3: ()
            // InternalMath.g:159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:169:3: ( ( (lv_params_2_0= 'int' ) ) (otherlv_3= ',' ( (lv_params_4_0= 'int' ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMath.g:170:4: ( (lv_params_2_0= 'int' ) ) (otherlv_3= ',' ( (lv_params_4_0= 'int' ) ) )*
                    {
                    // InternalMath.g:170:4: ( (lv_params_2_0= 'int' ) )
                    // InternalMath.g:171:5: (lv_params_2_0= 'int' )
                    {
                    // InternalMath.g:171:5: (lv_params_2_0= 'int' )
                    // InternalMath.g:172:6: lv_params_2_0= 'int'
                    {
                    lv_params_2_0=(Token)match(input,13,FOLLOW_7); 

                    						newLeafNode(lv_params_2_0, grammarAccess.getParameterAccess().getParamsIntKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    						addWithLastConsumed(current, "params", lv_params_2_0, "int");
                    					

                    }


                    }

                    // InternalMath.g:184:4: (otherlv_3= ',' ( (lv_params_4_0= 'int' ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMath.g:185:5: otherlv_3= ',' ( (lv_params_4_0= 'int' ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMath.g:189:5: ( (lv_params_4_0= 'int' ) )
                    	    // InternalMath.g:190:6: (lv_params_4_0= 'int' )
                    	    {
                    	    // InternalMath.g:190:6: (lv_params_4_0= 'int' )
                    	    // InternalMath.g:191:7: lv_params_4_0= 'int'
                    	    {
                    	    lv_params_4_0=(Token)match(input,13,FOLLOW_7); 

                    	    							newLeafNode(lv_params_4_0, grammarAccess.getParameterAccess().getParamsIntKeyword_2_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParameterRule());
                    	    							}
                    	    							addWithLastConsumed(current, "params", lv_params_4_0, "int");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleParameterUse"
    // InternalMath.g:213:1: entryRuleParameterUse returns [EObject current=null] : iv_ruleParameterUse= ruleParameterUse EOF ;
    public final EObject entryRuleParameterUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterUse = null;


        try {
            // InternalMath.g:213:53: (iv_ruleParameterUse= ruleParameterUse EOF )
            // InternalMath.g:214:2: iv_ruleParameterUse= ruleParameterUse EOF
            {
             newCompositeNode(grammarAccess.getParameterUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterUse=ruleParameterUse();

            state._fsp--;

             current =iv_ruleParameterUse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterUse"


    // $ANTLR start "ruleParameterUse"
    // InternalMath.g:220:1: ruleParameterUse returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) )? (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleParameterUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_2_0 = null;

        EObject lv_exp2_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:226:2: ( ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) )? (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )? otherlv_5= ')' ) )
            // InternalMath.g:227:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) )? (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )? otherlv_5= ')' )
            {
            // InternalMath.g:227:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) )? (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )? otherlv_5= ')' )
            // InternalMath.g:228:3: () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) )? (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )? otherlv_5= ')'
            {
            // InternalMath.g:228:3: ()
            // InternalMath.g:229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterUseAccess().getParameterUseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterUseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:239:3: ( (lv_exp_2_0= ruleExp ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)||LA5_0==12||LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMath.g:240:4: (lv_exp_2_0= ruleExp )
                    {
                    // InternalMath.g:240:4: (lv_exp_2_0= ruleExp )
                    // InternalMath.g:241:5: lv_exp_2_0= ruleExp
                    {

                    					newCompositeNode(grammarAccess.getParameterUseAccess().getExpExpParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_exp_2_0=ruleExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterUseRule());
                    					}
                    					set(
                    						current,
                    						"exp",
                    						lv_exp_2_0,
                    						"dk.sdu.mmmi.mdsd.Math.Exp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMath.g:258:3: (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMath.g:259:4: otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterUseAccess().getCommaKeyword_3_0());
                    			
                    // InternalMath.g:263:4: ( (lv_exp2_4_0= ruleExp ) )
                    // InternalMath.g:264:5: (lv_exp2_4_0= ruleExp )
                    {
                    // InternalMath.g:264:5: (lv_exp2_4_0= ruleExp )
                    // InternalMath.g:265:6: lv_exp2_4_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getParameterUseAccess().getExp2ExpParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_exp2_4_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterUseRule());
                    						}
                    						set(
                    							current,
                    							"exp2",
                    							lv_exp2_4_0,
                    							"dk.sdu.mmmi.mdsd.Math.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterUseAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleParameterUse"


    // $ANTLR start "entryRuleVarBinding"
    // InternalMath.g:291:1: entryRuleVarBinding returns [EObject current=null] : iv_ruleVarBinding= ruleVarBinding EOF ;
    public final EObject entryRuleVarBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBinding = null;


        try {
            // InternalMath.g:291:51: (iv_ruleVarBinding= ruleVarBinding EOF )
            // InternalMath.g:292:2: iv_ruleVarBinding= ruleVarBinding EOF
            {
             newCompositeNode(grammarAccess.getVarBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarBinding=ruleVarBinding();

            state._fsp--;

             current =iv_ruleVarBinding; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarBinding"


    // $ANTLR start "ruleVarBinding"
    // InternalMath.g:298:1: ruleVarBinding returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) ;
    public final EObject ruleVarBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:304:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) )
            // InternalMath.g:305:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            {
            // InternalMath.g:305:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            // InternalMath.g:306:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarBindingAccess().getVarKeyword_0());
            		
            // InternalMath.g:310:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:311:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:311:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:312:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getVarBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:332:3: ( (lv_expression_3_0= ruleExp ) )
            // InternalMath.g:333:4: (lv_expression_3_0= ruleExp )
            {
            // InternalMath.g:333:4: (lv_expression_3_0= ruleExp )
            // InternalMath.g:334:5: lv_expression_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarBindingAccess().getExpressionExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarBindingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleVarBinding"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:355:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:355:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:356:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:362:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:368:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMath.g:369:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMath.g:369:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMath.g:370:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:378:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=19)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMath.g:379:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:379:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==18) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==19) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMath.g:380:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMath.g:380:5: ( () otherlv_2= '+' )
            	            // InternalMath.g:381:6: () otherlv_2= '+'
            	            {
            	            // InternalMath.g:381:6: ()
            	            // InternalMath.g:382:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:394:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMath.g:394:5: ( () otherlv_4= '-' )
            	            // InternalMath.g:395:6: () otherlv_4= '-'
            	            {
            	            // InternalMath.g:395:6: ()
            	            // InternalMath.g:396:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,19,FOLLOW_10); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:408:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMath.g:409:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMath.g:409:5: (lv_right_5_0= ruleFactor )
            	    // InternalMath.g:410:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:432:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMath.g:432:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMath.g:433:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:439:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:445:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:446:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:446:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:447:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:455:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=20 && LA10_0<=21)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMath.g:456:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:456:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==20) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==21) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalMath.g:457:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMath.g:457:5: ( () otherlv_2= '*' )
            	            // InternalMath.g:458:6: () otherlv_2= '*'
            	            {
            	            // InternalMath.g:458:6: ()
            	            // InternalMath.g:459:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:471:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMath.g:471:5: ( () otherlv_4= '/' )
            	            // InternalMath.g:472:6: () otherlv_4= '/'
            	            {
            	            // InternalMath.g:472:6: ()
            	            // InternalMath.g:473:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,21,FOLLOW_10); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:485:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:486:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:486:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:487:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:509:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:509:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:510:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:516:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_value_4_0= ruleExp ) ) otherlv_5= ')' ) | this_VariableUse_6= ruleVariableUse | this_LetBinding_7= ruleLetBinding | this_ExternalBinding_8= ruleExternalBinding ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;

        EObject this_VariableUse_6 = null;

        EObject this_LetBinding_7 = null;

        EObject this_ExternalBinding_8 = null;



        	enterRule();

        try {
            // InternalMath.g:522:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_value_4_0= ruleExp ) ) otherlv_5= ')' ) | this_VariableUse_6= ruleVariableUse | this_LetBinding_7= ruleLetBinding | this_ExternalBinding_8= ruleExternalBinding ) )
            // InternalMath.g:523:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_value_4_0= ruleExp ) ) otherlv_5= ')' ) | this_VariableUse_6= ruleVariableUse | this_LetBinding_7= ruleLetBinding | this_ExternalBinding_8= ruleExternalBinding )
            {
            // InternalMath.g:523:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_value_4_0= ruleExp ) ) otherlv_5= ')' ) | this_VariableUse_6= ruleVariableUse | this_LetBinding_7= ruleLetBinding | this_ExternalBinding_8= ruleExternalBinding )
            int alt11=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case 12:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==12) ) {
                    alt11=5;
                }
                else if ( (LA11_3==EOF||(LA11_3>=14 && LA11_3<=16)||(LA11_3>=18 && LA11_3<=21)||(LA11_3>=23 && LA11_3<=24)) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMath.g:524:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:524:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:525:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:525:4: ()
                    // InternalMath.g:526:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMathNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:532:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:533:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:533:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:534:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:552:3: ( () otherlv_3= '(' ( (lv_value_4_0= ruleExp ) ) otherlv_5= ')' )
                    {
                    // InternalMath.g:552:3: ( () otherlv_3= '(' ( (lv_value_4_0= ruleExp ) ) otherlv_5= ')' )
                    // InternalMath.g:553:4: () otherlv_3= '(' ( (lv_value_4_0= ruleExp ) ) otherlv_5= ')'
                    {
                    // InternalMath.g:553:4: ()
                    // InternalMath.g:554:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getParenthesisAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMath.g:564:4: ( (lv_value_4_0= ruleExp ) )
                    // InternalMath.g:565:5: (lv_value_4_0= ruleExp )
                    {
                    // InternalMath.g:565:5: (lv_value_4_0= ruleExp )
                    // InternalMath.g:566:6: lv_value_4_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getValueExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_4_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"dk.sdu.mmmi.mdsd.Math.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:589:3: this_VariableUse_6= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_6=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:598:3: this_LetBinding_7= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_7=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMath.g:607:3: this_ExternalBinding_8= ruleExternalBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalBindingParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalBinding_8=ruleExternalBinding();

                    state._fsp--;


                    			current = this_ExternalBinding_8;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleLetBinding"
    // InternalMath.g:619:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalMath.g:619:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalMath.g:620:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalMath.g:626:1: ruleLetBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:632:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMath.g:633:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:633:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMath.g:634:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
            		
            // InternalMath.g:638:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:639:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:639:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:640:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:660:3: ( (lv_binding_3_0= ruleExp ) )
            // InternalMath.g:661:4: (lv_binding_3_0= ruleExp )
            {
            // InternalMath.g:661:4: (lv_binding_3_0= ruleExp )
            // InternalMath.g:662:5: lv_binding_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_binding_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
            		
            // InternalMath.g:683:3: ( (lv_body_5_0= ruleExp ) )
            // InternalMath.g:684:4: (lv_body_5_0= ruleExp )
            {
            // InternalMath.g:684:4: (lv_body_5_0= ruleExp )
            // InternalMath.g:685:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetBindingAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleExternalBinding"
    // InternalMath.g:710:1: entryRuleExternalBinding returns [EObject current=null] : iv_ruleExternalBinding= ruleExternalBinding EOF ;
    public final EObject entryRuleExternalBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalBinding = null;


        try {
            // InternalMath.g:710:56: (iv_ruleExternalBinding= ruleExternalBinding EOF )
            // InternalMath.g:711:2: iv_ruleExternalBinding= ruleExternalBinding EOF
            {
             newCompositeNode(grammarAccess.getExternalBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalBinding=ruleExternalBinding();

            state._fsp--;

             current =iv_ruleExternalBinding; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExternalBinding"


    // $ANTLR start "ruleExternalBinding"
    // InternalMath.g:717:1: ruleExternalBinding returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParameterUse ) ) ) ;
    public final EObject ruleExternalBinding() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_params_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:723:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParameterUse ) ) ) )
            // InternalMath.g:724:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParameterUse ) ) )
            {
            // InternalMath.g:724:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParameterUse ) ) )
            // InternalMath.g:725:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_params_1_0= ruleParameterUse ) )
            {
            // InternalMath.g:725:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMath.g:726:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMath.g:726:4: (lv_name_0_0= RULE_ID )
            // InternalMath.g:727:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getExternalBindingAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:743:3: ( (lv_params_1_0= ruleParameterUse ) )
            // InternalMath.g:744:4: (lv_params_1_0= ruleParameterUse )
            {
            // InternalMath.g:744:4: (lv_params_1_0= ruleParameterUse )
            // InternalMath.g:745:5: lv_params_1_0= ruleParameterUse
            {

            					newCompositeNode(grammarAccess.getExternalBindingAccess().getParamsParameterUseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_params_1_0=ruleParameterUse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalBindingRule());
            					}
            					set(
            						current,
            						"params",
            						lv_params_1_0,
            						"dk.sdu.mmmi.mdsd.Math.ParameterUse");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleExternalBinding"


    // $ANTLR start "entryRuleExternalDeclaration"
    // InternalMath.g:766:1: entryRuleExternalDeclaration returns [EObject current=null] : iv_ruleExternalDeclaration= ruleExternalDeclaration EOF ;
    public final EObject entryRuleExternalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDeclaration = null;


        try {
            // InternalMath.g:766:60: (iv_ruleExternalDeclaration= ruleExternalDeclaration EOF )
            // InternalMath.g:767:2: iv_ruleExternalDeclaration= ruleExternalDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExternalDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalDeclaration=ruleExternalDeclaration();

            state._fsp--;

             current =iv_ruleExternalDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExternalDeclaration"


    // $ANTLR start "ruleExternalDeclaration"
    // InternalMath.g:773:1: ruleExternalDeclaration returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_param_2_0= ruleParameter ) ) ) ;
    public final EObject ruleExternalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:779:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_param_2_0= ruleParameter ) ) ) )
            // InternalMath.g:780:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_param_2_0= ruleParameter ) ) )
            {
            // InternalMath.g:780:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_param_2_0= ruleParameter ) ) )
            // InternalMath.g:781:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_param_2_0= ruleParameter ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalDeclarationAccess().getExternalKeyword_0());
            		
            // InternalMath.g:785:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:786:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:786:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:787:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:803:3: ( (lv_param_2_0= ruleParameter ) )
            // InternalMath.g:804:4: (lv_param_2_0= ruleParameter )
            {
            // InternalMath.g:804:4: (lv_param_2_0= ruleParameter )
            // InternalMath.g:805:5: lv_param_2_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getExternalDeclarationAccess().getParamParameterParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_param_2_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalDeclarationRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_2_0,
            						"dk.sdu.mmmi.mdsd.Math.Parameter");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleExternalDeclaration"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:826:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:826:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:827:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:833:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:839:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:840:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:840:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:841:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:841:3: (otherlv_0= RULE_ID )
            // InternalMath.g:842:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0());
            			

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
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000040D030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000401030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});

}