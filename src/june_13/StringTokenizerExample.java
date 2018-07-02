package june_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name, age, salary separated by ,");
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		s1 = s1.trim();
		s2 = s2.trim();
		s3 = s3.trim();
		System.out.println("S1 " + s1 + " S2 " + s2 + " S3 " + s3);

	}

}
