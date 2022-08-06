<%-- 
    Document   : inativarFuncionario
    Created on : 05/06/2021, 18:26:40
    Author     : gusta
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Funcionário</title>
    </head>
    <body>
        <h1>Pagina para Editar dados do Funcionario</h1>
        
        <table border="3">
            
            <h2>Listagem de dados do Funcionário</h2>
            
            <thead>
                <tr>
                    
                    <th>ID</th>
                    <th>Nome Funcionário</th>
                    <th>Endereco</th>
                    <th>CPF</th>
                    <th>Idade</th>
                    <th>Tipo</th>
                    <th>Status</th>
                    <th colspan="2">Opções</th>
                </tr>
            </thead>
            
            <tbody>
                
            <c:forEach var="dados" items="${dadosFunc}">
            
            <tr>
                
            <td>${dados.idPessoa}</td>
            <td>${dados.nomePessoa}</td>
            <td>${dados.endereco}</td>
            <td>${dados.cpf}</td>
            <td>${dados.idade}</td>
            <td>${dados.tipo_pessoa}</td>
            <td>${dados.status_pessoa}</td>
            
            <td><a href="${pageContext.request.contextPath}/InativarFunc?idPessoa=${dados.idPessoa}"> Inativar </a></td>
            <td><a href="${pageContext.request.contextPath}/ExcluirFuncionario?idPessoa=${dados.idPessoa}"> Excluir </a></td>
            
            </c:forEach>
             
            </tr>
                
            </tbody>
                
    </body>
</html>
