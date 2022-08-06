<%-- 
    Document   : cadastro-cliente
    Created on : 23/07/2019, 14:12:36
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro Cliente</h1>
            
            <form action="CadastrarCliente" method="POST">
                Id<input type="text" name="id"/></br>
                </br>
                
                Nome<input type="text" name="nome"/></br>
                </br>
                
                Email<input type="text" name="email"/></br>
                </br>
                
                <input type="submit" value="Cadastrar"/></br>
                             
            </form>
    </body>
</html>
