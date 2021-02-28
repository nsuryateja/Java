package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("org.h2.Driver");

		System.out.println("H2 Driver Loaded");

		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

		System.out.println("Connection is established");

		Statement stmt = con.createStatement();

		System.out.println("Statement is created");

		// createTable(stmt);
		insertDataUsingPreparedStatement(con);
		displayData(stmt);

		stmt.close();
		con.close();
	}

	public static void createTable(Statement stmt) throws SQLException {

		String sql = "create table empfeb26(id integer,name varchar(15),age integer)";

		stmt.execute(sql);

		System.out.println("Table is Created");

	}

	public static void insertDataUsingPreparedStatement(Connection con) throws SQLException {

		PreparedStatement stmt = con.prepareStatement("insert into empfeb26 values(?,?,?)");

		stmt.setInt(1, 6789);

		stmt.setString(2, "Akshat");

		stmt.setInt(3,98);

		int n = stmt.executeUpdate();

		if (n > 0) {
			System.out.println("Data is Inserted");
		}

	}

	public static void updateDataUsingPreparedStatement(Connection con) throws SQLException {

		PreparedStatement stmt = con.prepareStatement("insert into empfeb26 values(?,?,?)");
		
		stmt.setInt(1, 22);
		
		stmt.setInt(2, 6789);

		int n = stmt.executeUpdate();

		if (n > 0) {
			System.out.println("Data is Updated");
		}

	}

	public static void displayData(Statement stmt) throws SQLException {

		String sql = "select * from empfeb26";

		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {

			System.out.println("Emp Id: " + rs.getInt(1));

			System.out.println("Emp Name: " + rs.getString(2));

			System.out.println("Emp Age: " + rs.getInt(3));
		}

		rs.close();

	}

}
