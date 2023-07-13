package com.durgamma;

public class OverridingTwo extends OverridingOne {
	public void sree(int a,int b) {
		super.sree(30,50);
		int c=a+b;
		System.out.println("this is child-class method:"+c);
	}
public static void main(String[] args) {
	OverridingTwo ex=new OverridingTwo();
	ex.sree(20,30);
	}
}
