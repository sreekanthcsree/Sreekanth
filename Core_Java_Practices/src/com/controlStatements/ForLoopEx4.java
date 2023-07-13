package com.controlStatements;

public class ForLoopEx4 {
	public static void main(String[] args) {
		String [] s= {"Sreekanth","Puspharaj","Raju","Ramlal","Nani","Ajith","Satheesh"};
		for(String str:s) {
			System.out.println("Friends Names : "+str);
		}
		System.out.println("-------------------------------------->");
		int [] i= {1234,5678,9012,3456,7890};
		for(int it:i) {
			System.out.println("Display the int values : "+it);
		}
	}

}
