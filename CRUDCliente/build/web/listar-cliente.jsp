<%-- 
    Document   : listar-cliente
    Created on : 12/02/2020, 13:12:35
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
        <h1>Página para listar Cliente: </h1>
        
        <form action="ListarCliente" method="POST">
            Listar por nome: <input type="text" size="15" name="nomePesquisa"/>  <input type="submit" value="Pesquisar"/> <br>
            <br>
        
            <c:forEach items="${listarPorNome}" var="cliente">
                ID do cliente: <input type="text" size="10" name="idCliente" readonly="true" value="${cliente.id_cliente}"/> <br>
                
            </c:forEach>
                
                 <table>
                    <thead>
                        <tr>
                            <th> Nome: </th>
                            <th> Telefone: </th>
                            <th> CPF: </th>
                        </tr>
                    </thead>
                    
                    <tbody>
                        <tr class="tabListarCliente">    
                        
                            <c:forEach items="${listarPorNome}" var="cliente">
                                
                                <td>${cliente.nome}</td>
                                <td>${cliente.telefone}</td>
                                <td>${cliente.cpf}</td>
                            </tr>
                            
                            </c:forEach>
                            
                    </tbody>
                    
                </table>
                
                
                
                <table>
                    
                    <thead>
                        
                        <tr>
                            <th> Nome: </th>
                            <th> Telefone: </th>
                            <th> CPF: </th>
                            
                        </tr>
                        
                    </thead>
                    
                    <tbody>
                        <tr class="tabListarCliente">    
                        
                            <c:forEach items="${listarCliente}" var="cliente">
                                
                                <td>${cliente.nome}</td>
                                <td>${cliente.telefone}</td>
                                <td>${cliente.cpf}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/ExcluirCliente?telefone_cliente=${cliente.telefone}"> Excluir </a> 
                                </td>
                            </tr>
                            
                            </c:forEach>
                            
                    </tbody>
                    
                </table>
                ${msg}
        </form>
        
    </body>
</html>
