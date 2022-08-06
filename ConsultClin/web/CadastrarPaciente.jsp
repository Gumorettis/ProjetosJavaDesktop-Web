<%-- 
    Document   : CadastrarPaciente
    Created on : 20/05/2020, 20:00:18
    Author     : Heitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ConsultClin</title>
    </head>
    <body>
        <h1>Cadastrar Cliente - Informe os seus dados a baixo</h1>
        <form action="CadastrarPaciente" method="POST">
            
            Nome Paciente: <input type="text" name="nomePaciente"><br><br>
            CPF Paciente: <input type="text" name="cpfPaciente"><br><br>
            Data de Nascimento: <input type="date" name="dataNascimentoPaciente"><br><br>
            Gênero: <input type="radio" id="male" name="generoPaciente" value="Masculino">
            <label for="male">Masculino</label>
            <input type="radio" id="female" name="generoPaciente" value="Feminino">
            <label for="female">Feminino</label>
            <input type="radio" id="other" name="generoPaciente" value="Outro">
            <label for="other">Outro</label><br><br>
            Endereco: <input type="text" name="enderecoPaciente"><br><br>
            Bairro: <input type="text" name="bairroPaciente"><br><br>
            Cidade: <input type="text" name="cidadePaciente"><br><br>
            CEP: <input type="text" name="cepPaciente"><br><br>
            Telefone: <input type="text" name="telefonePaciente"><br><br>
            Celular: <input type="text" name="celularPaciente"><br><br>
            Observações do Paciente: <input type="text" name="observacoesPaciente"><br><br>
            Email: <input type="email" name="emailPaciente"><br><br>
            Senha:<input type="password" name="senhaPaciente"><br><br>
            
            <input type="submit" value="Cadastrar"><br><br>
            ${msg}
                        
        </form>
    </body>
</html>
