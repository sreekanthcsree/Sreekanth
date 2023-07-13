package com.oopsEx;

public class CalculatorTwo extends CalculatorOne{
	public void mul(int a,int b) {
		int c=a*b;
		System.out.println("the mul of two numbers is:"+c);
	}
	public void div(int a,int b) {
		int c=a/b;
		System.out.println("the division of two numbers is:"+c);
	}
	public static void main(String[] args) {
		CalculatorTwo sree=new CalculatorTwo();
		sree.add(10,20);
		sree.sub(20,10);
		sree.mul(10,20);
		sree.div(20,10);
	}

}
      
