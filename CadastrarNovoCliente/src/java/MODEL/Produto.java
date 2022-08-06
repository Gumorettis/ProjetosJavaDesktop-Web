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
public class Produto {
    
    //declarando as características do meu objeto Produto
    private int idProduto;
    private String nomeProduto;
    private int valor;
    private String tipoProduto; 
    
    //construtor Vazio
    public Produto(){
        
    }

    public Produto(int idProduto, String nomeProduto, int valor, String tipoProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.tipoProduto = tipoProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
}
