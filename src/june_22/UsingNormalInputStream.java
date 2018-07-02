package june_22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UsingNormalInputStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("NormalInput.txt");
		
		System.out.println("File Contents are");
		
		char ch;
		int count = 0;
		while((ch = (char) fin.read()) != '@'){
			count++;
			System.out.print((char)ch);
			if(count==100){
				System.out.println();
				count = 0;
			}
		}
		
		fin.close();
	}

}
