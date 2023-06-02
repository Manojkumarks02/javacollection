package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Catt implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int legs = 4;
	int eyes = 2;
	int tail = 1;
	String name = "tom";

}
 
	
public class DS1 {
	public static void main(String[] args) throws Throwable {
		
		FileInputStream f = new FileInputStream("abcc.txt");
		ObjectInputStream ob1 = new ObjectInputStream(f);
		
		Catt c1 = (Catt) ob1.readObject();
		System.out.println(c1.legs);
		System.out.println(c1.eyes);
		
	}


}
