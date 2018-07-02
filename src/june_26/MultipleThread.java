package june_26;

class MyThread2 extends Thread {
	String task;
	
	public MyThread2(String task) {
		// TODO Auto-generated constructor stub
		this.task = task;
		
	}
	
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++){
			System.out.println(task + " " + i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class MultipleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread2 mt1 = new MyThread2("Ticket Booking");
		
		MyThread2 mt2 = new MyThread2("Showing Availability");

		mt1.start();
		mt2.start();
	}

}
