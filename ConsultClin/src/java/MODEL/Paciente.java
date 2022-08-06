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
public class Paciente extends Pessoa {

    private int idPaciente;
    private String observacoesPaciente;

    public Paciente() {
    }

    public Paciente(int idPaciente, String observacoesPaciente, int idPessoa, String nomePessoa, int cpfPessoa, Date dataNascimentoPessoa, String generoPessoa, String enderecoPessoa, String bairroPessoa, String cidadePessoa, String cepPessoa, String telefonePessoa, String celularPessoa, String emailPessoa, String senhaPessoa) {
        super(idPessoa, nomePessoa, cpfPessoa, dataNascimentoPessoa, generoPessoa, enderecoPessoa, bairroPessoa, cidadePessoa, cepPessoa, telefonePessoa, celularPessoa, emailPessoa, senhaPessoa);
        this.idPaciente = idPaciente;
        this.observacoesPaciente = observacoesPaciente;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getObservacoesPaciente() {
        return observacoesPaciente;
    }

    public void setObservacoesPaciente(String observacoesPaciente) {
        this.observacoesPaciente = observacoesPaciente;
    }

}
