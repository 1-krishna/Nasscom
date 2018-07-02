package june_29;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIteratorOnList {

	public static void main(String[] args) {
		ArrayList<String> lis = new ArrayList<>();
		lis.add("Krishna");
		lis.add("Mohan");
		lis.add("Verma");
		
		
		Iterator itr = lis.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
