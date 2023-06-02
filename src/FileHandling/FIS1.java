package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FIS1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
			long skipped = fis.skip(5);  //Skip method
			System.out.println(" skipped " + skipped + " bytes");
			fis.close();           // close method

		} catch (IOException e) {
			System.out.println("error " + e.getMessage());
		}

	}

}
