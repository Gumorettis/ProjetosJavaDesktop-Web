<%-- 
    Document   : Formulario1
    Created on : 31/05/2021, 09:34:58
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <style>
            input[type=submit]{
                background-color: #6495ED;
                border: 3px solid; 
                border-radius: 7px;
                padding: 7px 30px;
                margin: 5px 5px;
                font-family: monospace;
                font-size: 20px;
                width: 100%;
            }

            input[type=submit]:hover{
                background-color: aliceblue;
            }

            *{
                margin: 0;
                padding: 0;

            }

            div{
                border-radius: 5px;
                background-color: #cccccc;
                padding: 20px;
                max-width: 500px;
                width: 70%;
                position: absolute;
                left: 50%;
                top: 30%;
                transform: translate(-50%,-50%);

            }

            h1{
                text-align: center;
            }

            label,select{
                font-family: monospace;
                font-size: 15px;
            }

            #posicaoTabela{
                border-radius: 20px;
                top: 68%;
            }
            
            #tabela{
                width: 100%;
            }
            
            p{
                font-family: 'Roboto Slab', serif;
                font-size: 20px;
                font-weight: bold;
                text-align: center;
            }
            
            a{
                font-family: monospace;
                font-size: 16px;
                color: red;
                font-weight: bold;
                padding: 10px;
            }
            
        </style>
    </head>

    <body>

        <div>
            <h1>Preencha o formulário abaixo</h1> <br>
            <form action="Form1" method="POST">

                <label>Digite o nome da máquina: </label> 

                <input type="text" size="15" name="nomeMaquina"/> <br>
                <br>

                <label>Selecione uma potencia de operação(1 a 10): </label> 
                <input type="range" name="potencia" min="1" max="10"/> <br>
                <br>

                <label>Selecione a empresa fabricante da maquina: </label> 
                <select name="Fabricante">
                    <option value="Empresa A">Empresa A </option>
                    <option value="Empresa B">Empresa B</option>
                    <option value="Empresa C">Empresa C</option>

                </select> <br>
                <br>

                <label>Data de Fabricação da máquina: </label> 
                <input type="date" name="dataFab"/> <br>
                <br>

                <label> Grau de manuseio da máquina:  <br>
                    Alto <input type="radio" name="grupo" value="Alto"/> <br>
                    Medio <input type="radio" name="grupo" value="Medio" /> <br>
                    Baixo <input type="radio" name="grupo" value="Baixo" /> <br>
                    <br> </label>

                <input type="submit" value="Enviar Dados"/>

            </form>

        </div>
                        
        <div id="posicaoTabela">

            <table id="tabela" border="3px">

                <thead>

                    <tr>
                        <th colspan="2"> <h2>Informações da Máquina </h2> </th>
                    </tr>

                </thead>

                <tbody>
                    <tr>
                        <td> <p>Nome máquina</p> </td>
                        <td> <a>${nomeMaquina}</a> </td>
                    </tr>
                    
                    <tr>
                        <td> <p>Potencia da máquina</p> </td>
                        <td> <a>${potencia}</a> </td>
                    </tr>
                    
                    <tr>
                        <td> <p>Fabricante</p> </td>
                        <td> <a>${empresa}</a> </td>
                    </tr>
                    
                    <tr>
                        <td> <p>Data de Fabricação</p> </td>
                        <td> <a>${dataFab}</a> </td>
                    </tr>
                    
                    <tr>
                        <td> <p>Nível de manuseio</p> </td>
                        <td> <a>${manuseio}</a> </td>
                    </tr>

                </tbody>

            </table>

        </div>
                    
    </body>
</html>
