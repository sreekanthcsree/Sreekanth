package com.durgamma;

public class ConstructorOne {
	int id;
	String name;
	//displays the default values
	public void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		ConstructorOne ex=new ConstructorOne();
		ConstructorOne ex1=new ConstructorOne();
		ConstructorOne ex2=new ConstructorOne();


		ex.display();
		ex1.display();
		ex2.display();
	}

}
