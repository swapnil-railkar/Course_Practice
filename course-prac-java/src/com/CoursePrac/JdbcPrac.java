package com.CoursePrac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcPrac {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        /*
         *  1. import packages.
         *  2. load driver.
         *  3. register driver.
         *  4. create connection.
         *  5. create statement.
         *  6. execute statement.
         *  7. close connection.
         */
		
		String user = "postgres";// Database used.
		String pass = "Swapnil@2001";// password.
		
		/*
		 * url is created as follows : 
		 * jdbc : java lib used for connecting java to db.
		 * postgresql : db used.
		 * localhost : as the application is running on local device.
		 * 5432 : port number of db used. Is availabe on google and also is given while installing the db on local machine.
		 * MyDB : Name of database.
		 * 
		 */
		String url = "jdbc:postgresql://localhost:5432/MyDB";
		
		
		
		//establishing connection.
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection(url, user, pass);
		Statement st = conn.createStatement();
		
		//fetch result.
		ResultSet result = st.executeQuery("select * from student");
		
		
		//Display results.
		while(result.next()) {
			int id = result.getInt("sid");
            String name = result.getString("sname");
            int marks = result.getInt("marks");
			System.out.println(id+" "+name+"  "+marks);
		}
		
		//close connection.
		conn.close();
	}

}
