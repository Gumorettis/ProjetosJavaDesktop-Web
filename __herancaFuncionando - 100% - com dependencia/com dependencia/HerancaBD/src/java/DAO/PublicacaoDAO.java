/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.PessoaFisica;
import MODEL.Publicacao;
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
public class PublicacaoDAO {
    
    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    
    public PublicacaoDAO(){
        
        try {
    
        this.conn = ConnectionFactory.conectar(); 
        System.out.println("Conectado com sucesso!");
        
        } catch (Exception e) {
            
        System.out.println("ERRO AO CONECTAR AO BANCO - DAO");
        }
        
    }
    
    public boolean cadastrarPublicacao(Object objeto)throws Exception{
        
        try {
            
            String sql = "insert into publicacao(idpublicador,descricao) values (?,?)";
            stmt = this.conn.prepareStatement(sql);
            
            Publicacao oPublicacao = (Publicacao)objeto;
            
            stmt.setInt(1,oPublicacao.getIdPublicador().getIdPessoaFisica());
            stmt.setString(2, oPublicacao.getDescricao());
            
            stmt.execute();
            
        } catch (Exception e) {
            
            System.out.println("ERRO AO CADASTRAR PUBLICACAO NA DAO - "+e.getMessage());
            return false;
        }
        
        finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return true;
    }
    
    public List<Object> listarPublicacao(){
        
        List<Object> listaPublicacoes = new ArrayList<>();
        
        try {
            String sql = "select * from publicacao, pessoafisica "
                    + "where publicacao.idpublicador = pessoafisica.idpessoafisica";
            
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Publicacao oPublicacao = new Publicacao();
                
                oPublicacao.setIdPublicacao(rs.getInt("idpublicacao"));
                oPublicacao.setIdPublicador(new PessoaFisica(rs.getInt("idpublicador")));
                oPublicacao.setDescricao(rs.getString("descricao"));
                
                listaPublicacoes.add(oPublicacao);
            }
            
        } catch (Exception e) {
            System.out.println("ERRO AO LISTAR PUBLICACAO NA DAO - "+e.getMessage());
        }finally{
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("ERRO AO FECHAR CONEXÃO na dao = "+e.getMessage());
            }
        }
               
        return listaPublicacoes;
    }
    
    public Object carregarPublicacao(int idObject){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Publicacao oPublicacao = null;
        
        String sql = "select pub.*, pf.* from publicacao pub, pessoaFisica pf WHERE "
                + "pf.idpessoafisica = pub.idpublicador AND pub.idpublicacao=?";
        
        try {
            
            stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                
                oPublicacao = new Publicacao();
                
                oPublicacao.setIdPublicacao(rs.getInt("idpublicacao"));
                oPublicacao.setIdPublicador(new PessoaFisica(rs.getInt("idpublicador")));
                oPublicacao.setDescricao(rs.getString("descricao"));
            }
            
        } catch (Exception e) {
            System.out.println("ERRO AO CARREGAR PUBLICACAO NA DAO "+e.getMessage());
        }finally{
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("ERRO AO FECHAR CONEXÃO NA DAO "+e.getMessage());
            }
        }
        return oPublicacao;
    }
    
    public void Excluir(int id){
        
    }

    public boolean alterarPublicacao(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
