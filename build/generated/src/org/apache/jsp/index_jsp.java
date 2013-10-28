package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Clases.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");

    ConectionDB con=new ConectionDB();
    Consultas cons  = new Consultas();
    
    con.conectar();
    ResultSet rset = con.consulta(cons.obtiene_unidades());
    while (rset.next()){
        
    }
    con.cierraConexion();
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <!-- Estilos CSS -->\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/cupertino/jquery-ui-1.10.3.custom.css\" />\r\n");
      out.write("        <link href=\"css/navbar-fixed-top.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!---->\r\n");
      out.write("        <title>:: Nombre de la Pagina ::</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Fixed navbar -->\r\n");
      out.write("        <div class=\"navbar navbar-default\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Project name</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"#about\">About</a></li>\r\n");
      out.write("                        <li><a href=\"#contact\">Contact</a></li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                                <li class=\"divider\"></li>\r\n");
      out.write("                                <li class=\"dropdown-header\">Nav header</li>\r\n");
      out.write("                                <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                                <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li><a href=\"../navbar/\">Default</a></li>\r\n");
      out.write("                        <li><a href=\"../navbar-static-top/\">Static top</a></li>\r\n");
      out.write("                        <li class=\"active\"><a href=\"./\">Fixed top</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div><!--/.nav-collapse -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Cuerpo de la pagina -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>Plantilla de Proyectos!</h1>\r\n");
      out.write("            <!-- Los Botones tendran la siguiente forma -->\r\n");
      out.write("            <button class=\"btn\" type=\"submit\">Enviar</button>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"navbar navbar-default navbar-fixed-bottom\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                    <div class=\"text-center text-muted\">\r\n");
      out.write("                        Derechos Reservardos <span class=\"glyphicon glyphicon-registration-mark\"></span>\r\n");
      out.write("                    </div><a href=\"genera.jsp\">genera</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("================================================== -->\r\n");
      out.write("<!-- Se coloca al final del documento para que cargue mas rapido -->\r\n");
      out.write("<!-- Se debe de seguir ese orden al momento de llamar los JS -->\r\n");
      out.write("<script src=\"js/jquery-1.9.1.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-ui-1.10.3.custom.js\"></script>");
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
