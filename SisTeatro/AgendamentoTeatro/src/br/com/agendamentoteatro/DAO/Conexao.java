/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agendamentoteatro.DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    public static Connection con = null;
    static Statement stmt = null;
    
    public Conexao(){
        
    }
    
    public static void ConectDB(){
        try{
            String dsn = "TeatroDB";
            String user = "postgres";
            String senha = "postdba";
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            String url = "jdbc:postgresql://localhost:5432/"+dsn;
            
            con = DriverManager.getConnection(url,user,senha);
            stmt = con.createStatement();
            
            if(con == null){
                System.out.println("Erro ao abrir o banco");
                
            }
            else{
                System.out.println("''");
            }
        }
        catch(Exception e){
            System.out.println("Problema na abertura de dados"+e.getMessage());
        }
        
    }
        public static void CloseDB(){
            try{
                stmt.close();
                con.close();
            }
            catch(Exception zen){
                System.out.println("Problema na abertura de dados"+zen.getMessage());
            }
        }   
}
