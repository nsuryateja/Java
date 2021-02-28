package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("org.h2.Driver");

		System.out.println("H2 Driver Loaded");

		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

		System.out.println("Connection is established");

		Statement stmt = con.createStatement();

		System.out.println("Statement is created");

		//createTable(stmt);
		insertData(stmt);
		displayData(stmt);

		stmt.close();
		con.close();
	}

	public static void createTable(Statement stmt) throws SQLException {

		String sql = "create table empfeb26(id integer,name varchar(15),age integer)";

		stmt.execute(sql);

		System.out.println("Table is Created");

	}

	public static void insertData(Statement stmt) throws SQLException {

		String sql = "insert into empfeb26 values(10753,'monalisa',20)";

		int n = stmt.executeUpdate(sql);

		if (n > 0) {
			System.out.println("Data is Inserted");
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
