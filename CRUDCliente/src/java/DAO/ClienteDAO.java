/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Cliente;
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
public class ClienteDAO {
    
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
    
    public boolean cadastrarCliente(Object object)throws Exception{
        
        try {
            
            String sql = "insert into cliente(nome_cliente,telefone_cliente,cpf_cliente)values(?,?,?)";
            Cliente oCliente = (Cliente)object;
            
            //passamos a linha SQL PARA ser gerenciada pelo Statement
            stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, oCliente.getNome());
            stmt.setInt(2, oCliente.getTelefone());
            stmt.setString(3, oCliente.getCpf());
            
            stmt.execute(); //COMANDO EXECUTA A LINHA SQL NO BANCO
            
        } catch (Exception e) {
        System.out.println("ERRO AO CADASTRAR NA DAO"+e.getMessage());
        
        } finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        } 
    return true;
}
    
    public List<Object> listarCliente()throws Exception{
        
        List<Object> listaCliente = new ArrayList<>();
        
        try {
            
            String sql = "select * from cliente";
            stmt = this.conn.prepareStatement(sql);
            rs = this.stmt.executeQuery();
            
            while(rs.next()){
                
                Cliente oCliente = new Cliente();
                
                oCliente.setNome(rs.getString("nome_cliente"));
                oCliente.setTelefone(rs.getInt("telefone_cliente"));
                oCliente.setCpf(rs.getString("cpf_cliente"));
                
                listaCliente.add(oCliente);
            }
        } catch (Exception e) {
            System.out.println("ERRO AO LISTAR NA CLIENTE DAO"+e.getMessage());
        } finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return listaCliente;
    }
    
    public List<Object> listarPorNome(String nome)throws Exception{
        
        List<Object> lista = new ArrayList<>();
        
        Cliente oCliente = new Cliente();
        
        try {
            String sql = "select id_cliente,nome_cliente,telefone_cliente,cpf_cliente from cliente "
                    + "where nome_cliente like ? ";
            
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                oCliente.setId_cliente(rs.getInt("id_cliente"));
                oCliente.setNome(rs.getString("nome_cliente"));
                oCliente.setCpf(rs.getString("cpf_cliente"));
                oCliente.setTelefone(rs.getInt("telefone_cliente"));
                lista.add(oCliente);
            }
        } catch (Exception e) {
            System.out.println("ERRO AO LISTAR POR NOME E PEGAR O ID");
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return lista;
    }
    
    public void excluir(int telefoneObject) {
        
        try {
            
            String sql = "delete from cliente where telefone_cliente = ?";
            stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, telefoneObject);
            stmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERRO AO EXCLUIR CLIENTE "+e.getMessage());
        }
    }
}
