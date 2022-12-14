/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.PFisicaDAO;
import MODEL.Pessoa;
import MODEL.PessoaFisica;
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
@WebServlet(name = "CadastrarPFisica", urlPatterns = {"/CadastrarPFisica"})
public class CadastrarPFisica extends HttpServlet {

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
            //criei um objeto da pessoa utilizando a classe Pai
        PessoaFisica oPessoaFisica = new PessoaFisica();
        
        oPessoaFisica.setNomePessoa(nome);
        oPessoaFisica.setEndereco(endereco);
        oPessoaFisica.setCpf(cpf);
        oPessoaFisica.setIdade(idade);
        oPessoaFisica.setTelefone(telefone);
        oPessoaFisica.setTipo_pessoa("PF");
        oPessoaFisica.setLogin_pessoa(login);
        oPessoaFisica.setSenha_pessoa(senha);
        
        PFisicaDAO oPFisica = new PFisicaDAO();
        
        if(request.getParameter("id").equals("")){
            
                if(oPFisica.cadastrarPFisica(oPessoaFisica)){
                    mensagem = "Pessoa Fisica Cadastrada com Sucesso !";
                }

                else{
                    mensagem = "Erro ao cadastrar Pessoa Fisica!";
                }
        }
        
        else if(!request.getParameter("id").equals("")){
                
                oPessoaFisica.setIdPessoa(Integer.parseInt(request.getParameter("id")));
            
                if(oPFisica.alterarPF(oPessoaFisica)){
                    mensagem = "Pessoa Fisica Alterada com Sucesso ! ";
                }
                else{
                    mensagem = "Erro ao Alterar Pessoa Fisica ! ";
                }
        }
        
        request.setAttribute("msg", mensagem);
        request.getRequestDispatcher("ListarPFisica").forward(request, response);
        
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR PESSOA FISICA NA SERVLET "+e.getMessage());
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
