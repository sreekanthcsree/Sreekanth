package com.threadExamples;

public class ThreadOne extends Thread {
	  Table t;
	  ThreadOne(Table t){
		  this.t=t;
  }
	  public void run() {
		  t.multiplication(MIN_PRIORITY);
	  }
}
 