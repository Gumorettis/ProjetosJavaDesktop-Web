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
public class Pessoa {
    
    private int idPessoa;
    private String nomePessoa;
    private int cpfPessoa;
    private Date dataNascimentoPessoa;
    private String generoPessoa;
    private String enderecoPessoa;
    private String bairroPessoa;
    private String cidadePessoa;
    private String cepPessoa;
    private String telefonePessoa;
    private String celularPessoa;
    private String emailPessoa;
    private String senhaPessoa;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nomePessoa, int cpfPessoa, Date dataNascimentoPessoa, String generoPessoa, String enderecoPessoa, String bairroPessoa, String cidadePessoa, String cepPessoa, String telefonePessoa, String celularPessoa, String emailPessoa, String senhaPessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.cpfPessoa = cpfPessoa;
        this.dataNascimentoPessoa = dataNascimentoPessoa;
        this.generoPessoa = generoPessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.bairroPessoa = bairroPessoa;
        this.cidadePessoa = cidadePessoa;
        this.cepPessoa = cepPessoa;
        this.telefonePessoa = telefonePessoa;
        this.celularPessoa = celularPessoa;
        this.emailPessoa = emailPessoa;
        this.senhaPessoa = senhaPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(int cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public Date getDataNascimentoPessoa() {
        return dataNascimentoPessoa;
    }

    public void setDataNascimentoPessoa(Date dataNascimentoPessoa) {
        this.dataNascimentoPessoa = dataNascimentoPessoa;
    }

    public String getGeneroPessoa() {
        return generoPessoa;
    }

    public void setGeneroPessoa(String generoPessoa) {
        this.generoPessoa = generoPessoa;
    }

    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(String enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public String getBairroPessoa() {
        return bairroPessoa;
    }

    public void setBairroPessoa(String bairroPessoa) {
        this.bairroPessoa = bairroPessoa;
    }

    public String getCidadePessoa() {
        return cidadePessoa;
    }

    public void setCidadePessoa(String cidadePessoa) {
        this.cidadePessoa = cidadePessoa;
    }

    public String getCepPessoa() {
        return cepPessoa;
    }

    public void setCepPessoa(String cepPessoa) {
        this.cepPessoa = cepPessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public String getCelularPessoa() {
        return celularPessoa;
    }

    public void setCelularPessoa(String celularPessoa) {
        this.celularPessoa = celularPessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public String getSenhaPessoa() {
        return senhaPessoa;
    }

    public void setSenhaPessoa(String senhaPessoa) {
        this.senhaPessoa = senhaPessoa;
    }

     
    
}
