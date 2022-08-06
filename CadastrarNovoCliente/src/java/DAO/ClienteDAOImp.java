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
public class ClienteDAOImp implements GenericDAO {
    
    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    
    //o codigo abaixo abre uma nova conexão com o banco de dados
    public ClienteDAOImp(){
        
        try {
            this.conn = ConnectionFactory.conectar();
            
        } catch (Exception e) {
            
        System.out.println("ERRO AO TENTAR ABRIR NOVA CONEXÃO ! ");
        }
    }
    
    @Override
    public boolean cadastrar(Object parametro)throws Exception{
        
        try {
           //declração do comando sql que será executado lá no banco 
           String sql = "insert into cliente(nomecliente, rgcliente, idade, telefone)values(?,?,?,?)"; 
           
           //conversão de parametro para objeto(object)
           Cliente oCliente = (Cliente)parametro;
           
           //aviso o meu programa, comece a preparar a linha sql
           //pois o código a seguir envia dados para o value da linha sql
           stmt = this.conn.prepareStatement(sql);
           
           //estamos fazendo a passagem dos valores para os values do sql
           stmt.setString(1, oCliente.getNomeCliente());
           stmt.setString(2, oCliente.getRgCliente());
           stmt.setInt(3, oCliente.getIdadeCliente());
           stmt.setString(4, oCliente.getTelefoneCliente());
           
           //serve para executar a String sql lá no banco de dados
           stmt.execute();
           
        } 
        
        catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR DADOS NO BANCO - DAO"+e.getMessage());
        }
        finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
       return true;
    }
    
    @Override
    public void deletar(int idObjeto) {
        
        try {
            
            String sql = "delete from cliente where idCliente = ?";
            stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, idObjeto);
            stmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERRO AO EXCLUIR CLIENTE NA DAO "+e.getMessage());
        }
        
    }

    @Override
    public List<Object> listar() {
        
        //criamos a nossa lista para preencher com dados 
        List<Object> listaCliente = new ArrayList<>();
        
        try {
            
            String sql = "select * from cliente";
            
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            //enquanto tiver dados retornados pelo banco, pegue
            //esses dados e envia para a listaCliente
            while(rs.next()){
                Cliente oCliente = new Cliente();
                
                //é o processo de recuperação dos dados enviados pelo banco
                oCliente.setIdCliente(rs.getInt("idCliente"));
                oCliente.setNomeCliente(rs.getString("nomecliente"));
                oCliente.setRgCliente(rs.getString("rgcliente"));
                oCliente.setIdadeCliente(rs.getInt("idade"));
                oCliente.setTelefoneCliente(rs.getString("telefone"));
                
                //adicionar todas as informações recuperadas na lista
                listaCliente.add(oCliente);
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao listar Cliente na DAO "+e.getMessage());
        }finally{
            
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar conexao na DAO - Listar! "+e.getMessage());
            }
        }
       return listaCliente;
    }

    @Override
    public List<Object> listarPorNome(String nome)throws Exception{
        
        List<Object> listaDeDados = new ArrayList<>();
        
        try {
            
            String sql = "select idCliente,nomecliente,rgcliente,idade,telefone from cliente where nomecliente like ?";
            
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,"%"+nome+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Cliente oCliente = new Cliente();
                
                //é o processo de recuperação dos dados enviados pelo banco
                oCliente.setIdCliente(rs.getInt("idCliente"));
                oCliente.setNomeCliente(rs.getString("nomecliente"));
                oCliente.setRgCliente(rs.getString("rgcliente"));
                oCliente.setIdadeCliente(rs.getInt("idade"));
                oCliente.setTelefoneCliente(rs.getString("telefone"));
                
                //adicionar todas as informações recuperadas na lista
                listaDeDados.add(oCliente);
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao listar Cliente por Nome na DAO "+e.getMessage());
        }finally{
            
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar conexao na DAO - Listar! "+e.getMessage());
            }
        }
        
        return listaDeDados;
    }
    
    public Object carregarCliente(int idObjeto){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Cliente oCliente = null; 
        
        try {
            
            String sql = "select c. * from Cliente c WHERE c.idCliente = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObjeto);
            rs = stmt.executeQuery();
            
            if(rs.next()){
               
                //reativando o objeto para ser 
                //preenchido
                oCliente = new Cliente();
                oCliente.setIdCliente(rs.getInt("idCliente"));
                oCliente.setNomeCliente(rs.getString("nomeCliente"));
                oCliente.setIdadeCliente(rs.getInt("idade"));
                oCliente.setRgCliente(rs.getString("rgCliente"));
                oCliente.setTelefoneCliente(rs.getString("telefone"));
                
            }
            
        } catch (Exception e) {
            System.out.println("ERRO AO CARREGAR NA DAO "+e.getMessage());
        }finally{
            
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("ERRO AO FECHAR CONEXAO NA DAO - "+ex.getMessage());
            }
            
        }
       
     return oCliente;
    }
    
    public boolean alterarCliente(Object objeto){
        
        Cliente oCliente = (Cliente)objeto;
        PreparedStatement stmt = null;
        
        try {
            
            String sql = "update cliente SET nomeCliente = ?, rgCliente = ?, idade = ?, telefone = ?";
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, oCliente.getNomeCliente());
            stmt.setString(2, oCliente.getRgCliente());
            stmt.setInt(3, oCliente.getIdadeCliente());
            stmt.setString(4, oCliente.getTelefoneCliente());
            
            stmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERRO AO ALTERAR NA DAO "+e.getMessage());
        } finally{
            
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("ERRO AO FECHAR CONEXÃO NA DAO ");
            }
        }
        return true;
    }
}

