package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrarAdm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastrar Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Preencha o formulário abaixo: </h1>\n");
      out.write("        \n");
      out.write("        <form action=\"CadastrarAdministrador\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            ID: <input type=\"text\" size=\"10\" name=\"id\" readonly=\"true\" /> <br> \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            Nome: <input type=\"text\" size=\"15\" name=\"nome\" /> <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            Endereco: <input type=\"text\" size=\"15\" name=\"endereco\" /> <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            Telefone: <input type=\"text\" size=\"15\" name=\"telefone\" /> <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            Nivel Acesso: <input type=\"text\" size=\"15\" name=\"nivelAcesso\" /> <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            Login/usuário: <input type=\"text\" size=\"15\" name=\"login\" /> <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            Senha: <input type=\"password\" size=\"15\" name=\"senha\" /> <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Enviar Dados\"/>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <a href=\"logar.jsp\">Pagina de Login</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
