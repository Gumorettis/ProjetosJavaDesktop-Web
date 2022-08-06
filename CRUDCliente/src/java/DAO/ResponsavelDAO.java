/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Responsavel;
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
public class ResponsavelDAO {
    
    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    
    
    public ResponsavelDAO(){
    try {
    
        this.conn = ConnectionFactory.conectar(); 
        System.out.println("Conectado com sucesso!");
        
        } catch (Exception e) {
            
        System.out.println("ERRO AO CONECTAR AO BANCO - DAO");
        }
    }
    
    public boolean cadastrarResponsavel(Object object)throws Exception{
        Boolean retorno = true;
        
        try {
            String sql = "insert into responsavel (id_responsavel,nick_responsavel) values (?,?)";
            stmt = this.conn.prepareStatement(sql);
            Responsavel responsavel = (Responsavel) object;
            
            PessoaDAO pessoa = new PessoaDAO();
            
            stmt.setInt(1, pessoa.cadastrar(responsavel));
            stmt.setString(2, responsavel.getNickResponsavel());
            
            stmt.execute();
            
        } catch (Exception e) {
            retorno = false;
            System.out.println("Erro ao cadastrar Responsavel " + e.getMessage());
            
        }finally{            
              ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return retorno;
    }
    
    public List<Object> listarResponsavel(){
        
        List<Object> listaResponsaveis = new ArrayList<>();
        
        try {
            
            String sql = "select p.*, r.* from pessoa p, responsavel r "
                    + "where p.id_pessoa = r.id_responsavel order by p.nome_pessoa ";
            
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Responsavel oResponsavel = new Responsavel();
                
                oResponsavel.setId_responsavel(rs.getInt("id_responsavel"));
                oResponsavel.setCpf_pessoa(rs.getString("cpf_pessoa"));
                oResponsavel.setNome_pessoa(rs.getString("nome_pessoa"));
                oResponsavel.setLogin_pessoa(rs.getString("login_pessoa"));
                oResponsavel.setEmail_pessoa(rs.getString("email_pessoa"));
                oResponsavel.setTelefone_pessoa(rs.getString("telefone_pessoa"));
                oResponsavel.setNickResponsavel(rs.getString("nick_responsavel"));
                oResponsavel.setSenha_pessoa(rs.getString("senha_pessoa"));
                
                listaResponsaveis.add(oResponsavel);
                
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar responsavel " + e.getMessage());
        }finally{
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar os parâmetros de conexão!"
                        + "\n Erro: " + e.getMessage());
            }
        }
        return listaResponsaveis;
    }
    
    public void excluir(int id){
        PreparedStatement stmt = null;
        
        String sql = "DELETE from responsavel where id_responsavel = ?; COMMIT; delete from pessoa where id_pessoa = ?";
        
        try {
            
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            
        } catch (Exception ex) {
            
            System.out.println("Erro ao excluir Responsavel!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
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
    
    public Object carregarResponsavel(int idOject){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //criando um objeto para ser retornado para o método
        Responsavel responsavel = null;
        
        String sql = "select r.*, p.* from responsavel r, pessoa p WHERE r.id_responsavel = p.id_pessoa AND r.id_responsavel = ?";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idOject);
            rs = stmt.executeQuery();
            
            if(rs.next()){
              responsavel = new Responsavel();
              
              responsavel.setId_responsavel(rs.getInt("id_pessoa"));
              responsavel.setNome_pessoa(rs.getString("nome_pessoa"));
              responsavel.setCpf_pessoa(rs.getString("cpf_pessoa"));
              responsavel.setEmail_pessoa(rs.getString("email_pessoa"));
              responsavel.setLogin_pessoa(rs.getString("login_pessoa"));
              responsavel.setSenha_pessoa(rs.getString("senha_pessoa"));
              responsavel.setTelefone_pessoa(rs.getString("telefone_pessoa"));
              responsavel.setNickResponsavel(rs.getString("nick_responsavel"));
              
            }
            
        } catch (Exception ex) {
            
            System.out.println("Problemas ao carregar Responsavel!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        }finally{
            
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
                
            } catch (Exception ex) {
                
                System.out.println("Problemas ao fechar os parâmetros de conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        return responsavel;
    }
    
    public boolean alterarR(Object objeto){
        
        Responsavel oResponsavel = (Responsavel) objeto;
        PreparedStatement stmt = null;
        
        String sql = "update responsavel SET nick_responsavel = ? WHERE id_responsavel = ?";
        
        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, oResponsavel.getNickResponsavel());
            stmt.setInt(2, oResponsavel.getId_responsavel());
            
            try {
                if(new PessoaDAO().alterar(oResponsavel)){
                    stmt.executeUpdate();
                    return true;
                }
                else 
                    return false;
            } catch (Exception ex) {
                
                System.out.println("Problemas ao alterar Pessoa!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
                return false;
            }
            
        } catch (Exception ex) {
            System.out.println("Erro ao alterar Responsavel!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
            
        } finally{
            
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
