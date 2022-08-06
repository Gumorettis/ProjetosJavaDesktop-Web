<%-- 
    Document   : primeira-pagina
    Created on : 12/08/2019, 22:20:38
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
        <h1> Digite os dados abaixo: <h1>
            
             
                <form action="processamento" method="POST">
                    
                    Digite seu nome: <input type="text" size="15" name="nome"/> <br>
                    <br> 
                    
                    Digite sua idade: <input type="text" size="10" name="idade"/> <br>
                    <br> 
                    
                    Digite seu Curso: <input type="text" size="15" name="curso"/> <br>
                    <br> 
                    
                    Digite sua escola: <input type="text" size="15" name="escola"/> <br>
                    <br> 
                    
                    <input type="submit" value="Enviar"/>
                    
                </form>    
    </body>
</html>
