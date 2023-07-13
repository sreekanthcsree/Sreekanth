package com.oopsEx;

public class RunTimeTwo extends RunTimeOne {
	public void add(int a,int b) {
		super.add(20, 30);
		int c=a+b+20;
		System.out.println("sub-class:"+c);
	}
	public static void main(String[] args) {
		RunTimeTwo ex=new RunTimeTwo();
		ex.add(10, 20);
		
		}
}