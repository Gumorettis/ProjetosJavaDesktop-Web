/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gusta
 */
public class ConnectionFactory {
    
    // método para conectar no banco de dados
    public static Connection conectar()throws Exception{
        try {
            
        Class.forName("org.postgresql.Driver");
        System.out.println("Conectou! ");
        
        //LINHA X PARA FAZER CONEXÃO COM O BANCO
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/CRUDCliente","postgres","postdba");
        
        } catch (Exception e) {
            throw new Exception("ERRO AO CONECTAR NO BANCO na conection"+e.getMessage());
        }
    }
    
    //MÉTODO PARA FECHAR A CONEXÃO COM O BANCO DE DADOS 
    public static void fecharConexao(Connection conn, Statement stmt, ResultSet rs)throws Exception{
        try {
            
            if(rs != null){
               rs.close();
            }
            
            if(stmt != null){
                stmt.close();
            }
            
            if(conn != null){
                conn.close();
            }
            
        } catch (Exception e) {
            throw new Exception("ERRO AO FECHAR O BANCO na conection"+e.getMessage());
        }
    }
    
}
