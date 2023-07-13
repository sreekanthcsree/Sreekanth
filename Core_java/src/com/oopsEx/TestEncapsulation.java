package com.oopsEx;

public class TestEncapsulation {
	public static void main(String[] args) {
		EncapsulationExample sree=new EncapsulationExample();
		sree.setId(1510214);
		sree.setName("Sreekanth");
		sree.setMother("Yasodamma");
		sree.setFather("Palasaiah");
		sree.setLocation("Chittoor");
		sree.setIncome(50000);
		
		System.out.println(sree.getId());
		System.out.println(sree.getName());
		System.out.println(sree.getMother());
		System.out.println(sree.getFather());
		System.out.println(sree.getLocation());
		System.out.println(sree.getIncome());
	}

}
