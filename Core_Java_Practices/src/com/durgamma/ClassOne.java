package com.durgamma;

public class ClassOne {
	int counter=2;
	
	public void display() {
		counter++;
		System.out.println("Conter : "+counter);
	}
   public static void main(String[] args) {
	   ClassOne co=new ClassOne();
	   co.display();
	   co.display();
	   co.display();
	   co.display();
}
}
