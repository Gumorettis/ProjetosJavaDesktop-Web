/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.ClinicaDAO;
import MODEL.Clinica;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Heitor
 */
@WebServlet(name = "CadastrarClinica", urlPatterns = {"/CadastrarClinica"})
public class CadastrarClinica extends HttpServlet {

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
       
        String nomeClinica = request.getParameter("nomeClinica");
        int cnpjClinica = Integer.parseInt(request.getParameter("cnpjClinica"));
        String enderecoClinica = request.getParameter("enderecoClinica");
        String bairroClinica = request.getParameter("bairroClinica");
        String cidadeClinica = request.getParameter("cidadeClinica");
        String telefoneClinica = request.getParameter("telefoneClinica");
        String especificacaoClinica = request.getParameter("especificacaoClinica");
        
        String msg = "";
        
        Clinica oClinica = new Clinica();
        
        oClinica.setNomeClinica(nomeClinica);
        oClinica.setCnpjClinica(cnpjClinica);
        oClinica.setEnderecoClinica(enderecoClinica);
        oClinica.setBairroClinica(bairroClinica);
        oClinica.setCidadeClinica(cidadeClinica);
        oClinica.setTelefoneClinica(telefoneClinica);
        oClinica.setEspecificacaoClinica(especificacaoClinica);
        
        ClinicaDAO oClinicaDAO = new ClinicaDAO();
        
        try {
            
            if(oClinicaDAO.cadastrarClinica(oClinica)){
                msg = "A clínica "+nomeClinica+" foi cadastrada com sucesso!";
            }
            else {
                msg = "Clínica não cadastrada - Cheque os dados novamente";
            }
            
           request.setAttribute("msg", msg);
           request.getRequestDispatcher("CadastrarClinica.jsp").forward(request, response);
            
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
