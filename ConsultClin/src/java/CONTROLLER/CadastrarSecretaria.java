/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.SecretariaDAO;
import MODEL.Secretaria;
import UTIL.Conversoes;
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
@WebServlet(name = "CadastrarSecretaria", urlPatterns = {"/CadastrarSecretaria"})
public class CadastrarSecretaria extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");

        try {

            Secretaria oSecretaria = new Secretaria();

            oSecretaria.setNomePessoa(request.getParameter("nomeSecretaria"));
            oSecretaria.setCpfPessoa(Integer.parseInt(request.getParameter("cpfSecretaria")));
            oSecretaria.setGeneroPessoa(request.getParameter("generoSecretaria"));
            oSecretaria.setDataNascimentoPessoa(Conversoes.converterData(request.getParameter("dataNascimentoSecretaria")));
            oSecretaria.setEnderecoPessoa(request.getParameter("enderecoSecretaria"));
            oSecretaria.setBairroPessoa(request.getParameter("bairroSecretaria"));
            oSecretaria.setCidadePessoa(request.getParameter("cidadeSecretaria"));
            oSecretaria.setCepPessoa(request.getParameter("cepSecretaria"));
            oSecretaria.setTelefonePessoa(request.getParameter("telefoneSecretaria"));
            oSecretaria.setCelularPessoa(request.getParameter("celularSecretaria"));
            oSecretaria.setEmailPessoa(request.getParameter("emailSecretaria"));
            oSecretaria.setSenhaPessoa(request.getParameter("senhaSecretaria"));

            String msg = "";

            SecretariaDAO oSecretariaDAO = new SecretariaDAO();

            if (oSecretariaDAO.cadastrarSecretaria(oSecretaria)) {

                msg = "Secretaria cadastrado com sucesso ! ";

            } else {
                msg = "Erro ao cadastrar secretaria";
            }

            request.setAttribute("msg", msg);
            request.getRequestDispatcher("CadastrarSecretaria.jsp").forward(request, response);

        } catch (Exception e) {
            System.out.println("Erro ao inserir Secretaria" + e.getMessage());
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
