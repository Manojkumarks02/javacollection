package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class S2 {
	public static void main(String args[]) {
		try {

			Student s1 = new Student(211, "ravi"); // Creating the object
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("abcc.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(s1);
			out.flush();

			out.close(); // closing the stream
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
