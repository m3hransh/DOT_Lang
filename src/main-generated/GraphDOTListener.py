import sys
import antlr4
from DOTParser import DOTParser
from DOTParserListener import DOTParserListener

class GraphDOTListener(DOTParserListener):
    def __init__(self, g):
        