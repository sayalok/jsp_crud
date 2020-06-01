package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/header.html");
    _jspx_dependants.add("/includes/footer.html");
  }

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

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("    <title>Hello, world!</title>\n");
      out.write("  </head>\n");
      out.write("  <body>");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h2 class=\"text-center\"> Login Form</h2>\n");
      out.write("    <div class=\"row justify-content-center\">\n");
      out.write("        <div class=\"col-md-5 col-sm-6\">\n");
      out.write("            <div class=\"loginForm\">\n");
      out.write("                <form  method=\"post\" action=\"beanHandler/login.jsp\">\n");
      out.write("<!--                <form id=\"loginForm\">-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Username</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txtUname\" id=\"txtUname\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Password</label>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"txtPass\" id=\"txtPass\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" name=\"btnLogin\" value=\"Login\"/>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    document.getElementById(\"loginForm\").addEventListener(\"submit\", (e) => {\n");
      out.write("        e.preventDefault();\n");
      out.write("        \n");
      out.write("        txtUname = document.getElementById(\"txtUname\").value;\n");
      out.write("        txtPass = document.getElementById(\"txtPass\").value;\n");
      out.write("        console.log(txtPass,txtUname)\n");
      out.write("        var xhr = new XMLHttpRequest();\n");
      out.write("        xhr.open(\"POST\", \"beanHandler/login.jsp\");\n");
      out.write("        xhr.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');\n");
      out.write("        xhr.send(\"txtUname=\"+txtUname+\"&txtPass=\"+txtPass)\n");
      out.write("        \n");
      out.write("    })\n");
      out.write("</script>\n");
      out.write("<!-- Optional JavaScript -->\n");
      out.write("<!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
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
