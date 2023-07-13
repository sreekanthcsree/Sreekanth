package com.oopsEx;

public class CalculatorOne {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("the addition of two numbers is:"+c);
	}
	public void sub(int a,int b) {
		int c=a-b;
		System.out.println("the subtraction of two numbers is:"+c);
		
	}
	public static void main(String[] args) {
		CalculatorOne sree=new CalculatorOne();
		sree.add(10,20);
		sree.sub(20,10);
	}

}
