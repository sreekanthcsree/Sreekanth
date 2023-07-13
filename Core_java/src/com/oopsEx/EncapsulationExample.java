package com.oopsEx;

public class EncapsulationExample {
	private int id;
	private String name;
	private String location;
	private String mother;
	private String father;
	private double income;
	
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
	public void setMother(String mother) {
		this.mother=mother;
	}
	public String getMother() {
		return mother;
	}
	public void setFather(String father) {
		this.father=father;
	}
	public String getFather() {
		return father;
	}
	public void setIncome(double income) {
		this.income=income;
	}
	public double getIncome() {
		return income;
	}
	

}
