package com.durgamma;

public class StringThree {
	public static void main(String[] args) {
		String s="Sachin Tendulkar"; 
		String s1=new String("hello world");
		String s2=new String("hello World");
		String s3=new String("Vijayadurga");
		System.out.println(s.startsWith("S")); 
		System.out.println(s.endsWith("r"));
		System.out.println(s);
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(5));
		System.out.println(s.trim());//to remove the spaces at starting and ending positions
		System.out.println(s.length());//to calculate the length of the String
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.substring(1,4));//return 'ell'
		System.out.println(s1.substring(2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.concat(" "+s));
		System.out.println(s1.contains(s2));//two String values are equal or not i,e it's give a boolean value
		System.out.println(s1.toLowerCase());//to convert the lower case
		System.out.println(s3.toUpperCase());//to convert the upper case
		System.out.println(s1.split(s));
		System.out.println(s1.trim());
		System.out.println(s1.replaceFirst(s1,"Ramesh Tendulkar"));
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s2);
		}
}