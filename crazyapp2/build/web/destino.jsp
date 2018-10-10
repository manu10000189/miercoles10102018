<%-- 
    Document   : destino
    Created on : 10-oct-2018, 20:18:34
    Author     : Manu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Me ha llegado <% String usuario=(String)request.getAttribute("usuariojsp"); %></p>
        <h1>Hello World! <%=usuario%></h1>
    </body>
</html>
