<%-- 
    Document   : cadastrarResponsavel
    Created on : 17/05/2020, 14:14:20
    Author     : gusta
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="ListarResponsavel"></a>
        <h1>DIGITE OS DADOS ABAIXO PARA ADICIONAR UM NOVO RESPONSAVEL DO SISTEMA: </h1>
        
        <form action="CadastrarResponsavel" method="POST">
            
        Id: <input type="text" size="10" name="id" readonly="true" value="${responsavel.id_responsavel}" /> <br> 
        <br>
        
        Nome: <input type="text" size="15" name="nomeResp" required="required" value="${responsavel.nome_pessoa}"/> <br>
        <br>
        
        cpf: <input type="text" size="15" name="cpf" required="required" value="${responsavel.cpf_pessoa}"/> <br>
        <br>
        
        email: <input type="text" size="15" name="email" required="required" value="${responsavel.email_pessoa}"/> <br>
        <br>
        
        Login: <input type="text" size="20" name="login" required="required" value="${responsavel.login_pessoa}"/> <br>
        <br>
        
        senha: <input type="text" size="15" name="senha" required="required" value="${responsavel.senha_pessoa}"/> <br>
        <br>
        
        telefone: <input type="text" size="15" name="telefone" value="${responsavel.telefone_pessoa}"/> <br>
        <br>
        
        Nick do responsavel: <input type="text" size="15" name="nick" required="required" value="${responsavel.nickResponsavel}"/> <br>
        <br>
        
        <input type="submit" value="Salvar"/>
        
        ${mensagem}
          
        </form>
       
        <%-- CRIANDO TABELA DO RESPONSAVEL PARA LISTAGEM --%>
        
        <table border="2" cellspacing=0 class="tabelaResp">
            
            <h1>Listagem de Responsavel</h1>
            
            <thead>
                <tr>
                    
                    <th> ID Responsavel </th>
                    <th> Nome </th>
                    <th> CPF </th>
                    <th> Email </th>
                    <th> Login </th>
                    <th> senha </th>
                    <th> telefone </th>
                    <th> Nick </th>
                    <th colspan="2"> Editar </th>
                </tr>
            </thead>
            
            <tbody>
                
               <c:forEach var="responsavel" items="${resp}">
               <tr>
                    <td> ${responsavel.id_responsavel} </td>
                    <td> ${responsavel.nome_pessoa} </td>
                    <td> ${responsavel.cpf_pessoa} </td>
                    <td> ${responsavel.email_pessoa} </td>
                    <td> ${responsavel.login_pessoa} </td>
                    <td> ${responsavel.senha_pessoa} </td>
                    <td> ${responsavel.telefone_pessoa} </td>
                    <td> ${responsavel.nickResponsavel} </td>
                    <td><a href="${pageContext.request.contextPath}/ExcluirResponsavel?id_responsavel=${responsavel.id_responsavel}"> Excluir </a></td>
                    <td><a href="${pageContext.request.contextPath}/CarregarResponsavel?id_responsavel=${responsavel.id_responsavel}"> Alterar </a></td>
                </tr> 
                
            </c:forEach>
                
        </tbody>
        
        </table>
                
    </body>
</html>
