/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Produto;
import UTIL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author gusta
 */
public class ProdutoDAOImp implements GenericDAO{

    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    
    //o codigo abaixo abre uma nova conexão com o banco de dados
    public ProdutoDAOImp(){
        
        try {
            this.conn = ConnectionFactory.conectar();
            
        } catch (Exception e) {
            
        System.out.println("ERRO AO TENTAR ABRIR NOVA CONEXÃO ! ");
        }
    }
    
    
    @Override
    public boolean cadastrar(Object caxinha) throws Exception {
        
        try {
            
            String sql = "insert into produto(nomeProduto, valor, tipoProduto)values(?,?,?)";
            Produto oProduto = (Produto)caxinha;
            
            stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, oProduto.getNomeProduto());
            stmt.setInt(2, oProduto.getValor());
            stmt.setString(3, oProduto.getTipoProduto());
            
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR NA DAO "+e.getMessage());
        }
        
        finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return true;
    }

    @Override
    public void deletar(int idObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
