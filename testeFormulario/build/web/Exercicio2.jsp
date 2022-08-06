<%-- 
    Document   : Exercicio2
    Created on : 06/06/2021, 13:22:47
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de Investimentos</title>

        <style> 
            #btn{
                background-color: #4CAF50;
                border: none;
                color: white;
                padding: 16px 32px;
                text-decoration: none;
                margin: 2px 2px;
            }
        </style>

    </head>
    <body>
        <h1>Digite as informações referente ao investimento : </h1>

        <form action="Exercicio2" method="POST">
            <label>Digite seu nome: </label> <input type="text" size="15" name="nome"/><br>
            <br>

            <label>Selecione a sua data de nascimento: </label>
            <input type="date" name="dataNascimento"/>
            <br> 
            <br>

            <label>Selecione a quantidade que deseja investir(100 a 20.000): </label><br>
            <input type="range" name="valorInvestimento" min="100" max="20000"/>

            <br>
            <br>

            <label> Selecione o tipo de investimento: </label> <br>
            <p> Ações(Média de 20% - Alto risco) <input type="radio" name="grupo1"  value="acao"/> <br> </p>
            <p> Titulo do Tesouro(Média de 10% - Risco Moderado) <input type="radio" name="grupo1" value="titulo"/> <br> </p>
            <p> Poupança(Média de 5% - Risco baixo) <input type="radio" name="grupo1"  value="poup"/> <br> </p>

            <br>

            <input type="submit" value="Simular" id="btn"/>

        </form>

        <h2>Resumo da Simulação: </h2>

        <p> Nome: ${nome}</p>
        <p> Data de Nascimento: ${dataNascimento}</p> 
        <p> Tipo do Investimento: ${tipoInvest}</p> 
        <p> Total Investido: R$ ${valorInvestido}</p> 
        <p> Valor do Retorno financeiro: R$ ${retorno}</p> 
        <p> Valor Final após rendimento: R$ ${valorFinal}</p>

    </body>
</html>
