package june_19;

public class MyException extends Exception {
	public MyException(){
		System.out.println("Hello myexception");
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception Message";
	}
}
