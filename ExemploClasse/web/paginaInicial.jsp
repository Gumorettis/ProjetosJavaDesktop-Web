<%-- 
    Document   : paginaInicial
    Created on : 25/10/2020, 16:32:02
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

        <form action="ProcessamentoDados" method="POST">
            Nome: <input type="text" size="15" name="nome"/> <br>
            <br>
            cpf: <input  type="text" size="15" name="cpf"/> <br>
            <br>
            Idade: <input  type="text" size="15" name="idade"/> <br>
            <br>
            Digite valor Investido <input  type="text" size="15" name="valor"/> <br>
            <br>
            
            <input type="submit" value="Calcular"/>
        </form>

    </body>
</html>
