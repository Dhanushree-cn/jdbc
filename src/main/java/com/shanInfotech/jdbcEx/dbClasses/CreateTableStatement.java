package com.shanInfotech.jdbcEx.dbClasses;

import java.sql.Connection;


import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.shanInfotech.jdbcEx.dbConnection.DBConnect;

public class CreateTableStatement {
	static Connection con=null;
	static Statement st=null;
	
	public static void createTable() {
		try {
		con=DBConnect.dbConnect();
		st=con.createStatement();
		try {
			
		
		String tableCreation="Create table train(trainNumber int,  trainName varchar(20),ticketPrice decimal(8,2),fromSource varchar(50)"
				+ ", toDestination varchar(30))";
		st.execute(tableCreation);
		System.out.println("table created");
	}
		catch(Exception e) {
			System.out.println("table already exists");
		}
		//String insertData="insert into train values(1021,'Channai Express',1421.09,'Channai','Goa')";
		//st.executeUpdate(insertData);
		//System.out.println("data inserted");
		
		
		
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		

}
	
	
	
	public static void alterTable() {
		try {
		con=DBConnect.dbConnect();
		st=con.createStatement();
		

			String alterTrain="alter table train add constraint t_key primary key(trainNumber)";
			st.executeUpdate(alterTrain);
			System.out.println("Train number added with primary key");
		
		
		String alterTrainUnique="alter table train add constraint tname_key unique key(trainNumber)";
		st.executeUpdate(alterTrainUnique);
		System.out.println("Train number added with unique key");
		
		

		
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		}
	public static void insertTable() {
		try {
		con=DBConnect.dbConnect();
		st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		String insertsData="insert into train values("+sc.nextInt()+",'"+sc.next()+"',"+sc.nextDouble()+",'"+sc.next()+"','"+sc.next()+"')";
		st.executeUpdate(insertsData);
		System.out.println("data inserted");
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteTable() {
		try {
		con=DBConnect.dbConnect();
		st=con.createStatement();
		String deleteid="delete from train where trainNumber=1023";
		st.executeUpdate(deleteid);
		System.out.println("data deleted");
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void updateTable() {
		try {
		con=DBConnect.dbConnect();
		st=con.createStatement();
		String updatename="update train set trainName='hindu' where trainNumber=1022";
		st.executeUpdate(updatename);
		System.out.println("data updated");
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
}
}

