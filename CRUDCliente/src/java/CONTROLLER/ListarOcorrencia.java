/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.OcorrenciaDAO;
import DAO.ResponsavelDAO;
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
@WebServlet(name = "ListarOcorrencia", urlPatterns = {"/ListarOcorrencia"})
public class ListarOcorrencia extends HttpServlet {

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

         try {
            
            //PRIMEIRO LISTA OS RESPONSAVEIS PARA CADASTRAR NOVA OCORRENCIA
            ResponsavelDAO oResponsavelDAO = new ResponsavelDAO();
            request.setAttribute("resp", oResponsavelDAO.listarResponsavel());
            
            
            //EXECUTA O LISTAR DA OCORRENCIA
            OcorrenciaDAO ocorrenciaDAO = new OcorrenciaDAO();
            request.setAttribute("ocorrencia", ocorrenciaDAO.listarOcorrencia());
            
            request.getRequestDispatcher("gerarOcorrencia.jsp").forward(request, response);
            
            //if(!request.getParameter("id_ocorrencia").equals("")){
                
          //  int id = Integer.parseInt(request.getParameter("id_ocorrencia"));
            //CHAMA O CARREGAR PARA CARREGAR OS CAMPOS NA PAGINA 
           // request.setAttribute("oc", ocorrenciaDAO.carregarOcorrencia(id));
           // }

        } catch (Exception ex) {
            System.out.println("Problemas ao listar Ocorrencia!"
                    + "\n Erro: " + ex.getMessage());
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
