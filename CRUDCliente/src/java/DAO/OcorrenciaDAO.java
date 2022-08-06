/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Ocorrencia;
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
public class OcorrenciaDAO {

    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    public OcorrenciaDAO() throws Exception {

        try {

            this.conn = ConnectionFactory.conectar();
            System.out.println("Conectado com sucesso!");

        } catch (Exception e) {

            System.out.println("ERRO AO CONECTAR AO BANCO - DAO");
        }
    }

    public boolean cadastrarOcorrencia(Object object) throws Exception {

        Boolean retorno = true;

        try {
            String sql = "insert into ocorrencia(descricaoocorrencia,idresp) values (?,?)";
            stmt = this.conn.prepareStatement(sql);
            Ocorrencia oOcorrencia = (Ocorrencia) object;

            stmt.setString(1, oOcorrencia.getDescricao_ocorrencia());

            //recuperação do ID utilizando a classe de dependencia para passar ao banco na string sql
            stmt.setInt(2, oOcorrencia.getResponsavel().getId_responsavel());

            stmt.execute();

        } catch (Exception e) {
            retorno = false;
            System.out.println("Erro ao cadastrar Ocorrencia NA DAO" + e.getMessage());

        } finally {
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }

        return retorno;
    }

    public List<Object> listarOcorrencia() {

        List<Object> listaOcorrencias = new ArrayList<>();

        try {

            String sql = "select * from ocorrencia, responsavel "
                    + " where ocorrencia.idresp = responsavel.id_responsavel ";

            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Ocorrencia ocorrencia = new Ocorrencia();

                ocorrencia.setId_ocorrencia(rs.getInt("idocorrencia"));
                ocorrencia.setDescricao_ocorrencia(rs.getString("descricaoocorrencia"));
                ocorrencia.setResponsavel(new Responsavel(rs.getInt("idresp")));

                listaOcorrencias.add(ocorrencia);

            }
        } catch (Exception e) {
            System.out.println("Erro ao listar Ocorrencia na DAO " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar os parâmetros de conexão!"
                        + "\n Erro: " + e.getMessage());
            }
        }
        
        return listaOcorrencias;
    }

    public boolean alterarOcorrencia(Object objeto) {

        Ocorrencia oOcorrencia = (Ocorrencia) objeto;
        PreparedStatement stmt = null;

        String sql = "update ocorrencia SET descricaoocorrencia = ?, idresp = ? WHERE idocorrencia = ?;";

        try {
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, oOcorrencia.getDescricao_ocorrencia());
            stmt.setInt(2, oOcorrencia.getResponsavel().getId_responsavel());
            stmt.setInt(3, oOcorrencia.getId_ocorrencia());

            stmt.executeUpdate();
            return true;

        } catch (Exception ex) {

            System.out.println("Problemas ao alterar Ocorrencia! NA DAO"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
            
        } finally {

            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);

            } catch (Exception ex) {

                System.out.println("Problemas ao fechar os parâmetros da conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

    }

    public Object carregarOcorrencia(int idOject) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        //criando um objeto para ser retornado para o método
        Ocorrencia ocorrencia = null;

        String sql = "select o.*, r.* from responsavel r, ocorrencia o WHERE "
                + "r.id_responsavel = o.idresp AND o.idocorrencia = ?";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idOject);
            rs = stmt.executeQuery();

            if (rs.next()) {
                ocorrencia = new Ocorrencia();

                ocorrencia.setId_ocorrencia(rs.getInt("idocorrencia"));
                ocorrencia.setDescricao_ocorrencia(rs.getString("descricaoocorrencia"));
                ocorrencia.setResponsavel(new Responsavel(rs.getInt("idresp")));
            }
        } catch (Exception ex) {

            System.out.println("Problemas ao carregar Ocorrencia!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();

        } finally {

            try {
                ConnectionFactory.fecharConexao(conn, stmt, rs);

            } catch (Exception ex) {

                System.out.println("Problemas ao fechar os parâmetros de conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return ocorrencia;

    }

    public void excluir(int id) {

        PreparedStatement stmt = null;

        String sql = "DELETE from ocorrencia where idocorrencia = ?; COMMIT";

        try {

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (Exception ex) {

            System.out.println("Erro ao excluir Ocorrencia!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {

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
