package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		String url= "jdbc:mysql://localhost:3306/college";
		String uname= "root";
		String pass = "root";
		String query = "SELECT * FROM STUDENTS";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
			String id= rs.getString("sid");
			String name= rs.getString("sname");
			String branch= rs.getString("branch");
			System.out.println(id + " " + name + " " + branch);
			}
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
