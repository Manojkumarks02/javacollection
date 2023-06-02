package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FIS2 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("abc.txt")) {
			int a = fis.available();  //available method
			System.out.println("available "+ a + " bytes");
			
			
		} catch (IOException e) {
		System.out.println("error" + e.getMessage());
		}
			
		
	}

}
