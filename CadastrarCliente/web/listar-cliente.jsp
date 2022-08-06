<%-- 
    Document   : listar-cliente
    Created on : 12/02/2020, 21:13:55
    Author     : gusta
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>PAGINA PARA LISTAR CLIENTE: </h1>
        
<form action="ListarCliente" method="POST">
    Digite o nome do Cliente: <input type="text" size="15" name="nomeCliente"/> 
    <input type="submit" value="Listar"/> <br>
    <br>
    
    <c:forEach items="${listaPorNome}" var="cliente">
    ID do cliente: <input type="text" size="10" name="idCliente" readonly="true" value="${cliente.id_cliente}"/> <br> 
        
    </c:forEach>
    
        <table>
            <thead>
                <tr>
                    <th> Nome do Cliente: </th>
                    <th> CPF: </th>
                    <th> Idade: </th>
                    <th> Endereco: </th>
                </tr>
            </thead> 
           
            <tbody>
                <tr>
                    
            <c:forEach items="${listaPorNome}" var="item"> 
                        
                <td>${item.nomeCliente}</td>
                <td>${item.cpfCliente}</td>
                <td>${item.idadeCliente}</td>
                <td>${item.enderecoCliente}</td>
                
            </tr>    
            </c:forEach>
                
            </tbody>    
            
        </table>
    
    
    <table>
            <thead>
                <tr>
                    <th> Nome do Cliente: </th>
                    <th> CPF: </th>
                    <th> Idade: </th>
                    <th> Endereco: </th>
                </tr>
            </thead> 
           
            <tbody>
                <tr>
                     
            <c:forEach items="${listarCliente}" var="dados"> 
                        
                <td>${dados.nomeCliente}</td> 
                <td>${dados.cpfCliente}</td> 
                <td>${dados.idadeCliente}</td> 
                <td>${dados.enderecoCliente}</td> 
                
            </tr>  
            </c:forEach>
                  
            
                
            </tbody>    
            
        </table>
    
</form>
    </body>
</html>
