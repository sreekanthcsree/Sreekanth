package com.oopsEx;

public class Sree1 {
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	static int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(Sree1.add(10, 20));
		System.out.println(Sree1.add(10, 20, 40));
		

}
} 