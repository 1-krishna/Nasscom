package june_13;

public class ForEachLoop {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int r = 5;

		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i : arr){
			System.out.print(i+" ");
		}
	}

}
