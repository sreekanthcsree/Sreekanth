package com.collectionExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<Double>list1=new ArrayList<Double>();
		list1.add(23.12);
		
		List<Double>list= Arrays.asList(10.10,20.10,30.45,40.89,50.98,65.56);
		
		for(int i=0;i<list.size();i++) {
			System.out.println("list"+"("+i+")"+"="+list.get(i));
			
			for(Double d:list) {
				System.out.println("list of : "+d);
			}
			
		}
	}
}
