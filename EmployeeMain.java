package com.sreenivas;

import java.util.Scanner;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		Scanner x = new Scanner(System.in);
		String ch1;		
		System.out.println(" Enter the Employee Name: ");
		ch1 = x.nextLine();
		String ch2;
		System.out.println(" Enter the Employee Address: ");
		ch2 = x.nextLine();
		String ch3;
		System.out.println(" Enter the Employee Mobile NO: ");
		ch3 = x.nextLine();
		e.setName(ch1);
		e.setAddress(ch2);
		e.setMobile(ch3);
		System.out.println("Havik Employee Details Are:");
		System.out.println("Name: \t\t" + e.getName());
		System.out.println("Address: \t" + e.getAddress());
		System.out.println("Mobile No: \t" + e.getMobile());
		//System.out.println(e.getClass());
	}

}
