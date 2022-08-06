/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

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
@WebServlet(name = "Exercicio", urlPatterns = {"/Exercicio"})
public class Exercicio extends HttpServlet {

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
       
        String nomeProduto = request.getParameter("nomeProduto");
        int quantidade = Integer.parseInt(request.getParameter("qtd"));
        int valorProduto = Integer.parseInt(request.getParameter("valorProd"));
        String tipoCompra = request.getParameter("grupo1");
        String dataValidade = request.getParameter("dataValidade");
        
        double valorCompra, desconto = 0, valorFinal = 0;
        
        //valor da compra sem desconto ! 
        valorCompra = valorProduto*quantidade;
       
        if(tipoCompra.equals("Atacado")){
            desconto = valorCompra*0.02;
            //valor final da compra com desconto !
            valorFinal = valorCompra-desconto;
        }
        else if(tipoCompra.equals("Varejo")){
            desconto = valorCompra*0.05;
            valorFinal = valorCompra-desconto;
        }
        else if(tipoCompra.equals("cnpj")){
            desconto = valorCompra*0.1;
            valorFinal = valorCompra-desconto;
        }
        
        request.setAttribute("nomeProduto", nomeProduto);
        request.setAttribute("valorProduto", valorProduto);
        request.setAttribute("totalPagar", valorCompra);
        request.setAttribute("desconto", desconto);
        request.setAttribute("dataValidade", dataValidade);
        request.setAttribute("valorFinal", valorFinal);
        
        request.getRequestDispatcher("Formulario.jsp").forward(request, response);
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
