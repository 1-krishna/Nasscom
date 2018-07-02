package june_14;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1 = "Hello world";
		
		//Allocates a new space for Hello world even if it's same as s1
		String s2 = new String("Hello world");
		
		char[] arr = {'k','r','i','s','h','n','a'};
		
		String s3 = new String(arr);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("Lenght of s1 " + s1.length());
		
		System.out.println("s1 and s2 joined wiht concat fn: " + s1.concat(s2));
		
		System.out.println("s1 and s2 joined with + opr: "+ s1 + s2);
		
		boolean x = s1.startsWith("H");
		if(x){
			System.out.println("s1 starts with 'H'");
		}else{
			System.out.println("s1 doesn't starts with 'H'");
		}
		
		System.out.println(s1.substring(0, 3));
		
		System.out.println("UpperCase : " + s1.toUpperCase());
		

	}

}
