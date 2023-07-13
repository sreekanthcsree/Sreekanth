package com.durgamma;

public class StringOne {
	public static void main(String[] args) {
		String s1=new String("Welcome to Java Classes");
		String s2="welcome to java classes";
		
		System.out.println(s1);//to store the Heap Memory
		System.out.println(s2);//to store the String Constant Pool
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.concat(s2));//to use add two Strings
		System.out.println(s1.equals(s2));// boolean value
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.startsWith(s2));
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.charAt(0)+" + "+s2.charAt(0));
		
	}

}
