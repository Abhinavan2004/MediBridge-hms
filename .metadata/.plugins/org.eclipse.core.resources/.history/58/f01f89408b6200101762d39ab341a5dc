package com.User_Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.UserDao;
import com.db.DBConnect;
import com.entity.User;

@WebServlet("/user_register")
public class UserRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String fullname=  req.getParameter("username");
			String email = req.getParameter("email");
			String contact = req.getParameter("contact");
			String password = req.getParameter("password");
			
			User u = new User(fullname , email , contact , password);
			
			UserDao dao = new UserDao(DBConnect.getConn());
			
			boolean f = dao.register(u);
			
			if(f == true) {
				System.out.println("User Registered Successfully");
			}
			else{
				System.out.println("Error!! User not registered!!");
			}
		}
		catch(Exception e) {
			e.printStackTrace(); 
		}
	}

}
