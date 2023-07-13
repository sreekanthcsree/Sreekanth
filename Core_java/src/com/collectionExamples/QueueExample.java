package com.collectionExamples;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String>q=new LinkedBlockingDeque<String>();
		q.offer("father");
		q.offer("mother");
		q.offer("aunty");
		q.offer("uncle");
		System.out.println(q);
		System.out.println(q.element());
		
		Queue<Integer>queue=new ArrayDeque<Integer>();
		queue.add(10);
		queue.add(20);
		System.out.println(queue);
		System.out.println(queue.peek());
	}

}
