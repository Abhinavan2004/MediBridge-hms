package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SpecialistDao {

	private Connection conn ;
	
	public SpecialistDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean addSpecialist(String spec_name , String category , String contact_no) {
		boolean f = false ;
		
		try {
			String sql = "INSERT INTO specialist_record(spec_name , category , contact_no) VALUES(? ,? ,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, spec_name);
			stmt.setString(2, category);
			stmt.setString(3,contact_no);
			
			int i = stmt.executeUpdate();
			
			if(i==1) {
				f=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f ;
	}
}
