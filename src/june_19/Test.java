package june_19;

public class Test {

	public static void main(String[] args) {
		
		try {
			Testv.hello();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
