package com.flowControlExamples;

public class NestedIfStatement {
	int age=24;
	String gender="female";
	public void checkAge() {
		if(age>=22) {
			System.out.println("person is a major");
			if(gender=="female") {
				System.out.println("she is female voter");
			}else {
				System.out.println("he is male voter");
			}
		}else {
			System.out.println("he is not a major");
		}
	}
	public static void main(String[] args) {
		NestedIfStatement sree=new NestedIfStatement();
		sree.checkAge();
		
	}

}
