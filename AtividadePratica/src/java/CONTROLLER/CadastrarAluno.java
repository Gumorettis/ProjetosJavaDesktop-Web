/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.AlunoDAO;
import MODEL.Aluno;
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
@WebServlet(name = "CadastrarAluno", urlPatterns = {"/CadastrarAluno"})
public class CadastrarAluno extends HttpServlet {

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
        
        
        String nomeAluno = request.getParameter("nomeAluno");
        int semestre = Integer.parseInt(request.getParameter("semestre"));
        int nota1 = Integer.parseInt(request.getParameter("nota1"));
        int nota2 = Integer.parseInt(request.getParameter("nota2"));
        int nota3 = Integer.parseInt(request.getParameter("nota3"));
        int nota4 = Integer.parseInt(request.getParameter("nota4"));
        int mediaFinal = (nota1+nota2+nota3+nota4)/4;
        String mensagem = "";
        
        Aluno oAluno = new Aluno();
        oAluno.setNomeAluno(nomeAluno);
        oAluno.setNota1(nota1);
        oAluno.setNota2(nota2);
        oAluno.setNota3(nota3);
        oAluno.setNota4(nota4);
        oAluno.setSemestre(semestre);
        oAluno.setMediaFinal(mediaFinal);
        
        AlunoDAO oAlunoDAO = new AlunoDAO();
        try {
            if(oAlunoDAO.cadastrarAluno(oAluno)){
               mensagem = "Aluno cadastrado com sucesso" ;
            }
            request.setAttribute("msg", mensagem);
            request.setAttribute("media", mediaFinal);
            request.getRequestDispatcher("entrada-dados.jsp").forward(request, response);
            
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR ALUNO"+e.getMessage());
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
