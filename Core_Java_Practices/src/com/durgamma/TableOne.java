package com.durgamma;

public class TableOne {
	Table table;
	
	public TableOne(Table table) {
		this.table=table;
	}
	public void run() {
		table.multi(1);
		System.out.println("------------------------------------");
		table.multi(2);
		System.out.println("------------------------------------");
		table.multi(3);
		System.out.println("------------------------------------");
		table.multi(4);
		System.out.println("------------------------------------");
		table.multi(5);
		System.out.println("------------------------------------");
	}
}
