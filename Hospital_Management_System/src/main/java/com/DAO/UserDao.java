package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.User;

public class UserDao {

	private Connection conn ;

	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean register(User u) {
		boolean f  = false;
		
		try {
			String sql = "INSERT INTO user_account(name , email , contact , password) VALUES(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, u.getFullname());
			ps.setString(2, u.getEmailid());
			ps.setString(3, u.getContact());
			ps.setString(4,  u.getPassword());
			
			int i= ps.executeUpdate();
			
			if(i == 1) {
				f=true;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();	
		}
		
		return f ;
		
	}
}
