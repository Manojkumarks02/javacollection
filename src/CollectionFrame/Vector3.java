package CollectionFrame;

import java.util.Iterator;
import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("manoj");
		v.add("nikil");
		v.add("john");
		v.add("adams");
		v.add("roy");
		
		Iterator<String> itr = v.iterator();
		 while(itr.hasNext()) {
			 String name = itr.next();
			 System.out.println(name);
			 }
	}

}
