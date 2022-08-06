<%-- 
    Document   : entrada-dados
    Created on : 11/12/2019, 16:28:09
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
        <h1>Digite os dados do aluno abaixo: </h1>
        
        <form action="CadastrarAluno" method="POST">
            
            Nome do Aluno: <input type="text" size="15" name="nomeAluno"/> <br>
            <br>
            
            Semestre do Aluno: <input type="text" size="20" name="semestre"/> <br>
            <br>
            
            Nota 1: <input type="text" size="10" name="nota1"/> <br>
            <br>
            
            Nota 2: <input type="text" size="10" name="nota2"/> <br>
            <br>
            
            Nota 3: <input type="text" size="10" name="nota3"/> <br>
            <br>
            
            Nota 4: <input type="text" size="10" name="nota4"/> <br>
            <br>
            
            Media: <input type="text" size="10" value="${media}" placeholder="o campo vai ser preenchido ao cadastrar no banco de dados" disable/>
            <br>
            
            <input type="submit" value="Cadastrar ALUNO "/>
            <br>
            <p>${msg}</p>
            
        </form>
    </body>
</html>
