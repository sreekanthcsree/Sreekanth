package com.durgamma;

public class StringTwo {
   public static void main(String[] args) {
	   StringBuffer sb=new StringBuffer("Hello Sreekanth");
	   
	   System.out.println(sb);
	   System.out.println(sb.reverse());
	   System.out.println(sb.length());
	   System.out.println(sb.insert(6,"hai "));
	   System.out.println(sb.replace(0,5,"kotha"));
	   System.out.println(sb.append(" Welcome to Bangalore"));
	   System.out.println(sb.delete(1,4));//group of characters delete
	   System.out.println(sb.deleteCharAt(1));//only single character delete using this method
	   
    }
}
