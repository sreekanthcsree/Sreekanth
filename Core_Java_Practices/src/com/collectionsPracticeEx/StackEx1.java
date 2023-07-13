package com.collectionsPracticeEx;

import java.util.Iterator;
import java.util.Stack;

public class StackEx1 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();  
		s.push("Ayush");  
		s.push("Garvit");  
		s.push("Amit");  
		s.push("Ashish");  
		s.push("Garima");  
		s.pop(); 
		System.out.println("hsai: "+s.peek());
		Iterator<String> itr=s.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

	}
