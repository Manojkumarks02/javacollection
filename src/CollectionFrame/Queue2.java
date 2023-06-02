package CollectionFrame;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue2 {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("john");
		pq.add("adam");
		pq.add("roy");
		pq.add("glen");

		Iterator<String> itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
