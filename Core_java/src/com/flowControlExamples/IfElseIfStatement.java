package com.flowControlExamples;

public class IfElseIfStatement {
	int marks=36;
	public void marks() {
		if(marks<35) {
			System.out.println("Fail");
		}else if(marks>=35 && marks<60) {
			System.out.println("Second class");
		}else if(marks>=60 && marks<75) {
			System.out.println("First class");
		}else if(marks>=75 &&marks<100) {
			System.out.println("Distinction");
		}else {
			System.out.println("invalid marks");
		}
	}
	public static void main(String[] args) {
		IfElseIfStatement sree=new IfElseIfStatement();
		sree.marks();
	}

}
