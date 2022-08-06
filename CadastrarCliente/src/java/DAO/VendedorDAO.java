/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Vendedor;
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
public class VendedorDAO {
    
    private ResultSet rs;
    private PreparedStatement stmt;
    private Connection conn;
    
   public VendedorDAO(){
       try {
            this.conn = ConnectionFactory.conectar();
        } catch (Exception e) {
            System.out.println("ERRO AO CONECTAR ! ");
        }
   }
   
   public boolean cadastrarVendedor(Object object)throws Exception{
       
       try {
           
           String sql = "insert into vendedor(nome_vendedor,rg_vendedor,empresa,horas_trabalhadas)values(?,?,?,?)";
           Vendedor oVendedor = (Vendedor)object;
           stmt = this.conn.prepareStatement(sql);
           stmt.setString(1, oVendedor.getNome_vendedor());
           stmt.setString(2, oVendedor.getRg_vendedor());
           stmt.setString(3, oVendedor.getEmpresa());
           stmt.setInt(4, oVendedor.getHoras_trabalhadas());
           
           stmt.executeQuery();
           
       } catch (Exception e) {
           System.out.println("ERRO AO CADASTRAR NA DAO"+e.getMessage());
       }finally{
           ConnectionFactory.fecharConexao(conn, stmt, rs);
       }
       
       return true;
   }
   
}
