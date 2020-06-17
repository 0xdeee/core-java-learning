package com.jdbc.basic_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) throws SQLException {

		System.out.println("Connecting to the database");
		try {

			// STEP1 : LOAD & REGISTER THE DRIVER OF THE DB , have to get the jar and add it
			// externally in build path
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// STEP2 : CREATE A CONNECTION - create a connection to the DB using
			// getConnection static method in DriverManager and pass DB_URL, DB_USERNAME &
			// DB_PASSWORD as parmeter
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"qwerty");

			// STEP3 : CTEATE STATEMENT - to build queries
			Statement statement = connection.createStatement();

			// STEP4 : CREATE RESULTSET - to store the result of query that we build using
			// statement object
			ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
//			***********this would not fetch any data from this table if you haven't commited the changes in DB *************

			// ResultSet holds the one or more row result from Relational DB and we can
			// iterate over it using this next() method
			// At beginning it points to element previous to first element once we started
			// looping through that at first loop it points from the one before first elemnt
			// to the first element, then at each loop it goes to next and next finally once
			// it goes beyond the rows in result set it stops the loop.
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("ID") + " " + resultSet.getString("NAME"));
			}

			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
