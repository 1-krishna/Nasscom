package july_05;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class EmployeeDAO {
	String url, dbdriver, user, password;
	Connection con;
	
	public EmployeeDAO() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub
		ResourceBundle rb = ResourceBundle.getBundle("july_05/OracleDb");
		url = rb.getString("dburl");
		dbdriver = rb.getString("dbdriver");
		user = rb.getString("user");
		password = rb.getString("password");

		//System.out.println(url+","+dbdriver+","+user+","+password);
		
		
		
		//Register Driver and Connection
		Class.forName(dbdriver);
		con = DriverManager.getConnection(url, user, password);
		
	}
	
	public int addEmployee(Employee e) throws SQLException{
		int result = 0;
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO EMPTAB VALUES(?,?,?)");
		
		ps.setInt(1, e.geteNo());
		ps.setString(2, e.getName());
		ps.setFloat(3, e.getSalary());
		
		result = ps.executeUpdate();
		
		con.close();
		
		return result;
		
	}
	
	public ArrayList<Employee> getEmployees() throws SQLException{
		
		ArrayList<Employee> result = new ArrayList<>();
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM EMPTAB");
		
		
		while(rs.next()){
			
			result.add(new Employee(rs.getInt(1), rs.getString(2), rs.getFloat(3)));
			
		}
		
		con.close();
		
		return result;
		
	}
	
	public int updateEmployee(Employee e) throws SQLException{
		int result = 0;
		
		PreparedStatement ps = con.prepareStatement("UPDATE EMPTAB SET NAME=? , SALARY=? WHERE ENO=?");
		
		ps.setString(1, e.getName());
		ps.setFloat(2, e.getSalary());
		ps.setInt(3, e.geteNo());
		
		result = ps.executeUpdate();
		
		return result;
	}
	
	public int deleteEmployee(int eNo) throws SQLException{
		int result = 0;
		
		PreparedStatement ps = con.prepareStatement("DELETE FROM EMPTAB WHERE ENO=?");
		ps.setInt(1, eNo);
		
		result = ps.executeUpdate();
		
		return result;
	}

	public int searchEmployee(String name) throws SQLException{
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM EMPTAB WHERE NAME='"+name+"'");
		if(rs.next()){
			return 1;
		}else{
			return 0;
		}
	}

}
