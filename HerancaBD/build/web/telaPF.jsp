<%-- 
    Document   : telaPF
    Created on : 28/04/2021, 20:26:42
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina da Pessoa Fisica</title>
    </head>
    <body>
        <h2>Seja bem vinda(o) a tela da Pessoa Fisica </h2>
        
        <h3> Você esta logado como: ${dadosPessoa.nomePessoa} </h3>
        
        <h3> O seu login é: ${dadosPessoa.login_pessoa} </h3>
        
        <br>
        
        <input type="text" name="id" value="${dadosPessoa.idPessoa}"/>
        
        <a href="${pageContext.request.contextPath}/LogarPessoa?acao=logout"> Encerrar Login </a>
    </body>
</html>
