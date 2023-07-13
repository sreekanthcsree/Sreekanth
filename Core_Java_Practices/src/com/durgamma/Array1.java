package com.durgamma;

public class Array1 {
	public static void main(String[] args) {
		
	   int a[]=new int[7];//declaration and instantiation
		   a[0]=10;//initialization
		   a[1]=20;
		   a[2]=30;
		   a[3]=40;
		   a[4]=50;
		   a[5]=60;
		   a[6]=70;
		   
			/*
			 * System.out.println(a[0]); System.out.println(a[1]); System.out.println(a[2]);
			 * System.out.println(a[3]); System.out.println(a[4]); System.out.println(a[5]);
			 * System.out.println(a[6]); System.out.println(a[7]);
			 */		   
		   
		   for(int j=0;j<a.length;j++) {//length is the property of array
			   System.out.println("array numbers: "+a[j]);
		   }
	}

}
