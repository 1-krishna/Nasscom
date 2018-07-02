package june_21;

public class TestGarbageCollector {
	
	/*public void finalize(){
		System.out.println("Garbage Collected");
	}*/
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Collection done");
		super.finalize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestGarbageCollector t1 = new TestGarbageCollector();
		TestGarbageCollector t2 = new TestGarbageCollector();
		
		new TestGarbageCollector();
		
		System.gc();

	}

}
