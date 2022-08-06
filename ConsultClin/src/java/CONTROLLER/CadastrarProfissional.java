/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.ProfissionalDAO;
import MODEL.Profissional;
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
@WebServlet(name = "CadastrarProfissional", urlPatterns = {"/CadastrarProfissional"})
public class CadastrarProfissional extends HttpServlet {

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

            Profissional oProfissional = new Profissional();

            oProfissional.setNomePessoa(request.getParameter("nomeProfissional"));
            oProfissional.setCpfPessoa(Integer.parseInt(request.getParameter("cpfProfissional")));
            oProfissional.setDataNascimentoPessoa(Conversoes.converterData(request.getParameter("dataNascimentoProfissional")));
            oProfissional.setGeneroPessoa(request.getParameter("generoProfissional"));
            oProfissional.setEnderecoPessoa(request.getParameter("enderecoProfissional"));
            oProfissional.setBairroPessoa(request.getParameter("bairroProfissional"));
            oProfissional.setCidadePessoa(request.getParameter("cidadeProfissional"));
            oProfissional.setCepPessoa(request.getParameter("cepProfissional"));
            oProfissional.setTelefonePessoa(request.getParameter("telefoneProfissional"));
            oProfissional.setCelularPessoa(request.getParameter("celularProfissional"));
            oProfissional.setAreaAtuacaoProfissional(request.getParameter("areaAtuacaoProfissional"));
            oProfissional.setEmailPessoa(request.getParameter("emailProfissional"));
            oProfissional.setSenhaPessoa(request.getParameter("senhaProfissional"));

            String msg = "";

            ProfissionalDAO oProfissionalDAO = new ProfissionalDAO();

            if (oProfissionalDAO.cadastrarProfissional(oProfissional)) {

                msg = "Profissional cadastrado com sucesso ! ";

            } else {

                msg = "Erro ao cadastrar profissional";

            }

            request.setAttribute("msg", msg);
            request.getRequestDispatcher("CadastrarProfissional.jsp").forward(request, response);

        } catch (Exception e) {

            System.out.println("Erro ao inserir Paciente" + e.getMessage());
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
