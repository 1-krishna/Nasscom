package june_28;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class MultiServer implements Runnable{
	
	static ServerSocket ss;
	static Socket s;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String name = Thread.currentThread().getName();
		
		for(;;){
			System.out.println("Thread " + name + " ready to accept");
			try {
				s = ss.accept();
				System.out.println("Thread " + name + " accepted connection");
				PrintStream ps = new PrintStream(s.getOutputStream());
				
				ps.println("Thread " + name + " messaged you");
				ps.close();
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class MultiThreadedServerImplementation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		MultiServer ms = new MultiServer();
		MultiServer.ss = new ServerSocket(6666);
		Thread serv1 = new Thread(ms, "One");
		Thread serv2 = new Thread(ms, "Two");
		
		//MultiServer.ss.close();
		serv1.start();
		serv2.start();

	}

}
