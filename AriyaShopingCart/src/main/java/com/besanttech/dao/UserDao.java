package com.besanttech.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.besanttech.entities.User;

public class UserDao {
	static Connection con;
	public User validateLogin(User user) {
			 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myshopppingstore","root","root");
			 String sql="select * from users where user_name=? and user_pwd=?";
			 PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, user.getUsername() );
		    ps.setString(2,user.getPassword());
		    ResultSet rs=ps.executeQuery();
		    while(rs.next()) {
		    	return user;
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	}
	


