package fileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable_Demo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream Fos = null;
		ObjectOutputStream Ous = null;
		
		try {
			Emp_Serialization e = new Emp_Serialization(101,"Amar",10000);
			Fos = new FileOutputStream("C://Users/amarp/eclipse-workspace/CoreJava/src/fileIO/Seed.txt");
			Ous = new ObjectOutputStream(Fos);
			Ous.writeObject(e);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			Fos.close();
		}
		
		

	}

}
