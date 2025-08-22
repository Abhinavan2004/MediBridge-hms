package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.Doctor_entity;

public class DoctorDao {

	private Connection conn ;

	public DoctorDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	
	public boolean regiter_doctor(String doc_name , String doc_dob , String doc_quali , String doc_spec , String doc_email , String doc_contact) {
		boolean f = false ;
		try {
			
			String sql = "INSERT INTO Doctor_record(doc_name , doc_dob , doc_quali , doc_spec , doc_email , doc_contact) VALUES(?, ? , ? ,? ,?, ?)" ;
			
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1 , doc_name);
			pst.setString(2, doc_dob);
			pst.setString(3, doc_quali);
			pst.setString(4, doc_spec);
			pst.setString(5, doc_email);
			pst.setString(6, doc_contact);

			
			int i = pst.executeUpdate();
			
			if(i==1) {
				f=true;
			}
			
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		return f ;
		
	}
}
