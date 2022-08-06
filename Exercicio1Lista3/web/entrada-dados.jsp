<%-- 
    Document   : entrada-dados
    Created on : 16/10/2019, 22:16:18
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
        <h1>Digite as notas abaixo: </h1>
        
        <form action="Processamento" method="POST">
            Digite o nome do Aluno: <input type="text" size="15" name="nomeAluno"/> <br>    
            <br>
            
            Digite a nota 1: <input type="text" size="10" name="nota1"/> <br>
            <br>
            Digite a nota 2: <input type="text" size="10" name="nota2"/> <br>
            <br>
            Digite a nota 3: <input type="text" size="10" name="nota3"/> <br>
            <br>
            Digite a nota 4: <input type="text" size="10" name="nota4"/> <br>
            <br>
            
            <input type="submit" value="Calcular"/>
            
        </form>
    </body>
</html>
