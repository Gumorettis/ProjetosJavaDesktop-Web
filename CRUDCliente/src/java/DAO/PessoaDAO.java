/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Pessoa;
import UTIL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gusta
 */
public class PessoaDAO {
    
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    
    public PessoaDAO() throws Exception{
        
    try {
    
        this.conn = ConnectionFactory.conectar(); 
        System.out.println("Conectado com sucesso!");
        
        } catch (Exception e) {
            
        System.out.println("ERRO AO CONECTAR AO BANCO - DAO");
        }    
    }
    
    public Pessoa logarPessoa(String login, String senha){
        PreparedStatement stmt= null;
        ResultSet rs= null;
        Pessoa oPessoa=null;
       
        String sql = "select * from pessoa where login_pessoa = ? and senha_pessoa = ?";
        
        try {
            stmt = conn.prepareCall(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                oPessoa = new Pessoa();
                
                oPessoa.setId_pessoa(rs.getInt("id_pessoa"));
                oPessoa.setNome_pessoa(rs.getString("nome_pessoa"));
                oPessoa.setLogin_pessoa(rs.getString("login_pessoa"));
                oPessoa.setTipo_pessoa(rs.getString("tipo_pessoa"));
                               
            }
            
        } catch (Exception ex) {
            
            System.out.println("Problemas ao logar Pessoa erro: " + ex.getMessage());
            ex.printStackTrace();
        }finally{
            
            try {
                
                ConnectionFactory.fecharConexao(conn, stmt, rs);
                
            } catch (Exception ex) {
                
                System.out.println("Problemas ao fechar conexão erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        return oPessoa;
    }
    
    public Integer cadastrar(Object object) throws Exception{
        
        try {
            
            String sql = "insert into pessoa (cpf_pessoa, nome_pessoa, email_pessoa, login_pessoa, senha_pessoa, telefone_pessoa, tipo_pessoa) values (?, ?, ?, ?, ?, ?, ?) returning id_pessoa";
            stmt = this.conn.prepareStatement(sql);
            Pessoa pessoa = (Pessoa) object;
            stmt.setString(1, pessoa.getCpf_pessoa());
            stmt.setString(2, pessoa.getNome_pessoa());
            stmt.setString(3, pessoa.getEmail_pessoa());
            stmt.setString(4, pessoa.getLogin_pessoa());
            stmt.setString(5, pessoa.getSenha_pessoa());
            stmt.setString(6, pessoa.getTelefone_pessoa());
            stmt.setString(7, pessoa.getTipo_pessoa());
            rs = stmt.executeQuery();

            rs.next();
            
        } catch (Exception e) {
             System.out.println("Erro ao inserir Pessoa " + e.getMessage());
        }
        
        return rs.getInt("id_pessoa");
    }
    
    public boolean alterar(Object objeto){
        
        Pessoa oPessoa = (Pessoa) objeto;
        PreparedStatement stmt = null;
        
        String sql = "update pessoa SET "
                + " cpf_pessoa = ?,"
                + " nome_pessoa = ?,"
                + " email_pessoa = ?,"
                + " login_pessoa = ?,"
                + " senha_pessoa = ?,"
                + " telefone_pessoa = ? WHERE id_pessoa = ? ;";
        
        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, oPessoa.getCpf_pessoa());
            stmt.setString(2, oPessoa.getNome_pessoa());
            stmt.setString(3, oPessoa.getEmail_pessoa());
            stmt.setString(4, oPessoa.getLogin_pessoa());
            stmt.setString(5, oPessoa.getSenha_pessoa());
            stmt.setString(6, oPessoa.getTelefone_pessoa());
            stmt.setInt(7, oPessoa.getId_pessoa());
            
            stmt.executeUpdate();
            return true;
            
        } catch (Exception ex) {
            
            System.out.println("Erro ao alterar Pessoa!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
            
        }finally{
            
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception ex) {
                
                System.out.println("Problemas ao fechar os parâmetros da conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}
