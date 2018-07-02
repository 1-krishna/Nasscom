package june_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

//Run this on CMD for multiple file running at same time

public class Client1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		Socket s = new Socket("localhost", 6666);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str;
		
		while((str = br.readLine()) != null)
			System.out.println(str);
		
		br.close();
		s.close();
	}

}
