package com.yash.JdbcAssignment;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;

import com.yash.demo.ConnectionMaster;

public class User {

	public static void main(String[] args) {
		try {
			Connection conn = ConnectionMaster.getConnection();
			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery("select * from employee where ename='namdev'");

			if (rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4) + " "
						+ rs.getString(5) + " " + rs.getString(6));
			else {
				System.out.println("user not found");
			}

		} catch (Exception ex) {
			System.out.println("user not found");
		}

	}

}

//)Write a jdbc program to that prompts for a username and displays the result of that user if the 
//user does not exists then it displays user not found
