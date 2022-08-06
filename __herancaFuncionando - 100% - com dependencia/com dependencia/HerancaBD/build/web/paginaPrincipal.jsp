<%-- 
    Document   : paginaPrincipal
    Created on : 16/05/2021, 15:23:34
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
        
        <h1>Selecione um tipo de opção abaixo: </h1>
        
        <h1> <a href="${pageContext.request.contextPath}/ListarPFisica"> Cadastrar Pessoa Fisica </a> </h1>
        
        <h1> <a href="cadastrarPJuridica.jsp"> Cadastrar Pessoa Juridica </a> </h1>
        
        <h1> <a href="${pageContext.request.contextPath}/login.jsp"> Logar </a> </h1>
        
        <h1> <a href="${pageContext.request.contextPath}/ListarPublicacao"> Cadastrar Publicação </a> </h1>
        
    </body>
</html>
