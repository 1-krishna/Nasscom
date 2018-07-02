package june_26;

class MainThread extends Thread{
	int count=0;
	@Override
	public void run() {
		for(int i=0;i<100000;i++){
			count++;
			System.out.println(".");
		}
		System.out.println("This thread gets  completed " + this.getName() + 
				" With priority " + this.getPriority());
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		
		MainThread mt1 = new MainThread();
		MainThread mt2 = new MainThread();
		
		mt1.setPriority(10);
		mt2.setPriority(2);
		
		mt1.setName("Thread 1");
		mt2.setName("Thread 2");
		
		mt1.start();
		mt2.start();
		

	}

}
