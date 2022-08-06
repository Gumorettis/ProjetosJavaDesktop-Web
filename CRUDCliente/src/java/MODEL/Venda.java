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
public class Venda {
    
    private String tipoVenda;
    private int valorVenda; 
    private String descricaoVenda;
    
    public Venda(){
        
    }

    public Venda(String tipoVenda, int valorVenda, String descricaoVenda) {
        this.tipoVenda = tipoVenda;
        this.valorVenda = valorVenda;
        this.descricaoVenda = descricaoVenda;
    }

    public String getTipoVenda() {
        return tipoVenda;
    }

    public void setTipoVenda(String tipoVenda) {
        this.tipoVenda = tipoVenda;
    }

    public int getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(int valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getDescricaoVenda() {
        return descricaoVenda;
    }

    public void setDescricaoVenda(String descricaoVenda) {
        this.descricaoVenda = descricaoVenda;
    }
    
}
