package com.durgamma;

public class Table {
	public synchronized void multi(int j) {
		for(int i=1;i<=10;i++) {
			System.out.println(j+"*"+i+"="+i*j);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
