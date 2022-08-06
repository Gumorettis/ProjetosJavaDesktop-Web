/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.PJuridicaDAO;
import MODEL.PessoaJuridica;
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
@WebServlet(name = "CadastrarPJuridica", urlPatterns = {"/CadastrarPJuridica"})
public class CadastrarPJuridica extends HttpServlet {

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
        int capital = Integer.parseInt(request.getParameter("capital"));
        String cnpj = request.getParameter("cnpj");
        String login  = request.getParameter("login");
        String senha  = request.getParameter("senha");
        String mensagem = "";
        
        try {
            //criei um objeto da pessoa utilizando a classe Pai
        PessoaJuridica oPessoaJuridica = new PessoaJuridica();
        
        oPessoaJuridica.setNomePessoa(nome);
        oPessoaJuridica.setEndereco(endereco);
        oPessoaJuridica.setCnpj(cnpj);
        oPessoaJuridica.setCapital(capital);
        oPessoaJuridica.setTelefone(telefone);
        oPessoaJuridica.setTipo_pessoa("PJ");
        oPessoaJuridica.setLogin_pessoa(login);
        oPessoaJuridica.setSenha_pessoa(senha);
        
        
        PJuridicaDAO oPJuridicaDAO = new PJuridicaDAO();
        
        if(request.getParameter("id").equals("")){
            
            if(oPJuridicaDAO.cadastrarPJuridica(oPessoaJuridica)){
                mensagem = "Pessoa Juridica Cadastrada com Sucesso !";
            }

            else{
                mensagem = "Erro ao cadastrar Pessoa Juridica!";
            }
            
        }
        
        else if(!request.getParameter("id").equals("")){
            
            oPessoaJuridica.setIdPessoa(Integer.parseInt(request.getParameter("id")));
            
            if(oPJuridicaDAO.alterarPJ(oPessoaJuridica)){
                mensagem = "Pessoa Juridica Alterada com Sucesso ! ";
            }
            else{
                mensagem = " Erro ao Alterar Pessoa Juridica ";
            }
        }
        
        request.setAttribute("msg", mensagem);
        request.getRequestDispatcher("ListarPJuridica").forward(request, response);
        
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR PESSOA JURIDICA NA SERVLET "+e.getMessage());
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
