/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.OcorrenciaDAO;
import MODEL.Ocorrencia;
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
@WebServlet(name = "CadastrarOcorrencia", urlPatterns = {"/CadastrarOcorrencia"})
public class CadastrarOcorrencia extends HttpServlet {

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
        
        Ocorrencia oOcorrencia = new Ocorrencia();
      
        oOcorrencia.setDescricao_ocorrencia(request.getParameter("descricao_ocorrencia"));
        
        //pegando o valor do ID da tabela de dependencia que é passado da JSP 
        oOcorrencia.setResponsavel(new Responsavel(Integer.parseInt(request.getParameter("idResponsavel"))));
        
        String msg = "";
        try {
            OcorrenciaDAO ocorrenciaDAO = new OcorrenciaDAO();
            
            if(request.getParameter("id_ocorrencia").equals("")){
                
            if(ocorrenciaDAO.cadastrarOcorrencia(oOcorrencia)){
                msg = "Ocorrencia cadastrada com sucesso ! ";
            }
            
            else{
                 msg = "Erro ao cadastrar Ocorrencia";
            }
            
        }else if(!request.getParameter("id_ocorrencia").equals("")){
            
            oOcorrencia.setId_ocorrencia(Integer.parseInt(request.getParameter("id_ocorrencia")));
            if(ocorrenciaDAO.alterarOcorrencia(oOcorrencia)){
                msg = "Ocorrencia alterada com sucesso !";
            }
            else{
                msg = "Erro ao alterar Ocorrencia !";
            }
        }
        
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("ListarOcorrencia").forward(request, response);
            
        } catch (Exception e) {
            System.out.println("Erro ao inserir Ocorrencia" + e.getMessage());
            
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
