package com.durgamma;

public class Hello {
	 public static void main(String[] args)
	 {
	    String str1 = "Durga";    
		int leng = str1.length();
		if(leng >= 3)
			System.out.println( str1.substring(0, 4));
		else if(leng == 8)
			System.out.println( (str1.indexOf(6)));

	 }
}
