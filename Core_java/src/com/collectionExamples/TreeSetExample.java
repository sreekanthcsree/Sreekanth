package com.collectionExamples;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<String>set=new TreeSet<String>();//natural order
		//Set<String>set=new TreeSet<String>(Collections.reverseOrder());//reverse order
		
		set.add("anil");
		set.add("pankaj");
		set.add("sravani");
		set.add("durga");
		set.add("sree");
		set.add("sree");
		set.add("anil");
		set.add("bharath");
		System.out.println(set);
		
		for(String str:set) {        //used for loop
			System.out.println("Names:"+str);
		}
		
		
	}

}
