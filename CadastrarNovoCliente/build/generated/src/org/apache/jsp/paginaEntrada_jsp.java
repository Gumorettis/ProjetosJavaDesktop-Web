package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paginaEntrada_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Entrada dos dados</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Digite os dados abaixo para serem cadastrados: </h1>\n");
      out.write("        \n");
      out.write("        <form action=\"CadastrarClienteCTR\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" size=\"10\" name=\"idCliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            Nome: <input type=\"text\" size=\"15\" name=\"nomeCliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.nomeCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            RG: <input type=\"text\" size=\"15\" name=\"rgCliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.rgCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            Idade: <input type=\"text\" size=\"10\" name=\"idadeCliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.idadeCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            telefone: <input type=\"text\" size=\"15\" name=\"telefoneCliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.telefoneCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"CADASTRAR\"/> <br>\n");
      out.write("            \n");
      out.write("            <h1> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("            \n");
      out.write("            <h1> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h1>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("    ");
      out.write("\n");
      out.write("    \n");
      out.write("    <table border=\"2\" cellspacing=0 class=\"\">\n");
      out.write("        \n");
      out.write("        <h1>Lista de todos Clientes Cadastrados : </h1>\n");
      out.write("        \n");
      out.write("        <thead>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <th>ID Cliente </th>\n");
      out.write("                <th>Nome Cliente </th>\n");
      out.write("                <th>RG Cliente </th>\n");
      out.write("                <th>Idade Cliente </th>\n");
      out.write("                <th>Telefone Cliente </th>\n");
      out.write("                <th colspan=\"2\"> Editar </th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </thead>\n");
      out.write("        \n");
      out.write("        <tbody>\n");
      out.write("            \n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("        </tbody>\n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msgExcluir}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    \n");
      out.write("    <h1> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/listarClienteNome.jsp\"> Listagem de Cliente por nome ! </a> </h1>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("cliente");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr>\n");
          out.write("            \n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.nomeCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.rgCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.idadeCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.telefoneCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                \n");
          out.write("                <td> <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/ExcluirCliente?idCliente=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> Excluir </a> </td>\n");
          out.write("                <td> <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/CarregarCliente?idCliente=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> Alterar </a></td>\n");
          out.write("                \n");
          out.write("            </tr>\n");
          out.write("                \n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
