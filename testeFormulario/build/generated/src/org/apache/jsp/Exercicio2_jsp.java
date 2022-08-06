package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Exercicio2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Pagina de Investimentos</title>\n");
      out.write("\n");
      out.write("        <style> \n");
      out.write("            #btn{\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                border: 3px solid black;\n");
      out.write("                color: white;\n");
      out.write("                padding: 16px 32px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Digite as informações referente ao investimento : </h1>\n");
      out.write("\n");
      out.write("        <form action=\"Exercicio2\" method=\"POST\">\n");
      out.write("            <label>Digite seu nome: </label> <input type=\"text\" size=\"15\" name=\"nome\"/><br>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <label>Selecione a sua data de nascimento: </label>\n");
      out.write("            <input type=\"date\" name=\"dataNascimento\"/>\n");
      out.write("            <br> \n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <label>Selecione a quantidade que deseja investir(100 a 20.000): </label><br>\n");
      out.write("            <input type=\"range\" name=\"valorInvestimento\" min=\"100\" max=\"20000\"/>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <label> Selecione o tipo de investimento: </label> <br>\n");
      out.write("            <p> Ações(Média de 20% - Alto risco) <input type=\"radio\" name=\"grupo1\"  value=\"acao\"/> <br> </p>\n");
      out.write("            <p> Titulo do Tesouro(Média de 10% - Risco Moderado) <input type=\"radio\" name=\"grupo1\" value=\"titulo\"/> <br> </p>\n");
      out.write("            <p> Poupança(Média de 5% - Risco baixo) <input type=\"radio\" name=\"grupo1\"  value=\"poup\"/> <br> </p>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Simular\" id=\"btn\"/>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <h2>Resumo da Simulação: </h2>\n");
      out.write("\n");
      out.write("        <p> Nome: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        <p> Data de Nascimento: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataNascimento}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \n");
      out.write("        <p> Tipo do Investimento: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoInvest}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \n");
      out.write("        <p> Total Investido: R$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valorInvestido}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \n");
      out.write("        <p> Valor do Retorno financeiro: R$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${retorno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \n");
      out.write("        <p> Valor Final após rendimento: R$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valorFinal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
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
