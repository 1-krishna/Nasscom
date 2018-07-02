package june_22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


//This program read input from keyboard and writes it to file on desktop

public class UsingNormalOutputStream {

	public static void main(String[] args) throws IOException {
		
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fout = new FileOutputStream("NormalOutput.txt");
		
		char ch = (char)dis.read();
		Long startTime = System.currentTimeMillis();
		
		while((ch = (char)dis.read()) != '@'){
			fout.write(ch);
		}
		

		Long endTime = System.currentTimeMillis();
		
		System.out.println("Time taken = " + (endTime - startTime));
		
		fout.close();
	}

}
