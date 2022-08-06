/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
@WebServlet(urlPatterns = {"/Processamento"})
public class Processamento extends HttpServlet {

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
        
        //recebi os dados da JSP Inicial em variaveis 
        String nome = request.getParameter("nomeFuncionario");
        int quantidadeHoras = Integer.parseInt(request.getParameter("horasTrabalhadas"));
        double valorHoraTrabalhada = Double.parseDouble(request.getParameter("valorHora"));
        
        //Nos temos fazer a realizar a passagem das informações 
        //para os atributos utilizando o método set.
        
        //Criar uma instância(chamada/link) da minha Classe Objeto = Salario.
        Salario oSalario = new Salario(); 
        
        //etapa de passagem de dados da Servlet para a Classe Objeto
        //utilizando o método set e a instância(link) da Classe Objeto.
        oSalario.setNomeFuncionario(nome);
        oSalario.setHorasTrabalhadas(quantidadeHoras);
        oSalario.setValorHoraT(valorHoraTrabalhada);
        
        //realizar a chamada do método de calcular salario
        //e junto estou criando uma referencia do resultado para ser
        //exibido lá na pagina Resultado. 
        request.setAttribute("resultado", oSalario.calcularSalario());
        request.setAttribute("nome", nome);
        
        request.getRequestDispatcher("paginaResultado.jsp").forward(request, response);
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
