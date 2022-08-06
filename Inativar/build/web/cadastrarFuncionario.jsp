<%-- 
    Document   : cadastrarFuncionario
    Created on : 05/06/2021, 11:19:08
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Funcionario</title>
    </head>
    <body>
        <h1>Preencha o formulário abaixo: </h1>
        
        <form action="CadastrarFuncionario" method="POST">
            
            ID: <input type="text" size="10" name="id" readonly="true" /> <br> 
            <br>
            
            Nome: <input type="text" size="15" name="nome" /> <br>
            <br>
            
            Endereco: <input type="text" size="15" name="endereco" /> <br>
            <br>
            
            Telefone: <input type="text" size="15" name="telefone" /> <br>
            <br>
            
            CPF: <input type="text" size="15" name="cpf" /> <br>
            <br>
            
            Idade: <input type="text" size="15" name="idade" /> <br>
            <br>
            
            Login/usuário: <input type="text" size="15" name="login" /> <br>
            <br>
            
            Senha: <input type="password" size="15" name="senha" /> <br>
            <br>
            
            <input type="submit" value="Enviar Dados"/>
            <br>
            
            <h2> ${msg} </h2>
        </form>
        
        <a href="logar.jsp">Pagina de Login</a>
    </body>
</html>
