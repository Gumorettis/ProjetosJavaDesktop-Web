<%-- 
    Document   : telaPJ
    Created on : 28/04/2021, 20:36:09
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina da Pessoa Juridica</title>
    </head>
    <body>
        <h2>Seja bem vinda(o) a tela da Pessoa Juridica </h2>
        
        <h3> Logado como empresa: ${dadosPessoa.nomePessoa} </h3>
        
        <h3> O seu login é: ${dadosPessoa.login_pessoa} </h3>
        
        <br>
        
        <a href="${pageContext.request.contextPath}/LogarPessoa?acao=logout"> Encerrar Login </a>
        
    </body>
</html>
