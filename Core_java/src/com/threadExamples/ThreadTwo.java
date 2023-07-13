package com.threadExamples;

public class ThreadTwo extends Thread {
	Table t;
	ThreadTwo(Table t){
		this.t=t;
	}
	public void run() {
		t.multiplication(NORM_PRIORITY);
	}

}
