package com.yash.JdbcAssignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.yash.demo.ConnectionMaster;

public class EmpMaxSalary {
	
	public static void main(String[] args) {
		try {
			Connection conn = ConnectionMaster.getConnection();
			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(" select empid,ename,salary from employee where salary = (select max(salary) from employee)");
            System.out.println("The employee with  maximum salary");
			while (rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
