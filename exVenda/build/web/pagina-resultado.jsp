<%-- 
    Document   : pagina-resultado
    Created on : 18/08/2019, 22:19:10
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
        <h1>Dados da venda: </h1>
        
        <h1> Nome do vendedor: ${venda.nome_vendedor} </h1>
        <h1> Nome do produto: ${venda.produto}</h1>
        <h1> Valor da venda: ${venda.valor}</h1>
        
        <h1>Dados: ${venda.mostrarDados()}</h1>
        
    </body>
</html>
