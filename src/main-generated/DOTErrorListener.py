import sys
from DOTParser import DOTParser
from DOTParserListener import DOTParserListener
from antlr4.error.ErrorListener import ErrorListener


class DOTErrorListener(ErrorListener):

    def __init__(self):
        self._msg=''

    
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):        
        self._msg = 'Line '+str(line)+':'+str(column)+' '+ msg
        

    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
        raise Exception("Oh no!!")

    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        raise Exception("Oh no!!")

    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        raise Exception("Oh no!!")


    @property        
    def msg(self):
        return self._msg