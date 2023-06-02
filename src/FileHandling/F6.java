package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F6 {
	public static void main(String[] args) {
		
		try {
			FileReader	fileReader = new FileReader("abc.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			for(int i = 1; i<5; i++) {
				System.out.println(bufferedReader.readLine());
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
