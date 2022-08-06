/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.ClienteDAO;
import MODEL.Cliente;
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
@WebServlet(name = "CadastrarCliente", urlPatterns = {"/CadastrarCliente"})
public class CadastrarCliente extends HttpServlet {

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
        
        String nomeCliente = request.getParameter("nomeCliente");
        int telefoneCliente = Integer.parseInt(request.getParameter("telefoneCliente"));
        String cpfCliente = request.getParameter("cpfCliente");
        String mensagem = "";
        
        Cliente oCliente = new Cliente();
        oCliente.setNome(nomeCliente);
        oCliente.setTelefone(telefoneCliente);
        oCliente.setCpf(cpfCliente);
        
        ClienteDAO oClienteDAO = new ClienteDAO();
        
        try {
            
        //LINK DE CHAMADA PARA O MEU CADASTRAR LA NA DAO 
        if(oClienteDAO.cadastrarCliente(oCliente)){
           mensagem = "Cliente cadastrado com >>>SUCESSO<<<";
        }
        request.setAttribute("msg", mensagem);
        request.getRequestDispatcher("CadastrarCliente.jsp").forward(request, response);
        
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR CLIENTE NA SERVLET");
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
