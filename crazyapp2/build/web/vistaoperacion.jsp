<%-- 
    Document   : vistaoperacion
    Created on : 10-oct-2018, 19:49:37
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
        <h1>Hello Manu!</h1>
        <form action="CrazyController" method="POST">
      Nombre:
      <input type="text" name="usuario" required><br>
      Numero 1:
      <input type="text" name="num1" required><br>
      Numero 2:
      <input type="text" name="num2" required><br>
      
      <input type="hidden" name="operacion" value="suma">
      <br>
      <input type="submit" value="Confirmar">
  </form>
    </body>
</html>
