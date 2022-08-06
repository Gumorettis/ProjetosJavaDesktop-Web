/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

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
@WebServlet(name = "Exercicio2", urlPatterns = {"/Exercicio2"})
public class Exercicio2 extends HttpServlet {

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
        
        String nome = request.getParameter("nome");
        String dataNasc = request.getParameter("dataNascimento");
        Double valorInvest = Double.parseDouble(request.getParameter("valorInvestimento"));
        String tipoInvest = request.getParameter("grupo1");
        
        double retorno=0,valorFinal=0;
        
        if(tipoInvest.equals("acao")){
            retorno = valorInvest*0.2;
            valorFinal = valorInvest+retorno;
        }
        else if(tipoInvest.equals("titulo")){
            retorno = valorInvest*0.1;
            valorFinal = valorInvest+retorno;
        }
        else if(tipoInvest.equals("poup")){
            retorno = valorInvest*0.05;
            valorFinal = valorInvest+retorno;
        }
        
        request.setAttribute("nome", nome);
        request.setAttribute("dataNascimento", dataNasc);
        request.setAttribute("tipoInvest", tipoInvest);
        request.setAttribute("valorInvestido", valorInvest);
        request.setAttribute("retorno", retorno);
        request.setAttribute("valorFinal", valorFinal);
        
        request.getRequestDispatcher("Exercicio2.jsp").forward(request, response);
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
