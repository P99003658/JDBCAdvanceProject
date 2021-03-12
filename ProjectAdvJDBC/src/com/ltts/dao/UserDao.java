package com.ltts.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ltts.configuration.MyConnection;
import com.ltts.model.user;


public class UserDao {
	
	public boolean insertUser(user u) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
	
		ps.setString(1, u.getEmailid() );
		ps.setString(2, u.getMobile());
		ps.setString(3, u.getName());
		ps.setDate(4, u.getDob());
		ps.setString(5, u.getAddress());
		ps.setString(6, u.getPassword());
		ps.setString(7, u.getUsertype());
		return ps.execute();
	}

	public void ValidUser(UserDao us) throws Exception
	{
		Connection c = MyConnection.getConnection();
		Statement st = c.createStatement(); ResultSet rs;
		
		  rs = st.executeQuery("select * from user where name = '"+us.getName()+"' and password = '" +us.getPassword()+"'"); 
		  if (rs.next()) { System.out.println("nice"); }
		  else {
		  System.out.println("invalid credentials");
		  }
	}

	


	
	
	
	
}
