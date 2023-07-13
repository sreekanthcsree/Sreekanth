package com.controlStatements;

public class SwitchEx {
	public static void main(String[] args) {
		int month = 16;
		switch(month) {
		case 1:
			System.out.println("this is JAN month");
			break;
		case 2:
			System.out.println("this is FEB month");
			break;
		case 3:
			System.out.println("this is MAR month");
			break;
		case 4:
			System.out.println("this is APR month");
			break;
		case 5:
			System.out.println("this is MAY month");
			break;
		case 6:
			System.out.println("this is JUN month");
			break;
		case 7: 
			System.out.println("this is JUL month");
			break;
		case 8:
			System.out.println("this is AUG month");
			break;
		case 9:
			System.out.println("this is SEP month");
			break;
		case 10:
			System.out.println("this is OCT month");
			break;
		case 11:
			System.out.println("this is NOV month");
			break;
		case 12:
			System.out.println("this is DEC month");
			break;
			default:
				System.out.println("Invalid month");
				break;
		}
	}

}
