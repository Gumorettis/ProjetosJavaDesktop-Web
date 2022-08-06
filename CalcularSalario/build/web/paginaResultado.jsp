<%-- 
    Document   : paginaResultado
    Created on : 28/09/2020, 22:10:39
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de Resultado</title>
    </head>
    <body>
        <h1>Segue os dados do funcionário: </h1>
        
        <h1>********************************************************</h1>
        
        <h1>Nome do Funcionário é: ${nome} </h1>
        <h1>Quantidade de horas trabalhadas: ${horasTrabalhadas} </h1>
        <h1>O valor da Hora é: ${valorHora} </h1>
        <h1>O salario final do funcionário é: R$ ${valorSalario} </h1>
        <h1>Informação extra do salario: </h1>
        <h1>${msg}</h1>
        
        <h1>********************************************************</h1>
    </body>
</html>
