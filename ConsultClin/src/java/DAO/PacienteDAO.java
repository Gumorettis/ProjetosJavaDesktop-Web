/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Paciente;
import UTIL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Heitor
 */
public class PacienteDAO {

    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;

    public PacienteDAO() {

        try {

            this.conn = ConnectionFactory.conectar();
            System.out.println("CONECTADO COM SUCESSO");

        } catch (Exception e) {

            System.out.println("ERRO AO CONECTAR COM O BANCO ");
        }
    
    }

    public boolean cadastrarPaciente(Object object) throws Exception {

        Boolean retorno = true;

        try {

            String sql = "insert into paciente (idpaciente, observacoespaciente) values (?,?)";
            stmt = this.conn.prepareCall(sql);
            Paciente oPaciente = (Paciente) object;

            PessoaDAO oPessoaDAO = new PessoaDAO();

            stmt.setInt(1, oPessoaDAO.cadastrar(oPaciente));
            stmt.setString(2, oPaciente.getObservacoesPaciente());

            stmt.execute();

        } catch (Exception e) {
            retorno = false;
            System.out.println("Erro ao cadastrar paciente " + e.getMessage());

        } finally {
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }

        return retorno;

    }

}
