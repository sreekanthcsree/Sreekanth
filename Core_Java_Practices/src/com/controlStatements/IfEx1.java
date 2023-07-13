package com.controlStatements;

public class IfEx1 {
	int age=23;
	public  void voter() {
		if(age>18) {
			System.out.println("He/She is eligible for vote");
		}else {
			System.out.println("He/She is not eligible for vote");
		}
	}
public static void main(String[] args) {
	IfEx1 ex=new IfEx1();
	ex.voter();
}
}
