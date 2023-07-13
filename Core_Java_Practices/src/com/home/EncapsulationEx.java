package com.home;

public class EncapsulationEx {
	
	private int id;
	private String name;
	private String location;
	private int salary;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public static void main(String[] args) {
		EncapsulationEx e=new EncapsulationEx();
		e.setId(101);
		e.setName("Sreekanth");
		e.setLocation("Tirupathi");
		e.setSalary(20000);
		System.out.println("Id : "+e.getId()+" Name : "+e.getName()+" Locarion : "+e.getLocation()+" Salary : "+e.getSalary());
	}

}
