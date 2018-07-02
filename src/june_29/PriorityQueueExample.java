package june_29;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Amit");
		pq.add("Vijay");
		pq.add("Karan");
		pq.add("Jai");
		pq.add("Rahul");
		
		System.out.println("Head : " + pq.element());
		System.out.println("Head : " + pq.peek());
		System.out.println("Iterating elements");
		
		Iterator itr = pq.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
