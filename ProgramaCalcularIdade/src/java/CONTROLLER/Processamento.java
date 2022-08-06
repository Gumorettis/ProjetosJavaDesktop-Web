/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import MODEL.Usuario;
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
@WebServlet(name = "Processamento", urlPatterns = {"/Processamento"})
public class Processamento extends HttpServlet {

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
        
        String nome = request.getParameter("nomeUsuario");
        int anoAtual = Integer.parseInt(request.getParameter("anoAtual"));
        int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
        
        Usuario oUsuario = new Usuario();
        
        //passagem de dados para a Classe Usuario
        oUsuario.setNomeUsuario(nome);
        oUsuario.setAnoAtual(anoAtual);
        oUsuario.setAnoNascimento(anoNascimento);
        
        int resultadoIdade = oUsuario.calcularIdade();
        String mensagem = "";
        
        if(resultadoIdade >= 18){
            mensagem = ""+nome+" você tem: "+resultadoIdade+  " anos e é MAIOR de idade! ";
        }
        else{
              mensagem = ""+nome+" você tem: "+resultadoIdade+  " anos e é MENOR de idade! ";
        }
        
        request.setAttribute("resultado", mensagem);
        
        request.getRequestDispatcher("paginaResultado.jsp").forward(request, response);
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
