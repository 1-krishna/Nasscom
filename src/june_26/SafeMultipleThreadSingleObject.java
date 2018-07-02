package june_26;

//Here we use synchronized block to safe the method

class Reserve1 implements Runnable {
	int available = 1;
	int wanted;

	public Reserve1(int wanted) {
		// TODO Auto-generated constructor stub
		this.wanted = wanted;
	}

	@Override
	synchronized public void run() {

		//we can also use synchronize block
		//synchronized (this) {

			// TODO Auto-generated method stub
			System.out.println("Available births : " + available);

			if (available >= wanted) {
				String name = Thread.currentThread().getName();
				System.out.println(wanted + " Berths reservation for " + name);

				try {
					available = available - wanted;
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {
				System.out.println("No berths");
			}

		//}
	}
}

public class SafeMultipleThreadSingleObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reserve1 res = new Reserve1(1);

		Thread th1 = new Thread(res, "Person 1");
		Thread th2 = new Thread(res, "Person 2");

		th1.start();
		th2.start();

	}

}
