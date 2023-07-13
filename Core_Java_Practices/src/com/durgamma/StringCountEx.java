package com.durgamma;

public class StringCountEx {
	public static void main(String[] args) {
	  String s1="hai hello welcome";
	  int count=0;
	
	  for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i) !=' ') {
			count++;
	}
	}
	System.out.println(count);
	}
}
