package com.controlStatements;

public class IfEx2 {
	int age=60;
	public void vote() {
		if(age>=18 && age>=60) {
			System.out.println("He/She is Eligible for vote and they are elder people");
		}else if(age>=18 && age<=60) {
			System.out.println("He/She is Eligible for vote and they are not a elder people");
			
		}else {
			System.out.println("He/She are not eligible for vote");
		}
   }
	public static void main(String[] args) {
		IfEx2 ex=new IfEx2();
		ex.vote();
	}
}

