<%-- 
    Document   : cadastrarFuncionario
    Created on : 17/05/2020, 12:54:17
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
        <h1>Insira os dados abaixo: </h1>
        
        <form action="CadastrarFuncionario" method="POST">
            
       
        Id: <input type="text" size="10" name="idFunc" readonly="true"/> <br> 
        <br>
        
        Nome: <input type="text" size="15" name="nomeFunc"/> <br>
        <br>
        
        cpf: <input type="text" size="15" name="cpf"/> <br>
        <br>
        
        email: <input type="text" size="15" name="email"/> <br>
        <br>
        
        Login: <input type="text" size="15" name="login"/> <br>
        <br>
        
        senha: <input type="text" size="15" name="senha"/> <br>
        <br>
        
        telefone: <input type="text" size="15" name="telefone"/> <br>
        <br>
        
        <input type="submit" value="Cadastrar"/>
        
        ${mensagem}
        
        </form>
    </body>
</html>
