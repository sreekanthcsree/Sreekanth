package com.javaKeywords;

import java.io.IOException;

public class Welcome {
	public static void main(String[] args) throws IOException {
		int i=System.in.read();//returns ASCII code of 1st character  
		System.out.println((char)i);//will print the character  
	}

}
