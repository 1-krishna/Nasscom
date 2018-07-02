package june_28;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	int ranking;
	String name;
	
	
	
	public Employee(int ranking, String name) {
		super();
		this.ranking = ranking;
		this.name = name;
	}



	public int getRanking() {
		return ranking;
	}



	public void setRanking(int ranking) {
		this.ranking = ranking;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		if(this.ranking < o.ranking) return -1;
		else if(this.ranking > o.ranking) return 1;
		
		return 0;
	}
}

public class UsingComparableInterface {

	
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1, "Krishna"));
		employees.add(new Employee(5, "Mallik"));
		employees.add(new Employee(3, "Mradul"));
		
		for(Employee emp : employees)
			System.out.print(emp.name + " " + emp.ranking + " ");
		
		System.out.println();
		Collections.sort(employees);
		
		System.out.println("________________________");
		
		for(Employee emp : employees)
			System.out.print(emp.name + " " + emp.ranking + " ");
		
		
	}
}
