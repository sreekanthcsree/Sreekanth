package com.durgamma;

public class StaticKeyWord {
	int rollno;
	String name;
	static String college="SKUCET";
	
	public StaticKeyWord(int r,String n){
		rollno=r;
		name=n;
	}
	public void display() {
		System.out.println("RollNo : "+rollno+" ,"+" Name : "+name+" ,"+" College : "+college);
	}
	public static void main(String[] args) {
		StaticKeyWord ex=new StaticKeyWord(1001,"Sree");
		StaticKeyWord ex1=new StaticKeyWord(1002, "Durga");
		
		ex.display();
		ex1.display();
	}
}
