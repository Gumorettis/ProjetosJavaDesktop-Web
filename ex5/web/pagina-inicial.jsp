<%-- 
    Document   : pagina-inicial
    Created on : 19/08/2019, 22:26:13
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Entre com os numeros abaixo: </h1>
        
        <form action="Processamento" method="POST">
            
            Numero 1: <input type="text" size="10" name="num1"/> <br>
            <br>
            
            Numero 2: <input type="text" size="10" name="num2"/> <br>
            <br>
            
            <input type="submit" value="Calcular"/>
            
        </form>
        
    </body>
</html>
