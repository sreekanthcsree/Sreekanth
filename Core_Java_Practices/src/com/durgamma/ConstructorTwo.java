package com.durgamma;

public class ConstructorTwo {
	int id;
	String name;
	//parameterized constructor
	ConstructorTwo(int i,String n){
		id = i;
		name = n;
	}
	public void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		ConstructorTwo ex=new ConstructorTwo(100,":gay3");
		ConstructorTwo ex1=new ConstructorTwo(200,":durga");
		
		ex.display();
		ex1.display();
		
   }
 }
