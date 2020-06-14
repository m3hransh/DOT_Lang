# This is simple program for getting DOT program 
# file from terminal and show its representation using matplotlib.pyplot
import sys
import antlr4
from DOTLexer import DOTLexer
from DOTParser import DOTParser
from GraphDOTListener import GraphDOTListener



def main(file_name):
    chars = antlr4.FileStream(file_name)
    lexer = DOTLexer(chars)
    stream = antlr4.CommonTokenStream(lexer)
    parser = DOTParser(stream)
    tree = parser.graph()

    GraphDOT = GraphDOTListener()
    walker = antlr4.ParseTreeWalker()
    walker.walk(GraphDOT, tree)
    
    GraphDOT.show_graph()


if __name__ == "__main__":
    if len(sys.argv) > 1:
        main(sys.argv[1])