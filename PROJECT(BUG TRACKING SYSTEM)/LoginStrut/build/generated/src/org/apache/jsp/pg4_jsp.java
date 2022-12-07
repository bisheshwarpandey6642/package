package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pg4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write(".card {\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);\n");
      out.write("  max-width: 300px;\n");
      out.write("  margin: auto;\n");
      out.write("  text-align: center;\n");
      out.write("  font-family: arial;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  padding: 0 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container::after {\n");
      out.write("  content: \"\";\n");
      out.write("  clear: both;\n");
      out.write("  display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title {\n");
      out.write("  color: grey;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("  border: none;\n");
      out.write("  outline: 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 8px;\n");
      out.write("  color: white;\n");
      out.write("  background-color: #000;\n");
      out.write("  text-align: center;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 100%;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 22px;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover, a:hover {\n");
      out.write("  opacity: 0.7;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2 style=\"text-align:center\">E-contact-Card</h2>\n");
      out.write("\n");
      out.write("<div class=\"card\">\n");
      out.write("  <img src = \"img/er.jpg\" height = \"120\" width = \"120\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h1>Bisheshwar Pandey</h1>\n");
      out.write("    <p class=\"title\">CEO & Founder, ozho</p>\n");
      out.write("    <p>Lovely Professional University</p>\n");
      out.write("    <div style=\"margin: 24px 0;\">\n");
      out.write("      <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a> \n");
      out.write("      <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>  \n");
      out.write("      <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>  \n");
      out.write("      <a href=\"#\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("   </div>\n");
      out.write("    <p><button><a href = \"https://www.facebook.com/bisheswar.pandey.3\">Contact</a><center>CONTACT</center></button></p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
