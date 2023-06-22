package com.sreenivas;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) 
	{
		Scanner x = new Scanner(System.in);
		Innings i = new Innings();
		String ch1;
		System.out.println(" Enter the Team Name: ");
		ch1 = x.nextLine();
		String ch2;
		System.out.println(" Enter the Session: ");
		ch2 = x.nextLine();
		int n1;
		System.out.println("Enter the runs");
		n1 = x.nextInt();
		
		i.setTeamname(ch1);
		i.setInningsname(ch2);
		i.setRuns(n1);
		i.displayInningsDetails();
		/*
		System.out.println("T20 Match Result:");
		System.out.println("Team Name: \t" + i.getTeamname());
		System.out.println("Session: \t" + i.getInningsname());
		System.out.println("Scored: \t" + i.getRuns());
		*/
	}

}
