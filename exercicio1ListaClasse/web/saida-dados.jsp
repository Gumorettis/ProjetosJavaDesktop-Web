<%-- 
    Document   : saida-dados
    Created on : 22/09/2019, 15:22:25
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
        <h1>Dados do Salário: </h1>
        
        <h1>Nome do Funcionário: ${salario.nomeFuncionario} </h1> 
        <h1>Salario Final líquido:  ${salario.calcularSalario()} reais. </h1> 
        
    </body>
</html>
