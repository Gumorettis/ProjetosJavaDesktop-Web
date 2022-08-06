<%-- 
    Document   : entradaDados
    Created on : 05/10/2020, 21:27:31
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entrada de Dados</title>
    </head>
    <body>
        <h1>Digite 2 números abaixo: </h1>
        
        <form action="Processamento" method="POST">
            Numero 1: <input type="text" size="15" name="num1"/> <br>
            <br>
            
            Numero 2: <input type="text" size="15" name="num2"/> <br>
            <br>
            
            <input type="submit" value="Enviar Dados"/>
            
        </form>
        
    </body>
</html>
