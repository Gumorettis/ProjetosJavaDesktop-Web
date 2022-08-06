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
            
            stmt.setInt(1, oPublicacao.getIdPublicador().getIdPessoaFisica());
            stmt.setString(2, oPublicacao.getDescricao());
            
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR PUBLICACAO NA DAO "+e.getMessage());
            return false;
        }
        finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return true;
    }
    
    public List<Object> listarPublicacao(){
        //criada uma lista das publicações
        List<Object> listaPublicacoes = new ArrayList<>();
            
        try {
            String sql = "select * from publicacao, pessoaFisica"
                    + " WHERE publicacao.idpublicador = pessoaFisica.idpessoafisica";
            
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
            System.out.println("ERRO AO LISTAR PUB. NA DAO "+e.getMessage());
        }
        finally{
            
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("ERRO AO FECHAR CONEXÃO NA DAO "+e.getMessage());
            }
        }

        return listaPublicacoes;
    }
    
    public Object carregarPublicacao(int idObject){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Publicacao oPublicacao = null;
        
        return oPublicacao;
    }
    
    public void Excluir(int id){
        
    }
}
