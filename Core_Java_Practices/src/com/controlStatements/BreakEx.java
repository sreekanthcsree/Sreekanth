package com.controlStatements;

public class BreakEx {
	public static void main(String[] args) {
		
		  int sum=0, capacity=10;
		    for(int i=1;i<=10;i++) { 
			System.out.println(i);
		     sum=sum+i;
		       if(sum>=capacity)
			    break; 
		  }
		 
		
		/*
		 * for(int i=1;i<=10;i++) { System.out.println(i); if(i==3) { break; } }
		 */
	}

}
