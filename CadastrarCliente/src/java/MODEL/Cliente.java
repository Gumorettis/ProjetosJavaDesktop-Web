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
    
    private int id_cliente;
    private String nomeCliente; 
    private int cpfCliente; 
    private int idadeCliente; 
    private String enderecoCliente; 
   
    public Cliente(){
        
    }

    public Cliente(int id_cliente, String nomeCliente, int cpfCliente, int idadeCliente, String enderecoCliente) {
        this.id_cliente = id_cliente;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.idadeCliente = idadeCliente;
        this.enderecoCliente = enderecoCliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    
    
}
