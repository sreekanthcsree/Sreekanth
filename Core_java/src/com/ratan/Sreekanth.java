package com.ratan;

public class Sreekanth {
	public static String rev(String str) {
		String words[]=str.split("\\s");
		String rev="";
		for(String s:words) {
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			rev+=sb.toString()+" ";
		}
		return rev.trim();
	}
public static void main(String[] args) {
	System.out.println(Sreekanth.rev("SHIRIDI SAI BABA"));
	System.out.println(Sreekanth.rev("HAPPY NEW YEAR"));
  }
}