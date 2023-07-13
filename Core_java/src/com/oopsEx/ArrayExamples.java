package com.oopsEx;

public class ArrayExamples {
	 
	int i=10;
	int j=20;
	int k=30;
	int l=40;
	int m=50;
	int n=60;
	
	public void array() {
		int [] i=new int[10];
		for(k=0;k<10;k++){
			i[k]=k;
			
	}
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
	public static void main(String[] args) {
		ArrayExamples ex=new ArrayExamples();
		ex.array();
		
	}
}

