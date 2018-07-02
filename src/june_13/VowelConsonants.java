package june_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelConsonants {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		for(int i=0;i<input.length();i++){
			char c = input.charAt(i);
			if(c=='A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
					|| c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){}
		}

	}

}
