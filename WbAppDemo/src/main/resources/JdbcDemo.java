import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		
		class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM COLLEGE;");
		System.out.println(rs);

	}

}
