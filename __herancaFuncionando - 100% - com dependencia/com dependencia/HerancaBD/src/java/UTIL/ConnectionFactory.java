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
 * FÁBRICA DE CONEXÕES - ONDE SÃO ABERTAS OU FECHADAS CONEXÕES COM O BD
 *
 * @author gusta
 */
public class ConnectionFactory {

    //SERVE ENTÃO PARA ABRIR OU FECHAR A CONEXÃO COM O BANCO DE 
    //DADOS DA APLICAÇÃO 
    public static Connection conectar() throws Exception {

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("BANCO CONECTADO ! ");
            
    return DriverManager.getConnection("jdbc:postgresql://localhost:5432/bancoHeranca","postgres","postdba");
    
        } catch (Exception e) {
            throw new Exception("ERRO AO CONECTAR NO BANCO, NA FABRICA DE CONEXÕES"+e.getMessage());
        }
    }
    
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
            throw new Exception("ERRO AO FECHAR O BANCO na fabrica de conexões! "+e.getMessage());
        }
        
    }
}
