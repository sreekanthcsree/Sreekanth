package com.collectionsPracticeEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		Map<Integer,String> m =new HashMap<Integer,String>();
		m.put(1,"Shyam");
		m.put(2, "Sandilya");
		m.put(3, "Raju");
		m.put(4, "Ramlal");
		
		System.out.println(m);
		
		for(Map.Entry<Integer, String>mp:m.entrySet()) {
			System.out.println(mp.getKey()+" : "+mp.getValue());
		}
			
	}

}
