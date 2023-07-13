package com.home;

public class IfStatementEx1 {
	//if else if Statement
	
	public static void main(String[] args) {
		int age=80;
		if(age<10) {
			System.out.println("Kids");
		}
		 else if(age>=10 && age<25) {
			 System.out.println("tenegers");
		 }
		 else if(age>=25 && age<45) {
			 System.out.println("Youngers");
		 }
		 else if(age>=45 && age<70) {
			 System.out.println("old peoples");
		 }
		 else {
			 System.out.println("sreekanth");
		 }
		
	}
}
