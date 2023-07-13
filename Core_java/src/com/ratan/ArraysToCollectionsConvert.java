package com.ratan;

import java.util.ArrayList;
import java.util.Arrays; 

//to convert arrays to collections
public class ArraysToCollectionsConvert {
	public static void main(String[] args) {
		String a[]= {"sreekanth","Ramlal","Puspharaj","Raju"};
		
		ArrayList<String>al=new ArrayList<String>(Arrays.asList(a));
		al.add("Nani");
		al.add("Ajith");
		al.add("Satheesh");
		System.out.println(al);
	}
}
