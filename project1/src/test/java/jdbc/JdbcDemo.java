package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM STUDENTS;");
		System.out.println(rs);
	}

}
