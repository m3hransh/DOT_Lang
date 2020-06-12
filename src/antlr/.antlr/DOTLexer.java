// Generated from /home/mehran/Projects/compiler_lab/src/antlr/DOTLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DOTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CUR_L=1, CUR_R=2, SEM=3, EQ=4, BR_L=5, BR_R=6, COMMA=7, COLON=8, GRAPH=9, 
		STRICT=10, DIGRAPH=11, NODE=12, EDGE=13, SUBGRAPH=14, EDGEOP=15, COMMENT=16, 
		LINE_COMMENT=17, STRING=18, ID=19, NUMBER=20, PREPROC=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "S", "Y", "H", "O", "U", "T", "R", "C", "I", "G", "P", "D", 
		"N", "E", "DIGIT", "CUR_L", "CUR_R", "SEM", "EQ", "BR_L", "BR_R", "COMMA", 
		"COLON", "GRAPH", "STRICT", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", "EDGEOP", 
		"COMMENT", "LINE_COMMENT", "STRING", "ID", "NUMBER", "PREPROC", "WS"
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


	public DOTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DOTLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u010a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\5!\u00b0\n!"+
		"\3\"\3\"\3\"\3\"\7\"\u00b6\n\"\f\"\16\"\u00b9\13\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\7#\u00c4\n#\f#\16#\u00c7\13#\3#\5#\u00ca\n#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\7$\u00d4\n$\f$\16$\u00d7\13$\3$\3$\3%\3%\7%\u00dd\n%\f%\16"+
		"%\u00e0\13%\3&\5&\u00e3\n&\3&\3&\6&\u00e7\n&\r&\16&\u00e8\3&\6&\u00ec"+
		"\n&\r&\16&\u00ed\3&\3&\7&\u00f2\n&\f&\16&\u00f5\13&\5&\u00f7\n&\5&\u00f9"+
		"\n&\3\'\3\'\7\'\u00fd\n\'\f\'\16\'\u0100\13\'\3\'\3\'\3(\6(\u0105\n(\r"+
		"(\16(\u0106\3(\3(\5\u00b7\u00c5\u00d5\2)\3\2\5\2\7\2\t\2\13\2\r\2\17\2"+
		"\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\3\'\4)\5+\6-\7/\b\61\t"+
		"\63\n\65\13\67\f9\r;\16=\17?\20A\21C\22E\23G\24I\25K\26M\27O\30\3\2\27"+
		"\4\2CCcc\4\2DDdd\4\2UUuu\4\2[[{{\4\2JJjj\4\2QQqq\4\2WWww\4\2VVvv\4\2T"+
		"Ttt\4\2EEee\4\2KKkk\4\2IIii\4\2RRrr\4\2FFff\4\2PPpp\4\2GGgg\3\2\62;\6"+
		"\2C\\aac|\u0082\u0101\7\2\62;C\\aac|\u0082\u0101\4\2\f\f\17\17\5\2\13"+
		"\f\17\17\"\"\2\u0107\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2"+
		"\2\2\5S\3\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2"+
		"\2\21_\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33i\3\2"+
		"\2\2\35k\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#q\3\2\2\2%s\3\2\2\2\'u\3\2\2\2"+
		")w\3\2\2\2+y\3\2\2\2-{\3\2\2\2/}\3\2\2\2\61\177\3\2\2\2\63\u0081\3\2\2"+
		"\2\65\u0083\3\2\2\2\67\u0089\3\2\2\29\u0090\3\2\2\2;\u0098\3\2\2\2=\u009d"+
		"\3\2\2\2?\u00a2\3\2\2\2A\u00af\3\2\2\2C\u00b1\3\2\2\2E\u00bf\3\2\2\2G"+
		"\u00cf\3\2\2\2I\u00da\3\2\2\2K\u00e2\3\2\2\2M\u00fa\3\2\2\2O\u0104\3\2"+
		"\2\2QR\t\2\2\2R\4\3\2\2\2ST\t\3\2\2T\6\3\2\2\2UV\t\4\2\2V\b\3\2\2\2WX"+
		"\t\5\2\2X\n\3\2\2\2YZ\t\6\2\2Z\f\3\2\2\2[\\\t\7\2\2\\\16\3\2\2\2]^\t\b"+
		"\2\2^\20\3\2\2\2_`\t\t\2\2`\22\3\2\2\2ab\t\n\2\2b\24\3\2\2\2cd\t\13\2"+
		"\2d\26\3\2\2\2ef\t\f\2\2f\30\3\2\2\2gh\t\r\2\2h\32\3\2\2\2ij\t\16\2\2"+
		"j\34\3\2\2\2kl\t\17\2\2l\36\3\2\2\2mn\t\20\2\2n \3\2\2\2op\t\21\2\2p\""+
		"\3\2\2\2qr\t\22\2\2r$\3\2\2\2st\7}\2\2t&\3\2\2\2uv\7\177\2\2v(\3\2\2\2"+
		"wx\7=\2\2x*\3\2\2\2yz\7?\2\2z,\3\2\2\2{|\7]\2\2|.\3\2\2\2}~\7_\2\2~\60"+
		"\3\2\2\2\177\u0080\7.\2\2\u0080\62\3\2\2\2\u0081\u0082\7<\2\2\u0082\64"+
		"\3\2\2\2\u0083\u0084\5\31\r\2\u0084\u0085\5\23\n\2\u0085\u0086\5\3\2\2"+
		"\u0086\u0087\5\33\16\2\u0087\u0088\5\13\6\2\u0088\66\3\2\2\2\u0089\u008a"+
		"\5\7\4\2\u008a\u008b\5\21\t\2\u008b\u008c\5\23\n\2\u008c\u008d\5\27\f"+
		"\2\u008d\u008e\5\25\13\2\u008e\u008f\5\21\t\2\u008f8\3\2\2\2\u0090\u0091"+
		"\5\35\17\2\u0091\u0092\5\27\f\2\u0092\u0093\5\31\r\2\u0093\u0094\5\23"+
		"\n\2\u0094\u0095\5\3\2\2\u0095\u0096\5\33\16\2\u0096\u0097\5\13\6\2\u0097"+
		":\3\2\2\2\u0098\u0099\5\37\20\2\u0099\u009a\5\r\7\2\u009a\u009b\5\35\17"+
		"\2\u009b\u009c\5!\21\2\u009c<\3\2\2\2\u009d\u009e\5!\21\2\u009e\u009f"+
		"\5\35\17\2\u009f\u00a0\5\31\r\2\u00a0\u00a1\5!\21\2\u00a1>\3\2\2\2\u00a2"+
		"\u00a3\5\7\4\2\u00a3\u00a4\5\17\b\2\u00a4\u00a5\5\5\3\2\u00a5\u00a6\5"+
		"\31\r\2\u00a6\u00a7\5\23\n\2\u00a7\u00a8\5\3\2\2\u00a8\u00a9\5\33\16\2"+
		"\u00a9\u00aa\5\13\6\2\u00aa@\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\u00b0\7"+
		"/\2\2\u00ad\u00ae\7/\2\2\u00ae\u00b0\7@\2\2\u00af\u00ab\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0B\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b3\7,\2\2"+
		"\u00b3\u00b7\3\2\2\2\u00b4\u00b6\13\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\b\"\2\2\u00beD\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1"+
		"\7\61\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\13\2\2\2\u00c3\u00c2\3\2\2\2"+
		"\u00c4\u00c7\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\7\17\2\2\u00c9\u00c8\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00ce\b#\2\2\u00ceF\3\2\2\2\u00cf\u00d5\7$\2\2\u00d0\u00d1"+
		"\7^\2\2\u00d1\u00d4\7$\2\2\u00d2\u00d4\13\2\2\2\u00d3\u00d0\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7$\2\2\u00d9"+
		"H\3\2\2\2\u00da\u00de\t\23\2\2\u00db\u00dd\t\24\2\2\u00dc\u00db\3\2\2"+
		"\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00dfJ"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\7/\2\2\u00e2\u00e1\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00f8\3\2\2\2\u00e4\u00e6\7\60\2\2\u00e5\u00e7\5"+
		"#\22\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00f9\3\2\2\2\u00ea\u00ec\5#\22\2\u00eb\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f6\3\2\2\2\u00ef\u00f3\7\60\2\2\u00f0\u00f2\5#\22\2\u00f1\u00f0\3"+
		"\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00e4\3\2\2\2\u00f8\u00eb\3\2\2\2\u00f9"+
		"L\3\2\2\2\u00fa\u00fe\7%\2\2\u00fb\u00fd\n\25\2\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\b\'\2\2\u0102N\3\2\2\2\u0103"+
		"\u0105\t\26\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\b(\2\2\u0109"+
		"P\3\2\2\2\22\2\u00af\u00b7\u00c5\u00c9\u00d3\u00d5\u00de\u00e2\u00e8\u00ed"+
		"\u00f3\u00f6\u00f8\u00fe\u0106\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}