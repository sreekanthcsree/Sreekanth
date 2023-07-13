package com.ioExamples;

import java.io.File;
import java.util.Scanner;

public class FileDemoThree {
	public static void main(String[] args) throws Exception {
		File f=new File("D:\\Sree.txt");
		Scanner sc=new Scanner(f);
		while(sc.hasNext()) {
			String st=sc.nextLine();
			System.out.println(st);
		}
		sc.close();
	}
}
