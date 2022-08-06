/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agendamentoteatro.DAO;

import br.com.agendamentoteatro.model.Administrador;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Gustavo
 */
public class AdministradorDAO {
    
    private ResultSet rs = null;
    
    public ResultSet logarAdmin(Administrador administrador){
        
        try {
            Conexao.ConectDB();
            Statement stmt = Conexao.con.createStatement();  
            String sql = "SELECT user_admin, senha_admin FROM administrador WHERE user_admin = '"+administrador.getUser_admin()+
                    "' AND senha_admin = '"+administrador.getSenha_admin()+"'";
            rs = stmt.executeQuery(sql);
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        return rs;
    }
}
