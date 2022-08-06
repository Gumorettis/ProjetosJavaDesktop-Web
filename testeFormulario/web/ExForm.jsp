<%-- 
    Document   : formulario1
    Created on : 28/05/2021, 16:45:50
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
        <h1>Preencha o formulário abaixo: </h1>
        
        <form action="form1" method="POST">
        <label>Digite o nome da máquina: </label> <input type="text" size="15" name="nomeMaquina"/><br>
        <br>
        
        <label>Selecione uma potencia de operação da máquina(0 a 10): </label><br>
        <input type="range" name="potencia" min="1" max="10"/>
        
        <br>
        <br>
        
        <label> Selecione a empresa fabricante: </label>
        <select name="fabricante">
            
            <option value="empresa A">Empresa A</option>
            <option value="empresa B">Empresa B</option>
            <option value="empresa C">Empresa C</option>
            
        </select>
        
        <br>
        <br>
        
        <label>Selecione a data de fabricação da máquina: </label>
        <input type="date" name="dataFab"/>
        
        <br> 
        <br>
        
        <input type="submit" value="Enviar dados"/>
        
        </form>
        <br>
        
        <label> Dados informados: </label> <br>
        <br>
        
        <p> Nome da máquina: ${nomeMaq} </p>
        <p> Potência: ${pot} </p>
        <p> Empresa Fabricante: ${empresa} </p>
        <p> Data de Fabricação: ${dataFab} </p>
        
    </body>
</html>
