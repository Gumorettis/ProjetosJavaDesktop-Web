<%-- 
    Document   : entrada-dados
    Created on : 22/09/2019, 15:10:52
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
        <h1>Funcionário digite os dados abaixo: </h1>
        
        <form action="Processar" method="POST">
        Nome: <input type="text" size="15" name="nomeFunc"/> <br>
        <br>
        
        Valor da hora: <input type="text" size="10" name="valorHora"/> <br>
        <br>
        
        Quantidade de horas trabalhadas: <input type="text" size="10" name="qtdHoras"/> <br>
        <br>
        
        <input type="submit" value="Calcular"/> 
        
        </form>
    </body>
</html>
