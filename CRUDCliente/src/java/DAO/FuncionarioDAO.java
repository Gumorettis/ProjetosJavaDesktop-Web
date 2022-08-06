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

/**
 *
 * @author gusta
 */
public class FuncionarioDAO {
    
    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;

    public FuncionarioDAO() {
        
    try {
    
        this.conn = ConnectionFactory.conectar(); 
        System.out.println("Conectado com sucesso!");
        
        } catch (Exception e) {
            
        System.out.println("ERRO AO CONECTAR AO BANCO - DAO");
        }
    }
    
    public boolean cadastrarFuncionario(Object object)throws Exception{
        
        Boolean retorno = true;
        
        try {
            String sql = "insert into funcionario (id_funcionario) values (?)";
            stmt = this.conn.prepareCall(sql);
            Funcionario funcionario = (Funcionario) object;
            
            PessoaDAO pessoa = new PessoaDAO();
            
            stmt.setInt(1, pessoa.cadastrar(funcionario));
            
            stmt.execute();
            
        } catch (Exception e) {
            retorno = false;
            System.out.println("Erro ao cadastrar funcionario " + e.getMessage());
            
        }finally{            
              ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return retorno;
    }
    
}
