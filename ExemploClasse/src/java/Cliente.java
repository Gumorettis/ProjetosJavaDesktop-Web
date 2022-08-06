/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gusta
 */
//criação de uma classe genérica
//Classe é um objeto do tipo Cliente

public class Cliente {
    
    private String nomeCliente;
    private String login;
    private String senha;
    private int telefone;
    private String endereco; 
    private int idade; 
    
    //métodos construtores
    
    //este é o método construtor Vazio da Classe Cliente
    public Cliente() {
    }
    
    //Foi gerado o método construtor Cheio da Classe Cliente 
    public Cliente(String nomeCliente, String login, String senha, int telefone, String endereco, int idade) {
        this.nomeCliente = nomeCliente;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
