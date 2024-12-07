package fileIO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C://Users/amarp/eclipse-workspace/CoreJava/src/fileIO/Seed.txt");
			int data  = 0;
			while((data = fin.read())!= -1) {
				System.out.print((char)data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
            fin.close();
        }
		
		
	}

}
