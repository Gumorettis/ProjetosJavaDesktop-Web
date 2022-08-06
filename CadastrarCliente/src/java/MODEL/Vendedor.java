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
public class Vendedor {
    
    private int id_vendedor;
    private String nome_vendedor;
    private String rg_vendedor;
    private String empresa;
    private int horas_trabalhadas; 
    
    public Vendedor(){
        
    }

    public Vendedor(int id_vendedor, String nome_vendedor, String rg_vendedor, String empresa, int horas_trabalhadas) {
        this.id_vendedor = id_vendedor;
        this.nome_vendedor = nome_vendedor;
        this.rg_vendedor = rg_vendedor;
        this.empresa = empresa;
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNome_vendedor() {
        return nome_vendedor;
    }

    public void setNome_vendedor(String nome_vendedor) {
        this.nome_vendedor = nome_vendedor;
    }

    public String getRg_vendedor() {
        return rg_vendedor;
    }

    public void setRg_vendedor(String rg_vendedor) {
        this.rg_vendedor = rg_vendedor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setHoras_trabalhadas(int horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }

    
}
