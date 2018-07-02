package june_19;

public class FinallyBlockUse {

	public static void main(String[] args) {
		
		try{
			int a = 5;
			int b = 0;
			System.out.println(a/b);
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Hello finally");
		}

		System.out.println("after finally");
	}

}
