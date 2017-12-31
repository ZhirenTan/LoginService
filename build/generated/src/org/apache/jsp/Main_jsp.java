package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Main</title>\n");
      out.write("    </head>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("        * {\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        body{height: 100%;width: 100%;margin:0;padding:0;}\n");
      out.write("        body{\n");
      out.write("            background-image:url(bg.jpg);\n");
      out.write("        width:100%;\n");
      out.write("        height:100%;\n");
      out.write("        position:absolute;\n");
      out.write("       \n");
      out.write("            }\n");
      out.write("        .wrap {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 400px;\n");
      out.write("            padding: 40px 0;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 40%;\n");
      out.write("            margin-top: -200px;\n");
      out.write("            opacity: 0.8;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            width: 60%;\n");
      out.write("            margin: 0 auto;\n");
      out.write("        }\n");
      out.write("        .container h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #FFFFFF;\n");
      out.write("            font: microsft yahei;\n");
      out.write("            font-weight: 500;\n");
      out.write("        }\n");
      out.write("        .container input {\n");
      out.write("            width: 320px;\n");
      out.write("            display: block;\n");
      out.write("            height: 36px;\n");
      out.write("            border: 0;\n");
      out.write("            outline: 0;\n");
      out.write("            padding: 6px 10px;\n");
      out.write("            line-height: 24px;\n");
      out.write("            margin: 32px auto;\n");
      out.write("            -webkit-transition: all 0s ease-in 0.1ms;\n");
      out.write("            -moz-transition: all 0s ease-in 0.1ms;\n");
      out.write("            transition: all 0s ease-in 0.1ms;\n");
      out.write("        }\n");
      out.write("        .container input[type=\"text\"] , .container input[type=\"password\"]  {\n");
      out.write("            background-color: #FFFFFF;\n");
      out.write("            font-size: 16px;\n");
      out.write("            color: #50a3a2;\n");
      out.write("        }\n");
      out.write("        .container input[type='submit'] \n");
      out.write("        {\n");
      out.write("            font-size: 16px;\n");
      out.write("            letter-spacing: 2px;\n");
      out.write("            color: #666666;\n");
      out.write("            background-color: #FFFFFF;\n");
      out.write("        }\n");
      out.write("        .container input[type='reset'] {\n");
      out.write("            font-size: 16px;\n");
      out.write("            letter-spacing: 2px;\n");
      out.write("            color: #666666;\n");
      out.write("            background-color: #FFFFFF;\n");
      out.write("        }\n");
      out.write("        .container input:focus {\n");
      out.write("            width: 400px;\n");
      out.write("        }\n");
      out.write("        .container input[type='submit']:hover {\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 400px;\n");
      out.write("        }\n");
      out.write("        .container input[type='reset']:hover {\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 400px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        \n");
      out.write("        @keyframes square {\n");
      out.write("            0%  {\n");
      out.write("                    -webkit-transform: translateY(0);\n");
      out.write("                    transform: translateY(0)\n");
      out.write("                }\n");
      out.write("            100% {\n");
      out.write("                    bottom: 400px;\n");
      out.write("                    transform: rotate(600deg);\n");
      out.write("                    -webit-transform: rotate(600deg);\n");
      out.write("                    -webkit-transform: translateY(-500);\n");
      out.write("                    transform: translateY(-500)\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        @-webkit-keyframes square {\n");
      out.write("            0%  {\n");
      out.write("                -webkit-transform: translateY(0);\n");
      out.write("                transform: translateY(0)\n");
      out.write("            }\n");
      out.write("            100% {\n");
      out.write("                bottom: 400px;\n");
      out.write("                transform: rotate(600deg);\n");
      out.write("                -webit-transform: rotate(600deg);\n");
      out.write("                -webkit-transform: translateY(-500);\n");
      out.write("                transform: translateY(-500)\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body style=\"background: url(bg.jpg)\">\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1><font face=\"verdana\" color=\"white\">Hey！Welcome.</font></h1>\n");
      out.write("            <br>\n");
      out.write("                <input type=\"submit\" name=\"login\" value=\"Login\" onclick=\"window.location.href='\\Login.html'\">\n");
      out.write("                <input type=\"submit\" name=\"Register\" value=\"Register\" onclick=\"window.location.href='\\Register.html'\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
