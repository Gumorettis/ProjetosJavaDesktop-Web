/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.ClienteDAOImp;
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
@WebServlet(name = "CadastrarClienteCTR", urlPatterns = {"/CadastrarClienteCTR"})
public class CadastrarClienteCTR extends HttpServlet {

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

        //recebo a informação da JSP inicial
        String nome = request.getParameter("nomeCliente");
        String rg = request.getParameter("rgCliente");
        int idade = Integer.parseInt(request.getParameter("idadeCliente"));
        String telefone = request.getParameter("telefoneCliente");
        
        
        //preparo a informação para ser enviada para o banco de dados
        Cliente oCliente = new Cliente();
        oCliente.setNomeCliente(nome);
        oCliente.setRgCliente(rg);
        oCliente.setIdadeCliente(idade);
        oCliente.setTelefoneCliente(telefone);

        //será enviada a informação para a classe DAO para ser 
        //cadastrada no banco.
        ClienteDAOImp clienteDAO = new ClienteDAOImp();
        
        String mensagem = "";
        
        if(idade >= 18){
            
            if(request.getParameter("idCliente").equals("")){
              
        try {
            
            if (clienteDAO.cadastrar(oCliente)) {
                mensagem = "Cliente Cadastrado com Sucesso ! ";
            } 
            
            else {
                mensagem = "ERRO AO CADASTRAR CLIENTE ! ";
            }
            
            
            
        } catch (Exception e) {
                System.out.println("ERRO AO CADASTRAR CLIENTE NA SERVLET");
        }
        
            } else if(!request.getParameter("idCliente").equals("")){
                
                int idCliente = Integer.parseInt(request.getParameter("idCliente"));
                
                if(clienteDAO.alterarCliente(oCliente)){
                    mensagem = "Cliente alterado com sucesso ! ";
                }
                
                else{
                    mensagem = "Erro ao alterar Cliente !";
                }
            }
            
            request.setAttribute("msg", mensagem);
            
            //desvio de execução do programa ! Para a Servlet ListarClienteCTR
            request.getRequestDispatcher("ListarClienteCTR").forward(request, response);
        }
        
            
        
        else{
            String mensagem2 = "Erro ao cadastrar - Idade menor que 18 anos !";
            request.setAttribute("msg2", mensagem2);
            request.getRequestDispatcher("paginaEntrada.jsp").forward(request, response);
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
