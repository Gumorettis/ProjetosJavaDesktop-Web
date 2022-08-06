<%-- 
    Document   : listarClienteNome
    Created on : 14/12/2020, 23:40:12
    Author     : gusta
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina para listagem de dados</title>
    </head>
    <body>
        <h1>Listagem de dados do cliente via nome! </h1>
        
        <form action="ListarPorNomeCTR" method="POST">
            
            Nome do Cliente: <input type="text" size="15" name="nomeCliente"/> <br>
            <br>
            
            <input type="submit" value="BUSCAR CLIENTE"/>
            
        <!-- UMA TABELA DE EXIBIÇÃO  -->
        
        <table>
            
            <thead>
                
                <tr>
                    <th>ID Cliente </th>
                    <th>Nome Cliente </th>                    
                    <th>RG Cliente</th>                    
                    <th>Idade Cliente</th>                    
                    <th>Telefone Cliente</th>      
                    
                </tr>
            </thead>
            
            <tbody>
                <tr>
                    
                    <c:forEach items="${listaNome}" var="cliente"> 
                    
                        <td>${cliente.idCliente}</td>
                        <td>${cliente.nomeCliente}</td>
                        <td>${cliente.rgCliente}</td>
                        <td>${cliente.idadeCliente}</td>
                        <td>${cliente.telefoneCliente}</td>
                        
                    </tr>
                    </c:forEach>
                    
            </tbody>
            
        </table>
        
        <h1> ${msg1} </h1>
        <h1> ${msg2} </h1>
        
        </form>
        
    </body>
</html>
