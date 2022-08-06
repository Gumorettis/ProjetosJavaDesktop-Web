/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agendamentoteatro.model;

import java.sql.Date;



/**
 *
 * @author Gustavo
 */
public class AgendamentoCliente {
    
    private int id_agendamento;
    private String nome_cliente;
    private int telefone_cliente;
    private String instituicao_cliente;
    private String endereco_cliente;    
    private String data_inicio;
    private String data_termino;
    private String descricao_evento;
    private String periodo_evento;
    
    public AgendamentoCliente(){
        
    }

    public AgendamentoCliente(int id_agendamento, String nome_cliente, int telefone_cliente, String instituicao_cliente, String endereco_cliente, String data_inicio, String data_termino, String descricao_evento, String periodo_evento) {
        this.id_agendamento = id_agendamento;
        this.nome_cliente = nome_cliente;
        this.telefone_cliente = telefone_cliente;
        this.instituicao_cliente = instituicao_cliente;
        this.endereco_cliente = endereco_cliente;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
        this.descricao_evento = descricao_evento;
        this.periodo_evento = periodo_evento;
    }

    public int getId_agendamento() {
        return id_agendamento;
    }

    public void setId_agendamento(int id_agendamento) {
        this.id_agendamento = id_agendamento;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public int getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(int telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    public String getInstituicao_cliente() {
        return instituicao_cliente;
    }

    public void setInstituicao_cliente(String instituicao_cliente) {
        this.instituicao_cliente = instituicao_cliente;
    }

    public String getEndereco_cliente() {
        return endereco_cliente;
    }

    public void setEndereco_cliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_termino() {
        return data_termino;
    }

    public void setData_termino(String data_termino) {
        this.data_termino = data_termino;
    }

    public String getDescricao_evento() {
        return descricao_evento;
    }

    public void setDescricao_evento(String descricao_evento) {
        this.descricao_evento = descricao_evento;
    }

    public String getPeriodo_evento() {
        return periodo_evento;
    }

    public void setPeriodo_evento(String periodo_evento) {
        this.periodo_evento = periodo_evento;
    }
    
}
