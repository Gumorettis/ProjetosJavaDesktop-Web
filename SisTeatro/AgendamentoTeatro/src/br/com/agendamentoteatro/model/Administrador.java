/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agendamentoteatro.model;

/**
 *
 * @author Gustavo
 */
public class Administrador {
    
    private int id_administrador;
    private String user_admin;
    private int senha_admin;
    
    public Administrador(){
        
    }

    public Administrador(int id_administrador, String user_admin, int senha_admin) {
        this.id_administrador = id_administrador;
        this.user_admin = user_admin;
        this.senha_admin = senha_admin;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public String getUser_admin() {
        return user_admin;
    }

    public void setUser_admin(String user_admin) {
        this.user_admin = user_admin;
    }

    public int getSenha_admin() {
        return senha_admin;
    }

    public void setSenha_admin(int senha_admin) {
        this.senha_admin = senha_admin;
    }

    
    
}
