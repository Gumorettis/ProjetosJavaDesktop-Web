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
public class Usuario {
    
    private String nomeUsuario;
    private int anoAtual;
    private int anoNascimento;
    
    public Usuario(){
        
    }

    public Usuario(String nomeUsuario, int anoAtual, int anoNascimento) {
        this.nomeUsuario = nomeUsuario;
        this.anoAtual = anoAtual;
        this.anoNascimento = anoNascimento;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public int calcularIdade(){
        int calculoIdade = 0;
        
        calculoIdade = anoAtual-anoNascimento;
        
        return calculoIdade;
    }
    
    //SGBD significa : Sistema de gerenciamento de banco de dados 
    //SGBD ele irá executar comandos SQL no banco de dados
    //os comandos são criados e enviados para o SGBD pelo desenvolvedor
    //comandos SQL é a linguagem de programação utilizada em banco de dados
    
    //senha do BD: postgres
}
