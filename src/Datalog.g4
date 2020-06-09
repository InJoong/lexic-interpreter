/**
 * A Datalog grammar inspired from the textbook definition and heavily taken
 * from http://blogs.evergreen.edu/sosw/files/2014/04/Green-Vol5-DBS-017.pdf
 *
 * As per the semantics mentioned in the above link the grammar below supports
 * negation and aggregation as well. Main differences from the above spec to
 * this is how literals and variables are represented which differ a bit from
 * traditional logic programming convention.
 *
 * All literals are typed in below grammar and variables must be explicitly
 * indicated by '?' prefix. Predicates follow same rules as identifiers except
 * that they don't have the '?' character. These changes are so that grammar
 * can be used to store/query typed data from database.
 */
grammar Datalog;

// Top level program to perform two functions.
// Stores data using facts or performs a query over existing/new facts
program
    : facts
    | facts? rules? query
    ;

// Facts that represent ground truth information
fact
    : predicate '(' literalList ')' '.' #PredicateFact
    ;

literalList
    : literal ( ',' literal ) * #LietralLiteralList
    ;

facts
    : fact+ #FactFacts
    ;

// Horn clauses or rules in the query
regla
    : atom ':-' atoms '.'   #AtomRegla
    ;

rules
    : regla+    #ReglaRules
    ;

query
    : '?-' atom #AtomQuery
    ;

// Definition of atom (or goal) used in horn clauses (or rules)
atom
    : predicate '(' variableOrLiterals ')'  #PredicateAtom
    | NOT atom                              #NotAtom
    ;

atoms
    : atom ( ',' atom )*    #AtomAtoms
    ;

// Types of things allowed within arguments of rules
variableOrLiteral
    : variable          #VariableVariableOrLiteral
    | literal           #LiteralVariableOrLiteral
    | aggregateVariable #AVVariableOrLiteral
    ;

variableOrLiterals
    : variableOrLiteral (',' variableOrLiteral)*    #VLVariableOrLiterals
    ;

aggregateVariable
    : aggregateOp '<' variable '>'  #AOAggregateVariable
    ;

aggregateOp
    : COUNT #CountAggregateOp
    | AVG   #AvgAggregateOp
    | SUM   #SumAggregateOp
    | MIN   #MinAggregateOp
    | MAX   #MaxAggregateOp
    ;

variable
    : Identifier    #IdentifierVariable
    ;

predicate
    : Predicate #PredicatePredicate
    ;

literal
	:	IntegerLiteral          #IntegerLiteral
	|	FloatingPointLiteral    #FloatLLiteral
	|	BOOLEANLITERAL          #BoolLiteral
	|	CharacterLiteral        #CharLiteral
	|	StringLiteral           #StringLiteral
	;

// Lexer rules

//
// Keywords
//
NOT: 'not';
COUNT: 'count';
AVG: 'avg';
SUM: 'sum';
MIN: 'min';
MAX: 'max';

//
// Integers
//
IntegerLiteral
	:	DecimalIntegerLiteral
	|	HexIntegerLiteral
	|	OctalIntegerLiteral
	|	BinaryIntegerLiteral
	;

fragment
DecimalIntegerLiteral
	:	DecimalNumeral INTEGERTYPESUFFIX?
	;

fragment
HexIntegerLiteral
	:	HexNumeral INTEGERTYPESUFFIX?
	;

fragment
OctalIntegerLiteral
	:	OctalNumeral INTEGERTYPESUFFIX?
	;

fragment
BinaryIntegerLiteral
	:	BinaryNumeral INTEGERTYPESUFFIX?
	;

fragment
INTEGERTYPESUFFIX
	:	[lL]
	;

fragment
DecimalNumeral
	:	'0'
	|	NONZERODIGIT (Digits? | UNDERSCORES Digits)
	;

fragment
Digits
	:	Digit (DigitsAndUNDERSCORES? Digit)?
	;

fragment
Digit
	:	'0'
	|	NONZERODIGIT
	;

fragment
NONZERODIGIT
	:	[1-9]
	;

fragment
DigitsAndUNDERSCORES
	:	DigitOrUnderscore+
	;

fragment
DigitOrUnderscore
	:	Digit
	|	'_'
	;

fragment
UNDERSCORES
	:	'_'+
	;

fragment
HexNumeral
	:	'0' [xX] HexDigits
	;

