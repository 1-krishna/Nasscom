package july_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ActionQueriesInOracle {
	
	static int insertValues(Connection con) throws SQLException{

		Statement st = con.createStatement();
		
		return st.executeUpdate("INSERT INTO EMP VALUES(105, 'KRISHNA', 4)");
	}

	
	static int updateValues(Connection con) throws SQLException{
		Statement st = con.createStatement();
		
		return st.executeUpdate("UPDATE EMP SET NAME='KMV' WHERE EID=105");
	}
	
	static void showData(Connection con) throws SQLException{
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM EMP");
		while(rs.next()){
			System.out.println("eId : " + rs.getString(1) + ", name : " + rs.getString(2) + ", DId : " +rs.getString(3));
		}
	}
	
	static int removeData(Connection con) throws SQLException{
		Statement st = con.createStatement();
		return st.executeUpdate("DELETE FROM EMP WHERE EID=105");
 	}
	
	
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "KRISHNA", "KRISHNA");
		
		if(con != null){
			System.out.println("Conection established");
			int affectedRows = 0;
			affectedRows = insertValues(con);
			affectedRows = updateValues(con);
			affectedRows = removeData(con);
			showData(con);
			
			//System.out.println("Affected Rows : " + affectedRows);
			
			con.close();
		}
	}

}
