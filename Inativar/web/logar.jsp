<%-- 
    Document   : logar
    Created on : 05/06/2021, 17:31:57
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de Login</title>
    </head>
    <body>
        <h1>Realize seu login abaixo: </h1>
        
        <h2>Entre com o usuário e senha abaixo: </h2>
        
        <form action="${pageContext.request.contextPath}/Logar?acao=logar" method="POST">
            
            Usuário: <input type="text" size="25" name="login"/> <br>
            <br>
            
            Senha: <input type="password" size="25" name="senha"/> <br>
            <br>
            
            <input type="submit" value="LOGAR"/>
            <br>
            
            <h2> ${msg}</h2>
        </form>
        
        <a href="cadastrarAdm.jsp">Retornar</a>
        
    </body>
</html>
