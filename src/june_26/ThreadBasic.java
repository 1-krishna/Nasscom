package june_26;

import java.io.IOException;

class MyThread extends Thread{
	
	boolean flag;
	
	@Override
	public void run() {
		for(int i=0;i<10000000;i++){
			System.out.println(i);
			if(flag) return;
		}
	}
}

public class ThreadBasic {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		MyThread mt = new MyThread();
		//Thread t1 = new Thread(mt);
		//t1.start();
		
		mt.start();
		System.out.println("Main function");
		System.in.read(); //Wait for some keypress
		mt.flag = true;

	}

}
