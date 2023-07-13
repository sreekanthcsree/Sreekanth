package com.oopsEx;

public class Methodoverloading {
	public void add(int a, int b, int l) {
		int c = a+b+l;
		System.out.println(c);
	}
public void add(int h, float b) {
	float d = h+b;
	System.out.println(d);
}
public void add(float g, double f) {
	double i = g+f;
	System.out.println(i);
}
public static void main(String[] args) {
	Methodoverloading n = new Methodoverloading();
	n.add(10, 20);
	n.add(25, 12.23f);
	n.add(23.2f, 23.3656d);
	n.add(20, 20, 20);
	
}
}
