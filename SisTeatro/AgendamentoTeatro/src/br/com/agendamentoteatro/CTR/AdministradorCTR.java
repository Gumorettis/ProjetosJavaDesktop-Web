/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agendamentoteatro.CTR;

import br.com.agendamentoteatro.DAO.AdministradorDAO;
import br.com.agendamentoteatro.model.Administrador;
import java.sql.ResultSet;

/**
 *
 * @author Gustavo
 */
public class AdministradorCTR {
        
    public ResultSet logarAdmin(String user_admin, int senha_admin){
        
        Administrador administrador = new Administrador();
        AdministradorDAO oAdministradorDAO = new AdministradorDAO();
        
        administrador.setUser_admin(user_admin);
        administrador.setSenha_admin(senha_admin);
        
        ResultSet rs;
        rs = oAdministradorDAO.logarAdmin(administrador);
        return rs;
        
    }
}
