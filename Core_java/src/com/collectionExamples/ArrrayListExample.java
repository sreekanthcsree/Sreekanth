package com.collectionExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrrayListExample {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		
		list.add(10);
		
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
        list.isEmpty();
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(Integer.valueOf(40));//list.remove(2);  o/p:[10 20 40 50 60 70] 
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.contains(60));//@contains means true or false
		System.out.println(list.indexOf(50));//[10, 20, 30, 50, 60, 70] :it means indexof(50),the o/p is 3th ;else indexof(60),the o/p is 3rd because to remove the value; 
		
		                                     //valueof(40),indexof(40) is----->o/p is -1:

		
	}

}



