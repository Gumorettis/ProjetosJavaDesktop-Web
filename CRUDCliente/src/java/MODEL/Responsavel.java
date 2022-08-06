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
public class Responsavel extends Pessoa{
    private Integer id_responsavel;
    private String nickResponsavel; 
    
    public Responsavel(){
        
    }

    public Responsavel(Integer id_responsavel) {
        this.id_responsavel = id_responsavel;
    } 
    
    
    public Responsavel(Integer id_responsavel, String nickResponsavel) {
        this.id_responsavel = id_responsavel;
        this.nickResponsavel = nickResponsavel;
    }

    public Responsavel(Integer id_responsavel, String nickResponsavel, Integer id_pessoa, String cpf_pessoa, String nome_pessoa, String email_pessoa, String login_pessoa, String senha_pessoa, String telefone_pessoa, String tipo_pessoa) {
        super(id_pessoa, cpf_pessoa, nome_pessoa, email_pessoa, login_pessoa, senha_pessoa, telefone_pessoa, tipo_pessoa);
        this.id_responsavel = id_responsavel;
        this.nickResponsavel = nickResponsavel;
    }

    public Integer getId_responsavel() {
        return id_responsavel;
    }

    public void setId_responsavel(Integer id_responsavel) {
        this.id_responsavel = id_responsavel;
    }

    public String getNickResponsavel() {
        return nickResponsavel;
    }

    public void setNickResponsavel(String nickResponsavel) {
        this.nickResponsavel = nickResponsavel;
    }

    
    
}
