package com.durgamma;

import java.io.*;

public class BufferedReaderExample{    
	public static void main(String args[])throws Exception{             
	    InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);            
	    System.out.println("Enter your name:");    
	    String name=br.readLine();    
	   System.out.println("Hello "+name); 
	    System.out.println("Enter your location:");
	    String location=br.readLine();
	    System.out.println("Welcome to "+location);
	    System.out.println("Enter your salary:");
	    float salary=br.skip(1224);
	    
	    System.out.println("Name and Location is:"+(name+location));
	    
	    
	}    
	}  


