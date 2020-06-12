// Generated from /home/mehran/Projects/compiler_lab/src/antlr/DOTParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DOTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CUR_L=1, CUR_R=2, SEM=3, EQ=4, BR_L=5, BR_R=6, COMMA=7, COLON=8, GRAPH=9, 
		STRICT=10, DIGRAPH=11, NODE=12, EDGE=13, SUBGRAPH=14, EDGEOP=15, COMMENT=16, 
		LINE_COMMENT=17, STRING=18, ID=19, NUMBER=20, PREPROC=21, WS=22;
	public static final int
		RULE_graph = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_subgraph = 3, 
		RULE_attr_stmt = 4, RULE_attr_list = 5, RULE_a_list = 6, RULE_edge_stmt = 7, 
		RULE_edgeRHS = 8, RULE_node_stmt = 9, RULE_node_name = 10, RULE_port = 11, 
		RULE_name = 12;
	public static final String[] ruleNames = {
		"graph", "stmt_list", "stmt", "subgraph", "attr_stmt", "attr_list", "a_list", 
		"edge_stmt", "edgeRHS", "node_stmt", "node_name", "port", "name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'='", "'['", "']'", "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CUR_L", "CUR_R", "SEM", "EQ", "BR_L", "BR_R", "COMMA", "COLON", 
		"GRAPH", "STRICT", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", "EDGEOP", "COMMENT", 
		"LINE_COMMENT", "STRING", "ID", "NUMBER", "PREPROC", "WS"
	};
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
	public String getGrammarFileName() { return "DOTParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DOTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GraphContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode GRAPH() { return getToken(DOTParser.GRAPH, 0); }
		public TerminalNode DIGRAPH() { return getToken(DOTParser.DIGRAPH, 0); }
		public TerminalNode STRICT() { return getToken(DOTParser.STRICT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(26);
				match(STRICT);
				}
			}

			setState(29);
			_la = _input.LA(1);
			if ( !(_la==GRAPH || _la==DIGRAPH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(30);
				name();
				}
			}

			setState(33);
			match(CUR_L);
			setState(34);
			stmt_list();
			setState(35);
			match(CUR_R);
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

	public static class Stmt_listContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CUR_L) | (1L << GRAPH) | (1L << NODE) | (1L << EDGE) | (1L << SUBGRAPH) | (1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(37);
				stmt();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(38);
					match(SEM);
					}
				}

				setState(41);
				stmt_list();
				}
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

	public static class StmtContext extends ParserRuleContext {
		public Node_stmtContext node_stmt() {
			return getRuleContext(Node_stmtContext.class,0);
		}
		public Edge_stmtContext edge_stmt() {
			return getRuleContext(Edge_stmtContext.class,0);
		}
		public Attr_stmtContext attr_stmt() {
			return getRuleContext(Attr_stmtContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(45);
				node_stmt();
				}
				break;
			case 2:
				{
				setState(46);
				edge_stmt();
				}
				break;
			case 3:
				{
				setState(47);
				attr_stmt();
				}
				break;
			case 4:
				{
				setState(48);
				name();
				setState(49);
				match(EQ);
				setState(50);
				name();
				}
				break;
			case 5:
				{
				setState(52);
				subgraph();
				}
				break;
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

	public static class SubgraphContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode SUBGRAPH() { return getToken(DOTParser.SUBGRAPH, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SubgraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subgraph; }
	}

	public final SubgraphContext subgraph() throws RecognitionException {
		SubgraphContext _localctx = new SubgraphContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subgraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBGRAPH) {
				{
				setState(55);
				match(SUBGRAPH);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					setState(56);
					name();
					}
				}

				}
			}

			setState(61);
			match(CUR_L);
			setState(62);
			stmt_list();
			setState(63);
			match(CUR_R);
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

	public static class Attr_stmtContext extends ParserRuleContext {
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public TerminalNode GRAPH() { return getToken(DOTParser.GRAPH, 0); }
		public TerminalNode NODE() { return getToken(DOTParser.NODE, 0); }
		public TerminalNode EDGE() { return getToken(DOTParser.EDGE, 0); }
		public Attr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_stmt; }
	}

	public final Attr_stmtContext attr_stmt() throws RecognitionException {
		Attr_stmtContext _localctx = new Attr_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << NODE) | (1L << EDGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(66);
			attr_list();
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

	public static class Attr_listContext extends ParserRuleContext {
		public A_listContext a_list() {
			return getRuleContext(A_listContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Attr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_list; }
	}

	public final Attr_listContext attr_list() throws RecognitionException {
		Attr_listContext _localctx = new Attr_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(BR_L);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(69);
				a_list();
				}
			}

			setState(72);
			match(BR_R);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BR_L) {
				{
				setState(73);
				attr_list();
				}
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

	public static class A_listContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public A_listContext a_list() {
			return getRuleContext(A_listContext.class,0);
		}
		public A_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_list; }
	}

	public final A_listContext a_list() throws RecognitionException {
		A_listContext _localctx = new A_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_a_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			name();
			setState(77);
			match(EQ);
			setState(78);
			name();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEM || _la==COMMA) {
				{
				setState(79);
				_la = _input.LA(1);
				if ( !(_la==SEM || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(82);
				a_list();
				}
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

	public static class Edge_stmtContext extends ParserRuleContext {
		public EdgeRHSContext edgeRHS() {
			return getRuleContext(EdgeRHSContext.class,0);
		}
		public Node_nameContext node_name() {
			return getRuleContext(Node_nameContext.class,0);
		}
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Edge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_stmt; }
	}

	public final Edge_stmtContext edge_stmt() throws RecognitionException {
		Edge_stmtContext _localctx = new Edge_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_edge_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case ID:
			case NUMBER:
				{
				setState(85);
				node_name();
				}
				break;
			case CUR_L:
			case SUBGRAPH:
				{
				setState(86);
				subgraph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(89);
			edgeRHS();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BR_L) {
				{
				setState(90);
				attr_list();
				}
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

	public static class EdgeRHSContext extends ParserRuleContext {
		public TerminalNode EDGEOP() { return getToken(DOTParser.EDGEOP, 0); }
		public Node_nameContext node_name() {
			return getRuleContext(Node_nameContext.class,0);
		}
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public EdgeRHSContext edgeRHS() {
			return getRuleContext(EdgeRHSContext.class,0);
		}
		public EdgeRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeRHS; }
	}

	public final EdgeRHSContext edgeRHS() throws RecognitionException {
		EdgeRHSContext _localctx = new EdgeRHSContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_edgeRHS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(EDGEOP);
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case ID:
			case NUMBER:
				{
				setState(94);
				node_name();
				}
				break;
			case CUR_L:
			case SUBGRAPH:
				{
				setState(95);
				subgraph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EDGEOP) {
				{
				setState(98);
				edgeRHS();
				}
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

	public static class Node_stmtContext extends ParserRuleContext {
		public Node_nameContext node_name() {
			return getRuleContext(Node_nameContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Node_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_stmt; }
	}

	public final Node_stmtContext node_stmt() throws RecognitionException {
		Node_stmtContext _localctx = new Node_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_node_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			node_name();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BR_L) {
				{
				setState(102);
				attr_list();
				}
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

	public static class Node_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public Node_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_name; }
	}

	public final Node_nameContext node_name() throws RecognitionException {
		Node_nameContext _localctx = new Node_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_node_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			name();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(106);
				port();
				}
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

	public static class PortContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(COLON);
			setState(110);
			name();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(111);
				match(COLON);
				setState(112);
				name();
				}
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DOTParser.ID, 0); }
		public TerminalNode STRING() { return getToken(DOTParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(DOTParser.NUMBER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30x\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\5\2\36\n\2\3\2\3\2\5\2\"\n\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\5\3*\n\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\48\n\4\3\5\3\5\5\5<\n\5\5\5>\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\5\7I\n\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\b\5\bS\n\b\3\b\5\bV\n\b\3\t"+
		"\3\t\5\tZ\n\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\5\nc\n\n\3\n\5\nf\n\n\3\13"+
		"\3\13\5\13j\n\13\3\f\3\f\5\fn\n\f\3\r\3\r\3\r\3\r\5\rt\n\r\3\16\3\16\3"+
		"\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\6\4\2\13\13\r\r\4\2\13\13"+
		"\16\17\4\2\5\5\t\t\3\2\24\26\2\177\2\35\3\2\2\2\4-\3\2\2\2\6\67\3\2\2"+
		"\2\b=\3\2\2\2\nC\3\2\2\2\fF\3\2\2\2\16N\3\2\2\2\20Y\3\2\2\2\22_\3\2\2"+
		"\2\24g\3\2\2\2\26k\3\2\2\2\30o\3\2\2\2\32u\3\2\2\2\34\36\7\f\2\2\35\34"+
		"\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37!\t\2\2\2 \"\5\32\16\2! \3\2\2"+
		"\2!\"\3\2\2\2\"#\3\2\2\2#$\7\3\2\2$%\5\4\3\2%&\7\4\2\2&\3\3\2\2\2\')\5"+
		"\6\4\2(*\7\5\2\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\5\4\3\2,.\3\2\2\2-\'"+
		"\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/8\5\24\13\2\608\5\20\t\2\618\5\n\6\2\62"+
		"\63\5\32\16\2\63\64\7\6\2\2\64\65\5\32\16\2\658\3\2\2\2\668\5\b\5\2\67"+
		"/\3\2\2\2\67\60\3\2\2\2\67\61\3\2\2\2\67\62\3\2\2\2\67\66\3\2\2\28\7\3"+
		"\2\2\29;\7\20\2\2:<\5\32\16\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=9\3\2\2\2"+
		"=>\3\2\2\2>?\3\2\2\2?@\7\3\2\2@A\5\4\3\2AB\7\4\2\2B\t\3\2\2\2CD\t\3\2"+
		"\2DE\5\f\7\2E\13\3\2\2\2FH\7\7\2\2GI\5\16\b\2HG\3\2\2\2HI\3\2\2\2IJ\3"+
		"\2\2\2JL\7\b\2\2KM\5\f\7\2LK\3\2\2\2LM\3\2\2\2M\r\3\2\2\2NO\5\32\16\2"+
		"OP\7\6\2\2PR\5\32\16\2QS\t\4\2\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\5\16"+
		"\b\2UT\3\2\2\2UV\3\2\2\2V\17\3\2\2\2WZ\5\26\f\2XZ\5\b\5\2YW\3\2\2\2YX"+
		"\3\2\2\2Z[\3\2\2\2[]\5\22\n\2\\^\5\f\7\2]\\\3\2\2\2]^\3\2\2\2^\21\3\2"+
		"\2\2_b\7\21\2\2`c\5\26\f\2ac\5\b\5\2b`\3\2\2\2ba\3\2\2\2ce\3\2\2\2df\5"+
		"\22\n\2ed\3\2\2\2ef\3\2\2\2f\23\3\2\2\2gi\5\26\f\2hj\5\f\7\2ih\3\2\2\2"+
		"ij\3\2\2\2j\25\3\2\2\2km\5\32\16\2ln\5\30\r\2ml\3\2\2\2mn\3\2\2\2n\27"+
		"\3\2\2\2op\7\n\2\2ps\5\32\16\2qr\7\n\2\2rt\5\32\16\2sq\3\2\2\2st\3\2\2"+
		"\2t\31\3\2\2\2uv\t\5\2\2v\33\3\2\2\2\24\35!)-\67;=HLRUY]beims";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}