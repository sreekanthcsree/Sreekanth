package com.threadExamples;

public class TestThread {
	public static void main(String[] args) {
		Table sree=new Table();
		ThreadOne t1=new ThreadOne(sree);
		ThreadTwo t2=new ThreadTwo(sree);
		
		t1.start();t2.start();
		
    }
}
