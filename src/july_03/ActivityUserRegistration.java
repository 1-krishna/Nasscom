package july_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ActivityUserRegistration {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "KRISHNA", "KRISHNA");
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO USER_TABLE VALUES(?,?,?)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the total count of records");
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0;i<count;i++){
			System.out.println("Enter name for " + (i+1) + " record");
			ps.setString(1, br.readLine());

			System.out.println("Enter email for " + (i+1) + " record");
			ps.setString(2, br.readLine());
			
			System.out.println("Enter password for " + (i+1) + " record");
			ps.setString(3, br.readLine());
			
			ps.execute();
			System.out.println("Value Successfully inserted");
		}
		
		
		
		con.close();
	}

}
