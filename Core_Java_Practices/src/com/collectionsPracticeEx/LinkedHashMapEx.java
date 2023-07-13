package com.collectionsPracticeEx;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String>hm=new LinkedHashMap<Integer,String>();
		hm.put(1, "Gay3");
		hm.put(2, "Sree");
		hm.put(3, "Durga");
		hm.put(4, "Welcome");
		
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println(hm.remove(4));
		System.out.println(hm);
	}
}
