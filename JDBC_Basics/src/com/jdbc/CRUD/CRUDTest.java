package com.jdbc.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDTest {

	// CREATE
	public static Integer createTable(Statement statement) throws SQLException {

		Integer result = null;
		result = statement.executeUpdate("CREATE TABLE employee (emp_id int, emp_name varchar2(30), emp_salary int)");
//		 after succesful create operation in DB it returns 0 as zero rows are
//		 affected, we can check if table creation is success by checking if we get
//		 zero back.
		return result;
//		 in ORACLE we can check "desc table_name" to check whether our table is
//		 created or not
	}

	// INSERT - using Statement object
	public static Integer insertRows(Statement statement) throws SQLException {
		Integer result = 0;
		result += statement.executeUpdate("INSERT INTO employee values(101, 'Professor', '1000000')");
		result += statement.executeUpdate("INSERT INTO employee values(102, 'Tokyo', '10000')");
		result += statement.executeUpdate("INSERT INTO employee values(103, 'Nairobi', '1000')");
//		inserting record to specified fields 
		result += statement.executeUpdate("INSERT INTO employee(emp_id, emp_name) values (104, 'Lisbon')");
		return result;
	}

	// INSERT - using PreparedStatement Object
	public static Integer insertRowsUsingPreparedStatement(Connection connection) throws SQLException {
		Integer result = 0;
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employee VALUES (?, ?, ?)");
		// here the first param is index of "?" in query
		// second param is value of that particular index
		// ******** here index of param in query start w/ 1 *******************
		preparedStatement.setInt(1, 101);
		preparedStatement.setString(2, "Professor");
		preparedStatement.setInt(3, 240000000);
		result += preparedStatement.executeUpdate();

		preparedStatement.setInt(1, 102);
		preparedStatement.setString(2, "Nairobi");
		preparedStatement.setInt(3, 2400000);
		result += preparedStatement.executeUpdate();

		preparedStatement.setInt(1, 103);
		preparedStatement.setString(2, "Tokyo");
		preparedStatement.setInt(3, 240000);
		result += preparedStatement.executeUpdate();

		preparedStatement.setInt(1, 104);
		preparedStatement.setString(2, "Lisbon");
		preparedStatement.setInt(3, 24000);
		result += preparedStatement.executeUpdate();

		return result;
	}

	// UPDATE
	public static Integer updateRows(Statement statement) throws SQLException {
		Integer result = 0;
		result += statement.executeUpdate("UPDATE employee SET emp_salary = 200000 WHERE emp_id = 104");
		return result;
	}

	// UPDATE - using PreparedStatement Obj
	public static Integer updateRowsUsingPreparedStatement(Connection connection, int salary, int id)
			throws SQLException {
		Integer result = 0;
		PreparedStatement preparedStatement = connection
				.prepareStatement("UPDATE employee SET emp_salary = ? WHERE emp_id = ?");
		preparedStatement.setInt(1, salary);
		preparedStatement.setInt(2, id);
		result += preparedStatement.executeUpdate();

		return result;
	}

	// DELETE
	public static Integer deleteRows(Statement statement) throws SQLException {
		Integer result = 0;
		result += statement.executeUpdate("DELETE FROM employee WHERE emp_id = 104");
		return result;
	}

	// DELETE - using PreparedStatement Obj
	public static Integer deleteRowsUsingPreparedStatement(Connection connection, int id) throws SQLException {
		Integer result = 0;
		PreparedStatement preparedStatement = connection
				.prepareStatement("DELETE FROM employee WHERE emp_id = ?");
		preparedStatement.setInt(1, id);
		result += preparedStatement.executeUpdate();

		return result;
	}

	// READ
	public static ResultSet fetchAllRows(Statement statement) throws SQLException {
		return statement.executeQuery("SELECT * FROM employee");
	}

	public static void main(String[] args) {

		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"qwerty");

			Statement statement = connection.createStatement();

			System.out.println(CRUDTest.createTable(statement));
			// Not using Statment obj for insert ops cuz it very ineffcient, creates a exec
			// plan in DB for every repeated insert query eventhough its the same query with
			// diff values.
//			System.out.println(CRUDTest.insertRows(statement));

			// Using PreparedStatement Obj to do insert ops cuz its efficient with
			// repetitive queries with diff values, it creates a exec plan only once and use
			// that for all same queries w/ diff values
			System.out.println(CRUDTest.insertRowsUsingPreparedStatement(connection));
			
//			updating using preparedStatement Obj
//			System.out.println(CRUDTest.updateRows(statement));
			System.out.println(CRUDTest.updateRowsUsingPreparedStatement(connection, 5000, 104));
			
//			deleting using PreparedStatement obj
//			System.out.println(CRUDTest.deleteRows(statement));
			System.out.println(CRUDTest.deleteRowsUsingPreparedStatement(connection, 103));

			System.out.println();
			System.out.println();
			ResultSet resultSet = CRUDTest.fetchAllRows(statement);
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("emp_id") + " | " + resultSet.getString("emp_name") + " | "
						+ resultSet.getInt("emp_salary"));
			}

			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
