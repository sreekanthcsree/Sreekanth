package com.collectionsPracticeEx;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueEx {
	public static void main(String[] args) {
		Queue<String>q=new LinkedBlockingDeque<String>();
		q.offer("father");
		q.offer("mother");
		q.offer("aunty");
		q.offer("uncle");
		System.out.println(q);
		System.out.println(q.element());
	}

}
