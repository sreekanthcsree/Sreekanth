package com.home;

public class InheritanceExOne extends InheritanceEx {
	public void sub(int i,int j) {
		int k=i-j;
		System.out.println("The Subtraction of two numbers is : "+k);
	}
	public static void main(String[] args) {
		InheritanceExOne ex=new InheritanceExOne();
         ex.sub(20, 10);
         ex.add(10, 20);
	}

}
