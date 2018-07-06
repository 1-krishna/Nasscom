package july_05;

public class Employee {
	
	private int eNo;
	private String name;
	private float salary;
	public Employee(int eNo, String name, float salary) {
		super();
		this.eNo = eNo;
		this.name = name;
		this.salary = salary;
	}
	public int geteNo() {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	};
	
	

}
