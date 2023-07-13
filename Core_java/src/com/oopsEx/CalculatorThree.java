package com.oopsEx;

public class CalculatorThree extends CalculatorTwo {
	public void rem(int a,int b) {
		int c=a%b;
		System.out.println("the reminder of two numbers is:"+c);
		
	}
	public static void main(String[] args) {
		CalculatorThree sree=new CalculatorThree();
		sree.add(10,20);
		sree.sub(20,10);
		sree.mul(10,20);
		sree.div(20,10);
		sree.rem(23,10);
	}

}
