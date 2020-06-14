import sys
import antlr4
from DOTLexer import DOTLexer
from DOTParser import DOTParser
from GraphDOTListener import GraphDOTListener
import dash
from dash.dependencies import Input, Output
import dash_html_components as html
import dash_core_components as dcc
import plotly.graph_objects as go
from textwrap import dedent as d
import io
from DOTErrorListener import DOTErrorListener

colors = {
    'background': '#111111',
    'text': '#7FDBFF'
}
# base Figure for graph
fig = go.Figure(data=[],
             layout=go.Layout(
                plot_bgcolor= colors['background'],
                paper_bgcolor= colors['background'],
                titlefont_size=16,

                showlegend=False,
                hovermode='closest',
                margin=dict(b=20,l=5,r=5,t=40),
                annotations=[ dict(
                    showarrow=False,
                    xref="paper", yref="paper",
                    x=0.005, y=-0.002 ) ],
                font=dict(color=colors['text']),
                xaxis=dict(showgrid=False, zeroline=False, showticklabels=False),
                yaxis=dict(showgrid=False, zeroline=False, showticklabels=False))
                )


# This function is used in Callback for changeing textarea change
def main(data):

    chars = antlr4.InputStream(data)
    lexer = DOTLexer(chars)
    stream = antlr4.CommonTokenStream(lexer)
    parser = DOTParser(stream)
    

    error_listener = DOTErrorListener()
    lexer.removeErrorListeners()
    lexer.addErrorListener(error_listener)
    parser.removeErrorListeners()
    
    parser.addErrorListener(error_listener)
    tree = parser.graph()
   

    GraphDOT = GraphDOTListener()
    e=''
    try:
        walker = antlr4.ParseTreeWalker()
        walker.walk(GraphDOT, tree)
    
        f = GraphDOT.show()
    except Exception as err:
        f = fig
        e = err
    global error_message
    error_message = error_listener.msg+'\n'+str(e)

    return f

external_stylesheets = ['https://codepen.io/chriddyp/pen/bWLwgP.css']
app = dash.Dash(__name__, external_stylesheets=external_stylesheets)
app.title = "DOT Language"

styles = {
    'pre': {
        'border': 'thin lightgrey solid',
        'overflowX': 'scroll'
    }
}

app.layout =\
html.Div(children=[
    html.Div(className='row',children=[
        html.Div(className='eight columns',children=\
            dcc.Textarea(
                id='textarea',
                value='',
                style={'width': '100%', 'height': 300},)
        ),
        html.Div(
                className='four columns',
                children=[
                    html.Div(className='twelve columns',children=[
                    dcc.Markdown(d("""
                    Errors
                    """)),
                    html.Pre(id='error-data', style=styles['pre'])
                ],
                style={'height': '400px'})])]
    ),
    html.Div(children='Graph Representation', style={
        'textAlign': 'center',
        'color': colors['text'],
        'backgroundColor':colors['background']
    }),
    html.Div(className='row',children=[
        dcc.Graph(id='graph',figure=main(''))])
 ])

# When the textarea content change the graph and error message will be shown
@app.callback(
    [Output('graph', 'figure')
    ,Output('error-data', 'children')],
    [Input('textarea', 'value')]
)
def update_output(data):
    f = main(data)

    return f,error_message


if __name__ == "__main__":
    app.run_server(debug=True)