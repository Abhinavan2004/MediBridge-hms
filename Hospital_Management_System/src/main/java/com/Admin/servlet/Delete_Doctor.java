package com.Admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.DoctorDao;
import com.db.DBConnect;

@WebServlet("/deleteDoctor")
public class Delete_Doctor extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try{
			int id = Integer.parseInt(req.getParameter("id")); 
		
		HttpSession session = req.getSession();
		DoctorDao dao = new DoctorDao(DBConnect.getConn());
		
		if (dao.delete_doctor(id)) {
			session.setAttribute("succMsg", "Doctor Deleted Successfully");
			System.out.println("Doctor Deleted Successfully");
			resp.sendRedirect("admin/doctor_dashboard.jsp");
		} else {
			session.setAttribute("errorMsg", "Doctor Not Deleted Successfully");
			System.out.println("Doctor Not Deleted Successfully");
			resp.sendRedirect("admin/doctor_dashboard.jsp");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}

	}
	
}
