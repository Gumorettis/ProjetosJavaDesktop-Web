/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Aluno;
import UTIL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gusta
 */
public class AlunoDAO {
    
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    
    public AlunoDAO(){
        
        try {
            this.conn = ConnectionFactory.conectar();
        } catch (Exception e) {
            System.out.println("Erro ao conectar no BD ");
        }
        
    }
    
    public boolean cadastrarAluno(Object object) throws Exception{
        
        try{
            String sql = "insert into aluno(nomealuno,semestre,nota1,nota2,nota3,nota4,mediafinal) values(?,?,?,?,?,?,?)";
            Aluno oAluno = (Aluno) object;
            stmt= this.conn.prepareStatement(sql);
            
            stmt.setString(1, oAluno.getNomeAluno());
            stmt.setInt(2, oAluno.getSemestre());
            stmt.setInt(3, oAluno.getNota1());
            stmt.setInt(4, oAluno.getNota2());
            stmt.setInt(5, oAluno.getNota3());
            stmt.setInt(6, oAluno.getNota4());
            stmt.setInt(7, oAluno.getMediaFinal());
            
            stmt.execute();
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR NA DAO - " + e.getMessage());
            
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
            
        }
        return true; 
    }
}
