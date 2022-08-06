/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author gusta
 */
public class Pessoa {
    
    //DECLARO TODOS OS ATRIBUTOS 
    private Integer id_pessoa;
    private String cpf_pessoa;
    private String nome_pessoa;
    private String email_pessoa;
    private String login_pessoa;
    private String senha_pessoa;
    private String telefone_pessoa;
    private String tipo_pessoa;
    
    //METODO CONSTRUTOR VAZIO
    public Pessoa(){
        
    }
    
    //METODO CONSTRUTOR CHEIO

    public Pessoa(Integer id_pessoa, String cpf_pessoa, String nome_pessoa, String email_pessoa, String login_pessoa, String senha_pessoa, String telefone_pessoa, String tipo_pessoa) {
        this.id_pessoa = id_pessoa;
        this.cpf_pessoa = cpf_pessoa;
        this.nome_pessoa = nome_pessoa;
        this.email_pessoa = email_pessoa;
        this.login_pessoa = login_pessoa;
        this.senha_pessoa = senha_pessoa;
        this.telefone_pessoa = telefone_pessoa;
        this.tipo_pessoa = tipo_pessoa;
    }

    public Integer getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Integer id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getCpf_pessoa() {
        return cpf_pessoa;
    }

    public void setCpf_pessoa(String cpf_pessoa) {
        this.cpf_pessoa = cpf_pessoa;
    }

    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public String getEmail_pessoa() {
        return email_pessoa;
    }

    public void setEmail_pessoa(String email_pessoa) {
        this.email_pessoa = email_pessoa;
    }

    public String getLogin_pessoa() {
        return login_pessoa;
    }

    public void setLogin_pessoa(String login_pessoa) {
        this.login_pessoa = login_pessoa;
    }

    public String getSenha_pessoa() {
        return senha_pessoa;
    }

    public void setSenha_pessoa(String senha_pessoa) {
        this.senha_pessoa = senha_pessoa;
    }

    public String getTelefone_pessoa() {
        return telefone_pessoa;
    }

    public void setTelefone_pessoa(String telefone_pessoa) {
        this.telefone_pessoa = telefone_pessoa;
    }

    public String getTipo_pessoa() {
        return tipo_pessoa;
    }

    public void setTipo_pessoa(String tipo_pessoa) {
        this.tipo_pessoa = tipo_pessoa;
    }
       
}
