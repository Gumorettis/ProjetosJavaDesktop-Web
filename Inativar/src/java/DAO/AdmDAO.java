/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Administrador;
import MODEL.Funcionario;
import UTIL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gusta
 */
public class AdmDAO{
    
    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    
    public AdmDAO(){
        
        try {
    
        this.conn = ConnectionFactory.conectar(); 
        System.out.println("Conectado com sucesso!");
        
        } catch (Exception e) {
            
        System.out.println("ERRO AO CONECTAR AO BANCO - DAO");
        }
    }
    
    public boolean cadastrarAdm(Object objeto) throws Exception{
        
        try {
            
            String sql = "insert into administrador(idpessoaadm,nivelcredencial) values(?,?)";
            stmt = this.conn.prepareStatement(sql);
            
            Administrador oAdm = (Administrador)objeto;
            
            PessoaDAO oPessoaDAO = new PessoaDAO();
            
            stmt.setInt(1, oPessoaDAO.cadastrarPessoa(oAdm));
            stmt.setString(2, oAdm.getNivelCredencial());
            
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR Administrador - NA DAO "+e.getMessage());
        } 
        
        finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return true;     
        
    }
    
    public boolean inativarFuncionario(Object objeto){
        
        Funcionario oFuncionario = (Funcionario)objeto;
        PreparedStatement stmt = null;
        
        try {
            String sql = "update pessoa SET status_pessoa = 'Inativo' "
                     + "WHERE idpessoa = ?";
            
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, oFuncionario.getIdPessoa());
        
        stmt.executeUpdate();
        
        } catch (Exception e) {
            System.out.println("ERRO AO EDITAR FUNCIONARIO NA DAO - "+e.getMessage());
        }
        
        finally{
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("ERRO AO FECHAR CONEXÃO ! ");
            }
        }
        
        return true;
    }
    
    public boolean ativarFuncionario(Object objeto){
        
        Funcionario oFuncionario = (Funcionario)objeto;
        PreparedStatement stmt = null;
        
        try {
            String sql = "update pessoa SET status_pessoa = 'Ativo' "
                     + "WHERE idpessoa = ?";
            
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, oFuncionario.getIdPessoa());
        
        stmt.executeUpdate();
        
        } catch (Exception e) {
            System.out.println("ERRO AO EDITAR FUNCIONARIO NA DAO - "+e.getMessage());
        }
        
        finally{
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("ERRO AO FECHAR CONEXÃO ! ");
            }
        }
        
        return true;
    }
}
