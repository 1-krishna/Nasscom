package july_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetTypes {

	public static void main(String[] args) throws SQLException {

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "KRISHNA", "KRISHNA");

		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs = st.executeQuery("SELECT * FROM EMP");
		
		rs.next();
		System.out.println(rs.getInt(1));
		rs.absolute(2);
		rs.updateInt(1, 420);
		rs.updateRow();
		
		rs.close();
		con.close();
	}

}
