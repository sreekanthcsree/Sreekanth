package com.inheritance;

public class Employee1 {
	int eid;
	String name;
	
	Address add;//Aggregation
	
	public Employee1(int id,String name,Address add) {
		this.eid=id;
		this.name=name;
		this.add=add;
	}
	public void display() {
		System.out.println("Employee Id : "+eid+" Employee Name : "+name);
		System.out.println("Address Id : "+add.id+" Name : "+add.name+" City : "+add.city+" State : "+add.state);
	}
	public static void main(String[] args) {
		Address ad=new Address(101,"Charan", "Anantapur", "AP");
		Employee1 emp=new Employee1(1, "Sreekanth", ad);
		emp.display();
	
	}
}