package com.oopsEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaders {
	int id;
	String name;
	
	InputStreamReader ins = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(ins);
	
	public void store() throws IOException {
		System.out.println("enter student id");
		id = Integer.parseInt(br.readLine());
		System.out.println("enter student name");
		name = br.readLine();
		}
	public void display( ) {
		System.out.println("entered student id: "+id);
		System.out.println("entered student name: "+name);
	}
public static void main(String[] args) throws IOException{
	BufferedReaders m =new BufferedReaders();
	m.store();
	m.display();
}
}
