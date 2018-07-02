package june_14;

public class ExampleOfInnerClass {

	int classMember = 5;
	public void fun1(){
		InnerClass ic = new InnerClass();
		ic.printSomething();
	}

	private class InnerClass{
		InnerClass(){}
		int classMember = 6;
		void printSomething(){
			System.out.println("Hello");
			System.out.println(this.classMember);//Prints 6
			System.out.println(ExampleOfInnerClass.this.classMember);//Prints 5
		}
	}

}
