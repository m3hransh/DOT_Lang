parser grammar DOTParser;
/*
* Parser Rules
 */
 options { tokenVocab=DOTLexer; }


graph       : STRICT? (GRAPH | DIGRAPH) name? '{' stmt_list'}' ;

stmt_list   : (stmt ';'? stmt_list)? ;

stmt        : (node_stmt | edge_stmt | attr_stmt | name '=' name | subgraph) ;

subgraph    : (SUBGRAPH name?)? '{' stmt_list'}' ; 

attr_stmt   :(GRAPH | NODE | EDGE) attr_list ;

attr_list   : '[' a_list? ']' attr_list? ;

a_list      : name '=' name (';'|',')? a_list? ;

edge_stmt   : (node_name | subgraph) edgeRHS attr_list? ;

edgeRHS     : EDGEOP (node_name | subgraph) edgeRHS? ;

node_stmt   : node_name attr_list? ;

node_name     : name port? ;

port        : ':' name ( ':' name )? ;

name          : (ID| STRING| NUMBER) ;

