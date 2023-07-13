package com.durgamma;

public class Constuctor {
	
	Constuctor(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
	Constuctor(){
		System.out.println("default constructor");
	}
	public static void main(String[] args) {
		Constuctor ex=new Constuctor(10,20);//two arg const
		Constuctor ex1=new Constuctor();//default constructor
		
	}
}
