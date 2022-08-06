<%-- 
    Document   : paginaInicial
    Created on : 05/10/2020, 22:01:54
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina para digitação dos dados</title>
    </head>
    <body>
        <h1>Digite os seus dados abaixo: </h1>
        
        <form action="ProcessamentoDados" method="POST">
            
            Nome do usuário: <input type="text" size="15" name="nomeUsuario"/> <br>
            <br>
            
            Ano de nascimento: <input type="text" size="10" name="ano"/> <br>
            <br>
            
            Ano base para o calculo: <input type="text" size="10" name="anoBase"/> <br>
            <br>
            
            <input type="submit" value="Calcular Idade! "/>
            
        </form>
        
        <p>*********************************************</p>
        
        <h2>O seu Nome é:  ${oNome}</h2>
        <h2>E sua idade é:  ${oIdade} anos</h2>
        
        <p>*********************************************</p>
        
    </body>
</html>
