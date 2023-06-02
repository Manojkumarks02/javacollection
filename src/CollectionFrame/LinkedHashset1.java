package CollectionFrame;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashset1 {
	public static void main(String[] args) {
		
		LinkedHashSet<String > lh = new LinkedHashSet<>();
		lh.add("john");
		lh.add("ram");
		lh.add("adm");
		lh.add("roy");
		lh.add("smith");
		System.out.println(lh);
		
		Iterator< String > itr = lh.iterator();
		while( itr.hasNext()) {
			System.out.println(itr.next());
		}
			
	}

}
