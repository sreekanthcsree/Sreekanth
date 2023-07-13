package com.operators;

public class Operators1 {
	public static void main(String[] args) {
		int x=10;
		int y=12;
		System.out.println(x);
		System.out.println(x++);//we will first time execute never change the post increment
		System.out.println("post increment: "+(x++));//we can apply for post increment second time value will change
		System.out.println(y);
		System.out.println("pre increment: "+(++y));//pre-increment means we will first time increment value will be changed
		System.out.println(x--);
		System.out.println("post decrement :"+(x--));
		System.out.println("pre decrement : "+(--y));
		System.out.println(--y);
	}

}
