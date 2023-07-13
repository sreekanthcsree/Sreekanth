package com.home;

public class IfStatementEx2 {
	//nested if Statement
	
	public static void main(String[] args) {
		int telugu=50;
		int hindi=40;
		
		if(telugu>35) {
			if(hindi>30) {
				System.out.println("Passed");
			}else {
				System.out.println("Failed in Hindi");
			}
			}else {
				System.out.println("Failed in Telugu");
			}
	}
}
