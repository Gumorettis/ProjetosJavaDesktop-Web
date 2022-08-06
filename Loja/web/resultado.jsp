<%-- 
    Document   : resultado
    Created on : 23/07/2019, 14:37:48
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cliente Cadastro</h1>
         <h1>${cliente.nome}</h1>
         <h1>${cliente.email}</h1> 
         <h1>${cliente.mostrar()}</h1>
         <h1>${cliente.soma()}</h1>
         
    </body>
</html>
