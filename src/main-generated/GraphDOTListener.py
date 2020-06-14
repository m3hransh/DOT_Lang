import sys
import antlr4
from DOTParser import DOTParser
from DOTParserListener import DOTParserListener
import networkx as nx
import matplotlib.pyplot as plt
import plotly.graph_objects as go

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
        if ctx.name() is not None:
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

    def show(self):
        '''Return plotty Figure for dash graph component'''
        G = self.g
        traceRecode = []  # contains edge_trace, node_trace, middle_node_trace
        ############################################################################################################################################################
        # create proper postion for nodes 
        pos = nx.drawing.layout.spring_layout(G)
        for node in G.nodes:
            # store them in pos att
            G.nodes[node]['pos'] = list(pos[node])

        index = 0
        for edge in G.edges:
            x0, y0 = G.nodes[edge[0]]['pos']
            x1, y1 = G.nodes[edge[1]]['pos']
            # if the weight att doesn't exist it gives it weight of 1
            weight = float(G.edges[edge]['weight']) if G.edges[edge].get('weight') else 1
            color =  G.edges[edge]['color'] if G.edges[edge].get('color') else 'gray'
            trace = go.Scatter(x=tuple([x0, x1, None]), y=tuple([y0, y1, None]),
                               mode='lines',
                               line={'width': weight},
                               marker=dict(color=color),
                               line_shape='spline',
                               opacity=1)
            traceRecode.append(trace)
        ###############################################################################################################################################################
        node_trace = go.Scatter(x=[], y=[], hovertext=[], text=[], mode='markers+text', textposition="bottom center",
                                hoverinfo="text", marker={'size': 50, 'color': []})

        index = 0
        for node in G.nodes():
            x, y = G.nodes[node]['pos']
            hovertext = str(G.nodes[node])
            text = node
            node_trace['x'] += tuple([x])
            node_trace['y'] += tuple([y])
            node_trace['hovertext'] += tuple([hovertext])
            node_trace['text'] += tuple([text])
            node_trace['marker']['color'] += tuple([G.nodes[node]['color'] if G.nodes[node].get('color') else 'gray'])
            

        traceRecode.append(node_trace)

        fig = go.Figure(data=traceRecode,
             layout=go.Layout(
                plot_bgcolor= "#111111",
                paper_bgcolor= '#111111',
                titlefont_size=16,
                showlegend=False,
                hovermode='closest',
                margin=dict(b=20,l=5,r=5,t=40),
                annotations=[ dict(
                    text= G[edge[0]][edge[1]]['weight'] if G[edge[0]][edge[1]].get('weight') else '',
                    ax=(G.nodes[edge[0]]['pos'][0] + G.nodes[edge[1]]['pos'][0]) / 2,
                                    ay=(G.nodes[edge[0]]['pos'][1] + G.nodes[edge[1]]['pos'][1]) / 2, axref='x', ayref='y',
                                    x=(G.nodes[edge[1]]['pos'][0]*3  + G.nodes[edge[0]]['pos'][0]) / 4,
                                    y=(G.nodes[edge[1]]['pos'][1]*3  + G.nodes[edge[0]]['pos'][1]) / 4, xref='x', yref='y',
                    showarrow=True if nx.is_directed(G) else False,
                    arrowhead=3,
                    arrowsize=4,
                    arrowwidth=1,
                    
                     ) for edge in G.edges],
                     font=dict(color='#7FDBFF'),
                xaxis=dict(showgrid=False, zeroline=False, showticklabels=False),
                yaxis=dict(showgrid=False, zeroline=False, showticklabels=False))
                )
        return fig