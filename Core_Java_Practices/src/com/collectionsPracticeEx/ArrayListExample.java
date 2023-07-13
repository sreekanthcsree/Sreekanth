package com.collectionsPracticeEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<Integer>list = new ArrayList<Integer>();
		
		list.add(60);
		list.add(80);
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(70);
		list.add(90);
		list.add(30);
		list.add(20);
		
		System.out.println(list);
		System.out.println(list.size());//it returns size of the list
		list.remove(6);
		list.remove(Integer.valueOf(30));//to remove the particular list value
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(40));//this value is there return true, is not there return false
		System.out.println(list.indexOf(50));//to find out the index number
		System.out.println(list.get(2));//get the list object value using index number
	}
}
