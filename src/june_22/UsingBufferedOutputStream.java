package june_22;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferedOutputStream {

	public static void main(String[] args) throws IOException {
		
		DataInputStream dis = new DataInputStream(System.in);
		
		FileOutputStream fout = new FileOutputStream("BufferedOutput.txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);
		
		char ch = (char)dis.read();
		Long startTime = System.currentTimeMillis();//To compare time from Normal StreamOutput
		
		while((ch = (char)dis.read()) != '@'){
			bout.write(ch);
		}
		
		Long endTime = System.currentTimeMillis();
		
		System.out.println("Time taken = " + (endTime - startTime));
		bout.close();
		fout.close();
		
		
	}

}
