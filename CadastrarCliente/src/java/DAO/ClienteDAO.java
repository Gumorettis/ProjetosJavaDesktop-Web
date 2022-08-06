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
    
    //método construtor vazio 
    public ClienteDAO(){
        try {
            this.conn = ConnectionFactory.conectar();
        } catch (Exception e) {
            System.out.println("ERRO AO CONECTAR ! ");
        }
    }
    
    public boolean cadastrarCliente(Object object)throws Exception{
        
        try {
            
            String sql = "insert into cliente(nome_cliente,cpf_cliente,idade_cliente,endereco_cliente) "
                    + "values(?,?,?,?)";
            Cliente oCliente = (Cliente)object;
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, oCliente.getNomeCliente());
            stmt.setInt(2, oCliente.getCpfCliente());
            stmt.setInt(3, oCliente.getIdadeCliente());
            stmt.setString(4, oCliente.getEnderecoCliente());
            stmt.executeQuery();
            
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR! ");
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return true;
    }
    
    public List<Object> listarCliente()throws Exception{
        
        //CRIANDO UMA LISTA CHAMADA listaCliente do tipo ArrayList
        List<Object> listaCliente = new ArrayList<>();
        
        try {
            
            //criando o comando que irá executar no banco
            String sql = "select * from cliente";
            stmt = this.conn.prepareStatement(sql);
            rs = this.stmt.executeQuery();
            
            while(rs.next()){
            Cliente oCliente = new Cliente();
            
            //pegando do banco de dados a informação, por meio do RS.get
            oCliente.setNomeCliente(rs.getString("nome_cliente"));
            oCliente.setCpfCliente(rs.getInt("cpf_cliente"));
            oCliente.setEnderecoCliente(rs.getString("endereco_cliente"));
            oCliente.setIdadeCliente(rs.getInt("idade_cliente"));
            
            //preencher os dados na lista criada anteriormente
            listaCliente.add(oCliente);
            
            }
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR NA DAO");
            
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return listaCliente;
    }
    
    public List<Object> listarPorNome(String nome)throws Exception{
        
        List<Object> lista = new ArrayList<>();
        
        Cliente oCliente = new Cliente();
        
        try {
            String sql = "select * from cliente where nome_cliente like ?";
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
            oCliente.setId_cliente(rs.getInt("id_cliente"));
            oCliente.setNomeCliente(rs.getString("nome_cliente"));
            oCliente.setCpfCliente(rs.getInt("cpf_cliente"));
            oCliente.setEnderecoCliente(rs.getString("endereco_cliente"));
            oCliente.setIdadeCliente(rs.getInt("idade_cliente"));
            
            lista.add(oCliente);
                
            }
            
        } catch (Exception e) {
            System.out.println("ERRO AO LISTAR NA DAO");
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return lista;
    }
    
}
