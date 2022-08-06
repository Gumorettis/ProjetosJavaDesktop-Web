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
public class Publicacao {
    
    protected int idPublicacao;
    protected String descricao; 
    protected PessoaFisica idPublicador; 
    
    public Publicacao(){
        
    }

    public Publicacao(PessoaFisica idPublicador) {
        this.idPublicador = idPublicador;
    }

    public Publicacao(int idPublicacao, String descricao) {
        this.idPublicacao = idPublicacao;
        this.descricao = descricao;
    }

    public int getIdPublicacao() {
        return idPublicacao;
    }

    public void setIdPublicacao(int idPublicacao) {
        this.idPublicacao = idPublicacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PessoaFisica getIdPublicador() {
        return idPublicador;
    }

    public void setIdPublicador(PessoaFisica idPublicador) {
        this.idPublicador = idPublicador;
    }

   
    
}
