import sys
import antlr4
from DOTParser import DOTParser
from DOTParserListener import DOTParserListener
import networkx as nx
import matplotlib.pyplot as plt


class GraphDOTListener(DOTParserListener):
    def __init__(self):
       self.g = None
       self.node_att={}
       self.edge_att={}
    
    def enterGraph(self, ctx:DOTParser.GraphContext):
        if ctx.GRAPH() is not None:
            self.g  = nx.Graph() 
        elif ctx.DIGRAPH() is not None:
            self.g = nx.DiGraph()
        # label property specify the name of the graph
        self.g.graph['label'] = ctx.name().getText()


    def exitEdge_stmt(self, ctx:DOTParser.Edge_stmtContext):
        if ctx.node_name() is not None:
            first_node = ctx.node_name().getText()
            for second_node in ctx.edgeRHS().nodes:
                if ctx.attr_list():
                    attrs = self.edge_att.copy()
                    attrs.update(ctx.attr_list().attrs)
                else:
                    attrs = self.edge_att
                self.g.add_edge(first_node,second_node,**attrs)
                first_node = second_node
    
    def exitEdgeRHS(self, ctx:DOTParser.EdgeRHSContext):
        ctx.nodes=[]

        if ctx.node_name() is not None:
            ctx.nodes.append(ctx.node_name().getText())
            if ctx.edgeRHS() is not None:
                ctx.nodes += ctx.edgeRHS().nodes
    
    def exitAttr_stmt(self, ctx:DOTParser.Attr_stmtContext):
        if ctx.NODE() is not None:
            for k,v in ctx.attr_list().attrs.items():
                self.node_att[k] = v 
        elif ctx.EDGE() is not None:
            for k,v in ctx.attr_list().attrs.items():
                self.edge_att[k] = v
        else:
            for k,v in ctx.attr_list().attrs.items():
                self.g.graph[k] = v
            
    def exitNode_stmt(self, ctx:DOTParser.Node_stmtContext):
        if ctx.attr_list():
            attrs = self.node_att.copy()
            attrs.update(ctx.attr_list().attrs)
        else:
            attrs = self.node_att

        self.g.add_node(ctx.node_name().getText(),**attrs)

    def exitAttr_list(self, ctx:DOTParser.Attr_listContext):
        ctx.attrs = {}
        if ctx.a_list() is not None:
            ctx.attrs.update(ctx.a_list().attrs)
            if ctx.attr_list() is not None:
                ctx.attrs.update(ctx.attr_list().attrs)
    
    def exitA_list(self, ctx:DOTParser.A_listContext):
        ctx.attrs = {}
        ctx.attrs[ctx.name()[0].getText()] = ctx.name()[1].getText()
        if ctx.a_list() is not None:
            ctx.attrs.update(ctx.a_list().attrs)
    
    def show_graph(self):
        color_map = []
    
        for node in self.g:
            color= self.g.nodes[node].get('color')
            if color is not None:
                color_map.append(color)
            else:
                color_map.append('gray')
        edge_color_map = []
        for edge in self.g.edges:
            color= self.g[edge[0]][edge[1]].get('color')
            if color is not None:
                edge_color_map.append(color)
            else:
                edge_color_map.append('gray')
        weights = nx.get_edge_attributes(self.g, 'weight')
        print(self.g.adj)
        pos = nx.spring_layout(self.g)
        nx.draw(self.g,pos, node_color=color_map, edge_color=edge_color_map, with_labels=True)
        nx.draw_networkx_edge_labels(self.g,pos,edge_labels= weights)
        plt.title(label = self.g.graph['label'])
        plt.show()