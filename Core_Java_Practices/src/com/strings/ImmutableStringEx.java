package com.strings;

public class ImmutableStringEx {
	public static void main(String[] args) {
		String s="Rohit";
		s.concat(" Kohli");
		System.out.println(s);//will print Rohit because strings are immutable objects 
		
		
		
		String s1="Sachin";
		s1=s1.concat(" Tendulkar");
		System.out.println(s1);
	}	
}
