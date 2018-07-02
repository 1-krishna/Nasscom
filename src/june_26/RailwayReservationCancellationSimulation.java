package june_26;

class Booking implements Runnable{

	Object train, compartment;
	
	public Booking(Object train, Object compartment) {
		// TODO Auto-generated constructor stub
		this.train = train;
		this.compartment = compartment;
	}
	@Override
	public void run() {
		synchronized (train) {
			System.out.println("Booking locked on train");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Booking waiting for lock on compartment");
			synchronized (compartment) {
				System.out.println("Booking locked on compartment");
			}
			
		}

	}	
}

class Cancellation implements Runnable{
	Object train, compartment;	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (train) {
			System.out.println("Cancellation locked on train");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Cancellation now waiting to lock on compartment");
			
			
			synchronized (compartment) {
				System.out.println("Cancellation locked compartment");
			}
		}

	}
	
	public Cancellation(Object train, Object compartment) {
		// TODO Auto-generated constructor stub
		this.train = train;
		this.compartment = compartment;
	}
}

public class RailwayReservationCancellationSimulation {

	public static void main(String[] args) {
		
		Object train = new Object();
		Object compartment = new Object();
		
		Booking book = new Booking(train, compartment);
		Cancellation cancellation = new Cancellation(train, compartment);
		
		Thread bookThread = new Thread(book);
		Thread cancelThread = new Thread(cancellation);
		
		bookThread.start();
		cancelThread.start();
		

	}

}
