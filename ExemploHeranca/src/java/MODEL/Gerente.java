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
public class Gerente extends Funcionario{
    
    private String funcao;
    private String nomeChefe;
    
    public Gerente(){
        
    }

    public Gerente(String funcao, String nomeChefe) {
        this.funcao = funcao;
        this.nomeChefe = nomeChefe;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNomeChefe() {
        return nomeChefe;
    }

    public void setNomeChefe(String nomeChefe) {
        this.nomeChefe = nomeChefe;
    }
    
}
