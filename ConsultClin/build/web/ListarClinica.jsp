<%-- 
    Document   : ListarClinica
    Created on : 16/06/2020, 20:37:20
    Author     : Heitor
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
        <h1>Hello World!</h1>

        <form action="ListarClinica" method="POST">

            <table>

                <thead>

                    <tr>
                        <th> Nome </th>
                        <th> CNPJ </th>
                        <th> Endereço </th>
                        <th> Bairro </th>
                        <th> Cidade </th>
                        <th> Telefone </th>
                        <th> Especificação </th>

                    </tr>

                </thead>

                <tbody>
                <tr class="tabListarClinica">    

                    <c:forEach items="${listarCli}" var="clinica">
                            
                    <td>${clinica.nomeClinica}</td>
                    <td>${clinica.cnpjClinica}</td>
                    <td>${clinica.enderecoClinica}</td>
                    <td>${clinica.bairroClinica}</td>
                    <td>${clinica.cidadeClinica}</td>
                    <td>${clinica.telefoneClinica}</td>
                    <td>${clinica.especificacaoClinica}</td>

                </tr>
                            
                </c:forEach>
                
                </tbody>

            </table>
            <input type="submit" value="Listar">
            
        </form>
    </body>
</html>
