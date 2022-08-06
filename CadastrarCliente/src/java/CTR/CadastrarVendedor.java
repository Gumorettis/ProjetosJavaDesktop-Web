/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.VendedorDAO;
import MODEL.Vendedor;
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
@WebServlet(name = "CadastrarVendedor", urlPatterns = {"/CadastrarVendedor"})
public class CadastrarVendedor extends HttpServlet {

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
        
        String nome = request.getParameter("nomeVendedor");
        String rg = request.getParameter("rgVendedor");
        String empresa = request.getParameter("empresaVendedor");
        int horas = Integer.parseInt(request.getParameter("horasTrabalhadas"));
        
        Vendedor oVendedor = new Vendedor();
        
        oVendedor.setNome_vendedor(nome);
        oVendedor.setRg_vendedor(rg);
        oVendedor.setEmpresa(empresa);
        oVendedor.setHoras_trabalhadas(horas);
        
        String msg = "";
        VendedorDAO oVendedorDAO = new VendedorDAO();
        
        try {
            if(oVendedorDAO.cadastrarVendedor(oVendedor)){
            msg = "VENDEDOR CADASTRADO COM SUCESSO !";
        }
            else
                System.out.println("ERRO AO CADASTRAR VENDEDOR ! ");
            
        request.setAttribute("msg", msg);
            
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR NA CTR ");
        }
        
        request.getRequestDispatcher("cadastrar-vendedor.jsp").forward(request, response);
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
