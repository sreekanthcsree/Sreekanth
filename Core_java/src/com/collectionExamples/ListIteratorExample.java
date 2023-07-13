package com.collectionExamples;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		List<Double>list= Arrays.asList(10.10,20.10,30.45,40.89,50.98,65.56);
		
		ListIterator<Double>li=list.listIterator();
		
		while(li.hasNext()) {
			li.next();
	}
		while(li.hasPrevious()) {
		System.out.println("double values: "+li.previousIndex()+" = "+li.previous());
		}
		
		
	}	

}

