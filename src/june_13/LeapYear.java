package june_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter year");
		
		int year = Integer.parseInt(br.readLine());
		
		if(year%100==0 && year%400==0){
			System.out.println("Leap year and century year");
		}else if(year%100!=0 && year%4==0){
			System.out.println("Leap year but not Century Year");
		}else{
			System.out.println("Not leap year");
		}
		
		//System.out.println("Enter name, age, salary separated by ,");
		
		
		
	}

}
