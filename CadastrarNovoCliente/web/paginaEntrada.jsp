<%-- 
    Document   : paginaEntrada
    Created on : 11/11/2020, 22:27:26
    Author     : gusta
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entrada dos dados</title>
    </head>
    <body>
        <h1>Digite os dados abaixo para serem cadastrados: </h1>
        
        <form action="CadastrarClienteCTR" method="POST">
            
            <input type="hidden" size="10" name="idCliente" value="${cliente.idCliente}"/>
            <br>
            
            Nome: <input type="text" size="15" name="nomeCliente" value="${cliente.nomeCliente}" /> <br>
            <br>
            
            RG: <input type="text" size="15" name="rgCliente" value="${cliente.rgCliente}"/> <br>
            <br>
            
            Idade: <input type="text" size="10" name="idadeCliente" value="${cliente.idadeCliente}"/> <br>
            <br>
            
            telefone: <input type="text" size="15" name="telefoneCliente" value="${cliente.telefoneCliente}"/> <br>
            <br>
            
            <input type="submit" value="CADASTRAR"/> <br>
            
            <h1> ${msg2}</h1>
            
            <h1> ${msg} </h1>
            
        </form>
            
    <%--CRIAR UMA TABELA PARA EXIBIÇÃO DOS DADOS --%>
    
    <table border="2" cellspacing=0 class="">
        
        <h1>Lista de todos Clientes Cadastrados : </h1>
        
        <thead>
            
            <tr>
                
                <th>ID Cliente </th>
                <th>Nome Cliente </th>
                <th>RG Cliente </th>
                <th>Idade Cliente </th>
                <th>Telefone Cliente </th>
                <th colspan="2"> Editar </th>
                
            </tr>
            
        </thead>
        
        <tbody>
            
            <c:forEach var="cliente" items="${listaCliente}">
            <tr>
            
                <td>${cliente.idCliente}</td>
                <td>${cliente.nomeCliente}</td>
                <td>${cliente.rgCliente}</td>
                <td>${cliente.idadeCliente}</td>
                <td>${cliente.telefoneCliente}</td>
                
                <td> <a href="${pageContext.request.contextPath}/ExcluirCliente?idCliente=${cliente.idCliente}"> Excluir </a> </td>
                <td> <a href="${pageContext.request.contextPath}/CarregarCliente?idCliente=${cliente.idCliente}"> Alterar </a></td>
                
            </tr>
                
            </c:forEach>
            
        </tbody>
        
    </table>
    ${msgExcluir}
    
    <h1> <a href="${pageContext.request.contextPath}/listarClienteNome.jsp"> Listagem de Cliente por nome ! </a> </h1>
        
    </body>
</html>
