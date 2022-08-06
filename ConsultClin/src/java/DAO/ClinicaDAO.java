/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Clinica;
import UTIL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class ClinicaDAO {

    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;

    public ClinicaDAO() {
        try {
            this.conn = ConnectionFactory.conectar();
        } catch (Exception e) {
            System.out.println("ERRO AO CONECTAR ! ");
        }
    }

    public boolean cadastrarClinica(Object object) throws Exception {

        try {

            String sql = "insert into clinica(nomeclinica,cnpjclinica,enderecoclinica,bairroclinica,cidadeclinica,telefoneclinica,especificacaoclinica) values(?,?,?,?,?,?,?)";

            Clinica oClinica = (Clinica) object;

            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, oClinica.getNomeClinica());
            stmt.setInt(2, oClinica.getCnpjClinica());
            stmt.setString(3, oClinica.getEnderecoClinica());
            stmt.setString(4, oClinica.getBairroClinica());
            stmt.setString(5, oClinica.getCidadeClinica());
            stmt.setString(6, oClinica.getTelefoneClinica());
            stmt.setString(7, oClinica.getEspecificacaoClinica());
            stmt.execute();

        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR!\n erro: " + e.getMessage());
            e.printStackTrace();
        } finally {
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return true;
    }

    public List<Object> listarClinica() throws Exception {

        List<Object> listaClinica = new ArrayList<>();

        try {
            String sql = "select * from clinica";
            
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();
                
            while (rs.next()) {

                Clinica oClinica = new Clinica();

                oClinica.setNomeClinica(rs.getString("nomeclinica"));
                oClinica.setCnpjClinica(rs.getInt("cnpjclinica"));
                oClinica.setEnderecoClinica(rs.getString("enderecoclinica"));
                oClinica.setBairroClinica(rs.getString("bairroclinica"));
                oClinica.setCidadeClinica(rs.getString("cidadeclinica"));
                oClinica.setTelefoneClinica(rs.getString("telefoneclinica"));
                oClinica.setEspecificacaoClinica(rs.getString("especificacaoclinica"));

                listaClinica.add(oClinica);
            }

        } catch (Exception e) {
            System.out.println("ERRO AO LISTAR NA CLIENTE DAO" + e.getMessage());
        } finally {
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return listaClinica;
    }

}
