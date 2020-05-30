package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;
import model.Skill;

public class Main{
	public static void main(String[] args) throws Exception {
		SkillDAO skilldao=new SkillDAO();
		PlayerDAO playerdao=new PlayerDAO();
		
		System.out.println("List of all the players with all the details:");
		System.out.println("  ID"+"\t"+"NAME "+"\t"+"     COUNTRY  "+"\t"+"SKILLS");
		List<Player> list=playerdao.getAllPlayers();
		long id=2;
		Skill skill= skilldao.getSkillBylD(id);
		//System.out.println("Name1 "+skill.getSkillName());
		int i=1;
		for(Player player:list) {
			System.out.println(i+++" "+player.getPlayerId()+" "+player.getName()+"     "+player.getCountry()+"     "+player.getSkill());
		}
	}
}
//+"  "+skilldao.getSkillBylD(list.get(i).getSkill().getSkillId()).getSkillName()