/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.FuncionarioDAO;
import MODEL.Funcionario;
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
@WebServlet(name = "CadastrarFuncionario", urlPatterns = {"/CadastrarFuncionario"})
public class CadastrarFuncionario extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        
        try {
            
            Funcionario oFuncionario = new Funcionario();
            
            oFuncionario.setNome_pessoa(request.getParameter("nomeFunc"));
            oFuncionario.setCpf_pessoa(request.getParameter("cpf"));
            oFuncionario.setEmail_pessoa(request.getParameter("email"));
            oFuncionario.setLogin_pessoa(request.getParameter("login"));
            oFuncionario.setSenha_pessoa(request.getParameter("senha"));
            oFuncionario.setTelefone_pessoa(request.getParameter("telefone"));
            oFuncionario.setTipo_pessoa("F");
            
            String msg = "";
            FuncionarioDAO oFuncionarioDAO = new FuncionarioDAO();
            
            if(oFuncionarioDAO.cadastrarFuncionario(oFuncionario)){
                msg = "Funcionario cadastrado com sucesso ! ";
            }
            else
                 msg = "Erro ao cadastrar";
            
            request.setAttribute("mensagem", msg);
            request.getRequestDispatcher("cadastrarFuncionario.jsp").forward(request, response);
            
        } catch (Exception e) {
            
            System.out.println("Erro ao inserir funcionario" + e.getMessage());
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
