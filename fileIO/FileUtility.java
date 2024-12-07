package fileIO;

import java.io.File;

public class FileUtility {

	public static void main(String[] args) {
		File f = new File("C://Users/amarp/eclipse-workspace/CoreJava/src/fileIO/Seed.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File created successfully");
			}else {
				System.out.println("Not created");
			}
			
			System.out.println(f.canRead());
			System.out.println(f.isAbsolute());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.exists());
			System.out.println(f.length());
			
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
