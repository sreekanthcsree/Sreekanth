package com.controlStatements;

public class NestedIfEx {
	public static void main(String[] args) {
		int telugu=10;
		int english=30;	
		
		if(telugu > 35) {
			if(english > 20) {
				System.out.println("passed!");
			}else {
				System.out.println("Failed in English");
			}
		}else {
			System.out.println("Failed in Telugu");
		}
	}
}
