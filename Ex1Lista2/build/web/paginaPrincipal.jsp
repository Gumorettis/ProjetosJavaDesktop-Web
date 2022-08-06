<%-- 
    Document   : paginaPrincipal
    Created on : 07/10/2020, 22:21:58
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Principal</title>
    </head>
    <body>
        <h1>Prezado usuario, digite um numero abaixo: </h1>
        
        <form action="Calcular" method="POST">
            
            Numero: <input type="text" size="10" name="numero"/> <br>
            <br>
            
            <input type="submit" value="CALCULAR"/>
            
        </form>
        
        <p>*********************************************</p>
        
        <h1>O numero digitado foi: ${numero} e</h1>
        <h1>${msg}</h1>
        
        
        <p>*********************************************</p>
    </body>
</html>
