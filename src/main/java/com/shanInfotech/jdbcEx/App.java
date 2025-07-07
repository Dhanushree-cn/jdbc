package com.shanInfotech.jdbcEx;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.shanInfotech.jdbcEx.dbClasses.CreateTableStatement;

public class App {
	//static Connection con=null;//connection interface used for connecting to data
    //public static void main() throws ClassNotFoundException,SQLException{
        //System.out.println("Loading JDBC Driver");
       // Class.forName("com.mysql.cj.jdbc.Driver");//we are using type 4 driver and loading driver
       // System.out.println("Connecting to Database");
        //connection interface used for connecting to database
        //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcEx","root","root");
        //System.out.println("disconnecting from database");
        //con.close();
	
	public static void main(String []args)throws ClassNotFoundException,SQLException{
		//CreateTableStatement.createTable();
		//CreateTableStatement.alterTable();
		//CreateTableStatement.insertTable();
		//CreateTableStatement.deleteTable();
		//CreateTableStatement.updateTable();
		
		System.out.println("Hello");
    }
}
