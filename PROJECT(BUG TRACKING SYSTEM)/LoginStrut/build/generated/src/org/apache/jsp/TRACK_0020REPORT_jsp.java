package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TRACK_0020REPORT_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <table width=\"888\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <!--DWLayoutDefaultTable-->\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"182\" height=\"51\">&nbsp;</td>\n");
      out.write("    <td width=\"137\">&nbsp;</td>\n");
      out.write("    <td width=\"108\"></td>\n");
      out.write("    <td width=\"210\"></td>\n");
      out.write("    <td width=\"11\"></td>\n");
      out.write("    <td width=\"104\"></td>\n");
      out.write("    <td width=\"136\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"28\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">PRODUCT ID </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td colspan=\"2\" valign=\"top\"><input type=\"text\" name=\"textfield\" /></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"34\"></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"27\"></td>\n");
      out.write("    <td valign=\"top\">PRODUCT NAME </td>\n");
      out.write("    <td></td>\n");
      out.write("    <td colspan=\"2\" valign=\"top\"><input type=\"text\" name=\"textfield2\" /></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"38\"></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td valign=\"top\"><input type=\"submit\" name=\"Submit\" value=\"Submit\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"30\"></td>\n");
      out.write("    <td valign=\"top\">BUG ID </td>\n");
      out.write("    <td></td>\n");
      out.write("    <td colspan=\"2\" valign=\"top\"><input type=\"text\" name=\"textfield3\" /></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"34\"></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"26\"></td>\n");
      out.write("    <td valign=\"top\">TYPE</td>\n");
      out.write("    <td></td>\n");
      out.write("    <td colspan=\"2\" valign=\"top\"><input type=\"text\" name=\"textfield4\" /></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"28\"></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"2\"></td>\n");
      out.write("    <td rowspan=\"2\" valign=\"top\">DESCRIPTION</td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"28\"></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td rowspan=\"2\" valign=\"top\"><textarea name=\"textarea\"></textarea></td>\n");
      out.write("  <td></td>\n");
      out.write("  <td></td>\n");
      out.write("  <td></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("    <td height=\"42\"></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"16\"></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
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
