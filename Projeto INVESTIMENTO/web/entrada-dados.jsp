<%-- 
    Document   : entrada-dados
    Created on : 07/10/2019, 21:23:10
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
        <h1> Digite os dados abaixo: </h1>
        
        <form action="Processar" method="POST">
            
            Nome do investidor: <input type="text" size="15" name="nome"/> <br>
            <br>
            CPF do investidor: <input type="text" size="10" name="cpf"/> <br>
            <br>
            idade do investidor: <input type="text" size="10" name="idade"/> <br>
            <br>
            valor do investimento: <input type="text" size="10" name="valorInvestimento"/><br>
            
            <br>
            
            <input type="submit" value="Calcular"/> 
            
        </form>
    </body>
</html>
