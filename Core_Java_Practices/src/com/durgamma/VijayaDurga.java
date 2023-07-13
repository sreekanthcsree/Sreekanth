package com.durgamma;

public class VijayaDurga {
	private int id;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		VijayaDurga ex=new VijayaDurga();
		ex.setId(1510214);
		System.out.println(ex.getId());
	}

}