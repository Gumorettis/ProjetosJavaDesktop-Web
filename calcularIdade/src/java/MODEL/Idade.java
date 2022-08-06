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
    
    private int ano;
    
    public Idade(){
        
    }

    public Idade(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String calcularIdade(){
        int calculo, anoBase = 2019;
        String situacao;
        
        calculo = anoBase-ano;
        if(calculo > 18){
            situacao = "Maior de Idade";
        }
        else
            situacao = "Menor de Idade";
        return "Você tem: " +calculo+ " anos e é: "+situacao;
    }
}
