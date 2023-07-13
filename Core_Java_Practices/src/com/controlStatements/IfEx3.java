package com.controlStatements;

public class IfEx3 {
	static int age=18;
	public static void ageStepByStep() {
		if(age<12) {
			System.out.println("kid");
		}else if(age>=12 && age<20) {
			System.out.println("Teenager");
		}else if(age>=20 && age<50) {
			System.out.println("Adult");
		}else if(age>=51 && age<80) {
			System.out.println("old age");
		}else if(age>80) {
			System.out.println("not a live");
		}else {
			System.out.println("Your age is greater than 80 ");
		}
	}
public static void main(String[] args) {
	ageStepByStep();
   }
}
