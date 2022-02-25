package com.capgemini.JdbcDemo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");		//Load the Driver
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";		
			String userName = "e_commerce";
			String password = "root";
			 
			// To connect to DB and get the Connection Object
			Connection con = DriverManager.getConnection(url, userName, password);
			
			//Get a Statement object to execute the queries
			
			Statement stat = con.createStatement();
			
			System.out.println("Connection to DB is success..."+con.toString());
			// Execution of Query
			
			String insertQuery = "insert into customer values(1006,'Joey',123412441,'USA','joey@gmail.com')";
			stat.execute(insertQuery);
			System.out.println("Inserted...");
			
			String updateQuery = "update customer set customer_name='Morgan Freeman' where customer_id=1005";
			stat.executeUpdate(updateQuery);
			System.out.println("Customer table Updated...");
			
			String query = "select * from customer";
			ResultSet rs = stat.executeQuery(query);	// Result is stored in ResultSet object
			System.out.println("\nCustomer details...\n");
			
			while(rs.next()) {		//rs.next() points to the next entry in the result table
									// Looping till the result is exhausted
				int id = rs.getInt("customer_id");			// accessing individual values through column name/column number
				String name = rs.getString("customer_name");
				long phone = rs.getLong("phone");
				String location = rs.getString("location");
				String email = rs.getString("email_id");
				
				System.out.println(id+" "+name+" "+phone+" "+location+" "+email);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
