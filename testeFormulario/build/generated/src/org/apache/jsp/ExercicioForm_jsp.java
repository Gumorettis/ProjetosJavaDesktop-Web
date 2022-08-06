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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Preencha o formulário abaixo: </h1>\n");
      out.write("        \n");
      out.write("        <form action=\"Exercicio1\" method=\"POST\">\n");
      out.write("        <label>Digite o nome do produto: </label> <input type=\"text\" size=\"15\" name=\"nomeProduto\"/><br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <label>Selecione quantidade do produto(1 a 100): </label><br>\n");
      out.write("        <input type=\"range\" name=\"qtd\" min=\"1\" max=\"100\"/>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <label>Digite o valor do produto (R$): </label> <input type=\"number\" size=\"15\" name=\"valorProd\" min=\"1\"/><br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <label> Selecione o tipo de compra: </label> <br>\n");
      out.write("        Atacado <input type=\"radio\" name=\"grupo1\"  value=\"Atacado\"/> <br>\n");
      out.write("        Varejo <input type=\"radio\" name=\"grupo1\" value=\"Varejo\"/> <br>\n");
      out.write("        CNPJ <input type=\"radio\" name=\"grupo1\"  value=\"cnpj\"/> <br>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <label>Selecione a data de validade do produto: </label>\n");
      out.write("        <input type=\"date\" name=\"dataValidade\"/>\n");
      out.write("        <br> \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Enviar dados\" name=\"btn\"/>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <h2>Resumo da compra: </h2>\n");
      out.write("        \n");
      out.write("        <p> Nome do produto: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nomeProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        <p> Valor do produto: R$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valorProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \n");
      out.write("        <p> Total a pagar: R$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPagar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \n");
      out.write("        <p> Desconto aplicado: R$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${desconto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \n");
      out.write("        <p> Data de validade do produto: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataValidade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        <p> Valor final da compra: R$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valorFinal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \n");
      out.write("        \n");
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
