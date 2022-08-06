<%-- 
    Document   : paginaInicial
    Created on : 04/11/2020, 23:03:22
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Inicial</title>
    </head>
    <body>
        <h1>Insira os dados abaixo: </h1>
        
        <form action="Processamento" method="POST">
            
        Nome: <input type="text" size="15" name="nomeUsuario"/> <br>
        <br>
        Ano de Nascimento: <input type="text" size="15" name="anoNascimento"/> <br>
        <br>
        Ano atual: <input type="text" size="15" name="anoAtual"/> <br>
        <br>
        
        <input type="submit" value="Calcular Idade"/> 
        </form>
        
    </body>
</html>
