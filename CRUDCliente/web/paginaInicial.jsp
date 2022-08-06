<%-- 
    Document   : paginaInicial
    Created on : 17/05/2020, 14:10:29
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
        <h1>Selecione um tipo de cadastrado abaixo: </h1>
        
        <h1> <a href="cadastrarFuncionario.jsp"> Cadastrar Funcionario </a> </h1> <br>
        <br>
        
        <h1> <a href="cadastrarResponsavel.jsp"> Cadastrar Responsavel </a> </h1>
        
        <h1> <a href="${pageContext.request.contextPath}/loginIndex.jsp"> Logar </a> </h1>
        
        <h1> <a href="${pageContext.request.contextPath}/ListarOcorrencia"> Cadastrar Ocorrencia </a> </h1>
    </body>
</html>
