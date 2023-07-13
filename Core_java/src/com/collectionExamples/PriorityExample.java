package com.collectionExamples;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityExample {
	public static void main(String[] args) {
		
		Queue<Integer>queue=new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<String>pq=new PriorityQueue<String>(Collections.reverseOrder());
		
		queue.add(111);
		queue.add(112);
		queue.add(117);
		queue.add(118);
		queue.add(110);
		queue.add(109);
		queue.add(105);
		queue.offer(100);
		queue.add(99);
		 
		System.out.println(queue);
		
		pq.add("anil");
		pq.add("vamsi");
		pq.add("sandy");
		pq.add("allu");
		pq.add("sreekanth");
		
		System.out.println(pq);
	}

}
