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
public class Cliente {
    
    private String nomeCliente;
    private String rgCliente;
    private int idadeCliente;
    private String telefoneCliente;
    private int idCliente;// um atributo identificador do Cliente no banco.

    public Cliente() {
    }

    public Cliente(String nomeCliente, String rgCliente, int idadeCliente, String telefoneCliente, int idCliente) {
        this.nomeCliente = nomeCliente;
        this.rgCliente = rgCliente;
        this.idadeCliente = idadeCliente;
        this.telefoneCliente = telefoneCliente;
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
           
}
