package fileIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("C://Users/amarp/eclipse-workspace/CoreJava/src/fileIO/Seed.txt");
			String s = "Hey im amar patait this is new text";
			for(int i = 0; i<s.length(); i++) {
				fout.write(s.charAt(i));
			}
			System.out.println("Write successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			fout.close();
		}

	}

}
