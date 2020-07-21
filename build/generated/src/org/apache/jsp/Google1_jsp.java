package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Google1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("\n");
      out.write("<meta name=\"google-signin-scope\" content=\"profile email\">\n");
      out.write("<meta name=\"google-signin-client_id\"\n");
      out.write("     content=\"----- your google client id here -----------\">\n");
      out.write("\n");
      out.write("<title>Servlet OAuth example</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h2>Servlet OAuth example</h2>\n");
      out.write("\t<br>\n");
      out.write("\t<div class=\"g-signin2\" data-onsuccess=\"onSignIn\"></div>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("      //google callback. This function will redirect to our login servlet\n");
      out.write("      function onSignIn(googleUser) {\n");
      out.write("         var profile = googleUser.getBasicProfile();\n");
      out.write("         console.log('ID: ' + profile.getId());\n");
      out.write("         console.log('Name: ' + profile.getName());\n");
      out.write("         console.log('Image URL: ' + profile.getImageUrl());\n");
      out.write("         console.log('Email: ' + profile.getEmail());\n");
      out.write("         console.log('id_token: ' + googleUser.getAuthResponse().id_token);\n");
      out.write("\n");
      out.write("         //do not post all above info to the server because that is not secure.\n");
      out.write("         //just send the id_token\n");
      out.write("\n");
      out.write("         var redirectUrl = 'login';\n");
      out.write("\n");
      out.write("         //using jquery to post data dynamically\n");
      out.write("         var form = $('<form action=\"' + redirectUrl + '\" method=\"post\">' +\n");
      out.write("                          '<input type=\"text\" name=\"id_token\" value=\"' +\n");
      out.write("                           googleUser.getAuthResponse().id_token + '\" />' +\n");
      out.write("                                                                '</form>');\n");
      out.write("         $('body').append(form);\n");
      out.write("         form.submit();\n");
      out.write("      }\n");
      out.write("\n");
      out.write("   </script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
