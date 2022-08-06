<%-- 
    Document   : CadastrarProduto
    Created on : 25/11/2020, 23:49:23
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina para cadastrar Produto</title>
    </head>
    
    <div class="container-fluid">
        
    <body>
        <h1>Digite os dados do produto: </h1>
        
        <form action="CadastrarProdutoCTR" method="POST">
            Nome do Produto: <input type="text" size="15" name="nomeProduto"/> <br>
            <br>
            
            Valor do Produto: <input type="text" size="15" name="valorProduto"/> <br>
            <br>
            
            Tipo do Produto: <input type="text" size="15" name="tipoProduto"/> <br>
            <br>
           
            <input type="submit" value="CADASTRAR PRODUTO " href="paginaEntrada.jsp"/> <br>
            
            <h1> ${msg} </h1>
        </form>
        
    </body>
    
    </div>
</html>
