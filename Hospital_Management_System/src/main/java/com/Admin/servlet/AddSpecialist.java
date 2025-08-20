package com.Admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.SpecialistDao;
import com.db.DBConnect;

@WebServlet("/addSpecialist")
public class AddSpecialist extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String spec_name = req.getParameter("spec_name");
		String category = req.getParameter("category");
		String contact_no = req.getParameter("contact_no");
		
		SpecialistDao dao = new SpecialistDao(DBConnect.getConn());
		
		HttpSession session = req.getSession() ;
		boolean f = dao.addSpecialist(spec_name, category, contact_no);
		
		if(f==true){
			session.setAttribute("succMsg", "Specialist Added");
			System.out.println("Specialist Added successfully");
			resp.sendRedirect("admin/index.jsp");
		}
		else {
			session.setAttribute("errorMsg", "Specialist Not Added");
			System.out.print("Specialist Not Added");
			resp.sendRedirect("admin/index.jsp");
		}
	}
	
}
