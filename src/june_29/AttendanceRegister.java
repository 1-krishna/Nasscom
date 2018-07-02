package june_29;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Student12{
	String name;
	int rollNo;
	ArrayList<Boolean> attendanceRecord;
	public Student12(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		attendanceRecord = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void markAttendance(Boolean attendance){
		attendanceRecord.add(attendance);
	}
	public ArrayList<Boolean> getAttendance(){
		return attendanceRecord;
	}
	
	
	
}

class Register{
	static HashMap<Integer, Student12> register = new HashMap<>();
	
	void addStudent(String name, int rollNo){
		if(register.containsKey(rollNo)){
			System.out.println("Roll no already registered");
		}else{
			register.put(rollNo, new Student12(name, rollNo));
		}
	}
	
	void markAttendance(int rollNo, Boolean attendance){
		Student12 curStud = register.get(rollNo);
		curStud.attendanceRecord.add(attendance);
	}
	ArrayList<Boolean> getAttendance(int rollNo){
		Student12 curStud = register.get(rollNo);
		return curStud.getAttendance();
	}
}

public class AttendanceRegister {

	public static void main(String[] args) {
		
		
	}

}
