package com.oopsEx;

public class StaticPolyExample {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("the addition of two integer numbers:"+c);
	}
	public void add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println("the addition of three integer numbers:"+d);
	}
	public void add(int a,float b) {
		float f =a+b; 
		System.out.println("the addition of int and float numbers:"+f);
	}
	public void add(float a,double b) {
		double f=a+b;
		System.out.println("the addition of float,double numbers:"+f);
	}
	public void add(int a) {
		int c=++a;
		System.out.println("the addition of one integer number:"+c);
	}
	public void add() {
		System.out.println("this is add method");
	}
	public static void main(String[] args) {
		StaticPolyExample ex=new StaticPolyExample();
		ex.add();
		ex.add(10);
		ex.add(20.23f,30.3);
		ex.add(10,20.34f);
		ex.add(10,20);
		ex.add(10,20,30);
	}

}
