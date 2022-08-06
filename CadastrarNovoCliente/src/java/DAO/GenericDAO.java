/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;


/**
 *
 * @author gusta
 */
public interface GenericDAO {
    
    //cadastrar e deletar  
    
    public boolean cadastrar(Object objeto) throws Exception;
    
    public void deletar(int idObjeto)throws Exception;
    
    public List<Object> listar();
 
    public List<Object> listarPorNome(String nome)throws Exception;
    
}

