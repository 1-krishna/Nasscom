package june_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class ResultClass{
	String name;
	int physics, chemistry, maths;
	public ResultClass(String name, int physics, int chemistry, int maths) {
		super();
		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}
}

public class ResultClassActivityCopy {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<ResultClass> list = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter total count to records");
		
		int inputCount = Integer.parseInt(br.readLine());
		
		for(int i=0;i<inputCount;i++){
			
		}
		

	}

}
