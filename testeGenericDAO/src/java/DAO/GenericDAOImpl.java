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
public interface GenericDAOImpl {
    
    public boolean cadastrar(Object object)throws Exception;
    
    public void excluir()throws Exception;
    
    public List<Object> listar()throws Exception;
    
    
}
