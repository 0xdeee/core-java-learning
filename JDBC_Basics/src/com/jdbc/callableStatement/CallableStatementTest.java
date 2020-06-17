package com.jdbc.callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//used to invoke stored procedures or functions in DB
public class CallableStatementTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "qwerty");

		// for testing callable we must have a stored procedure or function in DB
//		CREATE OR REPLACE PROCEDURE insertEmployee(
//		eid IN NUMBER,
//		ename IN VARCHAR2,
//		esal IN NUMBER)
//		IS
//		BEGIN
//		INSERT INTO employee VALUES (eid,ename,esal);
//		END;
//		/

		CallableStatement callableStatement = connection.prepareCall("{call insertEmployee(?, ?, ?)}");
		callableStatement.setInt(1, 101);
		callableStatement.setString(2, "Professor");
		callableStatement.setInt(3, 50000000);
		int result = callableStatement.executeUpdate();
		System.out.println("Rows Affected " + result);

//		CREATE OR REPLACE PROCEDURE getEmployeeById(
//		eid IN employee.emp_id%TYPE,
//		ename OUT employee.emp_name%TYPE,
//		esal OUT employee.emp_salary%TYPE)
//		IS
//		BEGIN
//		SELECT emp_name, emp_salary INTO ename, esal FROM employee WHERE emp_id = eid;
//		END;
//		/

		callableStatement = connection.prepareCall("{call getEmployeeById(?, ?, ?)}");
		callableStatement.setInt(1, 101);
		callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
		callableStatement.registerOutParameter(3, java.sql.Types.INTEGER);
		callableStatement.executeUpdate();
		System.out.println("Name: " + callableStatement.getString(2) + " " + "Salary: " + callableStatement.getInt(3));

		connection.close();
	}

}
