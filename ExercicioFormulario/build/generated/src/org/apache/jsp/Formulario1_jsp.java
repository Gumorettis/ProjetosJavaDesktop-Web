package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Formulario1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            input[type=submit]{\n");
      out.write("                background-color: #6495ED;\n");
      out.write("                border: 3px solid; \n");
      out.write("                border-radius: 7px;\n");
      out.write("                padding: 7px 30px;\n");
      out.write("                margin: 5px 5px;\n");
      out.write("                font-family: monospace;\n");
      out.write("                font-size: 20px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=submit]:hover{\n");
      out.write("                background-color: aliceblue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div{\n");
      out.write("                border-radius: 5px;\n");
      out.write("                background-color: #cccccc;\n");
      out.write("                padding: 20px;\n");
      out.write("                max-width: 500px;\n");
      out.write("                width: 70%;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%;\n");
      out.write("                top: 30%;\n");
      out.write("                transform: translate(-50%,-50%);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            label,select{\n");
      out.write("                font-family: monospace;\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #posicaoTabela{\n");
      out.write("                border-radius: 20px;\n");
      out.write("                top: 68%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #tabela{\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            p{\n");
      out.write("                font-family: 'Roboto Slab', serif;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("                font-family: monospace;\n");
      out.write("                font-size: 16px;\n");
      out.write("                color: red;\n");
      out.write("                font-weight: bold;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <h1>Preencha o formulário abaixo</h1> <br>\n");
      out.write("            <form action=\"Form1\" method=\"POST\">\n");
      out.write("\n");
      out.write("                <label>Digite o nome da máquina: </label> \n");
      out.write("\n");
      out.write("                <input type=\"text\" size=\"15\" name=\"nomeMaquina\"/> <br>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <label>Selecione uma potencia de operação(1 a 10): </label> \n");
      out.write("                <input type=\"range\" name=\"potencia\" min=\"1\" max=\"10\"/> <br>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <label>Selecione a empresa fabricante da maquina: </label> \n");
      out.write("                <select name=\"Fabricante\">\n");
      out.write("                    <option value=\"Empresa A\">Empresa A </option>\n");
      out.write("                    <option value=\"Empresa B\">Empresa B</option>\n");
      out.write("                    <option value=\"Empresa C\">Empresa C</option>\n");
      out.write("\n");
      out.write("                </select> <br>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <label>Data de Fabricação da máquina: </label> \n");
      out.write("                <input type=\"date\" name=\"dataFab\"/> <br>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <label> Grau de manuseio da máquina:  <br>\n");
      out.write("                    Alto <input type=\"radio\" name=\"grupo\" value=\"Alto\"/> <br>\n");
      out.write("                    Medio <input type=\"radio\" name=\"grupo\" value=\"Medio\" /> <br>\n");
      out.write("                    Baixo <input type=\"radio\" name=\"grupo\" value=\"Baixo\" /> <br>\n");
      out.write("                    <br> </label>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Enviar Dados\"/>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("                        \n");
      out.write("        <div id=\"posicaoTabela\">\n");
      out.write("\n");
      out.write("            <table id=\"tabela\" border=\"3px\">\n");
      out.write("\n");
      out.write("                <thead>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\"> <h2>Informações da Máquina </h2> </th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> <p>Nome máquina</p> </td>\n");
      out.write("                        <td> <a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nomeMaquina}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td> <p>Potencia da máquina</p> </td>\n");
      out.write("                        <td> <a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${potencia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td> <p>Fabricante</p> </td>\n");
      out.write("                        <td> <a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empresa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td> <p>Data de Fabricação</p> </td>\n");
      out.write("                        <td> <a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataFab}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td> <p>Nível de manuseio</p> </td>\n");
      out.write("                        <td> <a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${manuseio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("                    \n");
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
