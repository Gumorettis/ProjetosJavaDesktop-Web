/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gusta
 */
public class ConnectionFactory {

    //nome do metodo conectar e ele desenvolvido
    public static Connection conectar() throws Exception {

        //linha do jdbc é um pra cada banco 
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Conectou!");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/lojaInfonet", "postgres", "postdba");

        } catch (Exception e) {
            throw new Exception("Erro ao conectar no banco" + e.getMessage());
        }
    }
    
    //metodo para fazer a conexão é importante para não deixar o banco aberto operando na memória
    public static void fecharConexao(Connection conn, Statement stmt, ResultSet rs) throws Exception {

        //realiza o fechamento das variaveis que foram iniciadas no banco 
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }

            if (conn != null) {
                conn.close();
            }

        } catch (Exception e) {

            throw new Exception("Erro ao fechar Conexao" + e.getMessage());
        }
    }
}

//CTRL + E = Apaga a linha inteira 
// SHIFT + ALT + F reorganiza o código 