/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.PublicacaoDAO;
import MODEL.PessoaFisica;
import MODEL.Publicacao;
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
@WebServlet(name = "CadastrarPublicacao", urlPatterns = {"/CadastrarPublicacao"})
public class CadastrarPublicacao extends HttpServlet {

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
        
        
        Publicacao oPublicacao = new Publicacao();
        
        oPublicacao.setDescricao(request.getParameter("descricao"));
        oPublicacao.setIdPublicador(new PessoaFisica(Integer.parseInt(request.getParameter("idPublicador"))));
        
        String msg = "";
        
        try {
            PublicacaoDAO daoPub = new PublicacaoDAO();
            
            if(request.getParameter("idPublicacao").equals("")){
                
                if(daoPub.cadastrarPublicacao(oPublicacao)){
                    msg = "Publicacao cadastrada com sucesso !";
                }
                
                else{
                    msg = "Erro ao cadastrar publicacao!";
                }
                
            }else if(!request.getParameter("idPublicacao").equals("")){
                
                oPublicacao.setIdPublicacao(Integer.parseInt(request.getParameter("idPublicacao")));
                if(daoPub.alterarPublicacao(oPublicacao)){
                    msg = "Publicacao alterada com sucesso ! ";
                }
                else{
                    msg = "Erro ao alterar publicacao !";
                }
            }
            
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("ListarPublicacao").forward(request, response);
            
        } catch (Exception e) {
            System.out.println("ERRO AO CADASTRAR PUBLICACAO NA SERVLET "+e.getMessage());
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
