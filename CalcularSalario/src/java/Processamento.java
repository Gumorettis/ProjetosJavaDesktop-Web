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
  Condição salario é: 
  * Se o salario for maior ou igual a 5.000 ele possui 
  * salario acima do teto
  * Se o salario for abaixo de 5.000 ele possui
  * salario dentro do teto.
  * Emitir uma mensagem para o usuário falando que: 
  * "Seu salario esta acima do teto" ou
  * "Seu salario esta abaixo do teto"
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
        //criamos as variaveis que receberam os dados da requisição 
        String nomeFuncionario = request.getParameter("nome");
        int horasTrabalhadas = Integer.parseInt(request.getParameter("horas"));
        double valorHora = Double.parseDouble(request.getParameter("valorHora"));
        String mensagem = ""; //declarar uma variavel String porém vazia
        
        double valorSalario; 
        //estrutura do calculo
        valorSalario = (horasTrabalhadas*valorHora);
        
        //estrutura condicional 
        if(valorSalario >= 5000){
            mensagem = "O seu salario esta acima do Teto !";
        }
        
        else{
            mensagem = "O seu salario esta abaixo do Teto !";
        }
        
        //criei as referencias para os dados serem exibidos 
        request.setAttribute("nome", nomeFuncionario);
        request.setAttribute("horasTrabalhadas", horasTrabalhadas);
        request.setAttribute("valorHora", valorHora);
        request.setAttribute("valorSalario", valorSalario);
        request.setAttribute("msg", mensagem);
        
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
