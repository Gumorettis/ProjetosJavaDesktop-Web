package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrarResponsavel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"ListarResponsavel\"></a>\n");
      out.write("        <h1>DIGITE OS DADOS ABAIXO PARA ADICIONAR UM NOVO RESPONSAVEL DO SISTEMA: </h1>\n");
      out.write("        \n");
      out.write("        <form action=\"CadastrarResponsavel\" method=\"POST\">\n");
      out.write("            \n");
      out.write("        Id: <input type=\"text\" size=\"10\" name=\"id\" readonly=\"true\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.id_responsavel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <br> \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        Nome: <input type=\"text\" size=\"15\" name=\"nomeResp\" required=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.nome_pessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        cpf: <input type=\"text\" size=\"15\" name=\"cpf\" required=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.cpf_pessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        email: <input type=\"text\" size=\"15\" name=\"email\" required=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.email_pessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        Login: <input type=\"text\" size=\"20\" name=\"login\" required=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.login_pessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        senha: <input type=\"text\" size=\"15\" name=\"senha\" required=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.senha_pessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        telefone: <input type=\"text\" size=\"15\" name=\"telefone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.telefone_pessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        Nick do responsavel: <input type=\"text\" size=\"15\" name=\"nick\" required=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.nickResponsavel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Salvar\"/>\n");
      out.write("        \n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("          \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        <table border=\"2\" cellspacing=0 class=\"tabelaResp\">\n");
      out.write("            \n");
      out.write("            <h1>Listagem de Responsavel</h1>\n");
      out.write("            \n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <th> ID Responsavel </th>\n");
      out.write("                    <th> Nome </th>\n");
      out.write("                    <th> CPF </th>\n");
      out.write("                    <th> Email </th>\n");
      out.write("                    <th> Login </th>\n");
      out.write("                    <th> senha </th>\n");
      out.write("                    <th> telefone </th>\n");
      out.write("                    <th> Nick </th>\n");
      out.write("                    <th colspan=\"2\"> Editar </th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            \n");
      out.write("            <tbody>\n");
      out.write("                \n");
      out.write("               ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("        </tbody>\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("                \n");
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
    _jspx_th_c_forEach_0.setVar("responsavel");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("               <tr>\n");
          out.write("                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.id_responsavel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.nome_pessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.cpf_pessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.email_pessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.login_pessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.senha_pessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.telefone_pessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.nickResponsavel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                    <td><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/ExcluirResponsavel?id_responsavel=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.id_responsavel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> Excluir </a></td>\n");
          out.write("                    <td><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/CarregarResponsavel?id_responsavel=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${responsavel.id_responsavel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> Alterar </a></td>\n");
          out.write("                </tr> \n");
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
