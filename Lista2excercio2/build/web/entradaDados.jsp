<%-- 
    Document   : entradaDados
    Created on : 14/08/2019, 12:36:51
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
        
        <form action="processamento" method="POST">
            
        Nome do aluno: <input type="text" size="15" name="nome"/><br>
        <br>
        
        Nota 1: <input type="number" size="10" min="0" name="nota1"/> <br>
        <br>
        
        Nota 2: <input type="number" size="10" min="0" name="nota2"/> <br>
        <br>
        
        Nota 3: <input type="number" size="10" min="0" name="nota3"/><br>
        <br>
        
        Nota 4: <input type="number" size="10" min="0" name="nota4"/><br>
        <br>
        
        <input type="submit" value="Calcular"/>
        
        </form>
    </body>
</html>
