package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



//Serialization
public class S1 {
	public static void main(String[] args) throws Throwable {
       Cat c = new Cat();
       FileOutputStream f1 = new FileOutputStream("abc.txt");
       ObjectOutputStream ob= new ObjectOutputStream(f1);
       ob.writeObject(c);
       ob.flush();
       ob.close();
      
       System.out.println(ob);
	}
}

