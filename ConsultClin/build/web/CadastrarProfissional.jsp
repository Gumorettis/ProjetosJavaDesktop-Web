<%-- 
    Document   : CadastrarProfissional
    Created on : 21/05/2020, 22:03:40
    Author     : Heitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ConsultClin</title>
    </head>
    <body>
        <h1>Cadastrar Profissional - Informe os seus dados a baixo</h1>
        <form action="CadastrarProfissional" method="POST">

            Nome: <input type="text" name="nomeProfissional"><br><br>
            CPF: <input type="text" name="cpfProfissional"><br><br>
            Data de Nascimento: <input type="date" name="dataNascimentoProfissional"><br><br>
            Gênero: <input type="radio" id="male" name="generoProfissional" value="Masculino">
            <label for="male">Masculino</label>
            <input type="radio" id="female" name="generoProfissional" value="Feminino">
            <label for="female">Feminino</label>
            <input type="radio" id="other" name="generoProfissional" value="Outro">
            <label for="other">Outro</label><br><br>
            Endereco: <input type="text" name="enderecoProfissional"><br><br>
            Bairro: <input type="text" name="bairroProfissional"><br><br>
            Cidade: <input type="text" name="cidadeProfissional"><br><br>
            CEP: <input type="text" name="cepProfissional"><br><br>
            Telefone: <input type="text" name="telefoneProfissional"><br><br>
            Celular: <input type="text" name="celularProfissional"><br><br>
            Área de atuação: <input type="text" name="areaAtuacaoProfissional"><br><br>
            Email: <input type="email" name="emailProfissional"><br><br>
            Senha:<input type="password" name="senhaProfissional"><br><br>  

            <input type="submit" value="Cadastrar"><br><br>
            ${msg}



        </form>
    </body>
</html>
