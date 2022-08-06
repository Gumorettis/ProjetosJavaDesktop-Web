<%-- 
    Document   : telaFN
    Created on : 05/06/2021, 17:45:08
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
        <h1>Tela do Funcionário !!</h1>
        
        Nome: <h2> ${dados.nomePessoa}</h2>
        
        Tipo: <h2> ${dados.tipo_pessoa} </h2>
        
        Status: <h2> ${dados.status_pessoa} </h2>
        
        <a href="${pageContext.request.contextPath}/Logar?acao=logout"> Encerrar Login </a>
    </body>
</html>
