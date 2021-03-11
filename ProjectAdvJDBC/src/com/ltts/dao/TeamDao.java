
package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.configuration.MyConnection;
import com.ltts.model.Team;


public class TeamDao {
	public boolean insertTeam(Team t) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into jdbcadvteam values(?,?,?,?)");
		ps.setInt(1,t.getTeam_id());
		ps.setString(2, t.getTeamname());
		ps.setString(3, t.getOwnername());
		ps.setString(4, t.getCoachname());
		System.out.println("Data Inserted Succesfully");
		return ps.execute();
}
}