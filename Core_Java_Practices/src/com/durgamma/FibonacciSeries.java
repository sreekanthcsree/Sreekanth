package com.durgamma;

public class FibonacciSeries {
	//0 1 1 2 3 5 8 13 21 34 55 89 144 223
	public static void fibonacci(int n) {
		int num1=0;
		int num2=1;
		int counter=0,num3;
		
		while(counter<n) {
			System.out.println("fibonacci series is: "+num1+" ");
			
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
		    counter=counter+1;
		}
	}
	public static void main(String[] args) {
		//FibonacciSeries fb=new FibonacciSeries();
		fibonacci(10);
	}

}
