package june_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Student {
	String name;
	int physics, chemistry, maths;

	public Student(String name, int physics, int chemistry, int maths) {
		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}
}

class Result {
	ArrayList<Student> details;

	public Result() {
		details = new ArrayList<>();
	}

	void insert(Student input) {
		for (Student s : details) {
			if (s.name.equals(input.name)) {
				System.out.println("Repeated record for : " + s.name);
				return;
			}
		}
		details.add(input);
	}

	int calcTotal() {
		int total = 0;
		for (Student s : details) {
			total = total + s.physics + s.chemistry + s.maths;
		}
		return total;
	}

}

public class ResultClassActivity {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//For HardCode input

		/*
		 * Student s1 = new Student("Krishna", 60, 40, 80); Student s2 = new
		 * Student("Mradul", 60, 80, 90); Student s3 = new Student("Krishna",
		 * 90, 40, 30); Student s4 = new Student("Malik", 66, 94, 64); Student
		 * s5 = new Student("Ritesh", 63, 95, 43);
		 * 
		 * Result r = new Result();
		 * 
		 * r.insert(s1); r.insert(s2); r.insert(s3); r.insert(s4); r.insert(s5);
		 */

		
		//For dynamic input
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Result r = new Result();

		System.out.println("Enter the no. of record your'e inserting");
		int recordCount = Integer.parseInt(br.readLine());

		System.out.println("Enter the records in following format\nName\nphysics marks\nchemsitry marks\nmaths marks");

		for (int i = 0; i < recordCount; i++) {
			String name = br.readLine();
			int physics = Integer.parseInt(br.readLine());
			int chemistry = Integer.parseInt(br.readLine());
			int maths = Integer.parseInt(br.readLine());
			r.insert(new Student(name, physics, chemistry, maths));
		}

		System.out.println("Total marks is " + r.calcTotal());

	}

}
