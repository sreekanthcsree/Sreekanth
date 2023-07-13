package com.flowControlExamples;

public class IfStatement {
	public void age(int age) {	
	 if(age>18) {
		 System.out.println("he/she is eligible for vote");
	 }
	  else {
		 System.out.println("he/she is not eligible for vote");
	 }
 }
	 public static void main(String[] args) {
		IfStatement ex=new IfStatement();
		ex.age(19);
	}
	 
}

