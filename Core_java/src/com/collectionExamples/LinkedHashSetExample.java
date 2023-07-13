package com.collectionExamples;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set<String>set=new LinkedHashSet<String>();
		set.add("anil");
		set.add("vamsi");
		set.add("pankaj");
		set.add("sravani");
		set.add("vani");
		set.add("vamsi");
		set.add("anil");
		System.out.println(set);
		
		
	}

}

