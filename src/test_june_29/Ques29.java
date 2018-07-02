package test_june_29;

class ThreadClass extends Thread{
	@Override
	public void run() {
		System.out.println("Hello from thread " + Thread.currentThread().getName());
		if(Integer.parseInt(Thread.currentThread().getName()) < 10){
			int curThread = Integer.parseInt(Thread.currentThread().getName());
			ThreadClass tc = new ThreadClass();
			Thread th = new Thread(tc, Integer.toString(curThread + 1));
			th.start();
		}
		
	}
}

public class Ques29 {
	
	
	public static void main(String[] args) {
		ThreadClass tc = new ThreadClass();
		Thread th = new Thread(tc, Integer.toString(1));
		th.start();

	}

}
