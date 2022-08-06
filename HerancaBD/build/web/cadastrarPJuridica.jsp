<%-- 
    Document   : cadastrarPJuridica
    Created on : 31/03/2021, 12:17:01
    Author     : gusta
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Cadastrar Pessoa Juridica </title>
    </head>
    <body>
       <form action="CadastrarPJuridica" method="POST">
           
           
            ID: <input type="text" size="10" name="id" visable="false" readonly="true" value="${pessoaj.idPessoa}"/> <br> 
            <br>
            
            Nome: <input type="text" size="15" name="nome" value="${pessoaj.nomePessoa}"/> <br>
            <br>
            
            Endereco: <input type="text" size="15" name="endereco" value="${pessoaj.endereco}"/> <br>
            <br>
            
            Telefone: <input type="text" size="15" name="telefone" value="${pessoaj.telefone}"/> <br>
            <br>
            
            CNPJ: <input type="text" size="15" name="cnpj" value="${pessoaj.cnpj}"/> <br>
            <br>
            
            Capital: <input type="text" size="15" name="capital" value="${pessoaj.capital}"/> <br>
            <br>
            
            Login: <input type="text" size="15" name="login" value="${pessoaj.login_pessoa}"/> <br>
            <br>
            
            Senha: <input type="password" size="15" name="senha" value="${pessoaj.senha_pessoa}"/> <br>
            <br>
           
            <input type="submit" value="Enviar Dados"/>
            <br>
            
            ${msg}
        </form>
        
        <table border="3">
            
            <h2>Listagem de dados Pessoa Juridica</h2>
            
            <thead>
                <tr>
                    
                    <th>ID Pessoa Juridica</th>
                    <th>Nome Pessoa Juridica</th>
                    <th>Endereco Pessoa Juridica</th>
                    <th>Telefone Pessoa Juridica</th>
                    <th>CNJP Pessoa Juridica</th>
                    <th>Capital Pessoa Juridica</th>
                    <th> Tipo </th>
                    <th colspan="2">Opções</th>
                </tr>
            </thead>
            
            <tbody>
                    
            <c:forEach var="pessoaj" items="${pjuridica}">
                
            <tr>
                
            <td>${pessoaj.idPessoa}</td>
            <td>${pessoaj.nomePessoa}</td>
            <td>${pessoaj.endereco}</td>
            <td>${pessoaj.telefone}</td>
            <td>${pessoaj.cnpj}</td>
            <td>${pessoaj.capital}</td>
            <td>${pessoaj.tipo_pessoa}</td>
            
            <td><a href="${pageContext.request.contextPath}/ExcluirPJuridica?idPessoa=${pessoaj.idPessoa}"> Excluir </a></td>
            <td><a href="${pageContext.request.contextPath}/CarregarPJuridica?idPessoa=${pessoaj.idPessoa}"> Alterar </a></td>
            
                
            </c:forEach>
            </tr>
           
            </tbody>
            
        </table>
            
        <a href="paginaPrincipal.jsp">Retornar</a>
    </body>
</html>
