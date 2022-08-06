/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gusta
 */
public class Salario {
    private String nomeFuncionario;
    private int horasTrabalhadas; 
    private double valorHoraT; 
    
    //construtor vazio
    public Salario(){
        
    }
    
    //construtor cheio

    public Salario(String nomeFuncionario, int horasTrabalhadas, double valorHoraT) {
        this.nomeFuncionario = nomeFuncionario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoraT = valorHoraT;
    }
    
    //montar os métodos get e set

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHoraT() {
        return valorHoraT;
    }

    public void setValorHoraT(double valorHoraT) {
        this.valorHoraT = valorHoraT;
    }
    
    public double calcularSalario(){
        //adota função de retorno do método e função para auxiliar no calculo
        //variavel local
        double calculoSalario = 0;
        
        //calculo do salario realizado e armazenado na variavel calculoSalario
        calculoSalario = horasTrabalhadas*valorHoraT;
        
        //adicionar uma instrução de retorno para o método
        return calculoSalario;
    }
    
}
