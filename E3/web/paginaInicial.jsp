<%-- 
    Document   : paginaInicial
    Created on : 05/10/2020, 22:34:14
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entrada de Dados</title>
    </head>
    <body>
        <h1>Digite os dados abaixo: </h1>
        
        <form action="Processamento" method="POST">
            Nome do usuário: <input type="text" size="15" name="nomeUsuario"/> <br>
            <br>
            
            Peso do usuário(kg): <input type="text" size="10" name="peso"/><br>
            <br>
            
            Altura do usuário(m): <input type="text" size="10" name="altura"/><br>
            <br>
            
            <input type="submit" value="Calcular IMC"/>
            
        </form>
        
        <p>*********************************************</p>
        
        <h1>O seu nome é: ${nomeUsuario}</h1>
        <h1>O seu IMC é: ${imc}</h1>
        
        <p>*********************************************</p>
        
    </body>
</html>
