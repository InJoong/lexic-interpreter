// Generated from C:/Users/injoo/IdeaProjects/compiladores_proyecto/src\Datalog.g4 by ANTLR 4.8
package mx.itesm.compiladores;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		NOT=10, COUNT=11, AVG=12, SUM=13, MIN=14, MAX=15, IntegerLiteral=16, FloatingPointLiteral=17, 
		BOOLEANLITERAL=18, CharacterLiteral=19, StringLiteral=20, Predicate=21, 
		Identifier=22, WS=23, COMMENT=24, MULTILINE_COMMENT=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"NOT", "COUNT", "AVG", "SUM", "MIN", "MAX", "IntegerLiteral", "DecimalIntegerLiteral", 
			"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "INTEGERTYPESUFFIX", 
			"DecimalNumeral", "Digits", "Digit", "NONZERODIGIT", "DigitsAndUNDERSCORES", 
			"DigitOrUnderscore", "UNDERSCORES", "HexNumeral", "HexDigits", "HEXDIGIT", 
			"HexDigitsAndUnderscores", "HexDigitOrUnderscore", "OctalNumeral", "Octaldigits", 
			"OCTALDIGIT", "OctaldigitsAndUNDERSCORES", "OCTALDIGITOrUnderscore", 
			"BinaryNumeral", "BinaryDigits", "BINARYDIGIT", "BinaryDigitsAndUnderscores", 
			"BinaryDigitOrUnderscore", "FloatingPointLiteral", "DecimalFloatingPointLiteral", 
			"ExponentPart", "EXPONENTINDICATOR", "SignedInteger", "SIGN", "FLOATTYPESUFFIX", 
			"HexadecimalFloatingPointLiteral", "HexSignificand", "BinaryExponent", 
			"BINARYEXPONENTINDICATOR", "BOOLEANLITERAL", "CharacterLiteral", "SINGLECHARACTER", 
			"StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
			"OctalEscape", "ZEROTOTHREE", "Predicate", "Identifier", "IDENTIFIERLETTER", 
			"IDENTIFIERLETTERORDIGIT", "WS", "COMMENT", "MULTILINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'delete'", "'('", "')'", "'.'", "','", "':-'", "'?-'", "'<'", 
			"'>'", "'not'", "'count'", "'avg'", "'sum'", "'min'", "'max'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "NOT", "COUNT", 
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


	public DatalogLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Datalog.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u01fc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\5\21\u00c7\n\21\3\22\3\22\5\22\u00cb\n\22\3\23"+
		"\3\23\5\23\u00cf\n\23\3\24\3\24\5\24\u00d3\n\24\3\25\3\25\5\25\u00d7\n"+
		"\25\3\26\3\26\3\27\3\27\3\27\5\27\u00de\n\27\3\27\3\27\3\27\5\27\u00e3"+
		"\n\27\5\27\u00e5\n\27\3\30\3\30\5\30\u00e9\n\30\3\30\5\30\u00ec\n\30\3"+
		"\31\3\31\5\31\u00f0\n\31\3\32\3\32\3\33\6\33\u00f5\n\33\r\33\16\33\u00f6"+
		"\3\34\3\34\5\34\u00fb\n\34\3\35\6\35\u00fe\n\35\r\35\16\35\u00ff\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\5\37\u0108\n\37\3\37\5\37\u010b\n\37\3 \3 \3"+
		"!\6!\u0110\n!\r!\16!\u0111\3\"\3\"\5\"\u0116\n\"\3#\3#\5#\u011a\n#\3#"+
		"\3#\3$\3$\5$\u0120\n$\3$\5$\u0123\n$\3%\3%\3&\6&\u0128\n&\r&\16&\u0129"+
		"\3\'\3\'\5\'\u012e\n\'\3(\3(\3(\3(\3)\3)\5)\u0136\n)\3)\5)\u0139\n)\3"+
		"*\3*\3+\6+\u013e\n+\r+\16+\u013f\3,\3,\5,\u0144\n,\3-\3-\5-\u0148\n-\3"+
		".\3.\3.\5.\u014d\n.\3.\5.\u0150\n.\3.\5.\u0153\n.\3.\3.\3.\5.\u0158\n"+
		".\3.\5.\u015b\n.\3.\3.\3.\5.\u0160\n.\3.\3.\3.\5.\u0165\n.\3/\3/\3/\3"+
		"\60\3\60\3\61\5\61\u016d\n\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\64\5\64\u0178\n\64\3\65\3\65\5\65\u017c\n\65\3\65\3\65\3\65\5\65\u0181"+
		"\n\65\3\65\3\65\5\65\u0185\n\65\3\66\3\66\3\66\3\67\3\67\38\38\38\38\3"+
		"8\38\38\38\38\58\u0195\n8\39\39\39\39\39\39\39\39\59\u019f\n9\3:\3:\3"+
		";\3;\5;\u01a5\n;\3;\3;\3<\6<\u01aa\n<\r<\16<\u01ab\3=\3=\5=\u01b0\n=\3"+
		">\3>\3>\5>\u01b5\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u01c2\n?\3@\3"+
		"@\3A\3A\7A\u01c8\nA\fA\16A\u01cb\13A\3B\3B\3B\7B\u01d0\nB\fB\16B\u01d3"+
		"\13B\3C\3C\3D\3D\3E\6E\u01da\nE\rE\16E\u01db\3E\3E\3F\3F\7F\u01e2\nF\f"+
		"F\16F\u01e5\13F\3F\5F\u01e8\nF\3F\3F\3G\3G\3G\3G\3G\7G\u01f1\nG\fG\16"+
		"G\u01f4\13G\3G\3G\3G\5G\u01f9\nG\3G\3G\3\u01f2\2H\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\2\'\2)"+
		"\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2"+
		"S\2U\2W\2Y\23[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\24q\25s\2u\26w\2y\2{\2}\2"+
		"\177\2\u0081\27\u0083\30\u0085\2\u0087\2\u0089\31\u008b\32\u008d\33\3"+
		"\2\26\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4"+
		"\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^"+
		"^\n\2$$))^^ddhhppttvv\3\2\62\65\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\4\3\f\f\17\17\2\u0209\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2Y\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2u\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0096\3\2\2\2\7\u0098\3\2\2\2\t\u009a"+
		"\3\2\2\2\13\u009c\3\2\2\2\r\u009e\3\2\2\2\17\u00a1\3\2\2\2\21\u00a4\3"+
		"\2\2\2\23\u00a6\3\2\2\2\25\u00a8\3\2\2\2\27\u00ac\3\2\2\2\31\u00b2\3\2"+
		"\2\2\33\u00b6\3\2\2\2\35\u00ba\3\2\2\2\37\u00be\3\2\2\2!\u00c6\3\2\2\2"+
		"#\u00c8\3\2\2\2%\u00cc\3\2\2\2\'\u00d0\3\2\2\2)\u00d4\3\2\2\2+\u00d8\3"+
		"\2\2\2-\u00e4\3\2\2\2/\u00e6\3\2\2\2\61\u00ef\3\2\2\2\63\u00f1\3\2\2\2"+
		"\65\u00f4\3\2\2\2\67\u00fa\3\2\2\29\u00fd\3\2\2\2;\u0101\3\2\2\2=\u0105"+
		"\3\2\2\2?\u010c\3\2\2\2A\u010f\3\2\2\2C\u0115\3\2\2\2E\u0117\3\2\2\2G"+
		"\u011d\3\2\2\2I\u0124\3\2\2\2K\u0127\3\2\2\2M\u012d\3\2\2\2O\u012f\3\2"+
		"\2\2Q\u0133\3\2\2\2S\u013a\3\2\2\2U\u013d\3\2\2\2W\u0143\3\2\2\2Y\u0147"+
		"\3\2\2\2[\u0164\3\2\2\2]\u0166\3\2\2\2_\u0169\3\2\2\2a\u016c\3\2\2\2c"+
		"\u0170\3\2\2\2e\u0172\3\2\2\2g\u0174\3\2\2\2i\u0184\3\2\2\2k\u0186\3\2"+
		"\2\2m\u0189\3\2\2\2o\u0194\3\2\2\2q\u019e\3\2\2\2s\u01a0\3\2\2\2u\u01a2"+
		"\3\2\2\2w\u01a9\3\2\2\2y\u01af\3\2\2\2{\u01b4\3\2\2\2}\u01c1\3\2\2\2\177"+
		"\u01c3\3\2\2\2\u0081\u01c5\3\2\2\2\u0083\u01cc\3\2\2\2\u0085\u01d4\3\2"+
		"\2\2\u0087\u01d6\3\2\2\2\u0089\u01d9\3\2\2\2\u008b\u01df\3\2\2\2\u008d"+
		"\u01eb\3\2\2\2\u008f\u0090\7f\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n\2"+
		"\2\u0092\u0093\7g\2\2\u0093\u0094\7v\2\2\u0094\u0095\7g\2\2\u0095\4\3"+
		"\2\2\2\u0096\u0097\7*\2\2\u0097\6\3\2\2\2\u0098\u0099\7+\2\2\u0099\b\3"+
		"\2\2\2\u009a\u009b\7\60\2\2\u009b\n\3\2\2\2\u009c\u009d\7.\2\2\u009d\f"+
		"\3\2\2\2\u009e\u009f\7<\2\2\u009f\u00a0\7/\2\2\u00a0\16\3\2\2\2\u00a1"+
		"\u00a2\7A\2\2\u00a2\u00a3\7/\2\2\u00a3\20\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5"+
		"\22\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\u00aa\7q\2\2\u00aa\u00ab\7v\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7e\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7v\2\2"+
		"\u00b1\30\3\2\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7x\2\2\u00b4\u00b5\7"+
		"i\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9"+
		"\7o\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7p\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7o\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1"+
		"\7z\2\2\u00c1 \3\2\2\2\u00c2\u00c7\5#\22\2\u00c3\u00c7\5%\23\2\u00c4\u00c7"+
		"\5\'\24\2\u00c5\u00c7\5)\25\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\"\3\2\2\2\u00c8\u00ca\5"+
		"-\27\2\u00c9\u00cb\5+\26\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"$\3\2\2\2\u00cc\u00ce\5;\36\2\u00cd\u00cf\5+\26\2\u00ce\u00cd\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf&\3\2\2\2\u00d0\u00d2\5E#\2\u00d1\u00d3\5+\26"+
		"\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3(\3\2\2\2\u00d4\u00d6"+
		"\5O(\2\u00d5\u00d7\5+\26\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"*\3\2\2\2\u00d8\u00d9\t\2\2\2\u00d9,\3\2\2\2\u00da\u00e5\7\62\2\2\u00db"+
		"\u00e2\5\63\32\2\u00dc\u00de\5/\30\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3"+
		"\2\2\2\u00de\u00e3\3\2\2\2\u00df\u00e0\59\35\2\u00e0\u00e1\5/\30\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00da\3\2\2\2\u00e4\u00db\3\2\2\2\u00e5.\3\2\2\2\u00e6\u00eb"+
		"\5\61\31\2\u00e7\u00e9\5\65\33\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2"+
		"\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\5\61\31\2\u00eb\u00e8\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\60\3\2\2\2\u00ed\u00f0\7\62\2\2\u00ee\u00f0\5\63"+
		"\32\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\62\3\2\2\2\u00f1\u00f2"+
		"\t\3\2\2\u00f2\64\3\2\2\2\u00f3\u00f5\5\67\34\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\66\3\2\2"+
		"\2\u00f8\u00fb\5\61\31\2\u00f9\u00fb\7a\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb8\3\2\2\2\u00fc\u00fe\7a\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100:\3\2\2\2"+
		"\u0101\u0102\7\62\2\2\u0102\u0103\t\4\2\2\u0103\u0104\5=\37\2\u0104<\3"+
		"\2\2\2\u0105\u010a\5? \2\u0106\u0108\5A!\2\u0107\u0106\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\5? \2\u010a\u0107\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b>\3\2\2\2\u010c\u010d\t\5\2\2\u010d@\3\2\2\2\u010e"+
		"\u0110\5C\"\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112B\3\2\2\2\u0113\u0116\5? \2\u0114\u0116"+
		"\7a\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116D\3\2\2\2\u0117\u0119"+
		"\7\62\2\2\u0118\u011a\59\35\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2"+
		"\u011a\u011b\3\2\2\2\u011b\u011c\5G$\2\u011cF\3\2\2\2\u011d\u0122\5I%"+
		"\2\u011e\u0120\5K&\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0123\5I%\2\u0122\u011f\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"H\3\2\2\2\u0124\u0125\t\6\2\2\u0125J\3\2\2\2\u0126\u0128\5M\'\2\u0127"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012aL\3\2\2\2\u012b\u012e\5I%\2\u012c\u012e\7a\2\2\u012d\u012b\3"+
		"\2\2\2\u012d\u012c\3\2\2\2\u012eN\3\2\2\2\u012f\u0130\7\62\2\2\u0130\u0131"+
		"\t\7\2\2\u0131\u0132\5Q)\2\u0132P\3\2\2\2\u0133\u0138\5S*\2\u0134\u0136"+
		"\5U+\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0139\5S*\2\u0138\u0135\3\2\2\2\u0138\u0139\3\2\2\2\u0139R\3\2\2\2\u013a"+
		"\u013b\t\b\2\2\u013bT\3\2\2\2\u013c\u013e\5W,\2\u013d\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140V\3\2\2\2"+
		"\u0141\u0144\5S*\2\u0142\u0144\7a\2\2\u0143\u0141\3\2\2\2\u0143\u0142"+
		"\3\2\2\2\u0144X\3\2\2\2\u0145\u0148\5[.\2\u0146\u0148\5g\64\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0146\3\2\2\2\u0148Z\3\2\2\2\u0149\u014a\5/\30\2\u014a"+
		"\u014c\7\60\2\2\u014b\u014d\5/\30\2\u014c\u014b\3\2\2\2\u014c\u014d\3"+
		"\2\2\2\u014d\u014f\3\2\2\2\u014e\u0150\5]/\2\u014f\u014e\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u0153\5e\63\2\u0152\u0151\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u0165\3\2\2\2\u0154\u0155\7\60\2\2\u0155"+
		"\u0157\5/\30\2\u0156\u0158\5]/\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2"+
		"\2\u0158\u015a\3\2\2\2\u0159\u015b\5e\63\2\u015a\u0159\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u0165\3\2\2\2\u015c\u015d\5/\30\2\u015d\u015f\5]/\2\u015e"+
		"\u0160\5e\63\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0165\3\2"+
		"\2\2\u0161\u0162\5/\30\2\u0162\u0163\5e\63\2\u0163\u0165\3\2\2\2\u0164"+
		"\u0149\3\2\2\2\u0164\u0154\3\2\2\2\u0164\u015c\3\2\2\2\u0164\u0161\3\2"+
		"\2\2\u0165\\\3\2\2\2\u0166\u0167\5_\60\2\u0167\u0168\5a\61\2\u0168^\3"+
		"\2\2\2\u0169\u016a\t\t\2\2\u016a`\3\2\2\2\u016b\u016d\5c\62\2\u016c\u016b"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\5/\30\2\u016f"+
		"b\3\2\2\2\u0170\u0171\t\n\2\2\u0171d\3\2\2\2\u0172\u0173\t\13\2\2\u0173"+
		"f\3\2\2\2\u0174\u0175\5i\65\2\u0175\u0177\5k\66\2\u0176\u0178\5e\63\2"+
		"\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178h\3\2\2\2\u0179\u017b\5"+
		";\36\2\u017a\u017c\7\60\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u0185\3\2\2\2\u017d\u017e\7\62\2\2\u017e\u0180\t\4\2\2\u017f\u0181\5"+
		"=\37\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\7\60\2\2\u0183\u0185\5=\37\2\u0184\u0179\3\2\2\2\u0184\u017d\3"+
		"\2\2\2\u0185j\3\2\2\2\u0186\u0187\5m\67\2\u0187\u0188\5a\61\2\u0188l\3"+
		"\2\2\2\u0189\u018a\t\f\2\2\u018an\3\2\2\2\u018b\u018c\7v\2\2\u018c\u018d"+
		"\7t\2\2\u018d\u018e\7w\2\2\u018e\u0195\7g\2\2\u018f\u0190\7h\2\2\u0190"+
		"\u0191\7c\2\2\u0191\u0192\7n\2\2\u0192\u0193\7u\2\2\u0193\u0195\7g\2\2"+
		"\u0194\u018b\3\2\2\2\u0194\u018f\3\2\2\2\u0195p\3\2\2\2\u0196\u0197\7"+
		")\2\2\u0197\u0198\5s:\2\u0198\u0199\7)\2\2\u0199\u019f\3\2\2\2\u019a\u019b"+
		"\7)\2\2\u019b\u019c\5{>\2\u019c\u019d\7)\2\2\u019d\u019f\3\2\2\2\u019e"+
		"\u0196\3\2\2\2\u019e\u019a\3\2\2\2\u019fr\3\2\2\2\u01a0\u01a1\n\r\2\2"+
		"\u01a1t\3\2\2\2\u01a2\u01a4\7$\2\2\u01a3\u01a5\5w<\2\u01a4\u01a3\3\2\2"+
		"\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7$\2\2\u01a7v\3"+
		"\2\2\2\u01a8\u01aa\5y=\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01acx\3\2\2\2\u01ad\u01b0\n\16\2\2"+
		"\u01ae\u01b0\5{>\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0z\3\2"+
		"\2\2\u01b1\u01b2\7^\2\2\u01b2\u01b5\t\17\2\2\u01b3\u01b5\5}?\2\u01b4\u01b1"+
		"\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5|\3\2\2\2\u01b6\u01b7\7^\2\2\u01b7\u01c2"+
		"\5I%\2\u01b8\u01b9\7^\2\2\u01b9\u01ba\5I%\2\u01ba\u01bb\5I%\2\u01bb\u01c2"+
		"\3\2\2\2\u01bc\u01bd\7^\2\2\u01bd\u01be\5\177@\2\u01be\u01bf\5I%\2\u01bf"+
		"\u01c0\5I%\2\u01c0\u01c2\3\2\2\2\u01c1\u01b6\3\2\2\2\u01c1\u01b8\3\2\2"+
		"\2\u01c1\u01bc\3\2\2\2\u01c2~\3\2\2\2\u01c3\u01c4\t\20\2\2\u01c4\u0080"+
		"\3\2\2\2\u01c5\u01c9\5\u0085C\2\u01c6\u01c8\5\u0087D\2\u01c7\u01c6\3\2"+
		"\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u0082\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cd\7A\2\2\u01cd\u01d1\5\u0085"+
		"C\2\u01ce\u01d0\5\u0087D\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u0084\3\2\2\2\u01d3\u01d1\3\2"+
		"\2\2\u01d4\u01d5\t\21\2\2\u01d5\u0086\3\2\2\2\u01d6\u01d7\t\22\2\2\u01d7"+
		"\u0088\3\2\2\2\u01d8\u01da\t\23\2\2\u01d9\u01d8\3\2\2\2\u01da\u01db\3"+
		"\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\bE\2\2\u01de\u008a\3\2\2\2\u01df\u01e3\7\'\2\2\u01e0\u01e2\n\24"+
		"\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e8\t\25"+
		"\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\bF\2\2\u01ea"+
		"\u008c\3\2\2\2\u01eb\u01ec\7\61\2\2\u01ec\u01ed\7,\2\2\u01ed\u01f2\3\2"+
		"\2\2\u01ee\u01f1\5\u008dG\2\u01ef\u01f1\13\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01ef\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f2\u01f0\3\2"+
		"\2\2\u01f3\u01f8\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\7,\2\2\u01f6"+
		"\u01f9\7\61\2\2\u01f7\u01f9\7\2\2\3\u01f8\u01f5\3\2\2\2\u01f8\u01f7\3"+
		"\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\bG\2\2\u01fb\u008e\3\2\2\2:\2\u00c6"+
		"\u00ca\u00ce\u00d2\u00d6\u00dd\u00e2\u00e4\u00e8\u00eb\u00ef\u00f6\u00fa"+
		"\u00ff\u0107\u010a\u0111\u0115\u0119\u011f\u0122\u0129\u012d\u0135\u0138"+
		"\u013f\u0143\u0147\u014c\u014f\u0152\u0157\u015a\u015f\u0164\u016c\u0177"+
		"\u017b\u0180\u0184\u0194\u019e\u01a4\u01ab\u01af\u01b4\u01c1\u01c9\u01d1"+
		"\u01db\u01e3\u01e7\u01f0\u01f2\u01f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}