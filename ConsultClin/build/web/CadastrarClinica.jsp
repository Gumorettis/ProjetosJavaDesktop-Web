<%-- 
    Document   : CadastrarClinica
    Created on : 13/05/2020, 21:32:19
    Author     : Heitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="">
        <title>ConsultClin</title>
    </head>
    <body>
        <h1>Cadastro de Clínica</h1>
        <form action="CadastrarClinica" method="POST">

            Nome da Clínica: <input type="text" name="nomeClinica"><br><br>
            CNPJ da Clínica: <input type="text" name="cnpjClinica"><br><br>
            Endereço: <input type="text" name="enderecoClinica"><br><br>
            Bairro: <input type="text" name="bairroClinica"><br><br>
            Cidade: <input type="text" name="cidadeClinica"><br><br>
            Telefone da Clínica: <input type="text" name="telefoneClinica"><br><br>
            Especificação: <input type="text" name="especificacaoClinica"><br><br>

            <input type="submit" value="Cadastrar"><br><br>
            ${msg}

        </form>

    </body>
</html>
