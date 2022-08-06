<%-- 
    Document   : resultadoAluno
    Created on : 17/08/2019, 22:17:07
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Dados</title>
    </head>
    <body>
        <h1>Dados do aluno: </h1>
        <h1>Nome: ${aluno.nome} </h1>
        <h1>Curso: ${aluno.curso} </h1>
        <h1>Idade: ${aluno.idade} </h1>
        
        <h2>Dados: ${aluno.mostrarDados()}</h2>
    </body>
</html>
