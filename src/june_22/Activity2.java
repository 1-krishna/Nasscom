package june_22;


class Employee{
	String name;
	int age;
	double salary;
	
	public void printData(){
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Salary : " + this.salary);
		System.out.println("_________________________");
	}
}

class Programmer extends Employee{
	
	String language;
	
	public Programmer(String name, int age, double salary, String language){
		this.name = name;
		this.age = age;
		this.language = language;
		this.salary = salary;
	}
	
	@Override
	public void printData() {
		// TODO Auto-generated method stub
		System.out.println("Language : " + this.language);
		super.printData();
	}
}


class DatabasePro extends Employee{
	String databaseTool;
	public DatabasePro(String name, int age, double salary, String databaseTool){
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.databaseTool = databaseTool;
	}
	
	@Override
	public void printData() {
		// TODO Auto-generated method stub
		
		System.out.println("Database Tool : " + databaseTool);
		super.printData();
	}
}

public class Activity2 {

	public static void main(String[] args) {
		
		Programmer p1 = new Programmer("Krishna", 21, 50000, "Java");
		
		DatabasePro dbp1 = new DatabasePro("Malik", 20, 60000, "SQL");
		
		p1.printData();
		dbp1.printData();

	}

}
