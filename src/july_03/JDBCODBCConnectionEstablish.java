package july_03;

import java.sql.*;

public class JDBCODBCConnectionEstablish {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		//this doesn't support in java 1.8
		//DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
		//we have to use thin client driver for that
		
		
		//We have added a referenced library for this
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); //Registering driver
		
		//Establishing Connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "KRISHNA", "KRISHNA");
		//Port 1521 is fixed of Oracle XE
		
		if(con != null){
			System.out.println("Connection Established");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM EMP");
			
			//Indexing starts from 1
			while(rs.next()){
				System.out.println(rs.getString(2));
			}
			
			con.close();
		}else{
			System.out.println("Conn failed");
		}
	}

}
