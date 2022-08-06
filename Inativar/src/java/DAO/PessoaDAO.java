/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Funcionario;
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
    
    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    
    public PessoaDAO(){
        try {
    
        this.conn = ConnectionFactory.conectar(); 
        System.out.println("Conectado com sucesso!");
        
        } catch (Exception e) {
            
        System.out.println("ERRO AO CONECTAR AO BANCO - DAO");
        }
    }
    
    public Integer cadastrarPessoa(Object objeto)throws Exception{
        try {
            String sql = "insert into pessoa(nomepessoa,endereco,telefone,tipo_pessoa,status_pessoa,login_pessoa,senha_pessoa) values(?,?,?,?,?,?,?) returning idPessoa";
            stmt = this.conn.prepareStatement(sql);
            Pessoa oPessoa = (Pessoa)objeto;
            
            stmt.setString(1, oPessoa.getNomePessoa());
            stmt.setString(2, oPessoa.getEndereco());
            stmt.setInt(3, oPessoa.getTelefone());
            stmt.setString(4, oPessoa.getTipo_pessoa());
            stmt.setString(5, oPessoa.getStatus_pessoa());
            stmt.setString(6, oPessoa.getLogin_pessoa());
            stmt.setString(7, oPessoa.getSenha_pessoa());
            
            rs = stmt.executeQuery();
            
            rs.next();
            
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR PESSOA - NA DAO "+e.getMessage());
        } 
        
        //retorna um campo do banco de dados
        return rs.getInt("idPessoa");
        
    }
    
    public Pessoa logar(String login, String senha){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Pessoa oPessoa = null;
        Funcionario oFunc = null;
        String sql = "select * from pessoa where login_pessoa = ? and senha_pessoa = ?";
        
        try {
            
            stmt = conn.prepareCall(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                oPessoa = new Pessoa();
                oFunc = new Funcionario(); 
                
                oPessoa.setIdPessoa(rs.getInt("idpessoa"));
                oPessoa.setNomePessoa(rs.getString("nomepessoa"));
                oPessoa.setLogin_pessoa(rs.getString("login_pessoa"));
                oPessoa.setTipo_pessoa(rs.getString("tipo_pessoa"));
                oPessoa.setStatus_pessoa(rs.getString("status_pessoa"));
            }
            
        } catch (Exception e) {
            
            System.out.println("ERRO AO LOGAR - ERRO NA DAO "+e.getMessage());
        }
        finally{
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                 System.out.println("ERRO AO FECHAR A CONEXÃO NA DAO "+e.getMessage());
            }
        }
        return oPessoa;
    }
}
