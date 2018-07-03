package july_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Validate {

	public static int validateData(String email, String password) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "KRISHNA", "KRISHNA");
		Statement st = con.createStatement();
		/*if(con!=null){
			System.out.println("Conn estd");
		}*/
		return st.executeUpdate("SELECT NAME FROM USER_TABLE WHERE (EMAIL='"+email+"') AND (PASSWORD='"+password+"')");
	}
}

public class ActivityUserLogin {

	public static void main(String[] args) throws IOException, SQLException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the email");
		String email = br.readLine();
		System.out.println("Enter Password");
		String password = br.readLine();
		
		int found = Validate.validateData(email, password);
		if(found>0){
			System.out.println("Login Successful");
		}else{
			System.out.println("Login Failed, Invalid Credentials");
		}
	}

}
