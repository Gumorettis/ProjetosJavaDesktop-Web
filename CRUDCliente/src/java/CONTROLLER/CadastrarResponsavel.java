/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.ResponsavelDAO;
import MODEL.Responsavel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gusta
 */
@WebServlet(name = "CadastrarResponsavel", urlPatterns = {"/CadastrarResponsavel"})
public class CadastrarResponsavel extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       request.setCharacterEncoding("UTF-8");
        try {
            
            Responsavel oResponsavel = new Responsavel();   
            
            
            oResponsavel.setNome_pessoa(request.getParameter("nomeResp"));
            oResponsavel.setCpf_pessoa(request.getParameter("cpf"));
            oResponsavel.setEmail_pessoa(request.getParameter("email"));
            oResponsavel.setLogin_pessoa(request.getParameter("login"));
            oResponsavel.setSenha_pessoa(request.getParameter("senha"));
            oResponsavel.setTelefone_pessoa(request.getParameter("telefone"));
            oResponsavel.setNickResponsavel(request.getParameter("nick"));
            oResponsavel.setTipo_pessoa("R");
            
            String msg = "";
            ResponsavelDAO oResponsavelDAO = new ResponsavelDAO();
            
            //VERIFICA SE O CAMPO ID NÃO TEM NADA 
            if(request.getParameter("id").equals("")){
                
            if(oResponsavelDAO.cadastrarResponsavel(oResponsavel)){
                msg = "Responsavel cadastrado com sucesso ! ";
            }
            else{
                 msg = "Erro ao cadastrar";
            }
            
        }else if(!request.getParameter("id").equals("")){ //OPÇÃO PARA VERIFICAR SE O CAMPO ID TEM DADO
             
            oResponsavel.setId_responsavel(Integer.parseInt(request.getParameter("id")));
            oResponsavel.setId_pessoa(Integer.parseInt(request.getParameter("id")));
            
            if(oResponsavelDAO.alterarR(oResponsavel)){
                msg = "Responsavel alterado com sucesso !";
            }
            else{
                msg = "Erro ao alterar Responsavel !";
            }
        }
            request.setAttribute("mensagem", msg);
            request.getRequestDispatcher("ListarResponsavel").forward(request, response);
            
        } catch (Exception e) {
            
            System.out.println("Erro ao inserir Responsavel" + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
