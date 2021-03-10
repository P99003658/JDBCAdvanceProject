package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.ltts.configuration.MyConnection;
import com.ltts.model.Player;

public class PlayerDao {
	
	public boolean insertPlayer(Player p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into jdbcadv values(?,?,?)");
		ps.setString(1, p.getName());
		ps.setInt(2, p.getAge());
		ps.setString(3,p.getCountry());

		return ps.execute();
		//return false;

		
	}

}