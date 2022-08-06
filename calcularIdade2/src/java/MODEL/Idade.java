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
public class Idade {
    
    private String nome;
    private int ano; 
    
    public Idade(){
        
    }

    public Idade(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
   
    public String calcularIdade(){
        int calculoIdade;
        String mensagem = "";
        
        calculoIdade = 2019 - ano;
        mensagem = "A sua idade é: "+calculoIdade;
        
        return mensagem;
    }
}
