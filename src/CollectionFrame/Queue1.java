package CollectionFrame;

import java.util.PriorityQueue;

public class Queue1 {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("john");
		pq.add("adam");
		pq.add("roy");
		pq.add("glen");
		
		System.out.println(pq);
		System.out.println("--------------------------------");
		
		boolean a = pq.offer("manoj");
		System.out.println(a);
		System.out.println(pq);
		System.out.println("-------------------------------");
		
		boolean b = pq.remove("manoj");
		System.out.println(b);
		System.out.println(pq);
		System.out.println("-------------------------------");
		
		String c = pq.poll();
		System.out.println(c);
		System.out.println(pq);
		System.out.println("-------------------------------");
		
		String d = pq.element();
		System.out.println(d);
		System.out.println(pq);
		System.out.println("-------------------------------");
		
		String e = pq.peek();
		System.out.println(e);
		System.out.println(pq);
	
	}
}
