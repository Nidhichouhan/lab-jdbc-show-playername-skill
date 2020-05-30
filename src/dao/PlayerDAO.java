package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO{
	
 
	public List<Player> getAllPlayers() throws ClassNotFoundException, IOException, SQLException {
		Connection con=ConnectionManager.getConnection();
		List<Player> list=null;
		Statement smt=con.createStatement();
	     list= new ArrayList<>();
		String sql="SELECT PLAYER1.PLAYER_ID, PLAYER1.PLAYER_NAME, PLAYER1.COUNTRY,Skill3.id,SKILL3.NAME FROM PLAYER1 INNER JOIN SKILL3 ON PLAYER1.PLAYER_ID =SKILL3.ID";
		ResultSet rs=smt.executeQuery(sql);
		
		while(rs.next()) {
			Player player=new Player();
			//Skill skill=new Skill();//are you there?

			player.setPlayerId(rs.getInt(1));
			player.setName(rs.getString(2));
			player.setCountry(rs.getString(3));
			player.setSkill(rs.getString(5));
			long id=rs.getLong(4);
			String name=rs.getString(5);
		   
		    Skill skill = new Skill(id,name);
			
			list.add(player);
			
		}
		
		
		return list;
		
	}
}
