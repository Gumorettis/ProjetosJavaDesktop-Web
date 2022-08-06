<%-- 
    Document   : resultado-final
    Created on : 04/09/2019, 22:49:36
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
        <h1>Dados do cliente: </h1>
        
        <h1> Nome: ${cliente.nomeCliente}</h1>
        <h1> Telefone: ${cliente.telefone}</h1>
        <h1> Endereco: ${cliente.endereco}</h1>
        <h1> Idade: ${cliente.idade}</h1>
        
    </body>
</html>
