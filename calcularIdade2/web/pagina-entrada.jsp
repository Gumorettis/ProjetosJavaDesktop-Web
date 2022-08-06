<%-- 
    Document   : pagina-entrada
    Created on : 30/09/2019, 21:30:44
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
        <h1>Digite os dados abaixo: </h1>
        
        <form action="Processar" method="POST">
        Nome: <input type="text" size="15" name="nome"/> <br>
        <br>
        Ano de nascimento: <input type="text" size="10" name="ano"/> <br>
        <br>
        
        <input type="submit" value="Calcular"/>
        
        </form>
    </body>
</html>
