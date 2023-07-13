package com.flowControlExamples;

public class IfStatement1 {
	int height=167;
	public void checkHeight() {
		if(height>166) {
			System.out.println("he is eligible for pc");
		}else {
			System.out.println("he is not eligible for pc");
		}
		    
	}
	public static void main(String[] args) {
		IfStatement1 ex=new IfStatement1();
		ex.checkHeight();
	}

}
