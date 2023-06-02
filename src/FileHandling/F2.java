package FileHandling; // creating new file


import java.io.File;

public class F2 {
	public static void main(String[] args) {
		File f = new File("C://File/text3");
		try {
			boolean b = f.createNewFile();
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
