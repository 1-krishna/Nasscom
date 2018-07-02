package june_15;


class ToBeInherited{
	void calc(int a){
		System.out.println("From Parent class " + a);
	}
	static void test(){
		System.out.println("Test from parent class");
	}
}

class Implemented extends ToBeInherited{
	void calc(int a){
		System.out.println("From Implemented Class " + a);
	}
	
	
	//If we uncomment this then it will be executed
	/*static void test(){
		System.out.println("Test from Implemented");
	}*/
}
public class StaticInheritenceExample {

	public static void main(String[] args) {
	
		Implemented.test();
		
	}

}
