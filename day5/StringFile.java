package day5;

import java.io.FileWriter;
import java.io.IOException;

public class StringFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("D:\\Program Files\\eclipse-jee-2024-09-R-win32-x86_64\\eclipse\\Sample.java\\src\\Day05\\Output.txt");
			myWriter.write("Hai Hello Welcome To Java Programming");
			myWriter.close();
			System.out.println("Successfully Wrote to the file.");
		}
		catch(Exception e) {
			System.out.println("File not exist");
		}

	}

}
