/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agendamentoteatro.DAO;

import br.com.agendamentoteatro.model.AgendamentoCliente;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Gustavo
 */
public class AgendamentoClienteDAO {
    
    private ResultSet rs  = null;
    
    public boolean gravarAgendamento(AgendamentoCliente agendamentoCliente){
        
        try {
            
            Conexao.ConectDB();
            
            Statement stmt = Conexao.con.createStatement();
            
            String comando = "insertinto agendamentocliente(nome_cliente,telefone_cliente,instituicao_cliente,endereco_cliente)"
        } catch (Exception e) {
        }
        
    }
}
