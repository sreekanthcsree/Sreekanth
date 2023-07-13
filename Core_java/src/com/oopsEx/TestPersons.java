package com.oopsEx;

public class TestPersons {
	public static void main(String[] args) {
		Persons p=new  Persons();
		p.setAge(21);
		p.setName("sreekanth");
		p.setLocation("tirupathi");
		
		System.out.println("the age is:"+p.getAge());
		System.out.println("the name is:"+p.getName());
		System.out.println("the location is:"+p.getLocation());
	}

}
