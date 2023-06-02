package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOs3 {
	private static String message;

	public static void main(String[] args) {
		try {
			String s = "manoj";
			FileOutputStream output = new FileOutputStream("abc.txt");
			byte[] bytes = message.getBytes();
			output.write(bytes);
			System.out.println("Bytes written: " + bytes.length);
			output.flush(); // flush any remaining bytes to the file
			output.close();
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
