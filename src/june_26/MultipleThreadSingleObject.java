package june_26;

//Unsafe way of doing, we need to synchronize
//It provides random outputs

class Reserve implements Runnable{
	int available = 1;
	int wanted;
	public Reserve(int wanted) {
		// TODO Auto-generated constructor stub
		this.wanted = wanted;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Available births : " + available);
		
		if(available >= wanted){
			String name = Thread.currentThread().getName();
			System.out.println(wanted + " Berths reservation for " + name);
			
			try {
				available = available - wanted;
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			System.out.println("No berths");
		}
		
	}
}

public class MultipleThreadSingleObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reserve res = new Reserve(1);
		
		Thread th1 = new Thread(res, "Person 1");
		Thread th2 = new Thread(res, "Person 2");
		
		th1.start();
		th2.start();
		
		

	}

}
