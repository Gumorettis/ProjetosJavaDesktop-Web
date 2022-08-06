<%-- 
    Document   : saida-dados
    Created on : 07/10/2019, 21:57:58
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
        <h1>Dados do Investimento: </h1>
        
        <h1>Nome do investidor: ${investimento.nomeInvestidor}</h1>
        <h1>CPF: ${investimento.cpf} </h1>
        <h1>Idade: ${investimento.idade} </h1>
        <h1>Valor Investido: ${investimento.valorInvestimento} </h1>
        <h1>Valores do redimento: </h1> <br>
        <h1>${investimento.calcularInvestimento()}</h1>
        
        
    </body>
</html>
