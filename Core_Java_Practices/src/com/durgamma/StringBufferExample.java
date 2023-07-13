package com.durgamma;

public class StringBufferExample {
	public static void main(String [] args) {
		StringBuffer sb=new StringBuffer("hello");
		/*
		 * sb.append(" java"); System.out.println(sb); sb.insert(0,"welcome ");
		 * System.out.println(sb); sb.replace(1,4,"sreekanth"); System.out.println(sb);
		 * sb.delete(0, 1); System.out.println(sb); sb.delete(10,14);
		 * System.out.println(sb);
		 */
		sb.append(" Durga");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
