package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SIGN_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html><style>\n");
      out.write("/* Full-width input fields */\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set a style for all buttons */\n");
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
      out.write("/* Extra styles for the cancel button */\n");
      out.write(".cancelbtn {\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Float cancel and signup buttons and add an equal width */\n");
      out.write(".cancelbtn,.signupbtn {\n");
      out.write("    float: left;\n");
      out.write("    width: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add padding to container elements */\n");
      out.write(".container {\n");
      out.write("    padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats */\n");
      out.write(".clearfix::after {\n");
      out.write("    content: \"\";\n");
      out.write("    clear: both;\n");
      out.write("    display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <h2>Signup For Free</h2>\n");
      out.write("\n");
      out.write("<form action=\"s1\" method = \"get\" style=\"border:1px solid #ccc\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <label><b>Name</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\" Full Name\" name=\"m1\" required>\n");
      out.write("     \n");
      out.write("    <label><b>Contact</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Mobile Number\" name=\"m2\" required>\n");
      out.write("    \n");
      out.write(" <label><b>Project Name</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Project Name\" name=\"m3\" required>\n");
      out.write("    \n");
      out.write("     <label><b>Email id</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter mailId\" name=\"m4\" required>\n");
      out.write("    \n");
      out.write("     <label><b>Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"m5\" required>\n");
      out.write("    \n");
      out.write("    <label><b>Repeat Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Repeat Password\" name=\"m6\" required>\n");
      out.write("    <input type=\"checkbox\" checked=\"checked\"> Remember me\n");
      out.write("    <p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p>\n");
      out.write("\n");
      out.write("    <div class=\"clearfix\">\n");
      out.write("      <button type=\"button\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("      <button type=\"submit\" class=\"signupbtn\">Sign Up</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
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
