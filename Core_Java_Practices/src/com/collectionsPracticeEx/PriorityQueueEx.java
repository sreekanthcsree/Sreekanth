package com.collectionsPracticeEx;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		
		Queue<Integer>q=new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<String>pq=new PriorityQueue<String>(Collections.reverseOrder());
		
		q.add(111);
		q.add(112);
		q.add(117);
		q.add(118);
		q.add(110);
		q.add(109);
		q.add(105);
		q.add(100);
		q.add(100);
		
		System.out.println(q);
		
		pq.add("anil");
		pq.add("shyam");
		pq.add("sandilya");
		pq.add("sree");
		pq.add("gay3");
		pq.add("Balu");
		System.out.println(pq);
	}

}
