package com.oopsEx;

public class StudentC {
	
	int sid;
	String sname,course;
	
	
	public StudentC() {
		System.out.println("default const");
		
	}
	public StudentC(int id) {
		System.out.println("single argument const");
		sid=id;
	}
	public StudentC(String s){
		System.out.println("again single argument const");
		sname=s;
	}
	public StudentC(int i,String n,String c){
		System.out.println("three argument const");
		sid=i;
		sname=n;
		course=c;
		
	}
	public void display(){
		System.out.println("StudentC id:"+sid+"Name:"+sname+"Course:"+course);
	}
	public static void main(String[] args) {
		StudentC ex=new StudentC();
		ex.display();
}

}
