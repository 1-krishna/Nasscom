package test_june_18;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int decimalValue = 10;
		String binaryValue = "";
		
		while(decimalValue > 0){
			int mod = decimalValue%2;
			binaryValue = Integer.toString(mod) + binaryValue;
			decimalValue = decimalValue/2;
		}
		
		System.out.println(binaryValue);
	}

}
