<%-- 
    Document   : CadastrarVenda
    Created on : 18/11/2019, 22:40:38
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
        <h1>Entre com os dados da Venda:</h1>
        
        <form action="CadastrarVenda" method="POST">
            
        Tipo Venda: <input type="text" name="tipoVenda" size="20"/> <br>
        <br>
        Valor da Venda: <input type="text" name="valorVenda" size="15"/> <br>
        <br>
        Descricao da Venda: <input type="text" name="descricaoVenda" size="20"/> <br>
        <br>
        
        <input type="submit" value="Cadastrar Venda"/>
        
        </form>
    </body>
</html>
