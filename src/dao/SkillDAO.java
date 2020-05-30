package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
//	@SuppressWarnings("null")
	public Skill getSkillBylD(Long id) throws SQLException, ClassNotFoundException, IOException { 
		Connection con=null;
		con=ConnectionManager.getConnection();
		Skill skill=new Skill();
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("SELECT * FROM SKILL3");
		while(rs.next()) {
			long checkid=rs.getLong(1);
				if(id==checkid) 
				{
					String name=rs.getString(2);
					skill.setSkillId(checkid);
					skill.setSkillName(name);
					System.out.println("test "+rs.getString(2));
					return skill;
				}
		
		}
		return null;
		
	}
}
