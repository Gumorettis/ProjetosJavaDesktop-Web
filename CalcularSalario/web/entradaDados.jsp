<%-- 
    Document   : entradaDados
    Created on : 23/09/2020, 22:37:14
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
        <h1>Digite os dados abaixo para calcular seu salario: </h1>
        
        <form action="Processamento" method="POST">
            Nome: <input type="text" size="15" name="nome"/> <br>
            <br>

            Horas trabalhadas: <input type="text" size="10" name="horas"/> <br>
            <br>
            
            Valor da hora: <input type="text" size="10" name="valorHora"/> <br>
            <br>
            
            <input type="submit" value="CALCULAR"/>
        </form>
    </body>
</html>
