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
    
    protected int idPessoa;
    protected String nomePessoa;
    protected String endereco;
    protected int telefone;
    protected String status_pessoa;
    protected String tipo_pessoa;
    protected String login_pessoa;
    protected String senha_pessoa;
    
    public Pessoa(){
        
    }

    public Pessoa(int idPessoa, String nomePessoa, String endereco, int telefone, String status_pessoa, String tipo_pessoa, String login_pessoa, String senha_pessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.endereco = endereco;
        this.telefone = telefone;
        this.status_pessoa = status_pessoa;
        this.tipo_pessoa = tipo_pessoa;
        this.login_pessoa = login_pessoa;
        this.senha_pessoa = senha_pessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getStatus_pessoa() {
        return status_pessoa;
    }

    public void setStatus_pessoa(String status_pessoa) {
        this.status_pessoa = status_pessoa;
    }

    public String getTipo_pessoa() {
        return tipo_pessoa;
    }

    public void setTipo_pessoa(String tipo_pessoa) {
        this.tipo_pessoa = tipo_pessoa;
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

    
    
}
