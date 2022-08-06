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
public class Secretaria extends Pessoa {

    private int idsecretaria;

    public Secretaria() {
    }

    public Secretaria(int idsecretaria, int idPessoa, String nomePessoa, int cpfPessoa, Date dataNascimentoPessoa, String generoPessoa, String enderecoPessoa, String bairroPessoa, String cidadePessoa, String cepPessoa, String telefonePessoa, String celularPessoa, String emailPessoa, String senhaPessoa) {
        super(idPessoa, nomePessoa, cpfPessoa, dataNascimentoPessoa, generoPessoa, enderecoPessoa, bairroPessoa, cidadePessoa, cepPessoa, telefonePessoa, celularPessoa, emailPessoa, senhaPessoa);
        this.idsecretaria = idsecretaria;
    }

    public int getIdsecretaria() {
        return idsecretaria;
    }

    public void setIdsecretaria(int idsecretaria) {
        this.idsecretaria = idsecretaria;
    }

}
