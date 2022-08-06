/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author Heitor
 */
public class Profissional extends Pessoa {

    private int idProfissional;
    private String areaAtuacaoProfissional;

    public Profissional() {
    }

    public Profissional(int idProfissional, String areaAtuacaoProfissional, int idPessoa, String nomePessoa, int cpfPessoa, Date dataNascimentoPessoa, String generoPessoa, String enderecoPessoa, String bairroPessoa, String cidadePessoa, String cepPessoa, String telefonePessoa, String celularPessoa, String emailPessoa, String senhaPessoa) {
        super(idPessoa, nomePessoa, cpfPessoa, dataNascimentoPessoa, generoPessoa, enderecoPessoa, bairroPessoa, cidadePessoa, cepPessoa, telefonePessoa, celularPessoa, emailPessoa, senhaPessoa);
        this.idProfissional = idProfissional;
        this.areaAtuacaoProfissional = areaAtuacaoProfissional;
    }

    
    public int getIdProfissional() {
        return idProfissional;
    }

    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }

    public String getAreaAtuacaoProfissional() {
        return areaAtuacaoProfissional;
    }

    public void setAreaAtuacaoProfissional(String areaAtuacaoProfissional) {
        this.areaAtuacaoProfissional = areaAtuacaoProfissional;
    }

}
