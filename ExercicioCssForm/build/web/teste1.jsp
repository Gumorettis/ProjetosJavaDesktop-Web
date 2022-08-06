<%-- 
    Document   : testeS
    Created on : 02/10/2021, 21:52:35
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script>
            window.alert('Mensagem com JS ');
            confirm('Você é fulano ? ');
            var nome = prompt('qual é seu nome? ');
            window.alert('Seu nome é: '+nome);
            
            var n1 = prompt('Digite um número: ');
            var n2 = prompt('Digite um numero: ');
            
            var soma = Number(n1)+Number(n2);
            
            window.alert('A soma dos numeros é : '+String(soma));
            
            
        </script>
    </head>
    <body>
        <h1>Ola mundo </h1>
        
        
    </body>
</html>
