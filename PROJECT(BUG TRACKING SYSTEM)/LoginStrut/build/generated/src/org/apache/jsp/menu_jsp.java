package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_link_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_p_link_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_p_link_action.release();
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
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"ceo.css\">\n");
      out.write("        <div id = \"nav_wrapper\">\n");
      out.write("        <table width=\"100%\" border=\"2px\">\n");
      out.write("            <tr><td width=\"20%\" height=\"400\" valign=\"top\"><br><br><br><br><br><br>\n");
      out.write("                    ");
      if (_jspx_meth_p_link_0(_jspx_page_context))
        return;
      out.write("<br><br>\n");
      out.write("            ");
      if (_jspx_meth_p_link_1(_jspx_page_context))
        return;
      out.write("<br><br>\n");
      out.write("            ");
      if (_jspx_meth_p_link_2(_jspx_page_context))
        return;
      out.write("<br><br>\n");
      out.write("            ");
      if (_jspx_meth_p_link_3(_jspx_page_context))
        return;
      out.write("<br><br>\n");
      out.write("            ");
      if (_jspx_meth_p_link_4(_jspx_page_context))
        return;
      out.write("<br><br>\n");
      out.write("                </td>\n");
      out.write("        \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
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

  private boolean _jspx_meth_p_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_0.setPageContext(_jspx_page_context);
    _jspx_th_p_link_0.setParent(null);
    _jspx_th_p_link_0.setAction("/log1");
    int _jspx_eval_p_link_0 = _jspx_th_p_link_0.doStartTag();
    if (_jspx_eval_p_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_0.doInitBody();
      }
      do {
        out.write("menu");
        int evalDoAfterBody = _jspx_th_p_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_0);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_0);
    return false;
  }

  private boolean _jspx_meth_p_link_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_1.setPageContext(_jspx_page_context);
    _jspx_th_p_link_1.setParent(null);
    _jspx_th_p_link_1.setAction("/log1");
    int _jspx_eval_p_link_1 = _jspx_th_p_link_1.doStartTag();
    if (_jspx_eval_p_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_1.doInitBody();
      }
      do {
        out.write("Model");
        int evalDoAfterBody = _jspx_th_p_link_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_1);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_1);
    return false;
  }

  private boolean _jspx_meth_p_link_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_2.setPageContext(_jspx_page_context);
    _jspx_th_p_link_2.setParent(null);
    _jspx_th_p_link_2.setAction("/log2");
    int _jspx_eval_p_link_2 = _jspx_th_p_link_2.doStartTag();
    if (_jspx_eval_p_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_2.doInitBody();
      }
      do {
        out.write("Shop");
        int evalDoAfterBody = _jspx_th_p_link_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_2);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_2);
    return false;
  }

  private boolean _jspx_meth_p_link_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_3 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_3.setPageContext(_jspx_page_context);
    _jspx_th_p_link_3.setParent(null);
    _jspx_th_p_link_3.setAction("/log2");
    int _jspx_eval_p_link_3 = _jspx_th_p_link_3.doStartTag();
    if (_jspx_eval_p_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_3.doInitBody();
      }
      do {
        out.write("Shop");
        int evalDoAfterBody = _jspx_th_p_link_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_3);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_3);
    return false;
  }

  private boolean _jspx_meth_p_link_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_4 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_4.setPageContext(_jspx_page_context);
    _jspx_th_p_link_4.setParent(null);
    _jspx_th_p_link_4.setAction("/log2");
    int _jspx_eval_p_link_4 = _jspx_th_p_link_4.doStartTag();
    if (_jspx_eval_p_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_4.doInitBody();
      }
      do {
        out.write("Shop");
        int evalDoAfterBody = _jspx_th_p_link_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_4);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_4);
    return false;
  }
}
