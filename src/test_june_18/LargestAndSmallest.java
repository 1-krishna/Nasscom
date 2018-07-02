package test_june_18;

import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<10;i++){
			int currentValue = sc.nextInt();
			if(currentValue > max){
				max = currentValue;
			}
			if(currentValue < min){
				min = currentValue;
			}
		}
		
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);

	}

}
