<%-- 
    Document   : cadastrar-cliente
    Created on : 11/02/2020, 22:35:35
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
        
        <form action="CadastrarCliente" method="POST">
        Nome cliente: <input type="text" size="15" name="nomeCliente"/> <br>
        <br>
        CPF: <input type="text" size="10" name="cpfCliente"/> <br>
        <br>
        Idade cliente: <input type="text" size="10" name="idadeCliente"/> <br>
        <br>
        Endereco cliente: <input type="text" size="15" name="enderecoCliente"/> <br>
        <br>
        
        <input type="submit" value="CadastarCliente"/>
        
        ${msg}
        
        </form>
    </body> 
</html>
