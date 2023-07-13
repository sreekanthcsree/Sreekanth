package com.dextris;

public class InheritanceOne extends Inheritance{
	public void sub(int a,int b) {
		super.add(a, b);
		int c=a-b;
		System.out.println("Subtraction of two no's is : "+c);
	}
	public static void main(String[] args) {
		InheritanceOne io=new InheritanceOne();
		//io.add(10, 20);
		io.sub(20, 20);
	}
}