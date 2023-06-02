package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FIS3 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
			int b = fis.read();           // read method
			System.out.println("Byte read "+b);     
			fis.close();

		} catch (IOException e) {

			System.out.println("error " + e.getMessage());
		}

	}

}
