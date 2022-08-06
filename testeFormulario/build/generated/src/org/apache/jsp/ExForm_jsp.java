package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ExForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Preencha o formulário abaixo: </h1>\n");
      out.write("        \n");
      out.write("        <form action=\"form1\" method=\"POST\">\n");
      out.write("        <label>Digite o nome da máquina: </label> <input type=\"text\" size=\"15\" name=\"nomeMaquina\"/><br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <label>Selecione uma potencia de operação da máquina(0 a 10): </label><br>\n");
      out.write("        <input type=\"range\" name=\"potencia\" min=\"1\" max=\"10\"/>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <label> Selecione a empresa fabricante: </label>\n");
      out.write("        <select name=\"fabricante\">\n");
      out.write("            \n");
      out.write("            <option value=\"empresa A\">Empresa A</option>\n");
      out.write("            <option value=\"empresa B\">Empresa B</option>\n");
      out.write("            <option value=\"empresa C\">Empresa C</option>\n");
      out.write("            \n");
      out.write("        </select>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <label>Selecione a data de fabricação da máquina: </label>\n");
      out.write("        <input type=\"date\" name=\"dataFab\"/>\n");
      out.write("        \n");
      out.write("        <br> \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Enviar dados\"/>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <label> Dados informados: </label> <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <p> Nome da máquina: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nomeMaq}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("        <p> Potência: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("        <p> Empresa Fabricante: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empresa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("        <p> Data de Fabricação: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataFab}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("        \n");
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
