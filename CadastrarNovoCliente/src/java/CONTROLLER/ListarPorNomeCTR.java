/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.ClienteDAOImp;
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
@WebServlet(name = "ListarPorNomeCTR", urlPatterns = {"/ListarPorNomeCTR"})
public class ListarPorNomeCTR extends HttpServlet {

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
            String nome = request.getParameter("nomeCliente");
            
            ClienteDAOImp oClienteDAOImp = new ClienteDAOImp();
            
            //verificação de algo foi digitado no campo de pesquisa
            if(nome.equals("")){
                String mensagem1 = "Digite algum nome para buscar ! ";
                request.setAttribute("msg1", mensagem1);
            }
            
            else{
                
                request.setAttribute("listaNome", oClienteDAOImp.listarPorNome(nome));
                if(oClienteDAOImp.cadastrar(nome) == false){
                    String msg2 = "Digite algo para buscar ! ";
                    request.setAttribute("msg2", msg2);
                }
            }
                
        } catch (Exception e) {
            System.out.println("ERRO AO LISTAR CLIENTE POR NOME "+e.getMessage());
        }
        
        request.getRequestDispatcher("listarClienteNome.jsp").forward(request, response);
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
