package com.collectionsPracticeEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(60);
		l.add(80);
		l.add(70);
		l.add(50);
		
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
