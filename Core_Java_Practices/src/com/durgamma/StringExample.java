package com.durgamma;

public class StringExample {
	public static void main(String[] args) {
		 String str=new String("hello");
		 String str1="Hello world welcome to java";
		 
		 str1.concat("world");
		 int length=str1.length();
		 System.out.println("the length of the String is:"+length);
		 
		 System.out.println(str1.contains("e"));//boolean value
		 
		 String [] words=str1.split(" ");
		 for(int i=0;i<words.length;i++) {
			 System.out.print(words[i]+",");
		 }
		 String str2=str1.trim();
		 System.out.println(str);
		 System.out.println();
		 System.out.println(str1);
		 System.out.println(str2.toUpperCase());
		 String str3="WELCOME TO INDIA";
		 System.out.println(str3.toLowerCase());
	}
}