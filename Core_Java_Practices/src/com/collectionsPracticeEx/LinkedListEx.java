package com.collectionsPracticeEx;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		
		List<String>list1=new LinkedList<String>();
		LinkedList<String>list=new LinkedList<String>();
		
		list.add("Sreekanth");
		list.add("pankaj");
		list.add("ravitheja");
		list.add("shyam");
		list.add("sandilya");
		list.add("aravind");
		
		System.out.println(list);
		
		list1.add("durga");
		list1.add("gay3");
		list.addAll(list1);
		System.out.println(list);
		
		list.addFirst("Kishore");
		list.addLast("Asha");
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println(list.indexOf("Sreekanth"));
		System.out.println(list.lastIndexOf("Sreekanth"));
		
		
		/*
		 * list.removeAll(list); System.out.println(list);
		 */
	}
}
