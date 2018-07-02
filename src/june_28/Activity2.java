package june_28;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * Making POJO(plain java object)
 * Make A class to write to file
 * Another class to read from file
 * */

/*
 * 
 * */

class Student {
	private String name;
	private String branch;
	private int rollNo;

	public Student(String name, String branch, int rollNo) {
		super();
		this.name = name;
		this.branch = branch;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}

class StudentRecordWriter {
	DataOutputStream dos;

	public StudentRecordWriter(String fileName) throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		File file = new File(fileName);
		FileOutputStream fos = new FileOutputStream(file);
		dos = new DataOutputStream(fos);
	}

	void writer(Student student) throws IOException {

		dos.writeUTF(student.getName());
		dos.writeUTF(student.getBranch());
		dos.writeInt(student.getRollNo());

	}

	void save() throws IOException {
		dos.close();
	}
}

class StudentRecordReader {
	DataInputStream dis;

	public StudentRecordReader(String fileName) throws IOException {
		// TODO Auto-generated constructor stub

		File file = new File(fileName);

		FileInputStream fis = new FileInputStream(file);
		dis = new DataInputStream(fis);
	}

	Student reader() throws IOException {

		String name = dis.readUTF();
		String branch = dis.readUTF();
		int rollNo = dis.readInt();

		Student curStudent = new Student(name, branch, rollNo);

		return curStudent;
	}

	ArrayList<Student> readAll() throws IOException {
		ArrayList<Student> allData = new ArrayList<Student>();
		
		try {
			while (true) {
				String name = dis.readUTF();
				String branch = dis.readUTF();
				int rollNo = dis.readInt();
				allData.add(new Student(name, branch, rollNo));
			}
		} catch (EOFException e) {
		}
		
		return allData;
	}

}

public class Activity2 {

	public static void main(String[] args) throws IOException {

		int studentCount = 3;
		ArrayList<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student("Krishna", "CSE", 12));
		studentList.add(new Student("Mradul", "CSE", 5));
		studentList.add(new Student("NUNU", "EN", 40));

		StudentRecordWriter srw = new StudentRecordWriter("POJOStudent.txt");

		for (Student s : studentList) {
			srw.writer(s);
		}
		srw.save();
		System.out.println("Writing done........");

		// Reading from file

		StudentRecordReader srr = new StudentRecordReader("POJOStudent.txt");
		//Student curStudent;

		ArrayList<Student> inputStudents = new ArrayList<Student>();
		/*for (int i = 0; i < studentCount; i++) {
			curStudent = srr.reader();
			inputStudents.add(curStudent);
			System.out.println(curStudent.getName() + " " + curStudent.getBranch() + " " + curStudent.getRollNo());
		}*/
		
		inputStudents = srr.readAll();
		
		for(Student s : inputStudents){
			System.out.println(s.getName() + " " + s.getBranch() + " " + s.getRollNo());
		}

	}

}
