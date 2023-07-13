package com.abhi;

public class SwitchExample {
	
	public void month() {
		int q=4;
	switch(q) {
	
	case 1:
		System.out.println("jan");
		break;
	case 2:
		System.out.println("feb");
		break;
	case 3:
		System.out.println("mar");
		break;
	case 4:
		System.out.println("apr");
		break;
	case 5:
		System.out.println("may");
		break;
	default:
		System.out.println("invalid month");
		break;
	}	 
	}
	public static void main(String[] args) {
		SwitchExample ex=new SwitchExample();
		ex.month();
	}
}
