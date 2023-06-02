
package CollectionFrame;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector< String> v = new Vector<>();
		v.add("john");   //adding elements 
		v.add("adams");
		v.add("paul");
		v.add("cook");
		v.add("bell");
		
		System.out.println(v);
		
		System.out.println("size is : " + v.size());   // size 
		System.out.println("default capacity : "+ v.capacity());
		
		if(v.contains("cook")) {
			System.out.println("cook is present in specifed index " + v.indexOf("cook"));
		}
		else {
			System.out.println("cook is not present");
		}
		
		
      
	}

}