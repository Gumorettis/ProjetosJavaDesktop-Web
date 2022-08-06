<%-- 
    Document   : CadastrarCliente
    Created on : 30/10/2019, 23:48:10
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
        <h1>Insira os dados abaixo: </h1>
        
        <form action="CadastrarCliente" method="POST">
        Nome Cliente: <input type="text" size="15" name="nomeCliente"/> <br>
            <br>
        Telefone: <input type="text" size="10" name="telefoneCliente"/> <br>
            <br>
        CPF: <input type="text" size="15" name="cpfCliente"/> <br>
            <br>
            
        <input type="submit" value="Cadastrar"/>  ${msg}
        
        </form>
    </body>
</html>
