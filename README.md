# DOT Implementation with ANTLR
In this Project we are going to implement DOT language using ANTLR. 
### What is DOT?
DOT is a DSL(domain specific language) that can describe graphs, either directed or non directed. This is example of DOT executed with dot2tex(a console program).
![Alt text](doc/images/dot_ex_readme.png)
### What is ANTLR?
ANTLR is a parser generator, a tool that helps you to create parser. for installation of ANTLR on your platform click [here](https://www.antlr.org/index.html).
## Phase 1(Defining Grammar)
The grammar is defined with respect to [https://graphviz.org/doc/info/lang.html](https://graphviz.org/doc/info/lang.html).This is the [lexer](src/antlr/DOTLexer.g4) and this is the [parser](src/antrl/DOTParser.g4) rules in ANTLR format.

### Parse Tree Represntation
To see if the parse tree is created in a way that we want you can test it against some inputs. This is how you do it:
```
\\ Lines proceded by $ are command
\\ Lines proceded by > are inpu
$ antlr4 *.g4 -o test
$ javac DOT*.java
$ grun DOT graph
> digraph G {
> subgraph cluster0 {
> style=filled;
> a0 -> a1;
> label = "1";
> }
> subgraph cluster1 {
> node [style=filled];
> b0 -> b1 -> b2 -> b3;
> label = "2";
> }
> start -> a0;}
```
This is the respected output of the above, that has executed in terminal:
![Alt text](doc/images/parse-tree.png)
