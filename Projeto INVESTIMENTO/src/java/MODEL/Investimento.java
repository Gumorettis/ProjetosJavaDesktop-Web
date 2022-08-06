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
    
    public String calcularInvestimento(){
        double calcularPoup, calcularCDI, calcularAcao;
        String mensagem="";
        
        calcularPoup = (valorInvestimento*0.06)+valorInvestimento;
        calcularCDI = (valorInvestimento*0.08)+valorInvestimento;
        calcularAcao = (valorInvestimento*0.12)+valorInvestimento;
        
        mensagem = "Valor na Poupanca: "+calcularPoup+ 
                "</br> Valor no CDI: "+calcularCDI+ 
                "</br> Valor nas Acoes: "+calcularAcao;
        
        return mensagem;
    }
   
    
}
