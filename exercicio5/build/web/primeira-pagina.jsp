<%-- 
    Document   : primeira-pagina
    Created on : 12/08/2019, 14:47:15
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
        <h1>Digite os numeros abaixo: </h1>
        
         <form action="processamento" method="POST">
            Digite o 1 numero: <input type="text" size="15" name="num1"/> <br>
            <br>
            
            Digite o 2 numero: <input type="text" size="10" name="num2"/> <br>
            <br>
            
            <input type="submit" value="Calcular"/>
        </form>
        
    </body>
</html>
