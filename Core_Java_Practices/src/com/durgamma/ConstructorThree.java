package com.durgamma;

public class ConstructorThree {
	int id;
	String name;
	int age;
	String location;
	
	ConstructorThree(int i,String n){
		id=i;
		name=n;
	}
	ConstructorThree(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	ConstructorThree(int i,String n,int a,String l){
		id=i;
		name=n;
		age=a;
		location=l;
	}
	public void display() {
		System.out.println(id+" "+name+" "+age+" "+location);
	}
	public static void main(String[] args) {
		ConstructorThree c=new ConstructorThree(10,"durga",24,"chittoor");
		ConstructorThree c1=new ConstructorThree(11,"sunil",28,"tirupati");
		ConstructorThree c2=new ConstructorThree(12,"satheesh",29,"tirupati");
		
		c.display();
		c1.display();
		c2.display();
		
		
	}

}
