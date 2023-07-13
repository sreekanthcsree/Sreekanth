package com.oopsEx;

public class Single2 extends Single1{
	public void mul() {
		System.out.println("the multiplication of two numbers ");
	}
	public void div() {
		System.out.println("the division of two numbers ");	
	}
	public static void main(String[] args) {
		Single2 ex=new Single2();
		ex.add();
		ex.sub();
		ex.mul();
		ex.div();
		}

}
