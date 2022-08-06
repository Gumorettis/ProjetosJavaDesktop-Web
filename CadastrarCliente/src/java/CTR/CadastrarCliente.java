/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

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
        
        String nome = request.getParameter("nomeCliente");
        int idade = Integer.parseInt(request.getParameter("idadeCliente"));
        int CPF = Integer.parseInt(request.getParameter("cpfCliente"));
        String endereco = request.getParameter("enderecoCliente");
        
        Cliente oCliente = new Cliente();
        oCliente.setCpfCliente(CPF);
        oCliente.setEnderecoCliente(endereco);
        oCliente.setIdadeCliente(idade);
        oCliente.setNomeCliente(nome);
        
        ClienteDAO oClienteDAO = new ClienteDAO();
        String mensagem = "";
        
        try {
            
            if(oClienteDAO.cadastrarCliente(oCliente)){
            mensagem = "Cliente cadastrado com sucesso !";
        }
            else {
                mensagem = "Erro ao tentar cadastrar o Cliente !";
            }
        request.setAttribute("msg", mensagem);
        request.getRequestDispatcher("cadastrar-cliente.jsp").forward(request, response);
        
        } catch (Exception e) {
        System.out.println("ERRO AO TENTAR PASSAR O OBJETO PARA A DAO"); 
        
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
