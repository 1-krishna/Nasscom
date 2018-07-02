package june_29;

import java.util.HashMap;
import java.util.Map;

class Student1{
	String name;
	int roll;
	public Student1(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
}

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Student1> studentMap = new HashMap<String, Student1>();
		
		Student1 s1 = new Student1("Krishna", 45);
		Student1 s2 = new Student1("Mohan", 62);
		Student1 s3 = new Student1("Verma", 75);
		
		studentMap.put("Krishna", s1);
		studentMap.put(s2.getName(), s2);
		studentMap.put(s3.getName(), s3);
		
		System.out.println(studentMap.size() + " distinct objects");
		System.out.println("Contents of map are " + studentMap);
	    
	}

}
