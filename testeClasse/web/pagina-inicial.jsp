<%-- 
    Document   : pagina-inicial
    Created on : 02/09/2019, 22:25:52
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
        <h1>Digite os dados abaixo: </h1>
        
        <form action="Processar" method="POST">
            
            Nome do Cliente: <input type="text" size="15" 
                             name="nomeCliente"/> <br>
            <br>
            
            Telefone Cliente: <input type="text" size="10"
                             name="telefoneCliente"/> <br>
            <br>
            
            Endereço Cliente: <input type="text" size="15"
                             name="enderecoCliente"/> <br>
            <br>
            
            Idade Cliente: <input type="text" size="10" 
                             name="idadeCliente"/> <br> 
            <br>
            
            <input type="submit" value="Enviar"/>
            
        </form>
    </body>
</html>
