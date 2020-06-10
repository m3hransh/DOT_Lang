// Generated from /home/mehran/Projects/compiler_lab/src/main/antlr/CalcLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NL=2, INPUT_KW=3, OUTPUT_KW=4, NUMBER_LIT=5, ID=6, LPAREN=7, RPAREN=8, 
		EQUAL=9, MINUS=10, PLUS=11, MUL=12, DIV=13, UNRECOGNIZED=14;
	public static final int
		WS_CHANNEL=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "WS_CHANNEL"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "NL", "INPUT_KW", "OUTPUT_KW", "NUMBER_LIT", "ID", "LPAREN", "RPAREN", 
		"EQUAL", "MINUS", "PLUS", "MUL", "DIV", "UNRECOGNIZED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'input'", "'output'", null, null, "'('", "')'", "'='", 
		"'-'", "'+'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "NL", "INPUT_KW", "OUTPUT_KW", "NUMBER_LIT", "ID", "LPAREN", 
		"RPAREN", "EQUAL", "MINUS", "PLUS", "MUL", "DIV", "UNRECOGNIZED"
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


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalcLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20c\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2!\n\2\r\2\16\2\"\3\2\3"+
		"\2\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\5\6C\n\6\3\6\3\6\6"+
		"\6G\n\6\r\6\16\6H\5\6K\n\6\3\7\3\7\7\7O\n\7\f\7\16\7R\13\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\2\2\20\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2"+
		"\b\4\2\13\13\"\"\4\2\f\f\17\17\3\2\63;\3\2\62;\4\2C\\c|\6\2\62;C\\aac"+
		"|\2i\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3 \3\2\2\2\5)\3\2\2\2\7-\3"+
		"\2\2\2\t\63\3\2\2\2\13B\3\2\2\2\rL\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23"+
		"W\3\2\2\2\25Y\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35a\3\2\2\2"+
		"\37!\t\2\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%"+
		"\b\2\2\2%\4\3\2\2\2&\'\7\17\2\2\'*\7\f\2\2(*\t\3\2\2)&\3\2\2\2)(\3\2\2"+
		"\2*+\3\2\2\2+,\b\3\2\2,\6\3\2\2\2-.\7k\2\2./\7p\2\2/\60\7r\2\2\60\61\7"+
		"w\2\2\61\62\7v\2\2\62\b\3\2\2\2\63\64\7q\2\2\64\65\7w\2\2\65\66\7v\2\2"+
		"\66\67\7r\2\2\678\7w\2\289\7v\2\29\n\3\2\2\2:C\7\62\2\2;?\t\4\2\2<>\t"+
		"\5\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2B:\3"+
		"\2\2\2B;\3\2\2\2CJ\3\2\2\2DF\7\60\2\2EG\t\5\2\2FE\3\2\2\2GH\3\2\2\2HF"+
		"\3\2\2\2HI\3\2\2\2IK\3\2\2\2JD\3\2\2\2JK\3\2\2\2K\f\3\2\2\2LP\t\6\2\2"+
		"MO\t\7\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\16\3\2\2\2RP\3\2\2"+
		"\2ST\7*\2\2T\20\3\2\2\2UV\7+\2\2V\22\3\2\2\2WX\7?\2\2X\24\3\2\2\2YZ\7"+
		"/\2\2Z\26\3\2\2\2[\\\7-\2\2\\\30\3\2\2\2]^\7,\2\2^\32\3\2\2\2_`\7\61\2"+
		"\2`\34\3\2\2\2ab\13\2\2\2b\36\3\2\2\2\n\2\")?BHJP\3\2\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}