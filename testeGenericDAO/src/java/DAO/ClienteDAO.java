/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author gusta
 */
public class ClienteDAO implements GenericDAOImpl{
    
    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    
    public ClienteDAO(){
        
        try {
    //ESTE CODIGO ABRE UMA NOVA CONEXÃO PARA CADASTRAR
        this.conn = ConnectionFactory.conectar(); 
           
        } catch (Exception e) {
        System.out.println("ERRO AO CONECTAR AO BANCO - DAO");
        }
    }

    @Override
    public boolean cadastrar(Object object) throws Exception {
        
        
    }

    @Override
    public void excluir() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    
    
    
    
}
