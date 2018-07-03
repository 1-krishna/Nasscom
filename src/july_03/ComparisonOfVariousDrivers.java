package july_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ComparisonOfVariousDrivers {
	
	/*For improved speed use
		1.Use Thin Client Driver
		2.Increasing Fetch size
		3.Use PreparedStatement
	*/
	
	static void usingNormalStatement(Connection con) throws SQLException{
		Statement st = con.createStatement();
		long t1 = System.currentTimeMillis();
		
		for(int i=0;i<1000;i++){
			
			//we could use PreparedStatement instead of Statement to further improve the speed
			//because parsing is done only single time in PreparedStatement
			st.executeUpdate("INSERT INTO TEST VALUES(" + i + ")" );
		}
		
		long t2 = System.currentTimeMillis();
		
		System.out.println("Time taken using Statement is : " + (t2 - t1) + "ms");
		//It is taking 1963ms
		//But for similar operation odbc takes 5000ms
	}

	static void usingPreparedStatement(Connection con) throws SQLException{
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO TEST VALUES(?)");
		

		long t1 = System.currentTimeMillis();
		
		for(int i=1000;i<2000;i++){
			ps.setInt(1, i);
			ps.executeUpdate();
		}
		
		long t2 = System.currentTimeMillis();
		
		//it takes around 1136ms
		System.out.println("Time taken using PreparedStatement is : " + (t2 - t1));
	}
	public static void main(String[] args) throws SQLException {

		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "KRISHNA", "KRISHNA");
		
		
		if(con != null){
			usingPreparedStatement(con);
			con.close();
		}

	}

}
