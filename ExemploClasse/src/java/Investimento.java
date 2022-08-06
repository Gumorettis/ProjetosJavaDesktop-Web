/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gusta
 */
public class Investimento {
    
    private String nomeInvestidor;
    private int cpf; 
    private int idade; 
    private double valorInvestimento; 
    
    public Investimento(){
        
    }

    public Investimento(String nomeInvestidor, int cpf, int idade, double valorInvestimento) {
        this.nomeInvestidor = nomeInvestidor;
        this.cpf = cpf;
        this.idade = idade;
        this.valorInvestimento = valorInvestimento;
    }

    public String getNomeInvestidor() {
        return nomeInvestidor;
    }

    public void setNomeInvestidor(String nomeInvestidor) {
        this.nomeInvestidor = nomeInvestidor;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }
    
    
    public String calcularSalario(){
        String mensagem="";
        double calculo;
        
        calculo = valorInvestimento*(12*0.02);
       
        mensagem = "Seu nome é: "+nomeInvestidor+ " e em um ano seu dinheiro rendeu: R$"+calculo+ " sendo 2% ao mês";
        return  mensagem;
    }
}
