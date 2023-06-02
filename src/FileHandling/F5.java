package FileHandling; //Output Stream 

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class F5 {
	public static void main(String[] args) {
		try {
			OutputStream outputStream = new FileOutputStream("abc.txt");
			String data = "hello manoj";
			byte[] bs = data.getBytes();
			outputStream.write(bs);
			outputStream.close();
			System.out.println("Data is written to file");

		} catch (IOException e) {

			System.out.println("error" + e.getMessage());
		}

	}

}
