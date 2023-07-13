package com.durgamma;

public class TestThread {
	public static void main(String[] args) {
		Table table=new Table();
		TableOne t1=new TableOne(table);
	    TableTwo t2=new TableTwo(table);
	    t1.run();
	    t2.run();
	    
	}

}
