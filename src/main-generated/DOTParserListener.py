# Generated from DOTParser.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .DOTParser import DOTParser
else:
    from DOTParser import DOTParser

# This class defines a complete listener for a parse tree produced by DOTParser.
class DOTParserListener(ParseTreeListener):

    # Enter a parse tree produced by DOTParser#graph.
    def enterGraph(self, ctx:DOTParser.GraphContext):
        pass

    # Exit a parse tree produced by DOTParser#graph.
    def exitGraph(self, ctx:DOTParser.GraphContext):
        pass


    # Enter a parse tree produced by DOTParser#stmt_list.
    def enterStmt_list(self, ctx:DOTParser.Stmt_listContext):
        pass

    # Exit a parse tree produced by DOTParser#stmt_list.
    def exitStmt_list(self, ctx:DOTParser.Stmt_listContext):
        pass


    # Enter a parse tree produced by DOTParser#stmt.
    def enterStmt(self, ctx:DOTParser.StmtContext):
        pass

    # Exit a parse tree produced by DOTParser#stmt.
    def exitStmt(self, ctx:DOTParser.StmtContext):
        pass


    # Enter a parse tree produced by DOTParser#subgraph.
    def enterSubgraph(self, ctx:DOTParser.SubgraphContext):
        pass

    # Exit a parse tree produced by DOTParser#subgraph.
    def exitSubgraph(self, ctx:DOTParser.SubgraphContext):
        pass


    # Enter a parse tree produced by DOTParser#attr_stmt.
    def enterAttr_stmt(self, ctx:DOTParser.Attr_stmtContext):
        pass

    # Exit a parse tree produced by DOTParser#attr_stmt.
    def exitAttr_stmt(self, ctx:DOTParser.Attr_stmtContext):
        pass


    # Enter a parse tree produced by DOTParser#attr_list.
    def enterAttr_list(self, ctx:DOTParser.Attr_listContext):
        pass

    # Exit a parse tree produced by DOTParser#attr_list.
    def exitAttr_list(self, ctx:DOTParser.Attr_listContext):
        pass


    # Enter a parse tree produced by DOTParser#a_list.
    def enterA_list(self, ctx:DOTParser.A_listContext):
        pass

    # Exit a parse tree produced by DOTParser#a_list.
    def exitA_list(self, ctx:DOTParser.A_listContext):
        pass


    # Enter a parse tree produced by DOTParser#edge_stmt.
    def enterEdge_stmt(self, ctx:DOTParser.Edge_stmtContext):
        pass

    # Exit a parse tree produced by DOTParser#edge_stmt.
    def exitEdge_stmt(self, ctx:DOTParser.Edge_stmtContext):
        pass


    # Enter a parse tree produced by DOTParser#edgeRHS.
    def enterEdgeRHS(self, ctx:DOTParser.EdgeRHSContext):
        pass

    # Exit a parse tree produced by DOTParser#edgeRHS.
    def exitEdgeRHS(self, ctx:DOTParser.EdgeRHSContext):
        pass


    # Enter a parse tree produced by DOTParser#node_stmt.
    def enterNode_stmt(self, ctx:DOTParser.Node_stmtContext):
        pass

    # Exit a parse tree produced by DOTParser#node_stmt.
    def exitNode_stmt(self, ctx:DOTParser.Node_stmtContext):
        pass


    # Enter a parse tree produced by DOTParser#node_name.
    def enterNode_name(self, ctx:DOTParser.Node_nameContext):
        pass

    # Exit a parse tree produced by DOTParser#node_name.
    def exitNode_name(self, ctx:DOTParser.Node_nameContext):
        pass


    # Enter a parse tree produced by DOTParser#port.
    def enterPort(self, ctx:DOTParser.PortContext):
        pass

    # Exit a parse tree produced by DOTParser#port.
    def exitPort(self, ctx:DOTParser.PortContext):
        pass


    # Enter a parse tree produced by DOTParser#name.
    def enterName(self, ctx:DOTParser.NameContext):
        pass

    # Exit a parse tree produced by DOTParser#name.
    def exitName(self, ctx:DOTParser.NameContext):
        pass



del DOTParser