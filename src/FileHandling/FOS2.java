package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOS2 {
	public static void main(String[] args) {
		try {
			File f = new File("abc.txt");
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(65);
			fos.close();
			System.out.println("knsck");

		} catch (IOException e) {
			System.out.println("error " + e.getMessage());

		}
	}

}
