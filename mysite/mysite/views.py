from django.http import HttpResponse
import datetime
def current_datetime(request):
    now=datetime.datetime.now()
    html = "<html><body>It is now %s.</body></html>" % now
    return HttpResponse(html)
def table(request):
    html=list()
    html.append("""<html>
        <head>
        </head>
        <body>
            <table border="2px solid red" >""")
    for i in range(11):
        html.append("""
                    <tr>
                        <td>2 {}s are</td>
                        <td> {}</td>
                    </tr>""".format(i,2*i))
    html.append("""
    </table>
    </body>
    </html>
    """)
    return HttpResponse("".join(x for x in html))
