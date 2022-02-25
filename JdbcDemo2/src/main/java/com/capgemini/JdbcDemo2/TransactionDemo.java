package com.capgemini.JdbcDemo2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class TransactionDemo {
	private static Connection con;
	private static Statement stat;
	private static Savepoint sp1;
	public static void main(String[] args) throws SQLException {	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			String url = "jdbc:oracle:thin:@localhost:1521:xe";		
			String userName = "e_commerce";
			String password = "root";
			con = DriverManager.getConnection(url, userName, password);
			con.setAutoCommit(false);  //Set Auto Commit to false
			stat = con.createStatement();
			// 1. Insert a new Customer
			String insertCustomer="insert into customer values(1010,'Penny',56715341,'Nebraska','penny@gmail.com')";
			stat.execute(insertCustomer);
			sp1 = con.setSavepoint("SavePoint1");
			//2. Insert a new Product
			String insertProduct = "insert into product values(2020,'Perfumes','Beauty',300)";
			stat.execute(insertProduct);
			
			//3. Insert into Order table
			String insertOrder = "insert into orders values(3301,1010,2020,3,900";
			stat.execute(insertOrder);
			
			con.commit();
			System.out.println("Transaction Success...Committing the DB..");
			
		} catch (ClassNotFoundException|SQLException e) {
			System.out.println(e);
			System.out.println("Exception Occured... Rolling back the Transaction to SavePoint1..");
			con.rollback(sp1);
			con.commit();
		}

		
	}

}
