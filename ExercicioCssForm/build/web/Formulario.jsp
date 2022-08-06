<%-- 
    Document   : Formulario
    Created on : 13/06/2021, 14:44:26
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            
            textArea{
                resize: none;
                width: 300px;
                height: 200px;
                
            }
        </style>
    </head>
    
    <body>
        
        <h1>Preencha o formulário abaixo: </h1>
        
        <form action="Exercicio" method="POST">
            <label>Digite o nome do produto: </label> <input type="text" multiple="" size="15" name="nomeProduto"/><br>
        <br>
        
        <label>Telefone: </label> <input type="tel" multiple="" size="15" pattern="\([0-9]{2}\)[\s][0-9]{5}-[0-9]{4}"  placeholder="--/---------" name="nomeProduto"/><br>
        <br>
        
        <textarea draggable="true"></textarea> <br> 
        
        <label>Selecione quantidade do produto(1 a 100): </label><br>
        <input type="range" name="qtd" min="1" max="100"/>
        
        <br>
        <br>
        
        <label>Digite o valor do produto (R$): </label> <input type="number" size="15" name="valorProd" min="1" placeholder="R$ 0.00" /><br>
        <br>
        
        <label> Selecione o tipo de compra: </label> <br>
        Atacado <input type="radio" name="grupo1"  value="Atacado"/> <br>
        Varejo <input type="radio" name="grupo1" value="Varejo"/> <br>
        CNPJ <input type="radio" name="grupo1"  value="cnpj"/> <br>
        
        <br>
        
        <label>Selecione a data de validade do produto: </label>
        <input type="date" name="dataValidade"/>
        <br> 
        <br>
        
        <input type="submit" value="Enviar dados" name="btn"/>
        
        </form>
        
        <h2>Resumo da compra: </h2>
        
        <p> Nome do produto: ${nomeProduto}</p>
        <p> Valor do produto: R$ ${valorProduto}</p> 
        <p> Total a pagar: R$ ${totalPagar}</p> 
        <p> Desconto aplicado: R$ ${desconto}</p> 
        <p> Data de validade do produto: ${dataValidade}</p>
        <p> Valor final da compra: R$ ${valorFinal}</p> 
        
    </body>
</html>
