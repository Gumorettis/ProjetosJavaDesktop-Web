<%-- 
    Document   : paginaInicial]
    Created on : 26/10/2020, 22:34:51
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de dados</title>
    </head>
    <body>
        <h1>Digite os dados abaixo: </h1>
        
        <form action="Processamento" method="POST">
            
            Nome do funcionario: <input type="text" size="15" name="nomeFuncionario"/> <br>
            <br>
            Horas Trabalhadas: <input type="text" size="15" name="horasTrabalhadas"/> <br>
            <br>
            Valor de cada hora trabalhada: <input type="text" size="15" name="valorHora"/> <br>
            <br>
            
            <input type="submit" value="Calcular Salario"/> <br>
            
        </form>
    </body>
</html>
