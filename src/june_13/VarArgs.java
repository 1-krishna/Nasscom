package june_13;

import java.util.Scanner;

public class VarArgs {

	public static void main(String[] args) {

		varArgSum(110,20,30,40,50);
		varArgSum(1,2,3,4,5);

	}

	static void varArgSum(int...x){
		int sum = 0;
		for(int i : x){
			sum += i;
		}
		System.out.println();



	}
	
	public static int[][] takeInput() {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

}
