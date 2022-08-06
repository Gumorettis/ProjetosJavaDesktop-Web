/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.PessoaFisica;
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
public class PFisicaDAO {
    
    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    
    public PFisicaDAO(){
        try {
    
        this.conn = ConnectionFactory.conectar(); 
        System.out.println("Conectado com sucesso!");
        
        } catch (Exception e) {
            
        System.out.println("ERRO AO CONECTAR AO BANCO - DAO");
        }
    }
    
    public boolean cadastrarPFisica(Object objeto)throws Exception{
        try {
            
            String sql = "insert into pessoaFisica(idPessoaFisica,cpf,idade) values(?,?,?)";
            stmt = this.conn.prepareStatement(sql);
            
            PessoaFisica oPFisica = (PessoaFisica)objeto;
            
            PessoaDAO oPessoaDAO = new PessoaDAO();
            
            stmt.setInt(1, oPessoaDAO.cadastrarPessoa(oPFisica));
            stmt.setString(2, oPFisica.getCpf());
            stmt.setInt(3, oPFisica.getIdade());
            
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR PESSOA FISICA - NA DAO "+e.getMessage());
        } 
        
        finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return true;     
    }
    
    public List<Object> listarPFisica(){
        
        List<Object> listaPessoaFisica = new ArrayList<>();
        
        try {
            
        String sql = "select p.*, pf.* from pessoa p,pessoafisica pf WHERE p.idpessoa = pf.idpessoafisica order by p.nomepessoa";
        
        stmt = this.conn.prepareStatement(sql);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            
            PessoaFisica oPessoaFisica = new PessoaFisica();
            
            oPessoaFisica.setIdPessoa(rs.getInt("idpessoa"));
            oPessoaFisica.setNomePessoa(rs.getString("nomePessoa"));
            oPessoaFisica.setEndereco(rs.getString("endereco"));
            oPessoaFisica.setTelefone(rs.getInt("telefone"));
            oPessoaFisica.setCpf(rs.getString("cpf"));
            oPessoaFisica.setIdade(rs.getInt("idade"));
            oPessoaFisica.setTipo_pessoa(rs.getString("tipo_pessoa"));
            
            listaPessoaFisica.add(oPessoaFisica);
        }
        
        } catch (Exception e) {
            System.out.println("ERRO AO LISTAR PESSOA FISICA NA DAO "+e.getMessage());
        }
        finally{
            
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("ERRO AO FECHAR CONEXÃO NA DAO "+e.getMessage());
            }
        }
        return listaPessoaFisica;
    }
    
    public void excluir(int id){
        PreparedStatement stmt = null; 
        
        String sql = "delete from pessoafisica WHERE idpessoafisica=?; COMMIT; "
                     + "delete from pessoa WHERE idpessoa=?";
        
        try {
           stmt = conn.prepareStatement(sql);
           stmt.setInt(1, id);
           stmt.setInt(2, id);
           stmt.executeUpdate();
           
        } catch (Exception e) {
            System.out.println("ERRO AO EXCLUIR PESSOA FISICA NA DAO "+e.getMessage());
        }
        finally{
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
        System.out.println("ERRO AO FECHAR CONEXÃO NA DAO-EXCLUIR PF"+e.getMessage());
            }
        }
    }
    
    public Object carregarPessoaFisica(int id){
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        //criação de um objeto vazio para ser preenchido
        PessoaFisica oPessoaF = null;
        
        try {
            String sql = "select p.*, pf. * from pessoa p, pessoafisica pf "
            + "WHERE pf.idpessoafisica = p.idpessoa AND pf.idpessoafisica = ?";
            
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            if(rs.next()){
            //irei utilizar o objeto vazio para receber os dados selecionados
                oPessoaF = new PessoaFisica();
                
                oPessoaF.setIdPessoa(rs.getInt("idpessoa"));
                oPessoaF.setNomePessoa(rs.getString("nomepessoa"));
                oPessoaF.setEndereco(rs.getString("endereco"));
                oPessoaF.setTelefone(rs.getInt("telefone"));
                oPessoaF.setCpf(rs.getString("cpf"));
                oPessoaF.setIdade(rs.getInt("idade"));
                
            }
                    
        } catch (Exception e) {
        System.out.println("ERRO AO CARREGAR PESSOA F NA DAO - "+e.getMessage());
        } 
        
        finally{
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
        System.out.println("ERRO AO FECHAR CONEXÃO NA DAO - "+e.getMessage());
            }
        }
        
        return oPessoaF;
    }
    
    public boolean alterarPF(Object objeto){
        
        PessoaFisica oPessoaFisica = (PessoaFisica)objeto;
        PreparedStatement stmt = null;
        
        try {
        String sql = "update pessoafisica SET cpf = ?, idade = ? "
                     + "WHERE idpessoafisica = ?";
        stmt = conn.prepareStatement(sql);
        
        stmt.setString(1, oPessoaFisica.getCpf());
        stmt.setInt(2, oPessoaFisica.getIdade());
        stmt.setInt(3, oPessoaFisica.getIdPessoa());
        
        try {
            if(new PessoaDAO().alterarPessoa(oPessoaFisica)){
                stmt.executeUpdate();
                return true;
            }
            else{
                return false;
            }
            
        } catch (Exception e) {
        System.out.println("ERRO AO ALTERAR PESSOA "+e.getMessage());
        }
            }catch (Exception e) {
            System.out.println("ERRO AO ALTERAR PESSOA FISICA"+e.getMessage());  
            return false;
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