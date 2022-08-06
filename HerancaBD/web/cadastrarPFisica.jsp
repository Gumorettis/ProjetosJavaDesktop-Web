<%-- 
    Document   : cadastrarPFisica
    Created on : 03/03/2021, 10:37:03
    Author     : gusta
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Pessoa fisica</title>
        
    </head>
    <body>
        
        <form action="CadastrarPFisica" method="POST">
            
            ID: <input type="text" size="10" name="id" readonly="true" value="${pessoaf.idPessoa}"/> <br> 
            <br>
            
            Nome: <input type="text" size="15" name="nome" value="${pessoaf.nomePessoa}"/> <br>
            <br>
            
            Endereco: <input type="text" size="15" name="endereco" value="${pessoaf.endereco}"/> <br>
            <br>
            
            Telefone: <input type="text" size="15" name="telefone" value="${pessoaf.telefone}"/> <br>
            <br>
            
            CPF: <input type="text" size="15" name="cpf" value="${pessoaf.cpf}"/> <br>
            <br>
            
            Idade: <input type="text" size="15" name="idade" value="${pessoaf.idade}"/> <br>
            <br>
            
            Login/usuário: <input type="text" size="15" name="login" value="${pessoaf.login_pessoa}"/> <br>
            <br>
            
            Senha: <input type="password" size="15" name="senha" value="${pessoaf.senha_pessoa}"/> <br>
            <br>
            
            <input type="submit" value="Enviar Dados"/>
            <br>
            
            ${msg}
        </form>
        
        <table border="3">
            
            <h2>Listagem de dados Pessoa Fisica</h2>
            
            <thead>
                <tr>
                    
                    <th>ID Pessoa Fisica</th>
                    <th>Nome Pessoa Fisica</th>
                    <th>Endereco Pessoa Fisica</th>
                    <th>Telefone Pessoa Fisica</th>
                    <th>CPF Pessoa Fisica</th>
                    <th>Idade Pessoa Fisica</th>
                    <th> Tipo </th>
                    <th colspan="2">Opções</th>
                </tr>
            </thead>
            
            <tbody>
                
            <c:forEach var="pessoaf" items="${pfisica}">
                
            <tr>
                
            <td>${pessoaf.idPessoa}</td>
            <td>${pessoaf.nomePessoa}</td>
            <td>${pessoaf.endereco}</td>
            <td>${pessoaf.telefone}</td>
            <td>${pessoaf.cpf}</td>
            <td>${pessoaf.idade}</td>
            <td>${pessoaf.tipo_pessoa}</td>
            
            <td><a href="${pageContext.request.contextPath}/ExcluirPFisica?idPessoa=${pessoaf.idPessoa}"> Excluir </a></td>
            <td><a href="${pageContext.request.contextPath}/CarregarPFisica?idPessoa=${pessoaf.idPessoa}"> Alterar </a></td>
            
                
            </c:forEach>
            
            </tr>
            </tbody>
            
        </table>
        
        <a href="paginaPrincipal.jsp">Retornar</a>
        
    </body>
</html>
