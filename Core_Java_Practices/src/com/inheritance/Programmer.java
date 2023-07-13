package com.inheritance;

public class Programmer extends Employee{
	int bonus=30000;
	public static void main(String[] args) {
		Programmer pr=new Programmer();
	  System.out.println("Salary : "+pr.salary);
	  System.out.println("Bonus : "+pr.bonus);
		
	}

}
