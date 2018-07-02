package june_14;

public class AnonymousClassExample {

	public static void main(String[] args) {
		
		
		//Conventional Method 
		
		AnotherClass ac = new AnotherClass();
		ac.doSomething(new ImplementationClass());
		
		
		//New Way to do same
		//Using anonymous class
		AnotherClass ac2 = new AnotherClass();
		ac2.doSomething(new TrailInterface() {
			//					|===>Anonymous Class
			@Override
			public void absFn() {
				// Complete function
			}
		});
	}
}
