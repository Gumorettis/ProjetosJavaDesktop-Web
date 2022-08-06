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
    
    private String produto;
    private String nome_vendedor;
    private int valor; 
    
    public Venda(){
        
    }

    public Venda(String produto, String nome_vendedor, int valor) {
        this.produto = produto;
        this.nome_vendedor = nome_vendedor;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getNome_vendedor() {
        return nome_vendedor;
    }

    public void setNome_vendedor(String nome_vendedor) {
        this.nome_vendedor = nome_vendedor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public String mostrarDados(){
        return "Nome do produto: "+produto+
               "\n Nome do Vendedor: "+nome_vendedor+
               "\n Valor da venda: "+valor;
    }
}
