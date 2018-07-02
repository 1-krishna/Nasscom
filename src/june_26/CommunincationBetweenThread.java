package june_26;

class Producer extends Thread {

	boolean dataAvailable = false;
	String data = "";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("Writing data.....");
			data += Integer.toString(i) + ",";
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		dataAvailable = true;

	}
}

class Consumer extends Thread {

	Producer producer;
	String data;

	public Consumer(Producer producer) {
		// TODO Auto-generated constructor stub
		this.producer = producer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (!producer.dataAvailable) {
			System.out.println("Loading.......");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		data = producer.data;
		System.out.println("Data is  : " + data);
	}

}

public class CommunincationBetweenThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producer p = new Producer();

		Consumer c = new Consumer(p);

		p.start();
		c.start();

	}

}
