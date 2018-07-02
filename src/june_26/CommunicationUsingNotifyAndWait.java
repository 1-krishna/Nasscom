package june_26;

class Producer1 extends Thread {
	
	//Here String can't be used as it doesn't support multi threading
	//thus can't be synchronized
	StringBuffer data;

	public Producer1() {
		data = new StringBuffer();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this.data) {
			for (int i = 0; i < 10; i++) {
				data.append(i+",");
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			data.notifyAll();
		}
	}
}

class Consumer1 extends Thread {
	StringBuffer data;
	Producer1 producer;

	public Consumer1(Producer1 producer) {
		// TODO Auto-generated constructor stub
		this.producer = producer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		synchronized (producer.data) {

			try {
				System.out.println("Loading.....");
				producer.data.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			data = producer.data;

			System.out.println("Data is " + data);
		}
	}
}

public class CommunicationUsingNotifyAndWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer1 p = new Producer1();

		Consumer1 c = new Consumer1(p);

		p.setPriority(10);
		p.start();
		c.start();
	}

}
