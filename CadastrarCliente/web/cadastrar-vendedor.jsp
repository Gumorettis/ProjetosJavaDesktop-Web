<%-- 
    Document   : cadastrar-vendedor
    Created on : 11/03/2020, 10:56:41
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
        <h1>Digite dos dados do Vendedor abaixo: </h1>
        
        <form action="CadastrarVendedor" method="POST">
            
            Nome do Vendedor: <input type="text" name="nomeVendedor" size="15"/> <br>
            <br>
            
            RG do vendedor: <input type="text" name="rgVendedor" size="20"/> <br>
            <br>
            
            Empresa de trabalho: <input type="text" name="empresaVendedor" size="15"/> <br>
            <br>
            
            Horas trabalhadas: <input type="text" name="horasTrabalhadas" size="15"/> <br>
            <br>
            
            <input type="submit" value="Cadastrar Vendedor"/>
            
            ${msg}
        </form>
    </body>
</html>
