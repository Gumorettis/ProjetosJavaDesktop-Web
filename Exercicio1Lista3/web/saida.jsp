<%-- 
    Document   : saida
    Created on : 16/10/2019, 22:53:18
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
        <h1>Dados do aluno: </h1>
        
        <h1> ${notas.calcularMedia()}</h1>
    </body>
</html>
