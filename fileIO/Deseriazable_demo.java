package fileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deseriazable_demo {

	public static void main(String[] args) throws IOException {
		Emp_Serialization o = null;
		FileInputStream eis = null;
		ObjectInputStream ois = null;
		
		try {
			eis = new FileInputStream("C://Users/amarp/eclipse-workspace/CoreJava/src/fileIO/Seed.txt");
			ois = new ObjectInputStream(eis);
			o = (Emp_Serialization)ois.readObject();
			System.out.println(o);
		}catch(Exception E) {
			E.printStackTrace();
		}finally {
			eis.close();
		}

	}

}
