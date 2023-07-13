package com.oopsEx;

public class CompileTime {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("two integer parameters: "+c);
	}
	public void add(int a,int b,int c) {
		int d=a+b;
		System.out.println("three integer parameters: "+d);
	}
	public void add(int a,float f) {
		float z=a+f;
		System.out.println("two parameters one is integer one is float: "+z);
	}
	public void add(float f,double d) {
		double z=f+d;
		System.out.println("one is float one is double:"+z);
	}
	public void add(String n,int a) {
		String z=n+a;
		System.out.println("one is string one is integer: "+z);
	}
	public void add(String n,char c) {
		String z=n+c;
		System.out.println("one is string one is char: "+z);
	}
	public static void main(String[] args) {
		CompileTime ex=new CompileTime();
		ex.add(10,20);
		ex.add(10,20,30);
		ex.add(10,20.78f);
		ex.add(10.87f,45.76d);
		ex.add("sree",10);
		ex.add("durga",'v');	
	}
}
