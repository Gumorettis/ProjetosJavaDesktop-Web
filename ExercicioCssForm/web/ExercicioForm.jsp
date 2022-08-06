<%-- 
    Document   : ExercicioForm
    Created on : 26/09/2021, 13:08:35
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <style>
            *{
                margin: 0;
                box-sizing: border-box;
                padding: 0;
                background-color: cornsilk;
            }
            
            form{
                
                width: 30%;
                margin: auto auto;
                font-family: Georgia;
                font-size: 20px;
            }

            fieldset{
                margin-top: 50%;

            }

            input[type=submit]{
                background-color: black;
                border: none;
                color: white;
                right: 5px;
                padding: 10px;
                width: 100%;
                margin-bottom: 5px;
            }
            
        </style>
    </head>
    <body>

        <form>

            <fieldset>
                <legend> Formulário de Mercadoria - Cliente </legend>
                <br>

                Nome: <input type="text" size="15" name="nome" min="5"/> <br>
                <br>

                Endereço: <input type="text" size="15" name="end" minlength="5"/><br>
                <br> 

                Telefone: <input type="tel" size="15" name="telefone" placeholder="(99)-99999-9999"/> <br>
                <br>

                Peso da mercadoria: <input type="range" minlength="1" maxlength="1000"/> <br>

                <br>
 
                Cidade entrega: 
                <input list="entrega">

                <datalist id="entrega">

                    <option value="Rio Preto">
                    <option value="Rio de Janeiro">
                    <option value="Campinas">
                    <option value="Poços de Caldas">
                </datalist>
                <br> 
                <br>

                <input type="submit" value="Cadastrar" /> <br>
            </fieldset>


        </form>
    </body>
</html>
