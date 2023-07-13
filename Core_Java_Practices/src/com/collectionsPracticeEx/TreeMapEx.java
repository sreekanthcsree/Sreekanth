package com.collectionsPracticeEx;

import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		//it follows the Ascending Order
		TreeMap<Integer, String>tm=new TreeMap<Integer,String>();
		tm.put(1001, "Sree");
		tm.put(1003, "Gay3");
		tm.put(1000, "Durga");
		tm.put(1007, "Sunil");
		tm.put(1005, "Satheesh");
		tm.put(1006, "Meramma");
		
		System.out.println(tm);
	}
}
