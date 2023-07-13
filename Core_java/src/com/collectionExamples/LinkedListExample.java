package com.collectionExamples;

import java.util.LinkedList;
import java.util.List;


public class LinkedListExample {
	public static void main(String[] args) {
		
		List<String>list1=new LinkedList<String>();
		LinkedList<String>list=new LinkedList<String>();
		
		list.add("pankaj");
		list.add("ravi");
		list.add("raviteja");
		list.add("sreekanth");
		list.add("anil");
		System.out.println(list);
		
		
		list.add(3,"anu");
		System.out.println(list);
		
		list1.add("ajith");
		list1.add("ramlal");
		list.addAll(list1);
		System.out.println(list);
		
		list.addFirst("sreekanth");
		System.out.println(list);
		System.out.println(list.indexOf("sreekanth"));
        System.out.println(list.lastIndexOf("sreekanth"));
		list.addLast("anu");
		System.out.println(list);
        String name=list.getFirst();
        System.out.println(name);
        System.out.println(list.getLast());
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);		
	}
}
