package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ExercicioForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                padding: 0;\n");
      out.write("                background-color: cornsilk;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                \n");
      out.write("                width: 30%;\n");
      out.write("                margin: auto auto;\n");
      out.write("                font-family: Georgia;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            fieldset{\n");
      out.write("                margin-top: 50%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=submit]{\n");
      out.write("                background-color: black;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                right: 5px;\n");
      out.write("                padding: 10px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("\n");
      out.write("            <fieldset>\n");
      out.write("                <legend> Formulário de Mercadoria - Cliente </legend>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                Nome: <input type=\"text\" size=\"15\" name=\"nome\" min=\"5\"/> <br>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                Endereço: <input type=\"text\" size=\"15\" name=\"end\" minlength=\"5\"/><br>\n");
      out.write("                <br> \n");
      out.write("\n");
      out.write("                Telefone: <input type=\"tel\" size=\"15\" name=\"telefone\" placeholder=\"(99)-99999-9999\"/> <br>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                Peso da mercadoria: <input type=\"range\" minlength=\"1\" maxlength=\"1000\"/> <br>\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                Cidade entrega: \n");
      out.write("                <input list=\"entrega\">\n");
      out.write("\n");
      out.write("                <datalist id=\"entrega\">\n");
      out.write("\n");
      out.write("                    <option value=\"Rio Preto\">\n");
      out.write("                    <option value=\"Rio de Janeiro\">\n");
      out.write("                    <option value=\"Campinas\">\n");
      out.write("                    <option value=\"Poços de Caldas\">\n");
      out.write("                </datalist>\n");
      out.write("                <br> \n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Cadastrar\" /> <br>\n");
      out.write("            </fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
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
