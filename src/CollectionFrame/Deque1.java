package CollectionFrame;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {
	public static void main(String[] args) {
		Deque<String> d = new ArrayDeque<>();
		d.add("john");
		d.add("adam");
		d.add("roy");
		d.add("glen");
		d.add("smith");

		for (String s : d) {
			System.out.println(d);
		}
		System.out.println("------------------------------");
		
		
        d.pollLast();
        System.out.println(  d.pollLast());
        System.out.println(d);
        System.out.println("--------------------------------");
        
       System.out.println( d.pollFirst());
        System.out.println(d);
        System.out.println("------------------------------------");
        
        System.out.println(d.peekFirst());
        System.out.println(d);
        System.out.println("---------------------------------------");
        
       System.out.println( d.peekLast());
        System.out.println(d);
        System.out.println("------------------------------------");

	}
}
