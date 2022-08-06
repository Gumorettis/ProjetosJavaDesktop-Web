/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Pessoa;
import UTIL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Heitor
 */
public class PessoaDAO {

    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;

    public PessoaDAO() {
        try {
            this.conn = ConnectionFactory.conectar();
        } catch (Exception e) {
            System.out.println("ERRO AO CONECTAR ! ");
        }
    }

    public Integer cadastrar(Object object) throws Exception {

        try {

            String sql = "insert into pessoa(nomepessoa,cpfpessoa,datanascimentopessoa,generopessoa,enderecopessoa,bairropessoa,cidadepessoa,ceppessoa,telefonepessoa,celularpessoa,emailpessoa,senhapessoa) values(?,?,?,?,?,?,?,?,?,?,?,?) returning idpessoa";

            stmt = this.conn.prepareStatement(sql);

            Pessoa oPessoa = (Pessoa) object;

            stmt.setString(1, oPessoa.getNomePessoa());
            stmt.setInt(2, oPessoa.getCpfPessoa());
            stmt.setDate(3, new java.sql.Date(oPessoa.getDataNascimentoPessoa().getTime()));
            stmt.setString(4, oPessoa.getGeneroPessoa());
            stmt.setString(5, oPessoa.getEnderecoPessoa());
            stmt.setString(6, oPessoa.getBairroPessoa());
            stmt.setString(7, oPessoa.getCidadePessoa());
            stmt.setString(8, oPessoa.getCepPessoa());
            stmt.setString(9, oPessoa.getTelefonePessoa());
            stmt.setString(10, oPessoa.getCelularPessoa());
            stmt.setString(11, oPessoa.getEmailPessoa());
            stmt.setString(12, oPessoa.getSenhaPessoa());
            rs = stmt.executeQuery();

            rs.next();

        } catch (Exception e) {
            System.out.println("Erro ao inserir Pessoa " + e.getMessage());
        }
        return rs.getInt("idPessoa");

    }
}
