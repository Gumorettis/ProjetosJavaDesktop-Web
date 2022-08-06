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
public class Funcionario extends Pessoa{
    protected int idFuncionario;
    protected String cpf;
    protected int idade; 
    
    public Funcionario(){
        
    }

    public Funcionario(int idFuncionario, String cpf, int idade) {
        this.idFuncionario = idFuncionario;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Funcionario(int idFuncionario, String cpf, int idade, int idPessoa, String nomePessoa, String endereco, int telefone, String status_pessoa, String tipo_pessoa, String login_pessoa, String senha_pessoa) {
        super(idPessoa, nomePessoa, endereco, telefone, status_pessoa, tipo_pessoa, login_pessoa, senha_pessoa);
        this.idFuncionario = idFuncionario;
        this.cpf = cpf;
        this.idade = idade;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
