package FileHandling;

import java.io.File;
import java.io.IOException;

public class F3 {
	public static void main(String[] args) {
		File f1 = new File("C://File/John");
		f1.mkdir();

		File f2 = new File(f1, "adam.txt"); // creating new directory
		try {
			f2.createNewFile();
			System.out.println("created");   // creating new file in current directory
		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("not created");
		}

	}

}
