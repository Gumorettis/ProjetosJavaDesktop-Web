/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.PessoaDAO;
import MODEL.Pessoa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gusta
 */
@WebServlet(name = "LogarPessoa", urlPatterns = {"/LogarPessoa"})
public class LogarPessoa extends HttpServlet {

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
        
        if(request.getParameter("acao").equals("logar")){
            
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        String mensagem = "";    
        
        if(!login.equals("") && !senha.equals("")){
            
            try {
                PessoaDAO daoPessoa = new PessoaDAO();
                Pessoa oPessoa = daoPessoa.logarPessoa(login, senha);
                
                if(oPessoa != null){
                    HttpSession session = request.getSession(true);
                    session.setAttribute("pessoa", oPessoa);
                            
                    if(oPessoa.getTipo_pessoa().equals("R")){
                        request.getRequestDispatcher("respIndex.jsp").forward(request, response);                        
                    }
                    
                    else if(oPessoa.getTipo_pessoa().equals("F")){
                        request.getRequestDispatcher("FuncIndex.jsp").forward(request, response);
                    }                    
                }
                
                else{
                    
                    mensagem = "Login e senha Invalidos !! ";
                    request.setAttribute("msg", mensagem);
                    request.getRequestDispatcher("loginIndex.jsp").forward(request, response);                   
                }
                                
            } catch (Exception ex) {
                    System.out.println("Problemas ao logar Pessoa Erro: "+ ex.getMessage());
                    ex.printStackTrace();
            }
        }
        
        }
        
        else if(request.getParameter("acao").equals("logout")){
            HttpSession session = request.getSession(true);
            session.invalidate();
            response.sendRedirect("loginIndex.jsp");
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
