lexer grammar DOTLexer;

/*
* Lexer Rules
 */
fragment A          : ('A'|'a') ;
fragment B          : ('B'|'b') ;
fragment S          : ('S'|'s') ;
fragment Y          : ('Y'|'y') ;
fragment H          : ('H'|'h') ;
fragment O          : ('O'|'o') ;
fragment U          : ('U'|'u') ;
fragment T          : ('T'|'t') ;
fragment R          : ('R'|'r') ;
fragment C          : ('C'|'c') ;
fragment I          : ('I'|'i') ;
fragment G          : ('G'|'g') ;
fragment P          : ('P'| 'p');
fragment D          : ('D'| 'd');
fragment N          : ('N'| 'n');
fragment E          : ('E'| 'e');
fragment DIGIT      : [0-9];

CUR_L: '{';
CUR_R:'}';
SEM:';';
EQ:'=';
BR_L:'[';
BR_R:']';
COMMA:',';
COLON:':';

GRAPH       : G R A P H ;
STRICT      : S T R I C T ;
DIGRAPH     : D I G R A P H ;
NODE        : N O D E ;
EDGE        : E D G E ;
SUBGRAPH    : S U B G R A P H ;
EDGEOP      : ('--'|'->') ;
COMMENT     : '/*' .*? '*/' -> skip ;
LINE_COMMENT: '//' .*? '\r'? '\n' -> skip ;
STRING      : '"' ( '\\"' | . )*? '"' ;
ID          : [_a-zA-Z\u0080-\u00FF][a-zA-Z\u0080-\u00FF_0-9]* ;
NUMBER      : '-'? ( '.' DIGIT+ | DIGIT+ ( '.' DIGIT* )? );
PREPROC     : '#' ~[\r\n]* -> skip ;
WS          : [ \t\n\r]+ -> skip ;
