/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.PessoaJuridica;
import UTIL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class PJuridicaDAO {
        
     private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    
    public PJuridicaDAO(){
        try {
    
        this.conn = ConnectionFactory.conectar(); 
        System.out.println("Conectado com sucesso!");
        
        } catch (Exception e) {
            
        System.out.println("ERRO AO CONECTAR AO BANCO - DAO");
        }
    }
    
    public boolean cadastrarPJuridica(Object objeto)throws Exception{
        try {
            
            String sql = "insert into pessoajuridica(idPessoaJuridica,cnpj,capital) values(?,?,?)";
            stmt = this.conn.prepareStatement(sql);
            
            PessoaJuridica oPJuridica = (PessoaJuridica)objeto;
            
            PessoaDAO oPessoaDAO = new PessoaDAO();
            
            stmt.setInt(1, oPessoaDAO.cadastrarPessoa(oPJuridica));
            stmt.setString(2, oPJuridica.getCnpj());
            stmt.setInt(3, oPJuridica.getCapital());
            
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR PESSOA JURIDICA - NA DAO "+e.getMessage());
        } 
        
        finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return true;     
    }
    public List<Object> listarPJuridica(){
        
        List<Object> listaPessoaJuridica = new ArrayList<>();
        
        try {
            
        String sql = "select p. *, pj. * from pessoa p,pessoajuridica pj WHERE p.idpessoa = pj.idpessoajuridica order by p.nomepessoa";
        
        stmt = this.conn.prepareStatement(sql);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            
            PessoaJuridica oPessoaJuridica = new PessoaJuridica();
            
            oPessoaJuridica.setIdPessoa(rs.getInt("idpessoa"));
            oPessoaJuridica.setNomePessoa(rs.getString("nomePessoa"));
            oPessoaJuridica.setEndereco(rs.getString("endereco"));
            oPessoaJuridica.setTelefone(rs.getInt("telefone"));
            oPessoaJuridica.setCnpj(rs.getString("cnpj"));
            oPessoaJuridica.setCapital(rs.getInt("capital"));
            oPessoaJuridica.setTipo_pessoa(rs.getString("tipo_pessoa"));
            
            listaPessoaJuridica.add(oPessoaJuridica);
        }
        
        } catch (Exception e) {
            System.out.println("ERRO AO LISTAR PESSOA JURIDICA NA DAO "+e.getMessage());
        }
        finally{
            
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("ERRO AO FECHAR CONEXÃO NA DAO "+e.getMessage());
            }
        }
        return listaPessoaJuridica;
    }
    
    public Object carregarPessoaJuridica(int id){
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        //criação de um objeto vazio para ser preenchido
        PessoaJuridica oPessoaJ = null;
        
        try {
            String sql = "select p.*, pj. * from pessoa p, pessoajuridica pj "
            + "WHERE pj.idpessoajuridica = p.idpessoa AND pj.idpessoajuridica = ?";
            
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            if(rs.next()){
            //irei utilizar o objeto vazio para receber os dados selecionados
                oPessoaJ = new PessoaJuridica();
                
                oPessoaJ.setIdPessoa(rs.getInt("idpessoa"));
                oPessoaJ.setNomePessoa(rs.getString("nomepessoa"));
                oPessoaJ.setEndereco(rs.getString("endereco"));
                oPessoaJ.setTelefone(rs.getInt("telefone"));
                oPessoaJ.setCnpj(rs.getString("cnpj"));
                oPessoaJ.setCapital(rs.getInt("capital"));
                
            }
                    
        } catch (Exception e) {
        System.out.println("ERRO AO CARREGAR PESSOA J NA DAO - "+e.getMessage());
        } 
        
        finally{
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
        System.out.println("ERRO AO FECHAR CONEXÃO NA DAO - "+e.getMessage());
            }
        }
        
        return oPessoaJ;
    }
    public void excluir(int id){
        PreparedStatement stmt = null; 
        
         String sql = "delete from pessoajuridica WHERE idpessoajuridica=?; COMMIT; delete from pessoa WHERE idpessoa=?";
        
        try {
           stmt = conn.prepareStatement(sql);
           stmt.setInt(1, id);
           stmt.setInt(2, id);
           stmt.executeUpdate();
           
        } catch (Exception e) {
            System.out.println("ERRO AO EXCLUIR PESSOA JURIDICA NA DAO "+e.getMessage());
        }
        finally{
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
        System.out.println("ERRO AO FECHAR CONEXÃO NA DAO-EXCLUIR PJ"+e.getMessage());
            }
        }
    }
    
    public boolean alterarPJ(Object objeto){
        
        PessoaJuridica oPessoaJuridica = (PessoaJuridica)objeto;
        PreparedStatement stmt = null;
        
        try {
            String sql = "update pessoajuridica SET cnpj = ?, capital = ? "
                     + "WHERE idpessoajuridica = ?";
            
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, oPessoaJuridica.getCnpj());
            stmt.setInt(2, oPessoaJuridica.getCapital());
            stmt.setInt(3, oPessoaJuridica.getIdPessoa());
            
            try {
                
               if(new PessoaDAO().alterarPessoa(oPessoaJuridica)){
                   stmt.executeUpdate();
                   return true;
               }
               else{
                   return false;
               }
                   
            } catch (Exception e) {
                System.out.println("ERRO AO ALTERAR PESSOA NA DAO "+e.getMessage());
            }
            
        } catch (Exception e) {
            System.out.println("ERRO AO ALTERAR PESSOA JURIDICA NA DAO "+e.getMessage());
            return false;
        }
        finally {
            
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("ERRO AO FECHAR CONEXÃO ! ");
            }
        }
        
        return true;
    }
}
    