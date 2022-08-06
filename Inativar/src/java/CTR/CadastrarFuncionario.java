/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

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
        
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        int telefone = Integer.parseInt(request.getParameter("telefone"));
        int idade = Integer.parseInt(request.getParameter("idade"));
        String cpf = request.getParameter("cpf");
        String login  = request.getParameter("login");
        String senha  = request.getParameter("senha");
        
        String mensagem = "";
        
        try {
            
        Funcionario oFunc = new Funcionario();
            
        oFunc.setNomePessoa(nome);
        oFunc.setEndereco(endereco);
        oFunc.setCpf(cpf);
        oFunc.setIdade(idade);
        oFunc.setTelefone(telefone);
        oFunc.setTipo_pessoa("FN");
        oFunc.setStatus_pessoa("Ativo");
        oFunc.setLogin_pessoa(login);
        oFunc.setSenha_pessoa(senha);
        
        FuncionarioDAO oFuncDAO = new FuncionarioDAO();
        
        if(oFuncDAO.cadastrarFuncionario(oFunc)){
            mensagem = "Funcionario cadastrado com Sucesso !";
        }
        
        else{
            mensagem = "Erro ao cadastrar Funcionario ! Verifique os campos !";
        }
        
        request.setAttribute("msg", mensagem);
        request.getRequestDispatcher("cadastrarFuncionario.jsp").forward(request, response);
        
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR FUNCIONARIO NA SERVLET "+e.getMessage());
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
