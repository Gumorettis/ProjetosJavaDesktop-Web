<%-- 
    Document   : CadastrarSecretaria
    Created on : 26/05/2020, 15:41:24
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
        <h1>Cadastrar Secretária - Informe os seus dados a baixo</h1>
        
        <form action="CadastrarSecretaria" method="POST">
            
            Nome: <input type="text" name="nomeSecretaria"><br><br>
            CPF: <input type="text" name="cpfSecretaria"><br><br>
            Data de Nascimento: <input type="date" name="dataNascimentoSecretaria"><br><br>
            Gênero: <input type="radio" id="male" name="generoSecretaria" value="Masculino">
            <label for="male">Masculino</label>
            <input type="radio" id="female" name="generoSecretaria" value="Feminino">
            <label for="female">Feminino</label>
            <input type="radio" id="other" name="generoSecretaria" value="Outro">
            <label for="other">Outro</label><br><br>
            Endereco: <input type="text" name="enderecoSecretaria"><br><br>
            Bairro: <input type="text" name="bairroSecretaria"><br><br>
            Cidade: <input type="text" name="cidadeSecretaria"><br><br>
            CEP: <input type="text" name="cepSecretaria"><br><br>
            Telefone: <input type="text" name="telefoneSecretaria"><br><br>
            Celular: <input type="text" name="celularSecretaria"><br><br>
            Email: <input type="email" name="emailSecretaria"><br><br>
            Senha:<input type="password" name="senhaSecretaria"><br><br>  

            <input type="submit" value="Cadastrar"><br><br>
            ${msg}
        
        
    </body>
</html>
