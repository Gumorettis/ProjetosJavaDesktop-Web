/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Consulta;
import UTIL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Heitor
 */
public class ConsultaDAO {

    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;

    public ConsultaDAO() {

        try {

            this.conn = ConnectionFactory.conectar();
            System.out.println("CONECTADO COM SUCESSO");

        } catch (Exception e) {

            System.out.println("ERRO AO CONECTAR COM O BANCO ");
        }

    }

    public boolean cadastrarConsulta(Object object) throws Exception {

        try {

            String sql = "insert into consulta(descricaoConsulta, tipoServicoConsulta) values (?,?)";

            Consulta oConsulta = (Consulta) object;

            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, oConsulta.getDescricaoConsulta());
            stmt.setString(2, oConsulta.getTipoServicoConsulta());
            stmt.execute();

        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR!\n erro: " + e.getMessage());
            e.printStackTrace();
        } finally {
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return true;

    }
}
