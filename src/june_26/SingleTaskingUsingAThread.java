package june_26;

class MyThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		task1(); task2(); task3();
		
	}
	
	void task1(){
		System.out.println("This is task 1");
	}
	
	void task2(){
		System.out.println("This is task 2");
	}
	
	void task3(){
		System.out.println("This is task 3");
	}
	
}

public class SingleTaskingUsingAThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyThread1 mt = new MyThread1();
		
		Thread th1 = new Thread(mt);
		
		th1.start();
	}

}
