<%-- 
    Document   : cadastrarPublicacao
    Created on : 16/05/2021, 15:33:34
    Author     : gusta
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Publicação</title>
    </head>
    <body>
        
        <h1>Cadastre uma publicação abaixo: </h1>
        
        <form action="CadastrarPublicacao" method="POST">

            ID <input type="text" name="idPublicacao" readonly="true" value="${carregarPublicacaoAlteracao.idPublicacao}"/> <br>
            <br>

            Descrição: <input type="text" name="descricao" size="25" value="${carregarPublicacaoAlteracao.descricao}"/> <br>
            <br>

            Publicador: 
            <select name="idPublicador">
                <!-- Criando um select para exibir todos as pessoas Fisicas cadastradas que aparecem na 
                lista já criada no listar Pessoa Fisica-->
                
                <c:forEach var="pessoaFisica" items="${pessoasF}">
<option value="${pessoaFisica.idPessoa}" ${pessoaFisica.idPessoa==carregarPublicacaoAlteracao.idPublicador.idPessoaFisica?'selected':''}> ${pessoaFisica.nomePessoa}</option>                    
                </c:forEach>
                    
            </select>

            <br> <br>

            <input type="submit" value="CADASTRAR"/>
            ${msg}
        </form>
        
        <table border="3">
            <h1>Listagem de Publicações</h1>

            <thead>
                <tr>

                    <th> ID Publicação </th>
                    <th> Descrição </th>
                    <th> Publicador </th>
                    <th colspan="2"> Editar </th>
                </tr>
            </thead>
            
            <tbody>
                
                <c:forEach var="pub" items="${publicacao}">
                    <tr>
                        
                        <td>${pub.idPublicacao}</td>
                        <td>${pub.descricao}</td>
                        <td>${pub.idPublicador.idPessoaFisica}</td>
                        
                        <td><a href="${pageContext.request.contextPath}/ExcluirPublicacao?idPublicacao=${pub.idPublicacao}"> Excluir </a></td>
                        <td><a href="${pageContext.request.contextPath}/CarregarPublicacao?idPublicacao=${pub.idPublicacao}"> Alterar </a></td>
                    </tr>
                    
                </c:forEach>
            </tbody>
            
        </table>
        <a href="paginaPrincipal.jsp">Retornar</a>
    </body>
</html>
