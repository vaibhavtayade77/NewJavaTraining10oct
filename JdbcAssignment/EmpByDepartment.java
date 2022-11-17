package com.yash.JdbcAssignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.yash.demo.ConnectionMaster;

public class EmpByDepartment {

	public static void main(String[] args) {
		try {
			Connection conn = ConnectionMaster.getConnection();
			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(" select empid,ename from employee where designation='manager'");
            System.out.println("The employee who have manager in post :");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
