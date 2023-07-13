package com.threadExamples;

public  class Table {
	public synchronized void multiplication(int s) {
		for(int i=1;i<=5;i++) {
			System.out.println(s+"*"+i+"="+i*s);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
