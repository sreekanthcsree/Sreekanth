package com.durgamma;

public class Addition {
	
	public int add(int x,int y) {
		int c=x+y;
		return c;	
	}
	public static void main(String[] args) {
		Addition ad=new Addition();
	   // System.out.println(ad.add(10, 20));
		int a=ad.add(10, 30);
		System.out.println(a);
	}

}
