package FileHandling; // to check the file is present or not

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class F1 {
	public static void main(String[] args) {
		File file = new File("abc.txt");
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();

		} catch (IOException e) {
			System.out.println("a error occured :" + e.getMessage());

			e.printStackTrace();
		}
	}

}
