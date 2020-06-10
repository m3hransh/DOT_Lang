import sys
import antlr4
from DOTLexer import DOTLexer
from DOTParser import DOTParser
from GraphDOTListener import GraphDOTListener

def main(argv):
    input = antlr4.FileStream(argv[1])
    lexer = DOTLexer(input)
    stream = antlr4.CommonTokenStream(lexer)
    parser = DOTParser(stream)
    tree = parser.graph()

    