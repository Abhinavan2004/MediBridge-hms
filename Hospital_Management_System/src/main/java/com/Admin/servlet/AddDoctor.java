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
import com.entity.Doctor_entity;

@WebServlet("/addDoctor")
public class AddDoctor extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String doc_name = req.getParameter("doc_name");
			String doc_dob = req.getParameter("doc_dob");
			String doc_quali = req.getParameter("doc_quali");
			String doc_spec = req.getParameter("doc_spec");
			String doc_email = req.getParameter("doc_email");
			String doc_contact = req.getParameter("doc_contact");

			// Validate required fields
			if (doc_name == null || doc_name.trim().isEmpty() || doc_dob == null || doc_dob.trim().isEmpty()
					|| doc_quali == null || doc_quali.trim().isEmpty() || doc_spec == null || doc_spec.trim().isEmpty()
					|| doc_email == null || doc_email.trim().isEmpty() || doc_contact == null
					|| doc_contact.trim().isEmpty()) {

				HttpSession session = req.getSession();
				session.setAttribute("errorMessage", "All fields are required!");
				resp.sendRedirect("admin/doctor_dashboard.jsp");
				return;
			}


			DoctorDao dao = new DoctorDao(DBConnect.getConn());
			HttpSession session = req.getSession();
			
			if (dao.regiter_doctor(doc_name, doc_dob, doc_quali, doc_spec, doc_email, doc_contact)) {
				session.setAttribute("succMsg", "Doctor Added Successfully");
				System.out.println("Doctor Added Successfully");
				resp.sendRedirect("admin/doctor_dashboard.jsp");
			} else {
				session.setAttribute("errorMsg", "Doctor Not added Successfully");
				System.out.println("Doctor Not added Successfully");
				resp.sendRedirect("admin/doctor_dashboard.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
