package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class confirmation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>IoTBay</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <span class=\"whitestrip\"><img src=\"Images/blurstrip.png\" alt=\"Banner\" height=90></span>\n");
      out.write("        <h1>IoTBay</h1>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <ul class=\"Navigation\">\n");
      out.write("            <li><a href=\"index.html\">Home</a></li>\n");
      out.write("            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("            <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("                <br><br><br><br><br><br>\n");
      out.write("        <h2><span class=\"pageheading\">Order Placed</span></h2>\n");
      out.write("        \n");
      out.write("        <p>\n");
      out.write("            ");

                session.setAttribute("username", "bruh");
                out.println("Thank you for your order " + session.getAttribute("username") + ". ");
            
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <a href=\"main.jsp\">Return to IoTBay</a>\n");
      out.write("            \n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        <footer>\n");
      out.write("            \n");
      out.write("            <ul class=\"foot\">\n");
      out.write("                <li class=\"dontH\"><a>Made By Group 31 | 41025 Introduction to Software Development</a></li>\n");
      out.write("                <li class=\"dontH\"><a>University of Technology Sydney</a></li>\n");
      out.write("                <li class=\"dontH\"><a href=\"index.html\">Home</a></li>\n");
      out.write("                <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
