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
public class Funcionario extends Pessoa{
    
    private Integer id_funcionario;
    
    public Funcionario(){
        
    }

    public Funcionario(Integer id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public Funcionario(Integer id_funcionario, Integer id_pessoa, String cpf_pessoa, String nome_pessoa, String email_pessoa, String login_pessoa, String senha_pessoa, String telefone_pessoa, String tipo_pessoa) {
        super(id_pessoa, cpf_pessoa, nome_pessoa, email_pessoa, login_pessoa, senha_pessoa, telefone_pessoa, tipo_pessoa);
        this.id_funcionario = id_funcionario;
    }

    public Integer getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Integer id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    
    
    
}
