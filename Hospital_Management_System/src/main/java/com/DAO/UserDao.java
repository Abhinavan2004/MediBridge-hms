package com.DAO ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User; ;

public class UserDao {
	private Connection conn ;
	
	public UserDao(Connection conn) {
		super();
		this.conn = conn ;
	}
	
	public boolean register(User u) {
		boolean f = false ;
		try {
			String sql = "INSERT INTO user_account(name , email , contact , password) values (?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, u.getFullname());
			ps.setString(2, u.getEmailid());;
			ps.setString(3, u.getContact());
			ps.setString(4, u.getPassword());
			
			int i = ps.executeUpdate();
			if(i==1) {
				 f=true;
			}
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		return f ; 
	}
	
	
	public User user_login(String email , String password) {
		User u = null ;
		try {
			String sql  = "SELECT * FROM USER WHERE email=? and password=?" ;
			PreparedStatement ps = conn.prepareStatement(sql);
			 
			ps.setString(1 , email);
			ps.setString(2, password) ;
			
 			ResultSet rs = ps.executeQuery();
 			
 			if(rs.next()) {
 				u = new User();
 	            u.setId(rs.getInt(1)); 
 				u.setFullname(rs.getString(2));
 				u.setEmailid(rs.getString(3));
 				u.setPassword(rs.getString(5));
 			}
		}
		catch(Exception e) {
			e.printStackTrace();		
			}
		return u ;

	}
		
}