package com.oopsEx;

public class DynamicPolyExampleOne extends DynamicPolyExample {
	@Override
	public void add(int a,int b,int k) {
		int c=a+b+k;
		++c;
		System.out.println("the child class addition of three integer numbers:"+c);
		super.add(20,30,40);
	}
	public static void main(String[] args) {
		DynamicPolyExampleOne ex=new DynamicPolyExampleOne();
		ex.add(10,20,30);
		
	}


}
