/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.106
 * Generated at: 2025-07-22 21:19:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/components/cdn-links.jsp", Long.valueOf(1753218954008L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1749728082234L));
    _jspx_dependants.put("jar:file:/D:/Abhinav_Eclipse/Hospital_Management_System/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Hospital_Management_System/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/admin/navbar.jsp", Long.valueOf(1753219193121L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Admin Dashboard - MediBridge</title>\r\n");
      out.write("<!-- Include CDN links -->\r\n");
      out.write("<!-- CDN Links File - Include this in your HTML files -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS should come first -->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap JS should come at the end, before closing </body> or in <head> -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery (optional, if needed) -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Popper.js (optional, if using Bootstrap tooltips/popovers separately) -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.11.8/umd/popper.min.js\"></script>");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    body {\r\n");
      out.write("        background-color: #f8f9fa;\r\n");
      out.write("        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .dashboard-header {\r\n");
      out.write("        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);\r\n");
      out.write("        color: white;\r\n");
      out.write("        padding: 1.5rem 0;\r\n");
      out.write("        box-shadow: 0 2px 10px rgba(0,0,0,0.1);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .dashboard-header h1 {\r\n");
      out.write("        font-size: 1.8rem;\r\n");
      out.write("        font-weight: 600;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .dashboard-header .fa-hospital {\r\n");
      out.write("        color: #a8d8ff;\r\n");
      out.write("        margin-right: 0.5rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .user-info {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        gap: 0.5rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .user-info .fa-user-circle {\r\n");
      out.write("        font-size: 1.5rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .dashboard-title {\r\n");
      out.write("        margin-bottom: 2rem;\r\n");
      out.write("        margin-top: 2rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .dashboard-title h2 {\r\n");
      out.write("        color: #2c3e50;\r\n");
      out.write("        font-size: 2rem;\r\n");
      out.write("        margin-bottom: 0.5rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .dashboard-title p {\r\n");
      out.write("        color: #6c757d;\r\n");
      out.write("        font-size: 1.1rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .stat-card {\r\n");
      out.write("        background: white;\r\n");
      out.write("        border-radius: 12px;\r\n");
      out.write("        padding: 1.5rem;\r\n");
      out.write("        box-shadow: 0 4px 6px rgba(0,0,0,0.07);\r\n");
      out.write("        border: none;\r\n");
      out.write("        transition: transform 0.2s ease, box-shadow 0.2s ease;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .stat-card:hover {\r\n");
      out.write("        transform: translateY(-2px);\r\n");
      out.write("        box-shadow: 0 8px 15px rgba(0,0,0,0.1);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .stat-card-content {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        gap: 1rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .stat-icon {\r\n");
      out.write("        width: 60px;\r\n");
      out.write("        height: 60px;\r\n");
      out.write("        border-radius: 12px;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        justify-content: center;\r\n");
      out.write("        font-size: 1.5rem;\r\n");
      out.write("        color: white;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .appointments .stat-icon {\r\n");
      out.write("        background: linear-gradient(135deg, #667eea, #764ba2);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .doctors .stat-icon {\r\n");
      out.write("        background: linear-gradient(135deg, #f093fb, #f5576c);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .specialists .stat-icon {\r\n");
      out.write("        background: linear-gradient(135deg, #4facfe, #00f2fe);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .patients .stat-icon {\r\n");
      out.write("        background: linear-gradient(135deg, #43e97b, #38f9d7);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .stat-info h3 {\r\n");
      out.write("        font-size: 0.9rem;\r\n");
      out.write("        color: #6c757d;\r\n");
      out.write("        margin-bottom: 0.5rem;\r\n");
      out.write("        font-weight: 500;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("        letter-spacing: 0.5px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .stat-number {\r\n");
      out.write("        font-size: 2rem;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        color: #2c3e50;\r\n");
      out.write("        margin-bottom: 0.3rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .stat-change {\r\n");
      out.write("        font-size: 0.8rem;\r\n");
      out.write("        font-weight: 500;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .stat-change.positive {\r\n");
      out.write("        color: #198754;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .stat-change.negative {\r\n");
      out.write("        color: #dc3545;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .stat-change.neutral {\r\n");
      out.write("        color: #6c757d;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .dashboard-section {\r\n");
      out.write("        background: white;\r\n");
      out.write("        border-radius: 12px;\r\n");
      out.write("        padding: 1.5rem;\r\n");
      out.write("        box-shadow: 0 4px 6px rgba(0,0,0,0.07);\r\n");
      out.write("        height: 100%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .dashboard-section h3 {\r\n");
      out.write("        color: #2c3e50;\r\n");
      out.write("        margin-bottom: 1rem;\r\n");
      out.write("        font-size: 1.2rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .appointment-item {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        gap: 1rem;\r\n");
      out.write("        padding: 0.75rem;\r\n");
      out.write("        background: #f8f9fa;\r\n");
      out.write("        border-radius: 8px;\r\n");
      out.write("        border-left: 4px solid #667eea;\r\n");
      out.write("        margin-bottom: 1rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .appointment-time {\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        color: #667eea;\r\n");
      out.write("        min-width: 80px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .appointment-details p {\r\n");
      out.write("        margin-bottom: 0.25rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .appointment-details small {\r\n");
      out.write("        color: #6c757d;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .action-btn {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        gap: 0.5rem;\r\n");
      out.write("        padding: 0.75rem 1rem;\r\n");
      out.write("        border: none;\r\n");
      out.write("        border-radius: 8px;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("        font-size: 0.9rem;\r\n");
      out.write("        font-weight: 500;\r\n");
      out.write("        transition: all 0.2s ease;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        text-align: left;\r\n");
      out.write("        margin-bottom: 0.75rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .action-btn.primary {\r\n");
      out.write("        background: linear-gradient(135deg, #667eea, #764ba2);\r\n");
      out.write("        color: white;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .action-btn.primary:hover {\r\n");
      out.write("        transform: translateY(-1px);\r\n");
      out.write("        box-shadow: 0 4px 8px rgba(102, 126, 234, 0.3);\r\n");
      out.write("        color: white;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .action-btn.secondary {\r\n");
      out.write("        background: #f8f9fa;\r\n");
      out.write("        color: #2c3e50;\r\n");
      out.write("        border: 1px solid #e9ecef;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .action-btn.secondary:hover {\r\n");
      out.write("        background: #e9ecef;\r\n");
      out.write("        transform: translateY(-1px);\r\n");
      out.write("        color: #2c3e50;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .alert-unauthorized {\r\n");
      out.write("        position: fixed;\r\n");
      out.write("        top: 50%;\r\n");
      out.write("        left: 50%;\r\n");
      out.write("        transform: translate(-50%, -50%);\r\n");
      out.write("        z-index: 1000;\r\n");
      out.write("        background: white;\r\n");
      out.write("        border-radius: 10px;\r\n");
      out.write("        padding: 2rem;\r\n");
      out.write("        box-shadow: 0 10px 30px rgba(0,0,0,0.3);\r\n");
      out.write("        text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    @media (max-width: 768px) {\r\n");
      out.write("        .dashboard-title h2 {\r\n");
      out.write("            font-size: 1.5rem;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .stat-number {\r\n");
      out.write("            font-size: 1.5rem;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .appointment-item {\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            gap: 0.5rem;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .appointment-time {\r\n");
      out.write("            min-width: auto;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    @media (max-width: 576px) {\r\n");
      out.write("        .stat-card-content {\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- Authentication Check -->\r\n");

    if (session.getAttribute("adminObj") == null) {
        response.sendRedirect("../Admin.jsp");
        return;
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Include Navbar -->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>MediBridge: Administrator</title>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background-color: #f8f9fa;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar-brand {\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("        }\r\n");
      out.write("        .nav-link {\r\n");
      out.write("            font-weight: 500;\r\n");
      out.write("            transition: color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("        .nav-link:hover {\r\n");
      out.write("            color: #ffc107 !important;\r\n");
      out.write("        }\r\n");
      out.write("        .dropdown-menu {\r\n");
      out.write("            border: none;\r\n");
      out.write("            box-shadow: 0 0.5rem 1rem rgba(0, 0, 0, 0.15);\r\n");
      out.write("        }\r\n");
      out.write("        .dropdown-item:hover {\r\n");
      out.write("            background-color: #f8f9fa;\r\n");
      out.write("        }\r\n");
      out.write("        .content-area {\r\n");
      out.write("            margin-top: 2rem;\r\n");
      out.write("            padding: 2rem;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark border-bottom\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\">\r\n");
      out.write("            <img src=\"../assets/logo.png\" alt=\"Logo\" width=\"35\" height=\"40\" \r\n");
      out.write("                 class=\"d-inline-block align-text-top me-2 rounded-circle\"\r\n");
      out.write("                 onerror=\"this.style.display='none'\">\r\n");
      out.write("            MediBridge\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- Navbar toggler for mobile -->\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" \r\n");
      out.write("                data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" \r\n");
      out.write("                aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\r\n");
      out.write("            <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                <li class=\"nav-item me-4\">\r\n");
      out.write("                    <a class=\"nav-link active\" aria-current=\"page\" href=\"../index.jsp\">\r\n");
      out.write("                        <i class=\"fa-solid fa-home me-1\"></i>Home\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item me-4\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"../index.jsp\">\r\n");
      out.write("                        <i class=\"fa-solid fa-user-doctor me-1\"></i>Doctor\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item me-4\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                        <i class=\"fa-solid fa-user-injured me-1\"></i>Patient\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" \r\n");
      out.write("                       id=\"navbarDropdownMenuLink\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"fa-solid fa-user-circle me-1\"></i>Account\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"profile.jsp\">\r\n");
      out.write("                                <i class=\"fa-solid fa-user me-2\"></i>Profile\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"../adminlogout\">\r\n");
      out.write("                                <i class=\"fa-solid fa-sign-out-alt me-2\"></i>Logout\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap JavaScript Bundle (includes Popper) -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Welcome Message -->\r\n");
      out.write("    <div class=\"dashboard-header mb-10\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row align-items-center\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <h1>\r\n");
      out.write("                        <i class=\"fas fa-hospital\"></i>\r\n");
      out.write("                        Welcome, Administrator\r\n");
      out.write("                    </h1>\r\n");
      out.write("                    <p class=\"mb-0\">Hospital Management System - Admin Dashboard</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Main Dashboard Content -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <!-- Dashboard Title -->\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- Stats Cards -->\r\n");
      out.write("    <div class=\"row g-4 mb-5\">\r\n");
      out.write("        <div class=\"col-xl-3 col-lg-6 col-md-6\">\r\n");
      out.write("            <div class=\"card stat-card appointments\">\r\n");
      out.write("                <div class=\"card-body p-0\">\r\n");
      out.write("                    <div class=\"stat-card-content\">\r\n");
      out.write("                        <div class=\"stat-icon\">\r\n");
      out.write("                            <i class=\"fas fa-calendar-check\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"stat-info\">\r\n");
      out.write("                            <h3>Total Appointments</h3>\r\n");
      out.write("                            <p class=\"stat-number\">247</p>\r\n");
      out.write("                            <span class=\"stat-change positive\">+12% from last month</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-xl-3 col-lg-6 col-md-6\">\r\n");
      out.write("            <div class=\"card stat-card doctors\">\r\n");
      out.write("                <div class=\"card-body p-0\">\r\n");
      out.write("                    <div class=\"stat-card-content\">\r\n");
      out.write("                        <div class=\"stat-icon\">\r\n");
      out.write("                            <i class=\"fas fa-user-md\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"stat-info\">\r\n");
      out.write("                            <h3>Active Doctors</h3>\r\n");
      out.write("                            <p class=\"stat-number\">32</p>\r\n");
      out.write("                            <span class=\"stat-change positive\">+2 new this month</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-xl-3 col-lg-6 col-md-6\">\r\n");
      out.write("            <div class=\"card stat-card specialists\">\r\n");
      out.write("                <div class=\"card-body p-0\">\r\n");
      out.write("                    <div class=\"stat-card-content\">\r\n");
      out.write("                        <div class=\"stat-icon\">\r\n");
      out.write("                            <i class=\"fas fa-stethoscope\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"stat-info\">\r\n");
      out.write("                            <h3>Specialists</h3>\r\n");
      out.write("                            <p class=\"stat-number\">15</p>\r\n");
      out.write("                            <span class=\"stat-change neutral\">No change</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-xl-3 col-lg-6 col-md-6\">\r\n");
      out.write("            <div class=\"card stat-card patients\">\r\n");
      out.write("                <div class=\"card-body p-0\">\r\n");
      out.write("                    <div class=\"stat-card-content\">\r\n");
      out.write("                        <div class=\"stat-icon\">\r\n");
      out.write("                            <i class=\"fas fa-users\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"stat-info\">\r\n");
      out.write("                            <h3>Registered Patients</h3>\r\n");
      out.write("                            <p class=\"stat-number\">1,842</p>\r\n");
      out.write("                            <span class=\"stat-change positive\">+156 this month</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Additional Dashboard Elements -->\r\n");
      out.write("    <div class=\"row g-4\">\r\n");
      out.write("        <div class=\"col-lg-8\">\r\n");
      out.write("            <div class=\"dashboard-section\">\r\n");
      out.write("                <h3>Today's Appointments</h3>\r\n");
      out.write("                <div class=\"appointment-list\">\r\n");
      out.write("                    <div class=\"appointment-item\">\r\n");
      out.write("                        <div class=\"appointment-time\">09:00 AM</div>\r\n");
      out.write("                        <div class=\"appointment-details\">\r\n");
      out.write("                            <p><strong>John Doe</strong> - Dr. Smith</p>\r\n");
      out.write("                            <small>Cardiology Consultation</small>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"appointment-item\">\r\n");
      out.write("                        <div class=\"appointment-time\">10:30 AM</div>\r\n");
      out.write("                        <div class=\"appointment-details\">\r\n");
      out.write("                            <p><strong>Jane Wilson</strong> - Dr. Johnson</p>\r\n");
      out.write("                            <small>General Checkup</small>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"appointment-item\">\r\n");
      out.write("                        <div class=\"appointment-time\">02:15 PM</div>\r\n");
      out.write("                        <div class=\"appointment-details\">\r\n");
      out.write("                            <p><strong>Mike Brown</strong> - Dr. Davis</p>\r\n");
      out.write("                            <small>Orthopedic Review</small>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"appointment-item\">\r\n");
      out.write("                        <div class=\"appointment-time\">03:45 PM</div>\r\n");
      out.write("                        <div class=\"appointment-details\">\r\n");
      out.write("                            <p><strong>Sarah Connor</strong> - Dr. Wilson</p>\r\n");
      out.write("                            <small>Dermatology Checkup</small>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-lg-4\">\r\n");
      out.write("            <div class=\"dashboard-section\">\r\n");
      out.write("                <h3>Quick Actions</h3>\r\n");
      out.write("                <div class=\"quick-actions\">\r\n");
      out.write("                    <button class=\"btn action-btn primary\">\r\n");
      out.write("                        <i class=\"fas fa-plus\"></i>\r\n");
      out.write("                        New Appointment\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <button class=\"btn action-btn secondary\">\r\n");
      out.write("                        <i class=\"fas fa-user-plus\"></i>\r\n");
      out.write("                        Add Patient\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <button class=\"btn action-btn secondary\">\r\n");
      out.write("                        <i class=\"fas fa-user-md\"></i>\r\n");
      out.write("                        Add Doctor\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <button class=\"btn action-btn secondary\">\r\n");
      out.write("                        <i class=\"fas fa-file-medical\"></i>\r\n");
      out.write("                        Generate Report\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <button class=\"btn action-btn secondary\">\r\n");
      out.write("                        <i class=\"fas fa-chart-bar\"></i>\r\n");
      out.write("                        View Analytics\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <button class=\"btn action-btn secondary\">\r\n");
      out.write("                        <i class=\"fas fa-cog\"></i>\r\n");
      out.write("                        Settings\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
