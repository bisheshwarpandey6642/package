package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_form_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_errors_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_errors_nobody.release();
    _jspx_tagPool_t_form_action.release();
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
      out.write("    <style>\n");
      out.write("form {\n");
      out.write("    border: 3px solid #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("    opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cancelbtn {\n");
      out.write("    width: auto;\n");
      out.write("    padding: 10px 18px;\n");
      out.write("    background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".imgcontainer {\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 12px 0 6px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.avatar {\n");
      out.write("    width: 20%;\n");
      out.write("    border-radius: 30%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.psw {\n");
      out.write("    float: right;\n");
      out.write("    padding-top: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\n");
      out.write("@media screen and (max-width: 300px) {\n");
      out.write("    span.psw {\n");
      out.write("       display: block;\n");
      out.write("       float: none;\n");
      out.write("    }\n");
      out.write("    .cancelbtn {\n");
      out.write("       width: 100%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h2>Login </h2>\n");
      out.write("        <center>\n");
      out.write("        ");
      if (_jspx_meth_t_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <font color=\"blue\">");
      if (_jspx_meth_t_errors_0(_jspx_page_context))
        return;
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mssg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("    </center>\n");
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

  private boolean _jspx_meth_t_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:form
    org.apache.struts.taglib.html.FormTag _jspx_th_t_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_t_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_t_form_0.setPageContext(_jspx_page_context);
    _jspx_th_t_form_0.setParent(null);
    _jspx_th_t_form_0.setAction("/log");
    int _jspx_eval_t_form_0 = _jspx_th_t_form_0.doStartTag();
    if (_jspx_eval_t_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"imgcontainer\">\n");
        out.write("    <img src=\"img/BUG.png\" alt=\"Avatar\" class=\"avatar\">\n");
        out.write("  </div>\n");
        out.write("\n");
        out.write("  <div class=\"container\">\n");
        out.write("    <label><b>Username</b></label>\n");
        out.write("    <input type=\"text\" placeholder=\"Enter Username\" name=\"t1\" required>\n");
        out.write("\n");
        out.write("    <label><b>Password</b></label>\n");
        out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"t2\" required>\n");
        out.write("        \n");
        out.write("    <button type=\"submit\">Login</button>\n");
        out.write("    <input type=\"checkbox\" checked=\"checked\"> Remember me\n");
        out.write("  </div>\n");
        out.write("\n");
        out.write("  <div class=\"container\" style=\"background-color:#f1f1f1\">\n");
        out.write("     \n");
        out.write("    <span class=\"psw\">Forgot <a href=\"#\">password?</a></span>\n");
        out.write("  </div>\n");
        out.write("       <!-- Name : <input type=\"text\" name=\"t1\"/><br>\n");
        out.write("        password : <input type=\"password\" name=\"t2\"/><br>\n");
        out.write("        <input type=\"submit\" value=\"login\"/>-->\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_t_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_form_action.reuse(_jspx_th_t_form_0);
      return true;
    }
    _jspx_tagPool_t_form_action.reuse(_jspx_th_t_form_0);
    return false;
  }

  private boolean _jspx_meth_t_errors_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_t_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_t_errors_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_t_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_t_errors_0.setParent(null);
    int _jspx_eval_t_errors_0 = _jspx_th_t_errors_0.doStartTag();
    if (_jspx_th_t_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_errors_nobody.reuse(_jspx_th_t_errors_0);
      return true;
    }
    _jspx_tagPool_t_errors_nobody.reuse(_jspx_th_t_errors_0);
    return false;
  }
}
