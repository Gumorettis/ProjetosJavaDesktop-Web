/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Heitor
 */
public class Clinica {

    private int idClinica;
    private String nomeClinica;
    private int cnpjClinica;
    private String enderecoClinica;
    private String bairroClinica;
    private String cidadeClinica;
    private String telefoneClinica;
    private String especificacaoClinica;

    public Clinica() {
    }

    public Clinica(int idClinica, String nomeClinica, int cnpjClinica, String enderecoClinica, String bairroClinica, String cidadeClinica, String telefoneClinica, String especificacaoClinica) {
        this.idClinica = idClinica;
        this.nomeClinica = nomeClinica;
        this.cnpjClinica = cnpjClinica;
        this.enderecoClinica = enderecoClinica;
        this.bairroClinica = bairroClinica;
        this.cidadeClinica = cidadeClinica;
        this.telefoneClinica = telefoneClinica;
        this.especificacaoClinica = especificacaoClinica;
    }

    public int getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(int idClinica) {
        this.idClinica = idClinica;
    }

    public String getNomeClinica() {
        return nomeClinica;
    }

    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    public int getCnpjClinica() {
        return cnpjClinica;
    }

    public void setCnpjClinica(int cnpjClinica) {
        this.cnpjClinica = cnpjClinica;
    }

    public String getEnderecoClinica() {
        return enderecoClinica;
    }

    public void setEnderecoClinica(String enderecoClinica) {
        this.enderecoClinica = enderecoClinica;
    }

    public String getBairroClinica() {
        return bairroClinica;
    }

    public void setBairroClinica(String bairroClinica) {
        this.bairroClinica = bairroClinica;
    }

    public String getCidadeClinica() {
        return cidadeClinica;
    }

    public void setCidadeClinica(String cidadeClinica) {
        this.cidadeClinica = cidadeClinica;
    }

    public String getTelefoneClinica() {
        return telefoneClinica;
    }

    public void setTelefoneClinica(String telefoneClinica) {
        this.telefoneClinica = telefoneClinica;
    }

    public String getEspecificacaoClinica() {
        return especificacaoClinica;
    }

    public void setEspecificacaoClinica(String especificacaoClinica) {
        this.especificacaoClinica = especificacaoClinica;
    }

    

}
