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
public class Ocorrencia {
    
    private int id_ocorrencia; 
    private String descricao_ocorrencia;
    private Responsavel responsavel; // associação de dependência com a classe Responsavel 
    
    public Ocorrencia(){
        
    }

    public Ocorrencia(int id_ocorrencia, String descricao_ocorrencia, Responsavel responsavel) {
        this.id_ocorrencia = id_ocorrencia;
        this.descricao_ocorrencia = descricao_ocorrencia;
        this.responsavel = responsavel;
    }

    public int getId_ocorrencia() {
        return id_ocorrencia;
    }

    public void setId_ocorrencia(int id_ocorrencia) {
        this.id_ocorrencia = id_ocorrencia;
    }

    public String getDescricao_ocorrencia() {
        return descricao_ocorrencia;
    }

    public void setDescricao_ocorrencia(String descricao_ocorrencia) {
        this.descricao_ocorrencia = descricao_ocorrencia;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

   
    
}
