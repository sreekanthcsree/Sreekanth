package com.durgamma;

public class ArrayExample {
	public static void main(String[] args) {
		
		int sree[]=new int[5];
		  
		  sree[0]=1;
		  sree[1]=7;
		  sree[2]=9;
		  sree[3]=8;
		  sree[4]=7;
			/*
			 * for(int i=0;i<sree.length;i++) {
			 * System.out.println("array values : "+sree[i]); }
			 */
			 			 	
			
			
	   for(int x:sree) {
		System.out.println("Array values : "+x+" "); 
	}
			  
 }

}
