/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.PacienteDAO;
import MODEL.Paciente;
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
@WebServlet(name = "CadastrarPaciente", urlPatterns = {"/CadastrarPaciente"})
public class CadastrarPaciente extends HttpServlet {

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

            Paciente oPaciente = new Paciente();
            
            oPaciente.setNomePessoa(request.getParameter("nomePaciente"));
            oPaciente.setCpfPessoa(Integer.parseInt(request.getParameter("cpfPaciente")));
            oPaciente.setDataNascimentoPessoa(Conversoes.converterData(request.getParameter("dataNascimentoPaciente")));
            oPaciente.setGeneroPessoa(request.getParameter("generoPaciente"));
            oPaciente.setEnderecoPessoa(request.getParameter("enderecoPaciente"));
            oPaciente.setBairroPessoa(request.getParameter("bairroPaciente"));
            oPaciente.setCidadePessoa(request.getParameter("cidadePaciente"));
            oPaciente.setCepPessoa(request.getParameter("cepPaciente"));
            oPaciente.setTelefonePessoa(request.getParameter("telefonePaciente"));
            oPaciente.setCelularPessoa(request.getParameter("celularPaciente"));
            oPaciente.setObservacoesPaciente(request.getParameter("observacoesPaciente"));
            oPaciente.setEmailPessoa(request.getParameter("emailPaciente"));
            oPaciente.setSenhaPessoa(request.getParameter("senhaPaciente"));

            String msg = "";
            PacienteDAO oPacienteDAO = new PacienteDAO();

            if (oPacienteDAO.cadastrarPaciente(oPaciente)) {
                msg = "Paciente cadastrado com sucesso ! ";
            } else {
                msg = "Erro ao cadastrar paciente";
            }

            request.setAttribute("msg", msg);
            request.getRequestDispatcher("CadastrarPaciente.jsp").forward(request, response);

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
