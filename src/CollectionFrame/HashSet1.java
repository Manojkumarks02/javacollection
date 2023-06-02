package CollectionFrame;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet< String> h = new HashSet<>();
		h.add("manoj");
		h.add("john");
		h.add("adam");
		h.add("roy");
		h.add("glen");
		h.add("smith");
		
		System.out.println(h);
		
		Iterator<String> itr = h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		h.remove("glen");
		System.out.println(h);
		
		h.spliterator();
		System.out.println(h);
		
		h.add("ram");
	    System.out.println(h);
	    
	    h.clone();
	    System.out.println(h);
	    
	    h.clear();
	    System.out.println(h);
		
		
	}

}
