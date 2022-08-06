<%-- 
    Document   : gerarOcorrencia
    Created on : 23/06/2020, 20:11:06
    Author     : gusta
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina para criar ocorrência</title>
    </head>
    <body>
        <h1>CADASTRE A OCORRENCIA ABAIXO: </h1>

        <form action="CadastrarOcorrencia" method="POST">

            ID <input type="text" name="id_ocorrencia" readonly="true" value="${ocorrenciasC.id_ocorrencia}"/> <br>
            <br>

            Descrição <input type="text" name="descricao_ocorrencia" size="25" value="${ocorrenciasC.descricao_ocorrencia}"/> <br>
            <br>

            Responsavel: 
            <select name="idResponsavel">
                <!-- Criando um laço para exibir todos os responsaveis cadastrados que aparecem na 
                lista já criada no listar Responsavel-->

                <c:forEach var="respo" items="${resp}">

            <option value="${respo.id_responsavel}" ${respo.id_responsavel==ocorrenciasC.responsavel.id_responsavel?'selected':''}> ${respo.nome_pessoa} </option>

                </c:forEach>

            </select>

            <br> <br>

            <input type="submit" value="CADASTRAR"/>

            ${msg}
        </form>


        <table border="2" cellspacing=0 class="tabelaResp">

            <h1>Listagem de Ocorrencias</h1>

            <thead>
                <tr>

                    <th> ID Ocorrencia </th>
                    <th> Descrição </th>
                    <th> Responsavel </th>
                    <th colspan="2"> Editar </th>
                </tr>
            </thead>

            <tbody>

                <c:forEach var="ocorrencias" items="${ocorrencia}">
                    <tr>
                        <td> ${ocorrencias.id_ocorrencia} </td>
                        <td> ${ocorrencias.descricao_ocorrencia} </td>
                        <td> ${ocorrencias.responsavel.id_responsavel} </td>
                        
                        <td><a href="${pageContext.request.contextPath}/ExcluirOcorrencia?id_ocorrencia=${ocorrencias.id_ocorrencia}"> Excluir </a></td>
                        <td><a href="${pageContext.request.contextPath}/CarregarOcorrencia?id_ocorrencia=${ocorrencias.id_ocorrencia}"> Alterar </a></td>
                    </tr> 

                </c:forEach>

            </tbody>

        </table>
    </body>
</html>
