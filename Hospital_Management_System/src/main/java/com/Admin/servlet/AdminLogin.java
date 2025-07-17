package com.Admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.User;

@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();

	try{
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		
		if("ad".equals(username) && "password".equals(password)) {
			session.setAttribute("adminObj", new User());
			resp.sendRedirect("admin/index.jsp");
		}	
	}
	
	
	catch(Exception e) {
		e.printStackTrace();
		session.setAttribute("errorMsg", "Invalid username or password");
        resp.sendRedirect("adminLogin.jsp");

	}
}}

