/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gusta
 */
public class Venda {
    
    private String nomeProduto;
    private double valorVenda; 
    private String nomeVendedor;
    private int codigoProduto;
    
    // montei o construtor vazio
    public Venda(){
        
    }

    public Venda(String nomeProduto, double valorVenda, String nomeVendedor, int codigoProduto) {
        this.nomeProduto = nomeProduto;
        this.valorVenda = valorVenda;
        this.nomeVendedor = nomeVendedor;
        this.codigoProduto = codigoProduto;
    }
    
    //gerou os métodos Get e Set 
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    
}
