package com.practiceJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CrudEx {
	static Connection con;
	static Statement st;
	static ResultSet rs;
	
	public static Statement getStatement() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Root");
			st=con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return st;
	}
	public static void select() {
		try {
			st=getStatement();
			rs=st.executeQuery("select * from login");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println("------------->");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void insert() {
		try {
			st=getStatement();
			String query="insert into login values(214,'vamsi','vamsi@123','male','kurnool')";
			boolean b=st.execute(query);
			if(b) {
				System.out.println("data inserted");
			}else {
				System.out.println("there is an error");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void update() {
		try {
			st=getStatement();
			String query="update login set username='durga',password='durga@123',gender='female',location='tirupati' where id=105";
			int i=st.executeUpdate(query);
			System.out.println("successfully updated:"+i);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static  void delete() {
		try {
			st=getStatement();
			String query="delete from login where id=103";
			int i=st.executeUpdate(query);
			System.out.println("successfully deleted:"+i);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
  public static void addColumn() {
	  try {
		 st=getStatement();
		 String query="alter table login add salary float ";
		 int i=st.executeUpdate(query);
		 System.out.println("addColumn:"+i);
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
  }
  public static void update1() {
	  try {
		  st=getStatement();
		  String query="update login set salary=50000 ";
		  int i=st.executeUpdate(query);
		  System.out.println("update1:"+i);
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
  }
	public static void main(String[] args) {
		//select();
		//insert();
		//update();
		//delete();
		//addColumn();
		update1();
	}
	

}
