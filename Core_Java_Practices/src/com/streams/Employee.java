package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {
	
	int id,age,year;
	String name,gender,dept;
	double salary;
	
	public Employee(int id, String name, int age, String gender, String dept, int year, double salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.dept=dept;
		this.year=year;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public int getYear() {
		return year;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getDept() {
		return dept;
	}
	public double getSalary() {
		return salary;
	}


	public static void main(String[] args) {
		
		List<Employee>emplist=new ArrayList<Employee>();
		
		emplist.add(new Employee(111,"Jiya Brein",32,"Female","HR",2011,25000.0));
		
		emplist.add(new Employee(122,"Paul Niksui",25,"Male","Sales and Marketing",2015,13500.0));
		
		emplist.add(new Employee(133,"Martien Theron",29,"Male","Infrastructure",2012,18000.0));
		
		emplist.add(new Employee(144,"Murali Gowda",28,"Male","Product Development",2014,32500.0));
		
		emplist.add(new Employee(155,"Nima Ray",27,"Female","HR",2013,22700.0));
		
		emplist.add(new Employee(177,"Manu Sharma",35,"Male","Product Development",2015,34500.0));
		
		emplist.add(new Employee(166,"Iqbal Hussain",43,"Male","Security and Transport",2016,10500.0));
		
		emplist.add(new Employee(188,"Wang Liu",31,"Male","Sales and Marketing",2015,34500.0));
		
		emplist.add(new Employee(199,"Amelia Zoe",24,"Female","Product Development",2016,11500.0));
		
		emplist.add(new Employee(200,"Jaden Dough",38,"Male","Security and Transport",2015,11000.5));
		
		emplist.add(new Employee(211,"Jasna Kaur",27,"Female","Infrastructure",2014,15700.5));
		
		emplist.add(new Employee(222,"Nitin Joshi",25,"Male","Product Development",2016,28200.0));
		
		emplist.add(new Employee(233,"C Sreekanth",24,"Male","Java Developer",2023,40000.45));
		
		System.out.println(emplist);
		
		List<String>li=emplist.stream().collect(Collectors.mapping(Employee::getName, Collectors.toList()));
		System.out.println(li);
		
		Set<String>set=emplist.stream().map(Employee::getDept).collect(Collectors.toSet());
		System.out.println(set);
		
		Map<Integer,Long>map=emplist.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.counting()));
		System.out.println(map);
		
		Map<String,Long>map1=emplist.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		System.out.println(map1);
		
		
	}

}
