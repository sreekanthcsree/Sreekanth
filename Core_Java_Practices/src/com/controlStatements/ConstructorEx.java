package com.controlStatements;

public class ConstructorEx {
	
	public ConstructorEx(){
		System.out.println("This is Default Constructor");
	}
	public ConstructorEx(int a,int b) {
		int c=a+b;
		System.out.println("Two Argumented Constructor : "+c);
	}
	public static void main(String[] args) {
		ConstructorEx ex=new ConstructorEx();
		ConstructorEx ex1=new ConstructorEx(10, 20);
	}
 }


