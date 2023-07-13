package com.oopsEx;

public class PojoClass {
	private int id;
	private String name;
	
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
	public static void main(String[] args) {
		PojoClass ex=new PojoClass();
		ex.setId(1001);
		ex.setName("sree");
		
		System.out.println("id:"+ex.getId());
		System.out.println("name:"+ex.getName());
	}

}
