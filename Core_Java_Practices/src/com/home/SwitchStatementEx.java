package com.home;

public class SwitchStatementEx {
	    int day=7;
	  public void sree() {
		  switch(day) {
		  case 1:
			  System.out.println("Today is Monday");
			  break;
		  case 2:
			  System.out.println("Today is Tuesday");
			  break;
		  case 3:
			  System.out.println("Today is Wednesday");
			  break;
		  case 4:
			  System.out.println("Today is Thursday");
			  break;
		  case 5:
			  System.out.println("Today is Friday");
			  break;
		  case 6:
			  System.out.println("Today is Saturday");
			  break;
		  case 7:
			  System.out.println("Today is Sunday");
			  break;
		  default:
			  System.out.println("It is Empty Day");	  
		  }	
	}
	  public static void main(String[] args) {
		SwitchStatementEx ex=new SwitchStatementEx();
		ex.sree();
	}

}
