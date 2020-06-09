// Generated from C:/Users/injoo/IdeaProjects/compiladores_proyecto/src\Datalog.g4 by ANTLR 4.8
package mx.itesm.compiladores;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NOT=9, 
		COUNT=10, AVG=11, SUM=12, MIN=13, MAX=14, IntegerLiteral=15, FloatingPointLiteral=16, 
		BOOLEANLITERAL=17, CharacterLiteral=18, StringLiteral=19, Predicate=20, 
		Identifier=21, WS=22, COMMENT=23, MULTILINE_COMMENT=24;
	public static final int
		RULE_program = 0, RULE_fact = 1, RULE_literalList = 2, RULE_facts = 3, 
		RULE_regla = 4, RULE_rules = 5, RULE_query = 6, RULE_atom = 7, RULE_atoms = 8, 
		RULE_variableOrLiteral = 9, RULE_variableOrLiterals = 10, RULE_aggregateVariable = 11, 
		RULE_aggregateOp = 12, RULE_variable = 13, RULE_predicate = 14, RULE_literal = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "fact", "literalList", "facts", "regla", "rules", "query", 
			"atom", "atoms", "variableOrLiteral", "variableOrLiterals", "aggregateVariable", 
			"aggregateOp", "variable", "predicate", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "','", "':-'", "'?-'", "'<'", "'>'", "'not'", 
			"'count'", "'avg'", "'sum'", "'min'", "'max'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NOT", "COUNT", 
			"AVG", "SUM", "MIN", "MAX", "IntegerLiteral", "FloatingPointLiteral", 
			"BOOLEANLITERAL", "CharacterLiteral", "StringLiteral", "Predicate", "Identifier", 
			"WS", "COMMENT", "MULTILINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Datalog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DatalogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public FactsContext facts() {
			return getRuleContext(FactsContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				facts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(33);
					facts();
					}
					break;
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT || _la==Predicate) {
					{
					setState(36);
					rules();
					}
				}

				setState(39);
				query();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactContext extends ParserRuleContext {
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	 
		public FactContext() { }
		public void copyFrom(FactContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PredicateFactContext extends FactContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public LiteralListContext literalList() {
			return getRuleContext(LiteralListContext.class,0);
		}
		public PredicateFactContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterPredicateFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitPredicateFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitPredicateFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fact);
		try {
			_localctx = new PredicateFactContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			predicate();
			setState(43);
			match(T__0);
			setState(44);
			literalList();
			setState(45);
			match(T__1);
			setState(46);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralListContext extends ParserRuleContext {
		public LiteralListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalList; }
	 
		public LiteralListContext() { }
		public void copyFrom(LiteralListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LietralLiteralListContext extends LiteralListContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public LietralLiteralListContext(LiteralListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterLietralLiteralList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitLietralLiteralList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitLietralLiteralList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralListContext literalList() throws RecognitionException {
		LiteralListContext _localctx = new LiteralListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literalList);
		int _la;
		try {
			_localctx = new LietralLiteralListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			literal();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(49);
				match(T__3);
				setState(50);
				literal();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactsContext extends ParserRuleContext {
		public FactsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facts; }
	 
		public FactsContext() { }
		public void copyFrom(FactsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactFactContext extends FactsContext {
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public FactFactContext(FactsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterFactFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitFactFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitFactFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactsContext facts() throws RecognitionException {
		FactsContext _localctx = new FactsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_facts);
		try {
			int _alt;
			_localctx = new FactFactContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(56);
					fact();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReglaContext extends ParserRuleContext {
		public ReglaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regla; }
	 
		public ReglaContext() { }
		public void copyFrom(ReglaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomReglaContext extends ReglaContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomsContext atoms() {
			return getRuleContext(AtomsContext.class,0);
		}
		public AtomReglaContext(ReglaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAtomRegla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAtomRegla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAtomRegla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReglaContext regla() throws RecognitionException {
		ReglaContext _localctx = new ReglaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_regla);
		try {
			_localctx = new AtomReglaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			atom();
			setState(62);
			match(T__4);
			setState(63);
			atoms();
			setState(64);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
	 
		public RulesContext() { }
		public void copyFrom(RulesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReglaRuleContext extends RulesContext {
		public List<ReglaContext> regla() {
			return getRuleContexts(ReglaContext.class);
		}
		public ReglaContext regla(int i) {
			return getRuleContext(ReglaContext.class,i);
		}
		public ReglaRuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterReglaRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitReglaRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitReglaRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rules);
		int _la;
		try {
			_localctx = new ReglaRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				regla();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOT || _la==Predicate );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	 
		public QueryContext() { }
		public void copyFrom(QueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomQueryContext extends QueryContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomQueryContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAtomQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAtomQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAtomQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_query);
		try {
			_localctx = new AtomQueryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__5);
			setState(72);
			atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PredicateAtomContext extends AtomContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public VariableOrLiteralsContext variableOrLiterals() {
			return getRuleContext(VariableOrLiteralsContext.class,0);
		}
		public PredicateAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterPredicateAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitPredicateAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitPredicateAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotAtomContext extends AtomContext {
		public TerminalNode NOT() { return getToken(DatalogParser.NOT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public NotAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterNotAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitNotAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitNotAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Predicate:
				_localctx = new PredicateAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				predicate();
				setState(75);
				match(T__0);
				setState(76);
				variableOrLiterals();
				setState(77);
				match(T__1);
				}
				break;
			case NOT:
				_localctx = new NotAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(NOT);
				setState(80);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomsContext extends ParserRuleContext {
		public AtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atoms; }
	 
		public AtomsContext() { }
		public void copyFrom(AtomsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomAtomsContext extends AtomsContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public AtomAtomsContext(AtomsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAtomAtoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAtomAtoms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAtomAtoms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomsContext atoms() throws RecognitionException {
		AtomsContext _localctx = new AtomsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atoms);
		int _la;
		try {
			_localctx = new AtomAtomsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			atom();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(84);
				match(T__3);
				setState(85);
				atom();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableOrLiteralContext extends ParserRuleContext {
		public VariableOrLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrLiteral; }
	 
		public VariableOrLiteralContext() { }
		public void copyFrom(VariableOrLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableVariableOrLiteralContext extends VariableOrLiteralContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableVariableOrLiteralContext(VariableOrLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVariableVariableOrLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVariableVariableOrLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitVariableVariableOrLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralVariableOrLiteralContext extends VariableOrLiteralContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralVariableOrLiteralContext(VariableOrLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterLiteralVariableOrLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitLiteralVariableOrLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitLiteralVariableOrLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AVVariableOrLiteralContext extends VariableOrLiteralContext {
		public AggregateVariableContext aggregateVariable() {
			return getRuleContext(AggregateVariableContext.class,0);
		}
		public AVVariableOrLiteralContext(VariableOrLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAVVariableOrLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAVVariableOrLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAVVariableOrLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrLiteralContext variableOrLiteral() throws RecognitionException {
		VariableOrLiteralContext _localctx = new VariableOrLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableOrLiteral);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new VariableVariableOrLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				variable();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BOOLEANLITERAL:
			case CharacterLiteral:
			case StringLiteral:
				_localctx = new LiteralVariableOrLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				literal();
				}
				break;
			case COUNT:
			case AVG:
			case SUM:
			case MIN:
			case MAX:
				_localctx = new AVVariableOrLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				aggregateVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableOrLiteralsContext extends ParserRuleContext {
		public VariableOrLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrLiterals; }
	 
		public VariableOrLiteralsContext() { }
		public void copyFrom(VariableOrLiteralsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VLVariableOrLiteralsContext extends VariableOrLiteralsContext {
		public List<VariableOrLiteralContext> variableOrLiteral() {
			return getRuleContexts(VariableOrLiteralContext.class);
		}
		public VariableOrLiteralContext variableOrLiteral(int i) {
			return getRuleContext(VariableOrLiteralContext.class,i);
		}
		public VLVariableOrLiteralsContext(VariableOrLiteralsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVLVariableOrLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVLVariableOrLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitVLVariableOrLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrLiteralsContext variableOrLiterals() throws RecognitionException {
		VariableOrLiteralsContext _localctx = new VariableOrLiteralsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableOrLiterals);
		int _la;
		try {
			_localctx = new VLVariableOrLiteralsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			variableOrLiteral();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(97);
				match(T__3);
				setState(98);
				variableOrLiteral();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateVariableContext extends ParserRuleContext {
		public AggregateVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateVariable; }
	 
		public AggregateVariableContext() { }
		public void copyFrom(AggregateVariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AOAggregateVariableContext extends AggregateVariableContext {
		public AggregateOpContext aggregateOp() {
			return getRuleContext(AggregateOpContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AOAggregateVariableContext(AggregateVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAOAggregateVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAOAggregateVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAOAggregateVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateVariableContext aggregateVariable() throws RecognitionException {
		AggregateVariableContext _localctx = new AggregateVariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aggregateVariable);
		try {
			_localctx = new AOAggregateVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			aggregateOp();
			setState(105);
			match(T__6);
			setState(106);
			variable();
			setState(107);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateOpContext extends ParserRuleContext {
		public AggregateOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateOp; }
	 
		public AggregateOpContext() { }
		public void copyFrom(AggregateOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinAggregateOpContext extends AggregateOpContext {
		public TerminalNode MIN() { return getToken(DatalogParser.MIN, 0); }
		public MinAggregateOpContext(AggregateOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterMinAggregateOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitMinAggregateOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitMinAggregateOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CountAggregateOpContext extends AggregateOpContext {
		public TerminalNode COUNT() { return getToken(DatalogParser.COUNT, 0); }
		public CountAggregateOpContext(AggregateOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterCountAggregateOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitCountAggregateOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitCountAggregateOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumAggregateOpContext extends AggregateOpContext {
		public TerminalNode SUM() { return getToken(DatalogParser.SUM, 0); }
		public SumAggregateOpContext(AggregateOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterSumAggregateOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitSumAggregateOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitSumAggregateOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AvgAggregateOpContext extends AggregateOpContext {
		public TerminalNode AVG() { return getToken(DatalogParser.AVG, 0); }
		public AvgAggregateOpContext(AggregateOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAvgAggregateOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAvgAggregateOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAvgAggregateOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaxAggregateOpContext extends AggregateOpContext {
		public TerminalNode MAX() { return getToken(DatalogParser.MAX, 0); }
		public MaxAggregateOpContext(AggregateOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterMaxAggregateOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitMaxAggregateOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitMaxAggregateOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateOpContext aggregateOp() throws RecognitionException {
		AggregateOpContext _localctx = new AggregateOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggregateOp);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				_localctx = new CountAggregateOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(COUNT);
				}
				break;
			case AVG:
				_localctx = new AvgAggregateOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(AVG);
				}
				break;
			case SUM:
				_localctx = new SumAggregateOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(SUM);
				}
				break;
			case MIN:
				_localctx = new MinAggregateOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(MIN);
				}
				break;
			case MAX:
				_localctx = new MaxAggregateOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(MAX);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierVariableContext extends VariableContext {
		public TerminalNode Identifier() { return getToken(DatalogParser.Identifier, 0); }
		public IdentifierVariableContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterIdentifierVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitIdentifierVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitIdentifierVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		try {
			_localctx = new IdentifierVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PredicatePredicateContext extends PredicateContext {
		public TerminalNode Predicate() { return getToken(DatalogParser.Predicate, 0); }
		public PredicatePredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterPredicatePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitPredicatePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitPredicatePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_predicate);
		try {
			_localctx = new PredicatePredicateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(Predicate);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolLiteralContext extends LiteralContext {
		public TerminalNode BOOLEANLITERAL() { return getToken(DatalogParser.BOOLEANLITERAL, 0); }
		public BoolLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharLiteralContext extends LiteralContext {
		public TerminalNode CharacterLiteral() { return getToken(DatalogParser.CharacterLiteral, 0); }
		public CharLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitCharLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode StringLiteral() { return getToken(DatalogParser.StringLiteral, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLLiteralContext extends LiteralContext {
		public TerminalNode FloatingPointLiteral() { return getToken(DatalogParser.FloatingPointLiteral, 0); }
		public FloatLLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterFloatLLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitFloatLLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitFloatLLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends LiteralContext {
		public TerminalNode IntegerLiteral() { return getToken(DatalogParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				_localctx = new FloatLLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(FloatingPointLiteral);
				}
				break;
			case BOOLEANLITERAL:
				_localctx = new BoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(BOOLEANLITERAL);
				}
				break;
			case CharacterLiteral:
				_localctx = new CharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\5\2%\n\2\3\2\5\2(\n\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\7\4\66\n\4\f\4\16\49\13\4\3\5\6\5<\n\5\r\5\16\5=\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\6\7F\n\7\r\7\16\7G\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"T\n\t\3\n\3\n\3\n\7\nY\n\n\f\n\16\n\\\13\n\3\13\3\13\3\13\5\13a\n\13\3"+
		"\f\3\f\3\f\7\ff\n\f\f\f\16\fi\13\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\5\16u\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0080\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2"+
		"\u0084\2*\3\2\2\2\4,\3\2\2\2\6\62\3\2\2\2\b;\3\2\2\2\n?\3\2\2\2\fE\3\2"+
		"\2\2\16I\3\2\2\2\20S\3\2\2\2\22U\3\2\2\2\24`\3\2\2\2\26b\3\2\2\2\30j\3"+
		"\2\2\2\32t\3\2\2\2\34v\3\2\2\2\36x\3\2\2\2 \177\3\2\2\2\"+\5\b\5\2#%\5"+
		"\b\5\2$#\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&(\5\f\7\2\'&\3\2\2\2\'(\3\2\2\2"+
		"()\3\2\2\2)+\5\16\b\2*\"\3\2\2\2*$\3\2\2\2+\3\3\2\2\2,-\5\36\20\2-.\7"+
		"\3\2\2./\5\6\4\2/\60\7\4\2\2\60\61\7\5\2\2\61\5\3\2\2\2\62\67\5 \21\2"+
		"\63\64\7\6\2\2\64\66\5 \21\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\67"+
		"8\3\2\2\28\7\3\2\2\29\67\3\2\2\2:<\5\4\3\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2"+
		"\2=>\3\2\2\2>\t\3\2\2\2?@\5\20\t\2@A\7\7\2\2AB\5\22\n\2BC\7\5\2\2C\13"+
		"\3\2\2\2DF\5\n\6\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\r\3\2\2\2"+
		"IJ\7\b\2\2JK\5\20\t\2K\17\3\2\2\2LM\5\36\20\2MN\7\3\2\2NO\5\26\f\2OP\7"+
		"\4\2\2PT\3\2\2\2QR\7\13\2\2RT\5\20\t\2SL\3\2\2\2SQ\3\2\2\2T\21\3\2\2\2"+
		"UZ\5\20\t\2VW\7\6\2\2WY\5\20\t\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2"+
		"\2\2[\23\3\2\2\2\\Z\3\2\2\2]a\5\34\17\2^a\5 \21\2_a\5\30\r\2`]\3\2\2\2"+
		"`^\3\2\2\2`_\3\2\2\2a\25\3\2\2\2bg\5\24\13\2cd\7\6\2\2df\5\24\13\2ec\3"+
		"\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\27\3\2\2\2ig\3\2\2\2jk\5\32\16\2"+
		"kl\7\t\2\2lm\5\34\17\2mn\7\n\2\2n\31\3\2\2\2ou\7\f\2\2pu\7\r\2\2qu\7\16"+
		"\2\2ru\7\17\2\2su\7\20\2\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3"+
		"\2\2\2u\33\3\2\2\2vw\7\27\2\2w\35\3\2\2\2xy\7\26\2\2y\37\3\2\2\2z\u0080"+
		"\7\21\2\2{\u0080\7\22\2\2|\u0080\7\23\2\2}\u0080\7\24\2\2~\u0080\7\25"+
		"\2\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2"+
		"\u0080!\3\2\2\2\16$\'*\67=GSZ`gt\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}