package july_05;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		EmployeeDAO db = new EmployeeDAO();
		
		//Adding employee
		//Employee e = new Employee(110, "RITESH SIR", 62000.0f);
		
		//System.out.println(db.addEmployee(e));
		
		
		//Get all the records
		/*ArrayList<Employee> result;
		result = db.getEmployees();
		
		for(Employee e : result){
			System.out.println("Id : " + e.geteNo() + ", Name : " + e.getName() + ", Salary : " + e.getSalary());
		}*/
		
		//Update employee
		
		//System.out.println(db.updateEmployee(new Employee(110, "VILAS", 65000.4f)));
		
		
		//Deleting Employee
		//System.out.println(110);
		
		//Searching
		//System.out.println(db.searchEmployee("KRISHNA"));
	}

}
