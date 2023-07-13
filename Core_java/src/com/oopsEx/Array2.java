
package com.oopsEx;

public class Array2 {
	
	int a=10;
	int b=15;
	int c=20;
	int d=25;
	int e=30;
	int f=35;
	
	public void array() {
		int [] i=new int [10];
		
		for(a=0;a<10;a++) {
			i[a]=a;
			
			System.out.println(i[0]);	
			System.out.println(i[1]);	
			System.out.println(i[2]);	
			System.out.println(i[3]);	
			System.out.println(i[4]);	
			System.out.println(i[5]);	
			System.out.println(i[6]);	
			System.out.println(i[7]);	
			System.out.println(i[8]);	
			System.out.println(i[9]);	
		}
	}
	public static void main(String[] args) {
		Array2 a=new Array2();
		a.array();
	}
	
}