fragment
HexDigits
	:	HEXDIGIT (HexDigitsAndUnderscores? HEXDIGIT)?
	;

fragment
HEXDIGIT
	:	[0-9a-fA-F]
	;

fragment
HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+
	;

fragment
HexDigitOrUnderscore
	:	HEXDIGIT
	|	'_'
	;

fragment
OctalNumeral
	:	'0' UNDERSCORES? Octaldigits
	;

fragment
Octaldigits
	:	OCTALDIGIT (OctaldigitsAndUNDERSCORES? OCTALDIGIT)?
	;

fragment
OCTALDIGIT
	:	[0-7]
	;

fragment
OctaldigitsAndUNDERSCORES
	:	OCTALDIGITOrUnderscore+
	;

fragment
OCTALDIGITOrUnderscore
	:	OCTALDIGIT
	|	'_'
	;

fragment
BinaryNumeral
	:	'0' [bB] BinaryDigits
	;

fragment
BinaryDigits
	:	BINARYDIGIT (BinaryDigitsAndUnderscores? BINARYDIGIT)?
	;

fragment
BINARYDIGIT
	:	[01]
	;

fragment
BinaryDigitsAndUnderscores
	:	BinaryDigitOrUnderscore+
	;

fragment
BinaryDigitOrUnderscore
	:	BINARYDIGIT
	|	'_'
	;

//
// Floating point numbers
//
FloatingPointLiteral
	:	DecimalFloatingPointLiteral
	|	HexadecimalFloatingPointLiteral
	;

fragment
DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FLOATTYPESUFFIX?
	|	'.' Digits ExponentPart? FLOATTYPESUFFIX?
	|	Digits ExponentPart FLOATTYPESUFFIX?
	|	Digits FLOATTYPESUFFIX
	;

fragment
ExponentPart
	:	EXPONENTINDICATOR SignedInteger
	;

fragment
EXPONENTINDICATOR
	:	[eE]
	;

fragment
SignedInteger
	:	SIGN? Digits
	;

fragment
SIGN
	:	[+-]
	;

fragment
FLOATTYPESUFFIX
	:	[fFdD]
	;

fragment
HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent FLOATTYPESUFFIX?
	;

fragment
HexSignificand
	:	HexNumeral '.'?
	|	'0' [xX] HexDigits? '.' HexDigits
	;

fragment
BinaryExponent
	:	BINARYEXPONENTINDICATOR SignedInteger
	;

fragment
BINARYEXPONENTINDICATOR
	:	[pP]
	;

//
// Boolean
//
BOOLEANLITERAL
	:	'true'
	|	'false'
	;

//
// Characters
//
CharacterLiteral
	:	'\'' SINGLECHARACTER '\''
	|	'\'' EscapeSequence '\''
	;

fragment
SINGLECHARACTER
	:	~['\\\r\n]
	;

//
// Strings
//
StringLiteral
	:	'"' StringCharacters? '"'
	;

fragment
StringCharacters
	:	StringCharacter+
	;

fragment
StringCharacter
	:	~["\\\r\n]
	|	EscapeSequence
	;

// §3.10.6 Escape Sequences for Character and String Literals
fragment
EscapeSequence
	:	'\\' [btnfr"'\\]
	|	OctalEscape
	;

fragment
OctalEscape
	:	'\\' OCTALDIGIT
	|	'\\' OCTALDIGIT OCTALDIGIT
	|	'\\' ZEROTOTHREE OCTALDIGIT OCTALDIGIT
	;

fragment
ZEROTOTHREE
	:	[0-3]
	;

//
// Identifiers & Predicates
//
Predicate
    : IDENTIFIERLETTER IDENTIFIERLETTERORDIGIT*
    ;

Identifier
    : '?' IDENTIFIERLETTER IDENTIFIERLETTERORDIGIT*
    ;

fragment
IDENTIFIERLETTER
    : [a-zA-Z]
    ;

fragment
IDENTIFIERLETTERORDIGIT
    : [a-zA-Z0-9_]
    ;

//
// Whitespace and comments
//
WS
    : [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    : '%' ~[\n\r]* ( [\n\r] | EOF) -> skip
    ;

MULTILINE_COMMENT
    : '/*' ( MULTILINE_COMMENT | . )*? ('*/' | EOF) -> skip
    ;