/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Funcionario;
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
public class FuncionarioDAO {
    
    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    
    public FuncionarioDAO(){
        try {
    
        this.conn = ConnectionFactory.conectar(); 
        System.out.println("Conectado com sucesso!");
        
        } catch (Exception e) {
            
        System.out.println("ERRO AO CONECTAR AO BANCO - DAO");
        }
    }
    
    public boolean cadastrarFuncionario(Object objeto) throws Exception{
        
        try {
            
            String sql = "insert into funcionario(idpessoafuncionario,cpf,idade) values(?,?,?)";
            stmt = this.conn.prepareStatement(sql);
            
            Funcionario oFunc = (Funcionario)objeto;
            
            PessoaDAO oPessoaDAO = new PessoaDAO();
            
            stmt.setInt(1, oPessoaDAO.cadastrarPessoa(oFunc));
            stmt.setString(2, oFunc.getCpf());
            stmt.setInt(3, oFunc.getIdade());
            
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR Funcionario - NA DAO "+e.getMessage());
        } 
        
        finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return true;     
        
    }
    
    public List<Object> listarFuncionario(){
        
        List<Object> listaFuncionario = new ArrayList<>();
        
        try {
            
            String sql = "select p.*, f.* from pessoa p,funcionario f WHERE p.idpessoa = f.idpessoafuncionario order by p.nomepessoa";
            
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Funcionario oFuncionario = new Funcionario();
                
                oFuncionario.setIdPessoa(rs.getInt("idPessoa"));
                oFuncionario.setNomePessoa(rs.getString("nomepessoa"));
                oFuncionario.setEndereco(rs.getString("endereco"));
                oFuncionario.setTelefone(rs.getInt("telefone"));
                oFuncionario.setTipo_pessoa(rs.getString("tipo_pessoa"));
                oFuncionario.setStatus_pessoa(rs.getString("status_pessoa"));
                oFuncionario.setCpf(rs.getString("cpf"));
                oFuncionario.setIdade(rs.getInt("idade"));
                
                listaFuncionario.add(oFuncionario);
            }
            
        } catch (Exception e) {
            System.out.println("ERRO AO LISTAR FUNCIONÁRIO NA DAO "+e.getMessage());
        }
        finally{
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("ERRO AO FECHAR CONEXÃO NA DAO "+e.getMessage());
            }
        }
        
        return listaFuncionario;
    }
}
