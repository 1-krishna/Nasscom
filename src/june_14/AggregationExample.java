package june_14;

class Address{
	String city, state;
	Address(String city, String state){
		this.city = city;
		this.state = state;
	}
}

class Employee{
	String name;
	Address address;
	
	Employee(String name, Address address){
		this.name = name;
		this.address = address;
	}
	
	void display(){
		System.out.println("Name: " + this.name + ", Address: "
				+ this.address.city 
				+ " " + this.address.state);
	}
}

public class AggregationExample {

	public static void main(String[] args) {
		Address address = new Address("Ghaziabad", "Uttar Pradesh");
		Employee employee = new Employee("Krishna", address);
		
		employee.display();
		
	}
	
	

}
