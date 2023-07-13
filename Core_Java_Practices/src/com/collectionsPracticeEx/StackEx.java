package com.collectionsPracticeEx;

import java.util.List;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer>st=new Stack<Integer>();
		Stack<String>st1=new Stack<String>();
		
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(80);
		st.add(40);
		st.add(50);
		
		st1.push("Kishore");
		st1.push("Sreekanth");
		st1.push("Ajith");
		st1.push("durga");
		st1.push("gay3");
		
		System.out.println(st);
		System.out.println(st1);
		
		System.out.println(st.size());
		System.out.println(st.indexOf(30));
		
		System.out.println(st.peek());
		System.out.println(st1.peek());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st1.pop());
		System.out.println(st1); 
	}

}
