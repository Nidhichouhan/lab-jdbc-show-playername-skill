package model;

public class Player{
	private long playerId;
	private String name;
	private String country;
	private String skill;
	
	public Player() {
		
	}
	
	public Player(long playerId, String name, String country, String skill) {
		
		this.playerId=playerId;
		this.name=name;
		this.country=country;
		this.skill=skill;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String string) {
		this.skill = string;
	}
	
	
}
