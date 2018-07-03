package july_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ActionQueriesInOracle {
	
	static int insertValues(Connection con) throws SQLException{

		Statement st = con.createStatement();
		
		return st.executeUpdate("INSERT INTO EMP VALUES(105, 'KRISHNA', 4)");
	}

	
	static int updateValues(Connection con) throws SQLException{
		Statement st = con.createStatement();
		
		return st.executeUpdate("UPDATE EMP SET EID=500 WHERE EID=101");
	}
	
	
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "KRISHNA", "KRISHNA");
		
		if(con != null){
			System.out.println("Conection established");
			int affectedRows = 0;
			//affectedRows = insertValues(con);
			// affectedRows = updateValues(con);
			
			System.out.println("Affected Rows : " + affectedRows);
			
			con.close();
		}
	}

}
