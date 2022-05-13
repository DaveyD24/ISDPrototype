package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staffmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>MainStaff</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("                <span class=\"whitestrip\"><img src=\"Images/blurstrip.png\" alt=\"Banner\" height=90></span>\r\n");
      out.write("        <h1>IoTBay</h1>\r\n");
      out.write("        \r\n");
      out.write("                <ul class=\"Navigation\">\r\n");
      out.write("            <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("            <li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("            <li><a href=\"register.jsp\">Register</a></li>\r\n");
      out.write("            <li><a href=\"UpdateCustomer.jsp\">Update Customer</a></li>\r\n");
      out.write("            <li><a href=\"UpdateProduct.jsp\">Update Product</a></li>\r\n");
      out.write("            <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("                <br><br><br><br><br><br>\r\n");
      out.write("        <h2><span class=\"pageheading\">Staff Control Panel</span></h2>\r\n");
      out.write("        \r\n");
      out.write("        <!-- CONTENT BODY STARTS HERE -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("                <p>Currently logged in as: staff</p>\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"AddProduct.jsp\"><button type=\"button\">Add Products</button></a>\r\n");
      out.write("                <a href=\"UpdateProduct.jsp\"><button type=\"button\">Update Products</button></a>\r\n");
      out.write("                <a href=\"DeleteProduct.jsp\"><button type=\"button\">Delete Products</button></a>\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"AddCustomer.jsp\"><button type=\"button\">Add Customers</button></a>\r\n");
      out.write("                <a href=\"UpdateCustomer.jsp\"><button type=\"button\">Update Customers</button></a><br>\r\n");
      out.write("                <a href=\"DeleteCustomer.jsp\"><button type=\"button\">Delete Customers</button></a>\r\n");
      out.write("                \r\n");
      out.write("        <input type=\"text\" class=\"Search\" placeholder=\"Search Products..\"><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Name</th>\r\n");
      out.write("                <th>Price</th>\r\n");
      out.write("                <th>Stock</th>\r\n");
      out.write("                <th></th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Cool product brah</td>\r\n");
      out.write("                <td>$129.99</td>\r\n");
      out.write("                <td>In Stock</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <button type=\"button\">Add To Cart</button>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                <td>Cool product brah</td>\r\n");
      out.write("                <td>$129.99</td>\r\n");
      out.write("                <td>In Stock</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <button type=\"button\">Add To Cart</button>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                <td>Cool product brah</td>\r\n");
      out.write("                <td>$129.99</td>\r\n");
      out.write("                <td>In Stock</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <button type=\"button\">Add To Cart</button>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table><br>\r\n");
      out.write("        \r\n");
      out.write("        <a href=\"checkout.jsp\"><button type=\"button\">Checkout</button></a>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- CONTENT BODY ENDS HERE -->\r\n");
      out.write("  \r\n");
      out.write("         <footer>\r\n");
      out.write("            \r\n");
      out.write("            <ul class=\"foot\">\r\n");
      out.write("                <li class=\"dontH\"><a>Made By Group 31 | 41025 Introduction to Software Development</a></li>\r\n");
      out.write("                <li class=\"dontH\"><a>University of Technology Sydney</a></li>\r\n");
      out.write("                <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                <li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("                <li><a href=\"register.jsp\">Register</a></li>\r\n");
      out.write("                <li><a href=\"UpdateCustomer.jsp\">Update Customer</a></li>\r\n");
      out.write("                <li><a href=\"UpdateProduct.jsp\">Update Product</a></li\r\n");
      out.write("                <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            \r\n");
      out.write("        </footer>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!-- DAVID\r\n");
      out.write("//keep track of currently logged in user\r\n");
      out.write("//options: browse catalogue (this page), update products, update customer, update catalogue, logout\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//keep track of currently logged in user\r\n");
      out.write("//options: browse catalogue (this page), UPDATE CUSTOMER, UPDATE PRODUCTS, logout\r\n");
      out.write("//search bar\r\n");
      out.write("//list all products\r\n");
      out.write("//for each product: Add to cart, validate: stock doesnt go below 0,\r\n");
      out.write("creates new Order()  ^^\r\n");
      out.write("-->");
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
