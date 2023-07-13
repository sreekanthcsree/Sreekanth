package com.durgamma;

public class TableTwo {
	Table table;
	
	public TableTwo(Table table) {
		this.table=table;
	}
	public void run() {
		table.multi(6);
		System.out.println("------------------------------------");
		table.multi(7);
		System.out.println("------------------------------------");
		table.multi(8);
		System.out.println("------------------------------------");
		table.multi(9);
		System.out.println("------------------------------------");
		table.multi(10);
	}
}
