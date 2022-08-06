<%-- 
    Document   : saida
    Created on : 30/09/2019, 22:10:44
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
        <h1>Dados da idade: </h1>
        
        <h1>Nome: ${idade.nome}</h1>
        <h1>${idade.calcularIdade()}</h1>
        
        
    </body>
</html>
