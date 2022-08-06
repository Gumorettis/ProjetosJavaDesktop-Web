<%-- 
    Document   : loginIndex
    Created on : 07/06/2020, 15:59:49
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
        
        <h1>TELA PARA REALIZAR LOGIN: </h1>
        
        <form action="${pageContext.request.contextPath}/LogarPessoa?acao=logar" method="POST">
            
            Usuário: <input type="text" size="20" name="login"/> <br>
            <br>
            
            Senha: <input type="password" size="20" name="senha"/> <br>
            <br>
            ${msg}
            
            <input type="submit" value="LOGAR"/>
        </form>
    </body>
</html>
