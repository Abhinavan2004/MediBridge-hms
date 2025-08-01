package com.user.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.DAO.UserDao;
import com.db.DBConnect;
import com.entity.User;

@WebServlet("/UserLogin")

public class UserLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        System.out.println("UserLogin servlet called!"); // Debug log
        
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        
        System.out.println("Email: " + email + ", Password: " + password); // Debug log
        
        HttpSession session = req.getSession();
        
        UserDao dao = new UserDao(DBConnect.getConn());
        User user = dao.user_login(email, password);
        
        if(user != null) {
            session.setAttribute("userObj", user);
            resp.sendRedirect("index.jsp");
        } else {
            // Fixed: Added proper error message attribute
            session.setAttribute("errorMsg", "Invalid Email or Password!!!");
            resp.sendRedirect("User.jsp");
        }
    }
}