package com.practiceJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementExample {
	static Connection con;
	static PreparedStatement ps;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Root");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void create() {
		String query="create table vani(id int primary key not null,name varchar(23),password varchar(24),gender varchar(10),salary float)";
		try {
			con=getConnection();
			ps=con.prepareStatement(query);
			ps.execute();
			System.out.println("table has been inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void insert() {
	  String query="insert into vani values(?,?,?,?,?)";
	  try {
		  con=getConnection();
		  ps=con.prepareStatement(query);
		  ps.setInt(1,1003);
		  ps.setString(2,"vani");
		  ps.setString(3,"vani@156");
		  ps.setString(4,"female");
		  ps.setFloat(5,40000.89f);
		  ps.execute();
		  System.out.println("inserted");
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	}
	public static void update() {
		String query="update vani set name=?,password=?,gender=?,salary=? where id=?";
		try {
			con=getConnection();
			ps=con.prepareStatement(query);
			ps.setString(1,"sravani");
			ps.setString(2,"sravani@123");
			ps.setString(3,"female");
			ps.setFloat(4,42000.78f);
			ps.setInt(5,1002);
			ps.execute();
			System.out.println("update second record");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void delete() {
		String query="delete from vani where id=1002";
		try {
			con=getConnection();
			ps=con.prepareStatement(query);
			ps.execute();
			System.out.println("deleted one row");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void addColumn() {
		String query="alter table vani add location varchar(23)";
		try {
		con=getConnection();
		ps=con.prepareStatement(query);
		ps.execute();
		System.out.println("addColumn");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void update1() {
		String query="update vani set location=? where id=?";
		try {
			con=getConnection();
			ps=con.prepareStatement(query);
			ps.setString(1,"Bangalore");
			ps.setInt(2,1001);
			ps.execute();
			System.out.println("update1");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//create();
		//insert();
		//update();
		//delete();
		//addColumn();
		update1();
	}
}
