package com.flowControlExamples;

public class IfElseIfStatement1 {
	int age=25;
	 public void checkAge() {
		 if(age<3) {
			 System.out.println("toddler");
		 }else if(age>=3 && age<5) {
			 System.out.println("preschool");
		 }else if(age>=5 && age<12) {
			 System.out.println("gradeschooler");
		 }else if(age>=12 && age<18) {
			 System.out.println("teenager");
		 }else if(age>=18 && age<21) {
			 System.out.println("young adult");
		 }else if(age>=21 && age<35) {
			 System.out.println("youth");
		 }else if(age>=35 && age<60) {
			 System.out.println("old man");
		 }else {
			 System.out.println("invalid");
		 }
	 }
	public static void main(String[] args) {
		IfElseIfStatement1 sree=new IfElseIfStatement1();
		sree.checkAge();
  }

}
