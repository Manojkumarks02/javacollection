package Serialization;

import java.io.Serializable;

public class Stundent implements Serializable {
	
	
		int id;
		String name;

		public void Student(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}


