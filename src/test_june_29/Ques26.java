package test_june_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

class Student{
	String name;
	int roll;
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}	
}

public class Ques26 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Student> list = new ArrayList<>();
		
		int studentCount = 10;
		
		for(int i=0;i<studentCount;i++){
			String name = br.readLine();
			int roll = Integer.parseInt(br.readLine());
			list.add(new Student(name, roll));
		}
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			Student cur = (Student)itr.next();
			System.out.println("Name = " + cur.name + ", Roll = " + cur.roll);
		}
	}

}
