<%-- 
    Document   : entrada-dados
    Created on : 17/08/2019, 21:51:00
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
        <h1>Digite seus dados abaixo: </h1>
        
        <form action="processamentoAluno" method="POST">
        Nome: <input type="text" size="15" name="nome"/> <br>
        <br>
        
        Curso: <input type="text" size="15" name="curso"/> <br>
        <br>
        
        Idade: <input type="text" size="10" name="idade"/> <br>
        <br>
        
        <input type="submit" value="Enviar"/> 
               
        </form>
    </body>
</html>
