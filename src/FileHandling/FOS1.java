package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOS1 {
	public static void main(String[] args) {

		try {
			File f = new File("abcc.txt");
			FileOutputStream fos = new FileOutputStream(f);
			String s = "manoj";
			fos.write(s.getBytes());
			System.out.println();
            fos.close();
		} catch (IOException e) {

			System.out.println("error " + e.getMessage());
		}

	}

}
