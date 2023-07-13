package com.collectionsPracticeEx;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
	public static void main(String[] args) {
		ArrayDeque<String>ad=new ArrayDeque<String>();
		
		ad.push("pankaj");
		ad.push("anil");
		ad.push("sandilya");
		ad.push("shyam");
		ad.push("sree");
		ad.push("shyam");
		
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.pop());
		System.out.println(ad);
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		System.out.println(ad);
		System.out.println(ad.poll());//same as pop() method
		System.out.println(ad);	
	}
}
