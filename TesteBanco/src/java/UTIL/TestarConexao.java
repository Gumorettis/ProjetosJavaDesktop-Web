/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

/**
 *
 * @author gusta
 */
public class TestarConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        ConnectionFactory conexao = new ConnectionFactory();
       
        conexao.conectar();
    }
    
}
