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
public class Salario {
    
    private double valorHora;
    private String nomeFuncionario;
    private double qtdHorasTrab;
    
    public Salario(){
        
    }

    public Salario(double valorHora, String nomeFuncionario, double qtdHorasTrab) {
        this.valorHora = valorHora;
        this.nomeFuncionario = nomeFuncionario;
        this.qtdHorasTrab = qtdHorasTrab;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double getQtdHorasTrab() {
        return qtdHorasTrab;
    }

    public void setQtdHorasTrab(double qtdHorasTrab) {
        this.qtdHorasTrab = qtdHorasTrab;
    }
    
    public double calcularSalario(){
        double aux; 
        aux = qtdHorasTrab*valorHora;
        
        return aux; 
        
    }
}
