package com.home;

public class InheritanceExTwo extends InheritanceExOne {
	
	public void mul(int a,int b) {
		int z=a*b;
		System.out.println("The Multiplication of Two Numbers is : "+z);
	}
	public void div(int a,int b) {
		int z=a/b;
		System.out.println("The Division of Two Numbers is : "+z);
	}
	public static void main(String[] args) {
		InheritanceExTwo e1=new InheritanceExTwo();
		e1.add(10, 20);
		e1.sub(20, 10);
		e1.mul(10, 30);
		e1.div(50, 2);
	}
}
