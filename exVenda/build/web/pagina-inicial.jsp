<%-- 
    Document   : pagina-inicial
    Created on : 18/08/2019, 22:07:40
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
        <h1>Digite os valores abaixo: </h1>
        
        <form action="processarVenda" method="POST">
        Nome do produto: <input type="text" size="15" name="nome_produto"/> <br>
        <br>
        
        Nome do vendedor: <input type="text" size="15" name="vendedor"/> <br>
        <br>
        
        Valor da venda: <input type="text" size="12" name="valor"/> <br>
        <br>
        
        <input type="submit" value="Enviar"/>
        
        </form>
        
    </body>
</html>
