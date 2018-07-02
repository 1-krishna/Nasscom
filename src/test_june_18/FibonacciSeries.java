package test_june_18;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int first = 1;
		int second = 1;
		int third = first + second;
		
		System.out.print(first + " " + second + " ");

		int n=6;//for 6 terms
		
		for(int i=0;i<n-2;i++){
			System.out.print(third + " ");
			first = second;
			second = third;
			third = first + second;
		}
				
	}

}
