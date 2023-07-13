package com.collectionExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer,String>map=new TreeMap<Integer,String>();
		map.put(1005,"sandy");
		map.put(1004,"shyam");
		map.put(1003,"allu");
		map.put(1002,"sreekanth");
		map.put(1001,"vamsi");
		map.put(1006,"allu");
	    map.put(1003,"sree");
		System.out.println(map);
		map.putIfAbsent(1007,"sravani");
		System.out.println(map);			
	}
}
