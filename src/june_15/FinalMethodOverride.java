package june_15;

class A {
	final void method(){
		System.out.println("From Class A");
	}
}

class B extends A {
	
	//Can't happen
	/*void method(){
		System.out.println("From Class B");
	}*/
	
	void method2(){
		System.out.println("M2 from class B");
	}
}
public class FinalMethodOverride {

	public static void main (String[] args) {

		B b = new B();
		
		b.method();
		
		A a = new B();
		
		//a.method2(); //can't happen
		
		//B refToA = new A();  //can't happen
		
		//B refToA = (B)new A(); //gives ClassCastException 
		
		//refToA.method2();
		
	}

}
