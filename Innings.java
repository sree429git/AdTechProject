package com.sreenivas;

public class Innings
{
	private String teamname;
	private String inningsname;
	private int runs;
	
	public String getTeamname() 
	{
		return teamname;
	}
	public void setTeamname(String teamname) 
	{
		this.teamname = teamname;
	}
	public String getInningsname() 
	{
		return inningsname;
	}
	public void setInningsname(String inningsname)
	{
		this.inningsname = inningsname;
	}
	public int getRuns() 
	{
		return runs;
	}
	public void setRuns(int runs) 
	{
		this.runs = runs;
	}
	public void displayInningsDetails() 
	{
		System.out.println("T20 Match Innings-"+ inningsname +" Result:");
		System.out.println("Name: " + teamname);
		System.out.println("Scored: " + runs);
		System.out.println("Need " + (runs + 1) + " to win");
	}
}
