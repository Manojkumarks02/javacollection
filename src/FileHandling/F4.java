package FileHandling; //input stream

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class F4 {
	public static void main(String[] args) throws IOException {

		try {
			InputStream inputStream = new FileInputStream("abc.txt");
			boolean data;
			while (data = inputStream.read() != -1) {
				System.out.println(data);

			}
			inputStream.close();
		} catch (IOException e) {

			System.out.println("error:" + e.getMessage());
		}

	}

}
